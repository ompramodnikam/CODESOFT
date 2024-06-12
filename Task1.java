import java.util.*;//for Scanner class
import java.util.Random;//To generate random number

public class Task1//user defined class
{
    ///////////////////////////////////////////////////////////////////////
    /// Method Name : NumberGame
    /// Description : It is used to cheak the relation between Random and Guess Number
    /// Input : int (iRandom)
    /// Output : No return value
    /// Author : Om Pramod Nikam
    /// Date : 12/06/2024
    ///////////////////////////////////////////////////////////////////////

    public static void NumberGame(int iRandom)//user defined method
    {
        //characteristics initilization
        int Attempts = 0;
        int won = 0;

        //Scanner object creation 
        Scanner sobj = new Scanner(System.in);

        int chance = 1;
        while(chance < 6)//Total Attemts is 5. Declare by the user
        {
            System.out.println("Enter the number to Guess in between Range 1-100: ");
            int iGuess = sobj.nextInt();

            //If the number is Negative
            if(iGuess < 0)
            {
                iGuess = -iGuess;
            }
            
            //If the Number not lies in the range 1 - 100
            if(iGuess > 100)
            {
                System.out.println("THE NUMBER SHOULD BE IN THE RANGE 1-100");
            }
            
            //The Guess number should be in the range of 1-100
            if((1 <= iGuess) && (iGuess <= 100))
            {
                if(iRandom == iGuess)
                {
                    System.out.println("The Guess Number "+iGuess+" is Matched with Random Number "+iRandom);
                    System.out.println();
                    won++;
                }
                else if(iRandom < iGuess)
                {
                    System.out.println("The Guess Number "+iGuess+" is Greater than Random Number "+iRandom);
                    System.out.println();
                }
                else
                {
                    System.out.println("The Guess Number "+iGuess+" is smaller than Random Number "+iRandom);
                    System.out.println();
                }
            }
            chance++;
            Attempts++;
        }

        System.out.println();
        System.out.println("You took "+Attempts+" Attempts To play the game ");
        if(won >= 1)
        {
            System.out.println("Congratulations You guess the number in "+won+" Attempts");
        }
        System.out.println("You won "+won+" Attempts");
    }

    ///////////////////////////////////////////////////////////////////////
    /// Method Name : main
    /// Description : It is used to Accept the Random Number. To call user defined Methods
    ///////////////////////////////////////////////////////////////////////
    public static void main(String Arg[]) 
    {
        //To generate random number 
        Random robj = new Random();
        int iValue = robj.nextInt(100);

        NumberGame(iValue);//static userdefined method

    }
}
