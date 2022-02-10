public class BmiServise {
    public int calculate(int weight, int growth) {
        int growthSquared = growth * growth / 10_000;

        int bodyMassIndex = weight / growthSquared;


        return bodyMassIndex;


    }
}
