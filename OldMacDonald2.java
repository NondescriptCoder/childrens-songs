/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
     /**
     * Sings the EIEIO line
     */
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }
   
     /**
     * Sings the second line.
     *
     * @param animal (as a word) for the specific animal present on the farm
     */
    public static void hadA(String animal) 
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }

     /**
     * Sings the third line.
     *
     * @param sound (as a word) for the sound each animal makes
     */
    public static void withA(String sound) 
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

     /**
     * Sings a verse of Ants Go Marching.
     * 
     * @param animal for the type of animal
     * @param sound for the sound the animal makes
     */
    public static void singIt(String animal, String sound) 
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    
     /**
     * Calls singIt() for each verse.
     */
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); 

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");        
    }
    
}
