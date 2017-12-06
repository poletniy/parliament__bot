public class bot {
    public static void main(String[] args) {
        int result = (int) (Math.random()*2);
        if (result == 0) {
            System.out.println("Законопроект отклонен"); //to annul a law
        }
        else{
            System.out.println("Законопроект принят"); //to pass a law
        }
    }
}
