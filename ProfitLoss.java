public class ProfitLoss {
    public static String findProfitOrLoss(int cp, int sp) {
        String returned_value = "NP";

        // checking for profit or loss
        if(sp > cp) {
            returned_value = "Profit";
        } else {
            returned_value = "Loss";
        }

        return returned_value;
    }
}