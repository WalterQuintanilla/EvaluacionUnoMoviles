package Entidad;

public class Estudiante {

    private int id;
    private String nombre;
    private String codigo;
    private  String materia;
    private Double primerParcial;
    private  Double segundoParcial;
    private  Double tercerParcial;
    private Double promedio;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(Double primerParcial) {
        this.primerParcial = primerParcial;
    }

    public Double getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(Double segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public Double getTercerParcial() {
        return tercerParcial;
    }

    public void setTercerParcial(Double tercerParcial) {
        this.tercerParcial = tercerParcial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
