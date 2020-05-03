# Задача № 2 "Получи рубль за каждые 100!"

## Краткое описание

1. Создано базовое приложение. 
2. Используется четыре переменные, типа long:
    * customer_pay      -   платеж клиента, в рублях
    * required_pay      -   порог для начисления бонусов, в рублях
    * bonus             -   начисленный бонус, в рублях
    * customer_account  -   счет клиента, в рублях
3. Для вывода результата используется форматированный вывод.

## Код

```java
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
```