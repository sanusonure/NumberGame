import java.util.*;
class RandomNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int attempt=-1;
        int max,min,rnum,win=0,choice=1;
        while(choice==1)
        {
            System.out.println(" ************************************* Welcome In Number Game ************************************************ ");
            System.out.println(" Enter the minimum and maximum number : ");
            min=sc.nextInt();
            max=sc.nextInt();
            rnum=(int) (Math.random()*(max-min+1)+min);
            while(true)
            {
                attempt++;
                if(attempt==5)
                    break;
                System.out.println(" Guess the number between "+ min + " - "+ max);
                int guess=sc.nextInt();
                
                if(guess==rnum)
                {
                    System.out.println(" Generated random number : "+ rnum);
                    System.out.println(" Congrats You guessed the correct number ");
                    win++;
                    break;
                }
                else if(guess>rnum)
                {
                    System.out.println(" Your guess is greater than generated number ");
                }
                else 
                {
                    System.out.println(" Your guess is smaller than generated number ");
                }
                
            } 
                 System.out.println(" Win : "+win);
                 System.out.println(" Total attempts : 5 ");
                 System.out.println(" No of Attempts : "+attempt);
                 System.out.println(" Win Rate : "+ (double)win/attempt*100);
                 System.out.println(" Press 1 for PalyAgain Otherwise 0 ");
                 choice=sc.nextInt();
                 if(choice==0)
                    System.exit(0);
                win=attempt=0;
           
        }
        
    }
}