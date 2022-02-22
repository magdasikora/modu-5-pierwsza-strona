package pl.magdasikora;

public class Main {

    public static void main(String[] args) {

        int[] tabl = {-1, 2, 50, 100};

        Numbers numbers = new Numbers(tabl);

        Lambda1 lambda1 = new Lambda1() {
            @Override
            public int add(int[] numbers1) {
                int sum = 0;
                for (int i = 0; i < numbers1.length; i++)
                    sum = sum + numbers1[i];
                return sum;
            }
        };
        int showAdd = numbers.add(lambda1);
        System.out.println(showAdd);

// stworzenie lambdy i demonstracja działania
        Lambda1 lambda1a = (int[] numbers1a) -> {
            int sum = 0;
            for (int i = 0; i < numbers1a.length; i++)
                sum = sum + numbers1a[i];
            return sum;
        };

        int showAdd1 = numbers.add(lambda1a);
        System.out.println(showAdd1);


        Lambda2 lambda2 = new Lambda2() {
            @Override
            public double avg(int[] numbers2) {
                double sum = 0;
                double avg = 0;
                for (int i = 0; i < numbers2.length; i++) {
                    sum = sum + numbers2[i];
                    avg = sum / numbers2.length;
                }
                return avg;
            }
        };
        double showAvg2 = numbers.avg(lambda2);
        System.out.println(showAvg2);

        Lambda2 lambda2a = (int[] numbers2) -> {
            double sum = 0;
            double avg = 0;
            for (int i = 0; i < numbers2.length; i++) {
                sum = sum + numbers2[i];
                avg = sum / numbers2.length;
            }
            return avg;
        };

        double showAvg2a = numbers.avg(lambda2);
        System.out.println(showAvg2a);

        Lambda3 lambda3 = new Lambda3() {
            @Override
            public void show(int[] numbers) {

                for (int i = 0; i < numbers.length; i++)
                    if (numbers[i] > 2) {
                        System.out.println(numbers[i]+ " ta liczba jest większa niż 2");
                    }
            }
            };
        numbers.show(lambda3);

        Lambda3 lambda3a=(int[] numbers3a)->{
            for (int i = 0; i < numbers3a.length; i++)
                if (numbers3a[i] > 2) {
                    System.out.println(numbers3a[i]+ " ta liczba jest większa niż 2");
                }
        };
        numbers.show(lambda3a);
    }
}







// poczytać o streemach

