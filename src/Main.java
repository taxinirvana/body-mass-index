import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        BmiServise index = new BmiServise();

        int bmi = index.calculate(80, 175);
        System.out.println("Ваш индекс" + bmi);


    }

}
