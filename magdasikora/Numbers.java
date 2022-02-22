package pl.magdasikora;

public class Numbers  {
    public int[] numbers;


    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

   public int add(Lambda1 lambda) {
        return lambda.add(numbers);
    }

    public double avg (Lambda2 lambda){
        return lambda.avg(numbers);
    }

    public void show(Lambda3 lambda){
        lambda.show(numbers);}

}





