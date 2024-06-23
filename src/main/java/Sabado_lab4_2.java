
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arvin
 */
public class Sabado_lab4_2 {
    
    public static int getOperationResult(String num1, String operation, String num2) {
        switch (operation) {
            case "+":
                return Integer.parseInt(num1) + Integer.parseInt(num2);
            case "-":
                return Integer.parseInt(num1) - Integer.parseInt(num2);
            case "*":
                return Integer.parseInt(num1) * Integer.parseInt(num2);
            case "/":
                return Integer.parseInt(num1) / Integer.parseInt(num2);
            default:
                JOptionPane.showMessageDialog(null, "Unidentified operation!");
                break;
        }
        return 0;
    }
    
    public static void main (String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter a number");
        
        String num2 = JOptionPane.showInputDialog("Enter another number");
        
        String operation = JOptionPane.showInputDialog("Enter valid arithmetic operation (+, *, -, /)");
        
        try {
            JOptionPane.showMessageDialog(null, num1 + " " + operation + " " + num2 + " = " + getOperationResult(num1, operation, num2));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format or operation!");
        }
    }
}
