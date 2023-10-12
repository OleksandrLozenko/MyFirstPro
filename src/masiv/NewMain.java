package masiv;
//======================================================  
import java.util.*;
//======================================================  
public class NewMain {
//======================================================      
    private enum MONTH {
        Январь,Февраль,Март,Апрель,Май,Июнь,Июль,Август,Сентябрь,Октябрь,Ноябрь,Декабрь
    }
//======================================================  
    public static void main(String[] args) {
//======================================================         
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//======================================================        
        int[][] WeatherInYear = new int[12][];
        WeatherInYear[0] = new int[31];
        WeatherInYear[1] = new int[28];
        WeatherInYear[2] = new int[31];
        WeatherInYear[3] = new int[30];
        WeatherInYear[4] = new int[31];
        WeatherInYear[5] = new int[30];
        WeatherInYear[6] = new int[31];
        WeatherInYear[7] = new int[31];
        WeatherInYear[8] = new int[30];
        WeatherInYear[9] = new int[31];
        WeatherInYear[10] = new int[30];
        WeatherInYear[11] = new int[31];
//======================================================         
        int min = -35;
        int max = 35;
//======================================================         
        for (int i = 0; i < WeatherInYear.length; i++) {
            for (int j = 0; j < WeatherInYear[i].length; j++) {
                WeatherInYear[i][j] = random.nextInt(max-min+1) + min;}}
//======================================================          
        for (int i = 0; i < WeatherInYear.length; i++) {
            System.out.printf("%10s:", MONTH.values()[i]);
            for (int j = 0; j < WeatherInYear[i].length; j++) {
                System.out.printf("%4", )}}
//======================================================        
    }   
}
