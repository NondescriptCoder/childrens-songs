/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 //Plays children's song Old MacDonald
{
    
    public static void eieio() //Prints EIEIO line
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }


    public static void hadA(String animal) //Prints line explaining present animal
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }


    public static void withA(String sound)  //Prints lines utilizing animal sound
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    
    public static void singIt(String animal, String sound)// Consolidates the invidual lines into verses 
    {
        //following lines activate lines of the song
        eieio();       
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println(); //Allows for spacing between verses
    }

    
    public static void main(String[] args)// Outputs a verse for each instance of singIt();  
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Gives song a title
        // Below, list the name of the animal and the sound respectively
        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        //Add more animals and sounds below here
    }
    
}
