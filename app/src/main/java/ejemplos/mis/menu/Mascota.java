package ejemplos.mis.menu;

/**
 * Created by nicopro on 16/5/16.
 */
public class Mascota {



    private String nombre;
    private int imagen;
    private int color;

    public Mascota(String nombre, int imagen, int color) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public int getColor() {
        return color;
    }
}
