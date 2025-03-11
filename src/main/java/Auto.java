public class Auto {

    String marca = "";
    String modelo = "";
    int anio = 0;
    double kilometraje = 0.0;
    String estado = "";

    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, double kilometraje, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }
    public String getPlaca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



    //metodos

    public void mostrardetalles () {
        System.out.println("Marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("año" + anio);
        System.out.println("Kilometraje: $" + kilometraje);
        System.out.println("Estado" + estado);

    }

    public void actualizarKilometraje(double nuevoKilometraje) {
        this.kilometraje = nuevoKilometraje;
    }

    public boolean esAntiguo() {
        return (2024 - this.anio) > 15;
    }

    public boolean necesitaMantenimiento() {
        return this.kilometraje > 100000;
    }

    public double calcularConsumoCombustible(double Km, double KmLitro) {
        return Km * KmLitro;
    }

    public double combustibleRestante(double capacidadTanque, double distancia, double consumoPorKm) {
        return capacidadTanque - calcularConsumoCombustible(distancia, consumoPorKm);
    }
}



