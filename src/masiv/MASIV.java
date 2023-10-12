package masiv;
import java.util.*;

public class MASIV {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] temperatureArray = new int[12][];
        for (int month = 0; month < temperatureArray.length; month++) {
            int dayMonth;
            switch (month) {
                case 3: case 5: case 8: case 10:
                    dayMonth = 30;
                    break;
                case 1:
                    dayMonth = 28;
                    break;
                default:
                    dayMonth = 31;
                    break;
            }
            temperatureArray[month] = new int[dayMonth];
            for (int day = 0; day < dayMonth; day++) {
                int temperature;
                if (month >= 3 && month <= 5) {
                    temperature = random.nextInt(10) + 10;}
                else if (month >= 6 && month <= 8) {
                    temperature = random.nextInt(15) + 25;}
                else if (month >= 9 && month <= 11) {
                    temperature = random.nextInt(10) + 10;}
                else {
                    temperature = random.nextInt(20) - 10;}
                temperatureArray[month][day] = temperature;
            }
        }
            for (int month = 0; month < temperatureArray.length; month++) {
                for (int day = 0; day < temperatureArray[month].length; day++) {
                    System.out.printf("Temperature %d, day %d : %dC\n", month + 1, day+1,temperatureArray[month][day]);
                }
            }
     } 
}
