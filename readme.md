# Задача № 2 "Получи рубль за каждые 100!"

## Краткое описание

1. Создано базовое приложение. 
2. Используется четыре переменные, типа long:
    * customerPay      -   платеж клиента, в рублях
    * requiredPay      -   порог для начисления бонусов, в рублях
    * bonus             -   начисленный бонус, в рублях
    * customerAccount  -   счет клиента, в рублях
3. Для вывода результата используется форматированный вывод.

## Код

```java
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
```