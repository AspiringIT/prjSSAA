import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Main {
    //
    public static int[] AccountNumbers = {
            5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
            8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
            1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
   /* public static JPanel panel;
   public static JLabel messageLabel;
    public static JButton checkerButton;
    private static JTextField checkNumText;

    static JFrame window; */

    protected static int requestedNum;

    public Main() {
    }
    //Array of account numbers

    public static void main(String[] args) {

       /* final int WINDOW_WIDTH = 450; // Window width in pixels final int
        final int WINDOW_HEIGHT = 150; // Window height in pixels
         window = new JFrame("frame");
        // Create a window.
        // Set the title.
        window.setTitle("Look up Account Number");
        // Set the size of the window.
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // Specify what happens when the close button is clicked.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

        // Build the panel and add it to the frame.
      //  buildPanel();
        // Add the panel to the frame's content pane.
       //window.add(panel);
        // Display the window.
      //  window.setVisible(true);

        Scanner keyboard = new Scanner(System.in);//creates scanner called keyboard to get user input
        System.out.println("Enter a charge account number");
         requestedNum = keyboard.nextInt();//gets the user input

        boolean NumisValid = isVaild.isValidAccount(requestedNum);//This calls isvalid account method in isValid class

        if (NumisValid) {
            System.out.println("This a valid account number");
        } else {
            System.out.println("This is an invalid account number.");
        }


    }

   /* private static void buildPanel() {
// Create a label to display instructions.
        messageLabel = new JLabel("Enter an account number ");
        checkNumText = new JTextField(10);
        checkerButton = new JButton("Check account number");
        panel = new JPanel();
        // Add the label, text field, and button // components to the panel.
        panel.add(messageLabel);
        panel.add(checkNumText);
        panel.add(checkerButton);
        checkerButton.addActionListener(event -> {
            //do whatever should happen when the button is clicked...
            System.out.println("The button was clicked");
            int i = Integer.parseInt(checkNumText.getText());
            requestedNum = i;

            JDialog d = new JDialog(window, "dialog Box");

            // create a label
            JLabel l = new JLabel("this is a dialog box");

            d.add(l);

            // setsize of dialog
            d.setSize(250, 150);

            // set visibility of dialog
            d.setVisible(true);


        }); */
    }




