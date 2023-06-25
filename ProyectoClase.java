package Proyecto_Clases;

public class ProyectoClase{
    private String nombre;
    private String descripcion;
    private String datosPitch;

public ProyectoClase(){

}

public ProyectoClase(String nombre){

}

public ProyectoClase(String nombre, String descripcion){

}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public String elevatorPitch(){
    System.out.println("Nombre: " + getNombre());
    return getNombre();
}


}