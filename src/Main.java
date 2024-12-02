import org.Alondra.Entity.Books;
import org.Alondra.Entity.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gut
public class Main {
    public static void main(String[] args) {

        Books books = new Books(
                "El lago de los cisnes", "Charlotte Gastaut", 900
        );

        books.showInformation();

        if (books.isLong()){
            System.out.println("El libro tiene mas de 300 paginas");
        } else {
            System.out.println("El libro tiene menos de 300 paginas");
        }

        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 14000);

        vehicle.setInformationCars();

        if (vehicle.needMilageRevision()) {
            System.out.println("El vehiculo necesita ser revisado");
        } else {
            System.out.println("El vehiculo no necesita revision");
        }
    }


}