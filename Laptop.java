/**
 * Clase Laptop
 * Fernando Rueda - 23748
 * Descripción: Clase que representa una Laptop. Esta clase extiende de la clase Device y proporciona funcionalidades específicas para una Laptop.
 * Fecha de creación: [27/10/2023]
 * Fecha de última modificación: [29/10/2023]
 */

public class Laptop extends Device {

    // RAM de la laptop.
    private String ram;
    
    // Tipo de disco de la laptop.
    private String diskType;
    
    // Tamaño del disco de la laptop.
    private String diskSize;
    
    // Velocidad del CPU de la laptop.
    private String cpuSpeed;
    
    // Velocidad del GPU de la laptop.
    private String gpuSpeed;

    /**
     * Constructor para inicializar una laptop con sus atributos específicos.
     *
     * @param brand Marca de la laptop.
     * @param price Precio de la laptop.
     * @param ram RAM de la laptop.
     * @param diskType Tipo de disco de la laptop.
     * @param diskSize Tamaño del disco de la laptop.
     * @param cpuSpeed Velocidad del CPU de la laptop.
     * @param gpuSpeed Velocidad del GPU de la laptop.
     */
    public Laptop(String brand, double price, String ram, String diskType, String diskSize, String cpuSpeed, String gpuSpeed) {
        super(brand, price);
        this.ram = ram;
        this.diskType = diskType;
        this.diskSize = diskSize;
        this.cpuSpeed = cpuSpeed;
        this.gpuSpeed = gpuSpeed;
    }

    /**
     * Enciende la laptop.
     */
    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("La laptop ahora está encendida.");
        } else {
            System.out.println("La laptop ya está encendida.");
        }
    }

    /**
     * Apaga la laptop.
     */
    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("La laptop ahora está apagada.");
        } else {
            System.out.println("La laptop ya está apagada.");
        }
    }

    /**
     * Aumenta el volumen de la laptop.
     */
    @Override
    public void increaseVolume() {
        if (volumeLevel < 100) {
            volumeLevel += 10;
            System.out.println("El volumen subió a: " + volumeLevel);
        } else {
            System.out.println("El volumen está al máximo.");
        }
    }

    /**
     * Disminuye el volumen de la laptop.
     */
    @Override
    public void decreaseVolume() {
        if (volumeLevel > 0) {
            volumeLevel -= 10;
            System.out.println("El volumen bajó a: " + volumeLevel);
        } else {
            System.out.println("El volumen está al mínimo.");
        }
    }

    /**
     * Aumenta el brillo de la laptop.
     */
    @Override
    public void increaseBrightness() {
        if (brightnessLevel < 100) {
            brightnessLevel += 10;
            System.out.println("El brillo subió a: " + brightnessLevel + "%");
        } else {
            System.out.println("El brillo está al máximo.");
        }
    }

    /**
     * Disminuye el brillo de la laptop.
     */
    @Override
    public void decreaseBrightness() {
        if (brightnessLevel > 0) {
            brightnessLevel -= 10;
            System.out.println("El brillo bajó al: " + brightnessLevel + "%");
        } else {
            System.out.println("El brillo está al mínimo.");
        }
    }

    /**
     * Muestra la información de la laptop.
     */
    @Override
    public void showInfo() {
        System.out.println("Información de la laptop:");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("RAM: " + ram);
        System.out.println("Tipo de Disco: " + diskType);
        System.out.println("Tamaño del Disco: " + diskSize);
        System.out.println("Velocidad del CPU: " + cpuSpeed);
        System.out.println("Velocidad del GPU: " + gpuSpeed);
    }

    /**
     * Muestra el estado actual de la laptop.
     */
    @Override
    public void showCurrentState() {
        System.out.println("Estado actual de la laptop:");
        System.out.println("Encendido: " + (isOn ? "Sí" : "No"));
        System.out.println("Nivel del volumen: " + volumeLevel + "%");
        System.out.println("Nivel del brillo: " + brightnessLevel + "%");
        System.out.println("Video actual: " + (currentVideo != 0 ? "Video " + currentVideo : "No se está reproduciendo ningún video"));
    }

    /**
     * Reproduce un video en la laptop.
     */
    @Override
    public void playVideo() {
        if (!isOn) {
            System.out.println("No se puede reproducir el video. La laptop está apagada.");
            return;
        }
        if (currentVideo == 0) {
            currentVideo = 1; 
            System.out.println("Reproduciendo video " + currentVideo);
        } else {
            System.out.println("El video " + currentVideo + " ya se está reproduciendo.");
        }
    }

    /**
     * Pausa un video en la laptop.
     */
    @Override
    public void pauseVideo() {
        if (!isOn) {
            System.out.println("No se puede pausar el video. La laptop está apagada.");
            return;
        }
        if (currentVideo != 0) {
            System.out.println("Video " + currentVideo + " en pausa.");
        } else {
            System.out.println("No se está reproduciendo ningún video actualmente.");
        }
    }

    /**
     * Detiene un video en la laptop.
     */
    @Override
    public void stopVideo() {
        if (!isOn) {
            System.out.println("No se puede detener el video. La laptop está apagada.");
            return;
        }
        if (currentVideo != 0) {
            System.out.println("Video " + currentVideo + " detenido.");
            currentVideo = 0;
        } else {
            System.out.println("No se está reproduciendo ningún video actualmente.");
        }
    }

    /**
     * Cambia el video que se está reproduciendo en la laptop.
     */
    @Override
    public void changeVideo() {
        if (!isOn) {
            System.out.println("No se puede cambiar el video. La laptop está apagada.");
            return;
        }
        currentVideo++; 
        System.out.println("Video cambiado " + currentVideo);
    }

    /**
     * Obtiene la RAM de la laptop.
     * 
     * @return RAM de la laptop.
     */
    public String getRam() {
        return ram;
    }

    /**
     * Establece la RAM de la laptop.
     * 
     * @param ram Nueva RAM para la laptop.
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * Obtiene el tipo de disco de la laptop.
     * 
     * @return Tipo de disco de la laptop.
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * Establece el tipo de disco de la laptop.
     * 
     * @param diskType Nuevo tipo de disco para la laptop.
     */
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    /**
     * Obtiene el tamaño del disco de la laptop.
     * 
     * @return Tamaño del disco de la laptop.
     */
    public String getDiskSize() {
        return diskSize;
    }

    /**
     * Establece el tamaño del disco de la laptop.
     * 
     * @param diskSize Nuevo tamaño de disco para la laptop.
     */
    public void setDiskSize(String diskSize) {
        this.diskSize = diskSize;
    }

    /**
     * Obtiene la velocidad del CPU de la laptop.
     * 
     * @return Velocidad del CPU de la laptop.
     */
    public String getCpuSpeed() {
        return cpuSpeed;
    }

    /**
     * Establece la velocidad del CPU de la laptop.
     * 
     * @param cpuSpeed Nueva velocidad del CPU para la laptop.
     */
    public void setCpuSpeed(String cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    /**
     * Obtiene la velocidad del GPU de la laptop.
     * 
     * @return Velocidad del GPU de la laptop.
     */
    public String getGpuSpeed() {
        return gpuSpeed;
    }

    /**
     * Establece la velocidad del GPU de la laptop.
     * 
     * @param gpuSpeed Nueva velocidad del GPU para la laptop.
     */
    public void setGpuSpeed(String gpuSpeed) {
        this.gpuSpeed = gpuSpeed;
    }
}

