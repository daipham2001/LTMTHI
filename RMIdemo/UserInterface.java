/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMIdemo;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class UserInterface extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;

    private JTextField idField;
    private JTextField nameField;
    private JTextField potField;

    public UserInterface() {
        super("User Data");

        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Pot");

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        idField = new JTextField(10);
        nameField = new JTextField(10);
        potField = new JTextField(10);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDataToServer();
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Pot:"));
        inputPanel.add(potField);
        inputPanel.add(addButton);

        panel.add(inputPanel, BorderLayout.SOUTH);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);

        loadDataFromServer();
    }

    private void loadDataFromServer() {
        try {
            Interface calculator = (Interface) Naming.lookup("rmi://localhost/calculator");
            List<User> userList = calculator.findAll();
//            tableModel.removeRow(ERROR);
            tableModel.setRowCount(0);

            for (User user : userList) {
                Object[] rowData = {user.getId(), user.getName(), user.getPot()};
                tableModel.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addDataToServer() {
        try {
            Interface calculator = (Interface) Naming.lookup("rmi://localhost/calculator");

            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String pot = potField.getText();

            User newUser = new User(id, name, pot);

            calculator.addUser(newUser);

            idField.setText("");
            nameField.setText("");
            potField.setText("");

            loadDataFromServer();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserInterface userInterface = new UserInterface();
            userInterface.setVisible(true);
        });
    }
}
