package com.Application.View;

import com.Application.Helper.Config;
import com.Application.Helper.Helper;
import com.Application.Model.Operator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private final Operator operator;
    private JTabbedPane tab_Operator;
    private JPanel panelUser;
    private JLabel lblWelcome;
    private JButton btnLogout;
    private JPanel panelUserList;
    private JTable tblUserList;
    private DefaultTableModel mdl_user_list;

    public OperatorGUI(Operator operator){
        this.operator=operator;
        Helper.setLayout();
        add(wrapper);
        setSize(1000,500);
        int x = Helper.ScreenCenterLocation("x",getSize());
        int y = Helper.ScreenCenterLocation("y",getSize());
        setLocation(x,y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITTLE);
        setVisible(true);

lblWelcome.setText("Welcome "+operator.getUsername());
mdl_user_list = new DefaultTableModel();
Object[] col_user_list = {"ID","Name","Username","Password","AccountType"};
mdl_user_list.setColumnIdentifiers(col_user_list);
Object [] firstRow = {"1","Berke Kaan Saraç","bekaans","brksrc","Student"};
mdl_user_list.addRow(firstRow);
tblUserList.setModel(mdl_user_list);
tblUserList.getTableHeader().setReorderingAllowed(false);
    }

}
