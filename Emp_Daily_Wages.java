package Day4_Pract_Prob;

public class Emp_Daily_Wages {

        public static void main(String[] args) {

            int FULL_TIME = 1;
            int WAGE_PER_HR = 20;
            int empType = (int) (Math.random () * 100) % 2;
            int workingHrs = 0;
            if (empType == FULL_TIME) {
                System.out.println ("Employee is Present");
                workingHrs = 8;
            } else {
                System.out.println ("Employee is Absent");
            }
            int wage = workingHrs * WAGE_PER_HR;
            System.out.println ("Employee Daily Wage is " + wage);
        }

}
