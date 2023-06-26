
package controladores;

/**
 *
 * @author Jose Armando
 */
public class Animales {
  int tipo,edad;
  String descripcion, genero, raza, tipo_mamifero,tipo_pelaje, color, teleraña,veneno,tipo_ave;
  double peso;

    public Animales(int tipo, int edad, String descripcion, String genero, String raza, String tipo_mamifero, String tipo_pelaje, double peso) {
        this.tipo = tipo;
        this.edad = edad;
        this.descripcion = descripcion;
        this.genero = genero;
        this.raza = raza;
        this.tipo_mamifero = tipo_mamifero;
        this.tipo_pelaje = tipo_pelaje;
        this.peso = peso;
    }

    public Animales(int tipo, int edad, String descripcion, String genero, String raza, String color, String teleraña, String veneno, double peso) {
        this.tipo = tipo;
        this.edad = edad;
        this.descripcion = descripcion;
        this.genero = genero;
        this.raza = raza;
        this.color = color;
        this.teleraña = teleraña;
        this.veneno = veneno;
        this.peso = peso;
    }

    public Animales(int tipo, int edad, String descripcion, String genero, String raza, String tipo_ave, double peso) {
        this.tipo = tipo;
        this.edad = edad;
        this.descripcion = descripcion;
        this.genero = genero;
        this.raza = raza;
        this.tipo_ave = tipo_ave;
        this.peso = peso;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo_mamifero() {
        return tipo_mamifero;
    }

    public void setTipo_mamifero(String tipo_mamifero) {
        this.tipo_mamifero = tipo_mamifero;
    }

    public String getTipo_pelaje() {
        return tipo_pelaje;
    }

    public void setTipo_pelaje(String tipo_pelaje) {
        this.tipo_pelaje = tipo_pelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTeleraña() {
        return teleraña;
    }

    public void setTeleraña(String teleraña) {
        this.teleraña = teleraña;
    }

    public String getVeneno() {
        return veneno;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    public String getTipo_ave() {
        return tipo_ave;
    }

    public void setTipo_ave(String tipo_ave) {
        this.tipo_ave = tipo_ave;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
  

  
}
