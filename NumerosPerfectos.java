
package numerosperfectos;

import javax.swing.JOptionPane;

public class NumerosPerfectos {


    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
        int count = 0;
        
        for(int i = 1; i <= numero; i++)
        {
            if(numero % i == 0 && i < numero)
            {
                count = count+i;
            }
        }
        if(count == numero)
        {
           JOptionPane.showMessageDialog(null,"Es un número perfecto.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No es un número perfecto.");
        }
    }
    
}
