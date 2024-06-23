/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Arvin
 */
public class Sabado_lab4_1 {

    public static void main(String[] args) {
        String originalName = JOptionPane.showInputDialog("Please enter your first and last name");
        
        String splitOldName[] = originalName.split(" ");
        
        String newName = "";
        
        for (String s : splitOldName) {
            newName += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
            newName += " ";
        }
        
        JOptionPane.showMessageDialog(null, "Orginal name was " + originalName + "\nRepaired name is " + newName);
    }
}
