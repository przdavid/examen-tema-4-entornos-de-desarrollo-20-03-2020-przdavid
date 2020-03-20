/**
 * @author David Pérez Ruiz
 * @version v0.0.1
 */

public class Vehiculo () {
    protected int num_serie;
    protected String fabricante;
    protected String color;

    public Vehiculo() {
        super();
    }
}

/**
 * @return Número de serie del vehículo.
 */

protected int getNum_serie() {
    return num_serie;
}

/**
 * @param num_serie Número de serie del vehículo.
 */

protected void setNum_serie(int num_serie) {
    this.num_serie = num_serie;
}

/**
 * @return Fabricante del vehículo.
 */

protected String getFabricante() {
    return fabricante;
}

/**
 * @param fabricante Fabricante del vehículo.
 */

protected void setFabricante(String fabricante) {
    this.fabricante = fabricante;
}

/**
 * @return Color del vehículo
 */

protected String getColor() {
    return color;
}

/**
 * @param color Color del vehículo.
 */

protected void setColor(String color) {
    this.color = color;
}