/**
 * Interfaz IDeviceControl
 * Fernando Rueda - 23748
 * Descripción: Interfaz que define las operaciones básicas de control para un dispositivo.
 * Fecha de creación: [27/10/2023]
 * Fecha de última modificación: [27/10/2023]
 */

public interface IDeviceControl {

    /**
     * Enciende el dispositivo.
     */
    void turnOn();

    /**
     * Apaga el dispositivo.
     */
    void turnOff();

    /**
     * Aumenta el volumen del dispositivo.
     */
    void increaseVolume();

    /**
     * Disminuye el volumen del dispositivo.
     */
    void decreaseVolume();

    /**
     * Aumenta el brillo del dispositivo.
     */
    void increaseBrightness();

    /**
     * Disminuye el brillo del dispositivo.
     */
    void decreaseBrightness();

    /**
     * Muestra la información del dispositivo.
     */
    void showInfo();

    /**
     * Muestra el estado actual del dispositivo.
     */
    void showCurrentState();

    /**
     * Reproduce un video en el dispositivo.
     */
    void playVideo();

    /**
     * Pausa el video que se está reproduciendo en el dispositivo.
     */
    void pauseVideo();

    /**
     * Detiene el video que se está reproduciendo en el dispositivo.
     */
    void stopVideo();

    /**
     * Cambia el video que se está reproduciendo en el dispositivo.
     */
    void changeVideo();
}


