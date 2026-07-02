import java.util.Random;

public class part1 {
     public static void main(String[] args) throws Exception {
        Random random = new Random();
        int[] years = new int[50];
        double sum = 0;
        double avg = 0;
        for (int elem = 0; elem<years.length; elem++){
            years[elem] = random.nextInt(26) + 2000;
            if (years[elem] > 2015){
                System.out.println(elem);
            }
            sum += years[elem];
            }
        
        avg = sum/50;
        System.out.println(avg);
        
    }
}
