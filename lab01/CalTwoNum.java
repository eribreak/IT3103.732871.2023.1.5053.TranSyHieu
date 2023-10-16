import javax.swing.JOptionPane;

public class CalTwoNum{
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,"Tran Sy Hieu - 20215053 - Please enter the first number:",
                "Enter the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Tran Sy Hieu - 20215053 - Please enter the second number:",
                "Enter the second number",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null,"Sum:"  + (num1+num2) +"\n"
        + "Difference: " + (num1 - num2) +"\n"
        + "Product: " + num1*num2 + "\n"
        + "Quotient: " + num1/num2);
        System.exit(0);
    }
}