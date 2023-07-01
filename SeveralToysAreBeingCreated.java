public class SeveralToysAreBeingCreated {
    public static void main(String[] args) {
        ContainsAListOfToys store = new ContainsAListOfToys();

        ContainsFieldsForTheToyId toy1 = new ContainsFieldsForTheToyId(1, "МЯЧ ТАКАНЕ", 10, 20);
        ContainsFieldsForTheToyId toy2 = new ContainsFieldsForTheToyId(2, "ЛАЙТБОРД", 200, 40);
        ContainsFieldsForTheToyId toy3 = new ContainsFieldsForTheToyId(3, "ЛЕТАЮЩИЙ СПИННЕР", 200, 90);
        ContainsFieldsForTheToyId toy4 = new ContainsFieldsForTheToyId(3, "КУКОЛЬНЫЙ ДОМИК", 50, 30);
        ContainsFieldsForTheToyId toy5 = new ContainsFieldsForTheToyId(3, "БАЛАНСИР", 200, 90);
        ContainsFieldsForTheToyId toy6 = new ContainsFieldsForTheToyId(3, "РАСКОПКИ", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        ContainsFieldsForTheToyId prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}

