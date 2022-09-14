import javax.swing.*;

public class EmployeeWageComputationUc1
{
    public static void main (String[] args)
    {
        int is_full_time= 1;

        int empcheck =(int) (Math.random() * 100) % 2;

        if ( empcheck == is_full_time )
        {
            System.out.println(" Employee is present ");
        }
        else
        {
            System.out.println(" Employee is absent ");
        }

    }
}
