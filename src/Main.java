public class Main {
    public static void main(String[] args) {
        long customer_account = 100; //Счет клиента, в рублях
        long customer_pay = 1100; // Платеж клиента, в рублях
        long required_pay = 1000; // Порог для начисления бонусов, в рублях
        long bonus = 0;

        if (customer_pay > required_pay){
            bonus = customer_pay /100;
        }
        // Счет клиента, в рублях
        customer_account = customer_account + customer_pay + bonus;

        //Выводим платеж, значение бонуса и счет клиента
        System.out.printf("Внесен платеж: %d\n" +
                "Начислен бонус: %d\n" +
                "Баланс счета: %d", customer_pay, bonus, customer_account);
    }
}
