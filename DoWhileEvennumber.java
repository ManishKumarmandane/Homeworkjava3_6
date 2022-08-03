package Homeworkjava3_6;

public class DoWhileEvennumber
{
    public static void main(String[] args)
    {
        int i=1;
        do {
            if(i%2==0)
            {
                System.out.println("even "+i);
            }
            else
            {
                System.out.println("odd  "   +i);
            }
            i++;
        }while (i<=10);
    }
}
