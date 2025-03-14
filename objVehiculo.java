public class objVehiculo{
private String Placa = "";
private String Nombre = "";
private Double Cilindraje = 0.0;
private String Modelo = "";
private Boolean Disponible = true;

public objVehiculo() {
}

public String getPlaca() {
    return Placa;
}

public void setPlaca(String placa) {
    Placa = placa;
}

public String getNombre() {
    return Nombre;
}

public void setNombre(String nombre) {
    Nombre = nombre;
}

public Double getCilindraje() {
    return Cilindraje;
}

public void setCilindraje(Double cilindraje) {
    Cilindraje = cilindraje;
}

public String getModelo() {
    return Modelo;
}

public void setModelo(String modelo) {
    Modelo = modelo;
}

public Boolean getDisponible() {
    return Disponible;
}

public void setDisponible(Boolean disponible) {
    Disponible = disponible;
}

}