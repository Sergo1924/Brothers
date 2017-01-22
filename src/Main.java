public class Main {

    public static void main(String[] args) {
	// write your code here
    // Выяснить возраст всех 4-х братьев, сумма 3 - х  из которых поочередно,  - 30, 32, 32, 35

        int minAge = 5;
        int maxAge = 15;
        for (int i = 0; i < maxAge; i++) {
            for (int j = 0; j <maxAge ; j++) {
                for (int k = 0; k < maxAge ; k++) {
                    for (int l = 0; l < maxAge ; l++) {
                        int sum = i + j + k;
                        int sum1 = i + j + l;
                        int sum2 = i + k + l;
                        int sum3  = j + k + l;
                        if (sum == 30 && sum1 == 32 && sum2 == 32 && sum3 ==35 ) {
                            System.out.println(i + " " + j + " " + k + " " + l);
                        }
                    }
                }
            }
        }
    }
}
