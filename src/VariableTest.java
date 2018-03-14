public class VariableTest {


    public static void printMax(double... numbers){
        double max_num = numbers[0];

        for(int i = 1; i < numbers.length; ++ i){
            if (max_num < numbers[i]){
                max_num = numbers[i];
            }
        }
        System.out.println(max_num);
    }

    public static void main(String... args){
        printMax(1, 5, 6, 8);
        printMax(new double[]{1, 6, 5.6});
    }

}
