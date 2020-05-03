public class Main {
    public static void main(String[] args) {
        long customerAccount = 100; //Счет клиента, в рублях
        long customerPay = 1100; // Платеж клиента, в рублях
        long requiredPay = 1000; // Порог для начисления бонусов, в рублях
        long bonus = 0;

        if (customerPay > requiredPay){
            bonus = customerPay /100;
        }
        // Обновляем баланс счета
        customerAccount = customerAccount + customerPay + bonus;

        //Выводим платеж, значение бонуса и счет клиента
        System.out.printf("Внесен платеж: %d\n" +
                "Начислен бонус: %d\n" +
                "Баланс счета: %d", customerPay, bonus, customerAccount);
    }
}
