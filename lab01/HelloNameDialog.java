// Example 3: HelloNameDialog

import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Tran Sy Hieu - 20215053 - Please enter your name:");
        JOptionPane.showMessageDialog(null, "Tran Sy Hieu - 20215053 - Hi " + result + "!");
        System.exit(0);
    }
}