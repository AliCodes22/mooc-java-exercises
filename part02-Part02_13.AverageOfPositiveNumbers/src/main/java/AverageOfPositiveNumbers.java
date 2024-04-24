import java.util.Scanner;

public class AverageOfPositiveNumbers {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double sum=0;
    double count=0;
    
    while(true){
        double num = Double.valueOf(scanner.nextLine());
        
        if(num==0){
            break;
        }
        if(num>0){
            sum += num;
            count++;
        }
    }
    if(count<=0){
        System.out.println("Cannot calculate the average");
    }
    double avarage = sum/count;
    if(avarage >0){
        System.out.println(avarage);
    }
}
}
