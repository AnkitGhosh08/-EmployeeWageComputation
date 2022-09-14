public class EmployeeWageComputationUc4
{
    public static void main(String[] args)

    {
        int FULL_TIME = 1;
        int PART_TIME = 2;
        int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        int wage = 0;

        switch (empType)
        {
            case 1:
                workingHours = 8;
                break;
            case 2:
                workingHours = 4;
                break;
            default:
        }
        wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}

