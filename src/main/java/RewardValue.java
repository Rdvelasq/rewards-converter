public class RewardValue {
    private double cashValue;
    private double convertedCashValue;
    private int miles;
    private int convertedMiles;
    private double milesToCashRate = 0.0035;

    //convert cash to miles
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public  RewardValue(int miles){
        this.miles = miles;
    }

    private void convert_from_miles_to_cash(){
        this.convertedCashValue = (double)(miles * milesToCashRate);

    }

    private void convert_from_cash_to_miles(){
        this.convertedMiles = (int)(cashValue / milesToCashRate);

    }

    public double getCashValue(){
        return cashValue;
    }

    public  int getMilesValue(){
        return miles;
    }

    public int getConvertedMiles(){
        convert_from_cash_to_miles();
        return  convertedMiles;
    }

    public double getConvertedCash(){
        convert_from_miles_to_cash();
        return convertedCashValue;
    }


}
