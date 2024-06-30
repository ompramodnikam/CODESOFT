/*
        Subjects        Marks

        English         85
        Hindi           90
        Physics         75
        Chemistry       80
        Mathematics     70
        Biology         80
---------------------------------------
        Total Marks :   480
        Avg Percentage: 80%
---------------------------------------

              Range                    Grade
-------------------------------------------------             
        0 To 35 (35 Exclusive)      --> Fail
        35 To 45 (45 Inclusive)     --> Pass
        45 To 60 (60 Inclusive)     --> B
        60 To 75 (75 Inclusive)     --> B+
        75 To 85 (85 Inclusive)     --> A
        85 To 95 (95 Inclusive)     --> A+
        95 To 100 (100 Inclusive)   --> O
-------------------------------------------------

*/
//inbuilt package for scanner : 
import java.util.*;

public class Task2 
{
        ///////////////////////////////////////////////////////////////////////
        /// Method Name : DisplayResult
        /// Description : It is used to desplay the result of student...
        /// Input : integer(iEng,iHindi,iPhy,iChem,iMath,iBio)
        /// Output : No return value
        /// Author : Om Pramod Nikam
        /// Date : 30/06/2024
        ///////////////////////////////////////////////////////////////////////

        public static void DisplayResult(int iEng, int iHindi, int iPhy, int iChem, int iMath, int iBio)
        {
                //To calculate Total Marks : 
                int TotalMarks = 0;
                TotalMarks = iEng + iHindi + iPhy + iChem + iMath + iBio;

                //To calculate the percentage : 
                int Percentage = 0;
                Percentage = (TotalMarks/6);

                //Filter
                if((Percentage < 0) || (Percentage > 100))
                {
                        System.out.println("Enter the Valid Marks....");
                }
                
                //To calculate grade accroding to percentage : 
                char Grade = '\0';
                if((Percentage >= 0) && (Percentage < 35))
                {
                        Grade = 'F';
                }
                else if((Percentage >= 35) && (Percentage < 45))
                {
                        Grade = 'P';
                }
                else if((Percentage >= 45) && (Percentage <= 60))
                {
                        Grade = 'B';
                }
                else if((Percentage >= 60) && (Percentage < 75))
                {
                        Grade = 'B';
                }
                else if((Percentage >= 75) && (Percentage < 85))
                {
                        Grade = 'A';
                }
                else if((Percentage >= 85) && (Percentage < 95))
                {
                        Grade = 'A';
                }
                else if((Percentage >= 95) && (Percentage <= 100))
                {
                        Grade = 'O';
                }

                //To Display the Result : 
                System.out.println("Congratulations YOU PASSED..!!");
                System.out.println("-------------------------------------------------");
                System.out.println("Total Marks : "+TotalMarks);
                System.out.println("Percentage(%) : "+Percentage+"%");
                System.out.println("Grade : "+Grade);
        }

        ///////////////////////////////////////////////////////////////////////
        /// Method Name : main
        /// Description : It is used to Accept the marks of individual subject by user..
        ///////////////////////////////////////////////////////////////////////
        
    public static void main(String Arg[])
    {
        //Accept the marks from user using scanner class
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the marks obtained in each subject /100 : ");

        System.out.println("English -> ");
        int iEng = sobj.nextInt();

        System.out.println("Hindi -> ");
        int iHindi = sobj.nextInt();

        System.out.println("Physics -> ");
        int iPhy = sobj.nextInt();

        System.out.println("Chemistry -> ");
        int iChem = sobj.nextInt();

        System.out.println("Mathematics -> ");
        int iMath = sobj.nextInt();

        System.out.println("Biology -> ");
        int iBio = sobj.nextInt();

        //Call of userdefined function (DisplayResult) : 
        DisplayResult(iEng,iHindi,iPhy,iChem,iMath,iBio);

    }
}