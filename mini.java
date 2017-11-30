import javax.swing.*;
import java.util.Random;

class mini

// Author: Marie Storvik Olsen
// Location on computer: Documents\GitHub\Procedural-Programming

{


public static void main (String [] param)

	{

	askforname();
	hungerlevel();
	tiredlevel();
	moodlevel();
	System.exit(0);

	}




// this method asks the user to name their new pet and confirms the choice

public static String askforname()

	{

	String name = JOptionPane.showInputDialog("What would you like to name your new alien pet?");


	System.out.println("The name of your new pet is "+ name);



	return name;

	}






// this method asks if you want to feed the pet

public static void hungerlevel()

	{

	String wanttofeed = JOptionPane.showInputDialog("Your pet seems hungry, would you like to feed him?");

    if (wanttofeed.equals("yes"))
    { System.out.println("You have fed your pet"); }

	  else
    { System.out.println("Your pet is still hungry"); }

	return;

	}






// this method tells you how tired your pet is

public static void tiredlevel()

	{

Random tired = new Random();
int n = tired.nextInt(10)+1;

	String askifsleep = JOptionPane.showInputDialog("Your pet is " + n + " tired on a scale from 1-10, would you like to let it sleep?");

    if (askifsleep.equals("yes"))
    { System.out.println("Your pet is sleeping"); }

	  else
    { System.out.println("Your pet is still tired"); }

	return;

	}






// this method tells you the mood of your pet by generating a random emotion

public static void moodlevel()

	{

Random mood = new Random();
int m = mood.nextInt(4);

String feeling;


    if (m==1)
    { feeling = "happy";
    System.out.println("Your pet is feeling " + feeling + ", how amazing!");
    }

   else  if (m==2)
    { feeling = "angry";
    System.out.println("Your pet is feeling " + feeling + ", that is not good!");
    }

    else  if (m==3)
    { feeling = "irritated";
    System.out.println("Your pet is feeling " + feeling + ", that is strange...");
    }

    else  if (m==4)
    { feeling = "excited";
    System.out.println("Your pet is feeling " + feeling + ", and you should too!");
    }

   else
    { feeling = "unknown";
    System.out.println("Your pet is feeling " + feeling + ", something must have gone wrong");
    }



	return;

	}


}





class petinfo

{ String name;
  int age;
  String feeling;

}
