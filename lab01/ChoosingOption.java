import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main (String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Tran Sy Hieu - 20215053 - Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, " Tran Sy Hieu - 20215053 - You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
