import java.util.Scanner;
/**
 * Letter grade translated to a numeric grade.
 */
public class LetterGradeToNumericGradeWithSwitch
{
    public static void main(String[] args)
    {

        String grade;
        double nGrade = 0.0;
        
        String st = "A";
        
        // System.out.println("Enter letter grade:");
        // Scanner kb = new Scanner(System.in);
        // grade = kb.next();
        
        grade = getLetterGrade();
        nGrade = getGPA(grade);

        printGPA(grade, nGrade);
        
    }// end main
    // print results
    public static void printGPA(String grade, double nGrade){
        System.out.println(grade+" --> "+nGrade);
    }// end print result
    
    // calculate gpa
    public static double getGPA(String g){
        double gpa = 0.0;
        
        switch (g) {
            case "a":
            case "A": gpa = 4.0;
                        System.out.println("well done");
                break;
            case "b": case "B": 
                        gpa = 3.0;
                break;
            case "C": gpa = 2.0;
                break;
            case "D": gpa = 1.0;
                break;
            case "F": gpa = 0.0;
                break;
            default:    gpa = -1.0;
                        System.out.println("invalid grad entered");
        }// end switch
        
        return gpa;
    }// end get gpa
    
    // get a letter grade
    public static String getLetterGrade(){
        String grade; 
        
        System.out.println("Enter letter grade:");
        Scanner kb = new Scanner(System.in);
        grade = kb.next();  
        
        return grade;
    }// end get letter grade
}// end of the class
