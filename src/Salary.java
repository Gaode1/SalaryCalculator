public class Salary {
    public static void main(String[] args) {
        double salary = 240000;
        double sum = 0;
        for(int i = 30; i >= 0; i--) {
            sum = sum + salary * Math.pow(1.04,i);
        }

        System.out.println(sum);
    }
}

