public class bot {
    public static void main(String[] args) {
        int result = (int) (Math.random()*2);
        if (result == 0) {
            System.out.println("No"); //to annul a law
        }
        else{
            System.out.println("Yes"); //to pass a law
        }
    }
}
