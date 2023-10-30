/**
 * Clase Controller
 * Fernando Rueda - 23748
 * Descripción: Clase que representa un controlador para gestionar dispositivos.
 * Fecha de creación: [27/10/2023]
 * Fecha de última modificación: [29/10/2023]
 */
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controller {
    
    // Dispositivo actual seleccionado.
    private Device selectedDevice;
    
    // Lista de dispositivos disponibles.
    private List<Device> devicesList;

    /**
     * Constructor para inicializar el controlador con una lista de dispositivos.
     *
     * @param devicesList Lista de dispositivos.
     */
    public Controller(List<Device> devicesList) {
        this.devicesList = devicesList;
    }

    /**
     * Obtiene el dispositivo actual seleccionado.
     * 
     * @return Dispositivo seleccionado.
     */
    public Device getSelectedDevice() {
        return selectedDevice;
    }

    /**
     * Establece el dispositivo seleccionado.
     * 
     * @param selectedDevice Dispositivo a seleccionar.
     */
    public void setSelectedDevice(Device selectedDevice) {
        if (devicesList.contains(selectedDevice)) {
            this.selectedDevice = selectedDevice;
        } else {
            System.out.println("Error: El dispositivo seleccionado no está en la lista.");
        }
    }

    /**
     * Obtiene la lista de dispositivos disponibles.
     * 
     * @return Lista de dispositivos.
     */
    public List<Device> getDevicesList() {
        return devicesList;
    }

    /**
     * Muestra la información del dispositivo proporcionado.
     * 
     * @param device Dispositivo del cual se desea mostrar la información.
     */
    public void showDeviceInfo(Device device) {
        if (devicesList.contains(device)) {
            device.showInfo();
        } else {
            System.out.println("Error: The device is not in the list.");
        }
    }

    /**
     * Controla el dispositivo actual seleccionado.
     */
    public void controlSelectedDevice() {
        if (selectedDevice != null) {
            selectedDevice.turnOn();
            selectedDevice.showCurrentState();
            // ... y así sucesivamente para otras funcionalidades
        } else {
            System.out.println("No device selected.");
        }
    }

    /**
     * Obtiene el dispositivo más caro de la lista.
     * 
     * @return Dispositivo más caro.
     */
    public Device getMostExpensiveDevice() {
        return Collections.max(devicesList);
    }

    /**
     * Obtiene el dispositivo más barato de la lista.
     * 
     * @return Dispositivo más barato.
     */
    public Device getCheapestDevice() {
        return Collections.min(devicesList);
    }

    /**
     * Carga dispositivos desde un archivo CSV.
     * 
     * @param filePath Ruta del archivo CSV.
     */
    public void loadDevicesFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                
                switch (values[0].toLowerCase()) {
                    case "smartphone":
                        Smartphone smartphone = new Smartphone(values[1], Double.parseDouble(values[2]), values[3], values[4], values[5], Boolean.parseBoolean(values[6]), Boolean.parseBoolean(values[7]), Boolean.parseBoolean(values[8]));
                        devicesList.add(smartphone);
                        break;
                    case "laptop":
                        Laptop laptop = new Laptop(values[1], Double.parseDouble(values[2]), values[3], values[4], values[5], values[6], values[7]);
                        devicesList.add(laptop);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}



