/**
 * Clase Main
 * Fernando Rueda - 23748
 * Descripción: Clase principal para ejecutar el sistema.
 * Fecha de creación: [27/10/2023]
 * Fecha de última modificación: [29/10/2023]
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * Método principal para ejecutar la aplicación.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Lista para almacenar los dispositivos.
        ArrayList<Device> devices = new ArrayList<>();

        // Controlador para gestionar los dispositivos.
        Controller controller = new Controller(devices);

        // Scanner para recibir la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Bucle principal para mostrar el menú y recibir la opción del usuario.
        while (true) {

            // Mostrar opciones del menú principal.
            System.out.println("Selecciona una opción:");
            System.out.println("1. Cargar dispositivos desde CSV");
            System.out.println("2. Mostrar todos los dispositivos");
            System.out.println("3. Seleccionar un dispositivo");
            System.out.println("4. Controlar dispositivo seleccionado");
            System.out.println("5. Visualizar dispositivo más caro");
            System.out.println("6. Visualizar dispositivo más barato");
            System.out.println("7. Salir");
            int choice = scanner.nextInt();

            // Switch para manejar la opción seleccionada por el usuario.
            switch (choice) {
                case 1:
                    try {
                        System.out.println("Ingrese la ruta del archivo CSV:");
                        String filePath = scanner.next();
                        controller.loadDevicesFromCSV(filePath);
                        System.out.println("Dispositivos cargados exitosamente.");
                    } catch (Exception e) {
                        System.out.println("Error al cargar el archivo: " + e.getMessage());
                    }
                    break;
                case 2:
                    for (int i = 0; i < devices.size(); i++) {
                        System.out.println((i + 1) + ". " + devices.get(i).getClass().getSimpleName() + " - " + devices.get(i).getBrand());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el número del dispositivo que desea seleccionar:");
                    int deviceNumber;
                    try {
                        deviceNumber = scanner.nextInt();
                        if (deviceNumber < 1 || deviceNumber > devices.size()) {
                            System.out.println("Número de dispositivo inválido. Intente nuevamente.");
                            continue;
                        }
                        controller.setSelectedDevice(devices.get(deviceNumber - 1));
                        System.out.println("Dispositivo seleccionado: " + controller.getSelectedDevice().getClass().getSimpleName());
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor, ingrese un número válido.");
                        scanner.next(); 
                    }
                    break;
                case 4:
                    if (controller.getSelectedDevice() == null) {
                        System.out.println("No se ha seleccionado ningún dispositivo.");
                    } else {
                        showDeviceControlMenu(controller, scanner);
                    }
                    break;
                case 5:
                    Device mostExpensive = controller.getMostExpensiveDevice();
                    System.out.println("Dispositivo más caro: " + mostExpensive.getClass().getSimpleName() + " - " + mostExpensive.getBrand() + " - $" + mostExpensive.getPrice());
                    break;
                case 6:
                    Device cheapest = controller.getCheapestDevice();
                    System.out.println("Dispositivo más barato: " + cheapest.getClass().getSimpleName() + " - " + cheapest.getBrand() + " - $" + cheapest.getPrice());
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
            }
        }
    }

    /**
     * Método para mostrar el menú de control del dispositivo seleccionado.
     * 
     * @param controller Controlador para gestionar los dispositivos.
     * @param scanner Scanner para recibir la entrada del usuario.
     */
    private static void showDeviceControlMenu(Controller controller, Scanner scanner) {

        // Bucle para mostrar el menú de control del dispositivo y recibir la opción del usuario.
        while (true) {

            // Mostrar opciones del menú de control del dispositivo.
            System.out.println("Control de dispositivo:");
            System.out.println("1. Encender dispositivo");
            System.out.println("2. Apagar dispositivo");
            System.out.println("3. Subir volumen del dispositivo");
            System.out.println("4. Bajar volumen del dispositivo");
            System.out.println("5. Aumentar brillo del dispositivo");
            System.out.println("6. Disminuir brillo del dispositivo");
            System.out.println("7. Mostrar información del dispositivo");
            System.out.println("8. Mostrar estado actual del dispositivo");
            System.out.println("9. Reproducir video publicitario");
            System.out.println("10. Pausar video publicitario");
            System.out.println("11. Parar video publicitario");
            System.out.println("12. Cambiar de video publicitario");
            System.out.println("13. Visualizar estado actual del dispositivo seleccionado");
            System.out.println("14. Regresar al menú principal");

            int choice = scanner.nextInt();

            // Switch para manejar la opción seleccionada por el usuario en el menú de control del dispositivo.
            switch (choice) {
                case 1:
                    controller.getSelectedDevice().turnOn();
                    break;
                case 2:
                    controller.getSelectedDevice().turnOff();
                    break;
                case 3:
                    controller.getSelectedDevice().increaseVolume();
                    break;
                case 4:
                    controller.getSelectedDevice().decreaseVolume();
                    break;
                case 5:
                    controller.getSelectedDevice().increaseBrightness();
                    break;
                case 6:
                    controller.getSelectedDevice().decreaseBrightness();
                    break;
                case 7:
                    controller.getSelectedDevice().showInfo();
                    break;
                case 8:
                    controller.getSelectedDevice().showCurrentState();
                    break;
                case 9:
                    controller.getSelectedDevice().playVideo();
                    break;
                case 10:
                    controller.getSelectedDevice().pauseVideo();
                    break;
                case 11:
                    controller.getSelectedDevice().stopVideo();
                    break;
                case 12:
                    controller.getSelectedDevice().changeVideo();
                    break;
                case 13:
                    System.out.println("Estado actual del dispositivo seleccionado:");
                    controller.getSelectedDevice().showCurrentState();
                    break;
                case 14:
                    return; 
                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
            }            
        }
    }
}

