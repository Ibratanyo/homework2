import java.util.Random;

public class homework2 {

    public static void main(String[] args) {
        int max = 30;
        int min = -20;
        int range = max - min +1;
        String name = "Ибрагим";
        int weather = (int) (Math.random() * range) + min;
        int age = generateRandomAge();
         if ((age >= 20 && age <= 45) && (weather <= 30 && weather >= -20)) {
             System.out.println("иди на улицу " + name +" смело тебе " + age + " лет" + " на улице " + weather + " градусов");

         }else if (age <= 20 && (weather >= 0 && weather <= 28)){
             System.out.println("иди на улицу " + name +" смело тебе " + age + " лет" + " на улице " + weather + " градусов");
         }else if (age >= 45 && (weather >= -10 && weather <= 25)) {
             System.out.println("иди на улицу " + name +" смело тебе " + age + " лет" + " на улице " + weather + " градусов");
         }else {
             System.out.println("Сиди дома " + name);
         }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(108);
    }
}
