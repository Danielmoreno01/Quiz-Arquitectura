import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> listaAutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int menu;
        do {
            System.out.println("\n----------------BIENVENID@------------" +
                                "\n------------------ MENÚ------------------");
            System.out.println("1. Agregar Auto");
            System.out.println("2. Mostrar Autos");
            System.out.println("3. Actualizar Kilometraje");
            System.out.println("4. Verificar si es Antiguo");
            System.out.println("5. Verificar si necesita Mantenimiento");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            menu = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (menu) {
                case 1:
                    System.out.print(" Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print(" Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print(" Año: ");
                    int anio = scanner.nextInt();

                    System.out.print(" kilometraje: ");
                    double kilometraje = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();

                    listaAutos.add(new Auto(marca, modelo, anio, kilometraje, estado));
                    System.out.println("Nuevo auto agregado.");
                    break;

                case 2:
                    if (listaAutos.isEmpty()) {
                        System.out.println("No hay autos registrados.");
                    } else {
                        for (Auto auto : listaAutos) {
                            auto.mostrardetalles();
                            System.out.println("---------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la marca del auto a actualizar: ");
                    String marcaBuscar = scanner.nextLine();
                    boolean encontrado = false;

                    for (Auto auto : listaAutos) {
                        if (auto.getMarca().equalsIgnoreCase(marcaBuscar)) {
                            System.out.print("Ingrese nuevo kilometraje: ");
                            double nuevoKilometraje = scanner.nextDouble();
                            auto.setKilometraje(nuevoKilometraje);
                            System.out.println("Kilometraje actualizado.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Auto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaAntiguo = scanner.nextLine();
                    boolean encontradoAntiguo = false;

                    for (Auto auto : listaAutos) {
                        if (auto.getMarca().equalsIgnoreCase(marcaAntiguo)) {
                            boolean esAntiguo = auto.getAnio() < (2024 - 15);
                            System.out.println("El auto es antiguo: " + esAntiguo);
                            encontradoAntiguo = true;
                            break;
                        }
                    }
                    if (!encontradoAntiguo) {
                        System.out.println("Auto no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaMantenimiento = scanner.nextLine();
                    boolean encontradoMantenimiento = false;

                    for (Auto auto : listaAutos) {
                        if (auto.getMarca().equalsIgnoreCase(marcaMantenimiento)) {
                            boolean necesitaMantenimiento = auto.getKilometraje() > 100000;
                            System.out.println("El auto necesita mantenimiento: " + necesitaMantenimiento);
                            encontradoMantenimiento = true;
                            break;
                        }
                    }
                    if (!encontradoMantenimiento) {
                        System.out.println("Auto no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (menu != 6);

        scanner.close();
    }
}





