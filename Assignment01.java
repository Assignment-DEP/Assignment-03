import java.util.Scanner;

public class Assignment01 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_GREEN_BOLD = "\033[32;1m";
        final String COLOR_YELLOW_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        String name;
        int age;
        String sub1; 
        String sub2;
        String sub3;
        double marks1;
        double marks2;
        double marks3;

        final String ERROR_MESSAGE = String.format("%s%s%s \n", COLOR_RED_BOLD,"%s",RESET);

        app:{
            System.out.print("Enter your name : ");
            name = scanner.nextLine().strip();
    
            if (name.length() == 0){
                System.out.printf(ERROR_MESSAGE,"Name can't be empty....!");
                break app;
            }
            //System.exit(1);     // exit form the JVM
            
            System.out.print("Enter your age : ");
            age = scanner.nextInt();
            scanner.nextLine();
            if (age < 10 || age > 18){
                System.out.printf(ERROR_MESSAGE,"Invalid age..!");
                break app;
            }
            /* subject 01 */
            System.out.print("Enter Subject-01 : ");
            sub1 = scanner.nextLine().strip();
            if(sub1.isBlank()){
                System.out.printf(ERROR_MESSAGE,"Subject can't be empty....!");
                break app;
            }else if (!sub1.startsWith("SE-")){
                System.out.printf(ERROR_MESSAGE,"Invalid subject...!");
                break app;
            }
            System.out.print("Enter marks for subject 01 : ");
            marks1 = scanner.nextDouble();
            scanner.nextLine();
            if (marks1 < 0 || marks1 > 100){
                System.out.printf(ERROR_MESSAGE,"Invalid marks...!");
                break app;
            }
    
            /* subject 02 */
            System.out.print("Enter Subject-02 : ");
            sub2 = scanner.nextLine().strip();
            if(sub1.isBlank()){
                System.out.printf(ERROR_MESSAGE,"Subject can't be empty....!");
                break app;
            }else if (!sub2.startsWith("SE-")){
                System.out.printf(ERROR_MESSAGE,"Invalid subject...!");
                break app;
            }else if (sub2.equals(sub1)){
                System.out.printf(ERROR_MESSAGE,"Subject already exits..!");
                break app;
            }
            System.out.print("Enter marks for subject 02 : ");
            marks2 = scanner.nextDouble();
            scanner.nextLine();
            if (marks2 < 0 || marks2 > 100){
                System.out.printf(ERROR_MESSAGE,"Invalid marks...!");
                break app;
            }
    
    
            /* subject 03 */
            System.out.print("Enter Subject-03 : ");
            sub3 = scanner.nextLine().strip();
            if(sub3.isBlank()){
                System.out.printf(ERROR_MESSAGE,"Subject can't be empty....!");
                break app;
            }else if (!sub3.startsWith("SE-")){
                System.out.printf(ERROR_MESSAGE,"Invalid subject...!");
                break app;
            }else if (sub3.equals(sub2) || sub3.equals(sub1)){
                System.out.printf(ERROR_MESSAGE,"Subject is already exits....!");
                break app;
            }
            System.out.print("Enter marks for subject 03 : ");
            marks3 = scanner.nextDouble();
            scanner.nextLine();
            if (marks3 < 0 || marks3 > 100){
                System.out.printf(ERROR_MESSAGE,"Invalid marks...!");
                break app;
            }

        
       

        double total = marks1+marks2+marks3;
        double avg = total/3;

        String status; //Overall status eka
        String subject1Status;
        String subject2Status;
        String subject3Status;

        final String DISTINGINISHED_PASS = COLOR_BLUE_BOLD+"Distinginiahed Pass"+RESET;
        final String CREDIT_PASS = COLOR_GREEN_BOLD+"Credit Pass"+RESET;
        final String PASS = COLOR_YELLOW_BOLD+"Pass"+RESET;
        final String FAIL = COLOR_RED_BOLD + "Fail" + RESET;


        //Determine the overall status
        if(avg >=75) status = DISTINGINISHED_PASS;
        else if(avg>=65) status = CREDIT_PASS;
        else if (avg>=55) status = PASS;
        else status=FAIL;//samahara company wala meka gahanna epaa kiyanava

        // Subject 1 status
        if(marks1>=75) subject1Status = DISTINGINISHED_PASS;
        else if(marks1>=65) subject1Status = CREDIT_PASS;
        else if (marks1>=55) subject1Status = PASS;
        else subject1Status=FAIL;

         // Subject 2 status
        if(marks2>=75) subject2Status = DISTINGINISHED_PASS;
        else if(marks2>=65) subject2Status = CREDIT_PASS;
        else if (marks2>=55) subject2Status = PASS;
        else subject2Status=FAIL;

         // Subject 3 status
        if(marks3>=75) subject3Status = DISTINGINISHED_PASS;
        else if(marks3>=65) subject3Status = CREDIT_PASS;
        else if (marks3>=55) subject3Status = PASS;
        else subject3Status=FAIL;

        sub1 = String.format("SE-%03d",Integer.valueOf(sub1.substring(3)));
        sub2 = String.format("SE-%03d",Integer.valueOf(sub2.substring(3)));
        sub3 = String.format("SE-%03d",Integer.valueOf(sub3.substring(3)));
        
        name = String.format("%s%s%s", COLOR_BLUE_BOLD,name.toUpperCase(),RESET);


        // lets genertat table

        System.out.println("+".concat("-".repeat(45)).concat("+"));
        System.out.printf("|%10s: %-44s|\n","Name",name);
        System.out.printf("|%10s: %-33s|\n","Age",age+ " years old");
        System.out.printf("|%10s: %-44s|\n","Status",status);
        System.out.printf("|%10s: %-33s|\n","Total",String.format("%.2f",total));
        System.out.printf("|%10s: %-33s|\n", "Avarage",String.format("%.2f", avg).concat("%"));
       
        final String LINE = "+".concat("-".repeat(7).concat("+").concat("-".repeat(12).concat("+").concat("-".repeat(24).concat("+"))));
        System.out.println(LINE);
        System.out.printf("|%-7s|%-12s|%-24s|\n","Subject","Marks","Status");
        System.out.println(LINE);
        System.out.printf("|%-7s|%-12s|%-35s|\n",sub1,marks1,subject1Status);
        System.out.printf("|%-7s|%-12s|%-35s|\n",sub2,marks2,subject2Status);
        System.out.printf("|%-7s|%-12s|%-35s|\n",sub3,marks3,subject3Status);
        
        System.out.println("+".concat("-".repeat(45).concat("+")));
        


    }
    
}}
