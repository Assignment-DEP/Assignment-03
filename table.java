public class table {
    public static void main(String[] args) {
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_GREEN_BOLD = "\033[32;1m";
        final String COLOR_YELLOW_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        String name = "Kasun Sampath";
        int age =  15;
        String subject1 = "SE-1";
        String subject2 = "SE-2";
        String subject3 = "SE-3";
        double marks1 = 45;
        double marks2 = 65;
        double marks3 = 85;

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

        subject1 = String.format("SE-%03d",Integer.valueOf(subject1.substring(3)));
        subject2 = String.format("SE-%03d",Integer.valueOf(subject2.substring(3)));
        subject3 = String.format("SE-%03d",Integer.valueOf(subject3.substring(3)));
        
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
        System.out.printf("|%-7s|%-12s|%-35s|\n",subject1,marks1,subject1Status);
        System.out.printf("|%-7s|%-12s|%-35s|\n",subject2,marks2,subject2Status);
        System.out.printf("|%-7s|%-12s|%-35s|\n",subject3,marks3,subject3Status);
        
        System.out.println("+".concat("-".repeat(45).concat("+")));
        


    }
    
}
