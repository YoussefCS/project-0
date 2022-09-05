package gradeaverage1;
import java.util.Scanner;
public class gradeAverage1 {
    public static double calcAverage(double userScore1, double userScore2,
            double userScore3, double userScore4, double userScore5){ 
        double average;
        average=(userScore1+userScore2+userScore3+userScore4+userScore5)/5;
        return average;   
    
    }
     public static String determineGrade(double testScore){ 
        String letterGrade= " ";
        if(testScore>=90 && testScore<=100){
            letterGrade= "A";
        }else if(testScore>=80 && testScore<=89){
            letterGrade= "B";
        }else if(testScore>=70 && testScore<=79){
            letterGrade= "C";
        }else if(testScore>=60 && testScore<=69){
            letterGrade= "D";
        }else{
            letterGrade= "F";            
        }
        return letterGrade;
   }
   public static void main(String[] args) {
    double[] scores= new double[5];
    Scanner reader = new Scanner(System.in); 
    for(int i=0;i<5;i++){
       System.out.print("Enter test grade for student "+(i+1)+":");
       scores[i] = reader.nextDouble();
    }
     for(int i=0;i<5;i++){
       System.out.println("Student"+(i+1)+": "+determineGrade(scores[i]));
    }
    System.out.println("The average grade was: "+calcAverage(scores[0],scores[1]
    , scores[2], scores[3], scores[4]));

    System.out.println();
  }
}