public class Main {
    public static void main(String[] args) {

        Persona person1 = new Persona();

        person1.setEdad(31);
        person1.setNombre("Juan");
        person1.setTelefono("387-4390474");

        System.out.println("Nombre: " + person1.getNombre());
        System.out.println("Edad: "+ person1.getEdad());
        System.out.println("Telefono: "+ person1.getTelefono());

        System.out.println("------+------");
        System.out.println("Ready sr!");
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}