
public class Coin
{
    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;

    /*
     * sets up the coin by flipping it initially
     */

    public Coin ()
    {
        flip();
    }

    /*
     * flips the coin by randomly choosing a face value
     */
    public void flip()
    {
        face = (int) (Math.random() *2);
    }

    /*
     * returns true if the courrent face is heads
     */
    public boolean isHeads()
    {
        return (face == HEADS);
    }
    public boolean isTails()
    {
        return (face == TAILS);
    }

    /*
     * returns the current face of hte coin as a string
     */

    public String toString()
    {
        String faceName;
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        return faceName;
    }
} 

