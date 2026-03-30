import java.util.Scanner;
public class reportcard{
    static int percentage(int n){
        int totalpercentage = n/5;
        System.out.println("total percentage is:"+totalpercentage);
        return n/5;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student's name:");
        String name = sc.nextLine();

        System.out.println("enter the subjects marks....");
        System.out.println("maths:");
        int maths = sc.nextInt();
        System.out.println("english:");
        int eng = sc.nextInt();
        System.out.println("science:");
        int science = sc.nextInt();
        System.out.println("social:");
        int sst = sc.nextInt();
        System.out.println("computer:");
        int comp = sc.nextInt();

        int n = maths + eng + science + sst + comp;
        System.out.println("total marks:"+n);
        int per = percentage(n);
    
    if(per>=95){
        System.out.println("your grade is A+");
    }
    else if(per>=90){
        System.out.println("your grade is A");
    }
    else if(per>=85){
        System.out.println("your grade is B+");
    }
    else if(per>=75){
        System.out.println("your grade is B");
    }
    else if(per>=65){
        System.out.println("your grade is C+");
    }
    else if(per>=55){
        System.out.println("your grade is C");
    }
    else if(per>=45){
        System.out.println("your grade is D+");
    }
    else if(per>=33){
        System.out.println("your grade is D");
    }
    else{
        System.out.println("your grade is F mean Fail.");
    }
    
    }
}