public class RewardValue {
    private double cashValue;
    private int miles;
    private double milesToCashRate = 0.0035;

    //convert cash to miles
    public RewardValue(double cashValue){
        this.miles = (int)(cashValue * milesToCashRate);
    }

    public  RewardValue(int miles){
        this.cashValue = miles / milesToCashRate;
    }

    public double getCashValue(){
        return cashValue;
    }

    public  int getMilesValue(){
        return miles;
    }
}
