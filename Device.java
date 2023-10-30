/**
 * Clase Device
 * Fernando Rueda - 23748
 * Descripción: Clase abstracta que representa un dispositivo genérico. Implementa la interfaz IDeviceControl y la interfaz Comparable para comparar dispositivos por precio.
 * Fecha de creación: [27/10/2023]
 * Fecha de última modificación: [27/10/2023]
 */
public abstract class Device implements IDeviceControl, Comparable<Device> {
    
    // Descripción del dispositivo.
    protected String description;

    // Precio del dispositivo.
    protected double price;

    // Marca del dispositivo.
    protected String brand;

    // Modelo del dispositivo.
    protected String model;

    // Cuotas de VISA para el dispositivo.
    protected int visaQuotas;

    // Estado de encendido del dispositivo.
    protected boolean isOn;

    // Nivel de volumen del dispositivo.
    protected int volumeLevel;

    // Nivel de brillo del dispositivo.
    protected int brightnessLevel;

    // Video actual que se está reproduciendo en el dispositivo.
    protected int currentVideo;

    /**
     * Constructor para inicializar un dispositivo con marca y precio.
     * 
     * @param brand Marca del dispositivo.
     * @param price Precio del dispositivo.
     */
    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * Método para comparar dispositivos basado en el precio.
     * 
     * @param otherDevice Otro dispositivo con el que se va a comparar.
     * @return Un valor negativo si este dispositivo es más barato, cero si tienen el mismo precio, o un valor positivo si este dispositivo es más caro.
     */
    @Override
    public int compareTo(Device otherDevice) {
        return Double.compare(this.price, otherDevice.price);
    }

    /**
     * Obtiene la marca del dispositivo.
     * 
     * @return Marca del dispositivo.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Establece la marca del dispositivo.
     * 
     * @param brand Nueva marca para el dispositivo.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Obtiene el precio del dispositivo.
     * 
     * @return Precio del dispositivo.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del dispositivo.
     * 
     * @param price Nuevo precio para el dispositivo.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
