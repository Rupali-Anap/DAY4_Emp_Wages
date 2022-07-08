package Day4_Pract_Prob;

public class Emp_wages_computation {

        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wages Computation Programme.");

            int Present = 1;

            double empCheck = Math.floor(Math.random() * 10) % 2;
            if (empCheck == Present)
                System.out.println("Employee is present");
            else {
                System.out.println("Employee is absent");
            }
        }

}

