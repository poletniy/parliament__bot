public class bot {
    public static void main(String[] args) {
        int result = (int) (Math.random()*2); //get a 50/50 chance in random generator
        if (result == 0) {
            System.out.println("No"); //to annul a law
        }
        else{
            System.out.println("Yes"); //to pass a law
        }
    }
}
