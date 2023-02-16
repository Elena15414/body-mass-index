public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massKg = 60;
        double heightM = 1.77;
        int index = service.calculate(massKg, heightM );
        System.out.println(index);
    }
}
 // Консоль :
// "C:\Program Files\Eclipse Adoptium\jdk-11.0.17.8-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=64946:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Татьяна\body mass index\out\production\body mass index" Main
//19
//
//Process finished with exit code 0