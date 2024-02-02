public class Main {
    public static void main(String[] args) {
        int currentBalance = 200; // начальная сумма на счету клиента
        int replenishment = 2000; // сумма пополнения

        int bonus = replenishment / 100; // расчет бонусных рублей
        int finalBalance = currentBalance + replenishment + bonus; // расчет итогового счета

        System.out.println("Итоговая сумма на счету клиента: " + finalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}