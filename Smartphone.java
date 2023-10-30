/**
 * Clase Smartphone
 * Fernando Rueda - 23748
 * Descripción:  * Clase que representa un Smartphone. Esta clase extiende de la clase Device y proporciona funcionalidades específicas para un Smartphone.
 * Fecha de creación: [27/10/2023]
 * Fecha de última modificación: [29/10/2023]
 */

public class Smartphone extends Device {

    // RAM del smartphone.
    private String ram;
    
    // Procesador del smartphone.
    private String processor;
    
    // Almacenamiento interno del smartphone.
    private String internalStorage;
    
    // Indica si el smartphone soporta MicroUSB.
    private boolean supportsMicroUSB;
    
    // Indica si el smartphone incluye un cubo de cargador.
    private boolean includesChargerCube;
    
    // Indica si el smartphone soporta 5G.
    private boolean is5G;

    /**
     * Constructor para inicializar un smartphone con sus atributos específicos.
     *
     * @param brand Marca del smartphone.
     * @param price Precio del smartphone.
     * @param ram RAM del smartphone.
     * @param processor Procesador del smartphone.
     * @param internalStorage Almacenamiento interno del smartphone.
     * @param supportsMicroUSB Indica si el smartphone soporta MicroUSB.
     * @param includesChargerCube Indica si el smartphone incluye un cubo de cargador.
     * @param is5G Indica si el smartphone soporta 5G.
     */
    public Smartphone(String brand, double price, String ram, String processor, String internalStorage, boolean supportsMicroUSB, boolean includesChargerCube, boolean is5G) {
        super(brand, price);
        this.ram = ram;
        this.processor = processor;
        this.internalStorage = internalStorage;
        this.supportsMicroUSB = supportsMicroUSB;
        this.includesChargerCube = includesChargerCube;
        this.is5G = is5G;
    }

    /**
     * Enciende el smartphone.
     */
    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Smartphone encendido.");
        } else {
            System.out.println("Smartphone ya está encendido.");
        }
    }

    /**
     * Apaga el smartphone.
     */
    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Smartphone apagado.");
        } else {
            System.out.println("Smartphone ya está apagado.");
        }
    }

    /**
     * Aumenta el volumen del smartphone.
     */
    @Override
    public void increaseVolume() {
        if (volumeLevel < 100) {
            volumeLevel++;
            System.out.println("El volumen subió a: " + volumeLevel + "%");
        } else {
            System.out.println("El volumen está al máximo.");
        }
    }

    /**
     * Disminuye el volumen del smartphone.
     */
    @Override
    public void decreaseVolume() {
        if (volumeLevel > 0) {
            volumeLevel--;
            System.out.println("El volumen bajó a: " + volumeLevel + "%");
        } else {
            System.out.println("El volumen está en el mínimo.");
        }
    }

    /**
     * Aumenta el brillo del smartphone.
     */
    @Override
    public void increaseBrightness() {
        if (brightnessLevel < 100) {
            brightnessLevel++;
            System.out.println("El brillo subió a: " + brightnessLevel + "%");
        } else {
            System.out.println("El brillo está al máximo.");
        }
    }

    /**
     * Disminuye el brillo del smartphone.
     */
    @Override
    public void decreaseBrightness() {
        if (brightnessLevel > 0) {
            brightnessLevel--;
            System.out.println("El brillo bajó a: " + brightnessLevel + "%");
        } else {
            System.out.println("El brillo está en el mínimo.");
        }
    }

    /**
     * Muestra la información del smartphone.
     */
    @Override
    public void showInfo() {
        System.out.println("Información del smartphone:");
        System.out.println("Marca: " + brand);
        System.out.println("Precio: " + price);
        System.out.println("RAM: " + ram);
        System.out.println("Procesador: " + processor);
        System.out.println("Almacenamiento interno: " + internalStorage);
        System.out.println("Soporta MicroUSB: " + supportsMicroUSB);
        System.out.println("Incluye cubo de cargador: " + includesChargerCube);
        System.out.println("Soporta 5G: " + is5G);
    }

    /**
     * Muestra el estado actual del smartphone.
     */
    @Override
    public void showCurrentState() {
        System.out.println("Estado del smartphone:");
        System.out.println("Encendido: " + (isOn ? "Si" : "No"));
        System.out.println("Nivel del volumen: " + volumeLevel + "%");
        System.out.println("Nivel del brillo: " + brightnessLevel + "%");
        System.out.println("Video actual: " + currentVideo);
    }

    /**
     * Reproduce un video en el smartphone.
     */
    @Override
    public void playVideo() {
        if (isOn) {
            System.out.println("Reproduciendo video: " + currentVideo);
        } else {
            System.out.println("El smartphone está apagado. No se puede reproducir el video.");
        }
    }

    /**
     * Pausa un video en el smartphone.
     */
    @Override
    public void pauseVideo() {
        if (isOn) {
            System.out.println("Video pausado: " + currentVideo);
        } else {
            System.out.println("El smartphone está apagado. No se puede pausar el video.");
        }
    }

    /**
     * Detiene un video en el smartphone.
     */
    @Override
    public void stopVideo() {
        if (isOn) {
            System.out.println("Video detenido: " + currentVideo);
        } else {
            System.out.println("El smartphone está apagado. No se puede detener el video.");
        }
    }

    /**
     * Cambia el video que se está reproduciendo en el smartphone.
     */
    @Override
    public void changeVideo() {
        if (isOn) {
            currentVideo++; 
            System.out.println("Video cambiado: " + currentVideo);
        } else {
            System.out.println("El smartphone está apagado. No se puede cambiar de video.");
        }
    }

    /**
     * Obtiene la RAM del smartphone.
     * 
     * @return RAM del smartphone.
     */
    public String getRam() {
        return ram;
    }

    /**
     * Establece la RAM del smartphone.
     * 
     * @param ram Nueva RAM para el smartphone.
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * Obtiene el procesador del smartphone.
     * 
     * @return Procesador del smartphone.
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Establece el procesador del smartphone.
     * 
     * @param processor Nuevo procesador para el smartphone.
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * Obtiene el almacenamiento interno del smartphone.
     * 
     * @return Almacenamiento interno del smartphone.
     */
    public String getInternalStorage() {
        return internalStorage;
    }

    /**
     * Establece el almacenamiento interno del smartphone.
     * 
     * @param internalStorage Nuevo almacenamiento interno para el smartphone.
     */
    public void setInternalStorage(String internalStorage) {
        this.internalStorage = internalStorage;
    }

    /**
     * Indica si el smartphone soporta MicroUSB.
     * 
     * @return Verdadero si el smartphone soporta MicroUSB, falso en caso contrario.
     */
    public boolean isSupportsMicroUSB() {
        return supportsMicroUSB;
    }

    /**
     * Establece si el smartphone soporta MicroUSB.
     * 
     * @param supportsMicroUSB Verdadero si el smartphone debe soportar MicroUSB, falso en caso contrario.
     */
    public void setSupportsMicroUSB(boolean supportsMicroUSB) {
        this.supportsMicroUSB = supportsMicroUSB;
    }

    /**
     * Indica si el smartphone incluye un cubo de cargador.
     * 
     * @return Verdadero si el smartphone incluye un cubo de cargador, falso en caso contrario.
     */
    public boolean isIncludesChargerCube() {
        return includesChargerCube;
    }

    /**
     * Establece si el smartphone incluye un cubo de cargador.
     * 
     * @param includesChargerCube Verdadero si el smartphone debe incluir un cubo de cargador, falso en caso contrario.
     */
    public void setIncludesChargerCube(boolean includesChargerCube) {
        this.includesChargerCube = includesChargerCube;
    }

    /**
     * Indica si el smartphone soporta 5G.
     * 
     * @return Verdadero si el smartphone soporta 5G, falso en caso contrario.
     */
    public boolean isIs5G() {
        return is5G;
    }

    /**
     * Establece si el smartphone soporta 5G.
     * 
     * @param is5G Verdadero si el smartphone debe soportar 5G, falso en caso contrario.
     */
    public void setIs5G(boolean is5G) {
        this.is5G = is5G;
    }
}


