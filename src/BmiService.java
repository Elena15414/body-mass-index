public class BmiService {
    public int calculate(int massKg, double heightM) {

        int index = (int) (massKg / (heightM * heightM));
        return index;
    }
}

