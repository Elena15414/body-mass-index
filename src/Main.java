public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massKg = 60;
        double heightM = 1.77;
        int index = service.calculate(massKg, heightM );
        System.out.println(index);
    }
}
