import java.math.BigDecimal;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сумма кредита 1_000_000 р., Срок кредита 1 год, Процентная ставка 9.99 %, Ежемесячный платеж: " + CreditPaymentService.monthlyPayment(1_000_000, 1, 9.99) + "р.");
        System.out.println("Сумма кредита 1_000_000 р., Срок кредита 2 года, Процентная ставка 9.99 %, Ежемесячный платеж: " + CreditPaymentService.monthlyPayment(1_000_000, 2, 9.99) + "р.");
        System.out.println("Сумма кредита 1_000_000 р., Срок кредита 3 года, Процентная ставка 9.99 %, Ежемесячный платеж: " + CreditPaymentService.monthlyPayment(1_000_000, 3, 9.99) + "р.");
    }
}
