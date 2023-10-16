// Example 4: ShowTwoNumbers

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,
                    "Tran Sy Hieu - 20215053 - Please input the first number: ", "Tran Sy Hieu - 20215053 - Input the first number",
                    JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
                    "Tran Sy Hieu - 20215053 - Please input the second number: ", "Tran Sy Hieu - 20215053 - Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;    

        JOptionPane.showMessageDialog(null, strNotification, "Tran Sy Hieu - 20215053 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);       
    }
}