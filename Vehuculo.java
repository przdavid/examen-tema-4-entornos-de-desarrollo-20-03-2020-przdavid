
public class Vehiculo () {
    protected int num_serie;
    protected String fabricante;
    protected String color;

    public Vehiculo() {
        super();
    }
}


protected int getNum_serie() {
    return num_serie;
}

/**
 * @param num_serie
 */

protected void setNum_serie(int num_serie) {
    this.num_serie = num_serie;
}

protected String getFabricante() {
    return fabricante;
}

/**
 * @param fabricante
 */

protected void setFabricante(String fabricante) {
    this.fabricante = fabricante;
}

protected String getColor() {
    return color;
}

/**
 * @param color
 */

protected void setColor(String color) {
    this.color = color;
}