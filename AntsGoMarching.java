/**
 * This program sings the song "Ants Go Marching."
 * lyrics: http://kids.niehs.nih.gov/lyrics/antsgo.htm
 *
 * @author  you
 * @version today
 */


public class AntsGoMarching 
{
    /**
     * Sings the first two lines.
     *
     * @param Number (as a word) for how the ants march
     */
    static int progress = 0;
    
    
    public static void goMarching(String number) 
    {
        System.out.println("The ants go marching " + number + " by " + number);
        System.out.println("Hurrah! Hurrah!");
    }
    
    /**
     * Sings the third line.
     *
     * @param Number (as a word) for how the ants march
     */ 
    public static void noHurrah(String number)
    {
        System.out.println("The ants go marching " + number + " by " + number);
    }
    
    /**
     * Sings the 4th line about the little ant.
     *
     * @param action What the little one stops to do
     */
    public static void littleAnt(String action)
    {   
        System.out.println("The little one stops to " + action);
    }
    
    /**
     * Sings the last two lines of each verse.
     */ 
    public static void rain() 
    {
        if (progress == 9)
        {
            System.out.println("THE END!!");
           }
           else
           {
        System.out.println("And they all go marching down into the ground");
        System.out.println("To get out of the rain");
        System.out.println("Boom, boom, boom, boom!");
       }
    }

    /**
     * Sings a verse of Ants Go Marching.
     * 
     * @param number Number (as a word) for how the ants march
     * @param action What the little one stops to do
     */
    public static void singIt(String n, String action) 
    {
        goMarching(n);
        noHurrah(n);
        littleAnt(action);
        rain();
        progress = progress + 1;
    }

    /**
     * Calls the singIt() for each verse.
     */
    public static void main(String[] args) 
    {
        System.out.println("Ants Go Marching\n");
        
        singIt("one","suck his thumb");
        singIt("two","tie his shoe");
        singIt("three","climb a tree");
        singIt("four","shut the door");
        singIt("five","take the dive");
        singIt("six","pick up sticks");
        singIt("seven","pray to heaven");
        singIt("eight","rollerskate");
        singIt("nine","check the time");
        singIt("ten","shout");
    }
   
}