import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditPaymentService {

    public static BigDecimal monthlyPayment(int amount, int creditPeriod, double interestRate) {
        double monthlyPercent = interestRate / 12 / 100;
        double payment = amount * (monthlyPercent * Math.pow(1 + monthlyPercent, creditPeriod * 12) / (Math.pow(1 + monthlyPercent, creditPeriod * 12) - 1));
        BigDecimal result = new BigDecimal(payment);
        result = result.setScale(0, RoundingMode.HALF_UP);
        return result;
    }
}
