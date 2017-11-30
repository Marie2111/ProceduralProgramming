

// Author: Marie Storvik Olsen
// Location on computer: Documents\GitHub\Procedural-Programming


import javax.swing.*;

class snack
{
    public static void main (String[] param)
    {

       String text = textinput();
        print(text);
        System.exit(0);

    }


 //    This method asks the user for a number and pops up an ok box, that number of times.


    public static String textinput()

    {


       String textinput;  // whatever the person types as text
       int n = 0;          // an integer version of textinput

       // Get an an int from the user to loop that many times
       // convert (known as parsing) it into a number version
       //

       textinput = JOptionPane.showInputDialog("What drink do you want (1 Coffee, 2 Tea, 3 Chocolate)?");
       n = Integer.parseInt(textinput);


return textinput;

}

   public static void print(String textinput)
    {

       if (textinput.equals("1"))
        {    System.out.println("Coffe costs 2.00");      }

             else  if (textinput.equals("2"))
        {    System.out.println("Coffe costs 2.50");       }

             else  if (textinput.equals("3"))
        {    System.out.println("Choclate costs 3.50");       }

             else
        {    System.out.println("I do not have a drink for that number");       }

 System.out.println("Enjoy your snack");

return;

    }

}
