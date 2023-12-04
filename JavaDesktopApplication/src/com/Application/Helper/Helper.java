package com.Application.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setLayout(){
        for (UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels()) {
            try {
                UIManager.setLookAndFeel(info.getClassName());
            } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                     InstantiationException e) {
                throw new RuntimeException(e);

            }break;
        }
    }
    public static int ScreenCenterLocation(String eksen, Dimension size){
        int point ;
            switch (eksen){
                case "x":
                    point =(Toolkit.getDefaultToolkit().getScreenSize().width-size.width)/2;
                    break;
                case "y" :
                    point =(Toolkit.getDefaultToolkit().getScreenSize().height-size.height);
                    break;
                default:point=0;
            }
        return point;
    }
}
