import java.util.*;
import javax.swing.*;

class UserInput {
    public static void main(String[] args) {
        while (true) {
            JFrame jFrame = new JFrame();
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter your stock name");
            String stockname = in.nextLine();
            System.out.print("Enter value for stock:");
            int stocknum = in.nextInt();
            if (stocknum >= 5)  {
                JOptionPane.showMessageDialog(jFrame,"Your stock count for " + stockname + " is currently at " + stocknum + " there is enough stock");
            }
            else if (stocknum < 5 && stocknum > 0) {
                JOptionPane.showMessageDialog (jFrame," The item entered is low in stock, please check count and re-order soon");
            }
            else
                JOptionPane.showMessageDialog(jFrame, "ERROR");
            }

        }
    }