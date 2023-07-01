import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ContainsAListOfToys {
    private ArrayList<ContainsFieldsForTheToyId> toys;
    private ArrayList<ContainsFieldsForTheToyId> prizeToys;
    private String prizeFilePath;

    public ContainsAListOfToys() {
        toys = new ArrayList<ContainsFieldsForTheToyId>();
        prizeToys = new ArrayList<ContainsFieldsForTheToyId>();
        prizeFilePath = "PrizeToys.txt";
    }

    public void addToy(ContainsFieldsForTheToyId toy) {
        toys.add(toy);
    }

    public void changeToyFrequency(int toyId, double newFrequency) {
        for (ContainsFieldsForTheToyId toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(newFrequency);
            }
        }
    }

    public void organizeRaffle() {
        prizeToys.clear();

        for (ContainsFieldsForTheToyId toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequency()) {
                prizeToys.add(toy);
            }
        }
    }
    public ContainsFieldsForTheToyId getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            ContainsFieldsForTheToyId prizeToy = prizeToys.remove(0);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);

            try {
                FileWriter writer = new FileWriter(prizeFilePath, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл игрушки");
            }

            return prizeToy;
        } else {
            System.out.println("Все игрушки кончились");
            return null;
        }
    }
}


  


