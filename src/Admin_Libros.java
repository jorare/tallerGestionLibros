public class Admin_Libros {
    public static void main(String[] args) {

       Libro librouno = new Libro("100 años Soledad", "Gabriel Garia Marquez",173,1967);
       Libro librodos = new Libro("Don Quijote de la mancha", "Miguel de Cervantes",225,1605);
       Libro librotres = new Libro("Algebra de Baldor", "Aurelio Angel Baldor",400,1941);


       System.out.println("Datos del libro:                                    ");
       System.out.println("                                                    ");
       librouno.mostrarDatos();

        System.out.println("----------------------------------------------------");
        System.out.println("Nuevo Autor Cambiado                                ");
        System.out.println("                                                    ");
        librouno.cambiarautor("Jorge Mondragon");
        System.out.println("----------------------------------------------------");
        System.out.println("                                                    ");
        System.out.println("Autor Cambiado Libro uno                            ");
        librouno.mostrarDatos();
        System.out.println("----------------------------------------------------");



        System.out.println("Datos del libro dos:                                    ");
        System.out.println("                                                    ");
        librodos.mostrarDatos();
        System.out.println("----------------------------------------------------");
        System.out.println("Nuevo Autor Cambiado libro dos                                ");
        System.out.println("                                                    ");
        librodos.cambiarautor("Paola Sandoval");
        System.out.println("----------------------------------------------------");
        System.out.println("                                                    ");
        System.out.println("Autor Cambiado Libro dos                            ");
        librodos.mostrarDatos();
        System.out.println("----------------------------------------------------");


        System.out.println("Datos del libro tres                                ");
        System.out.println("                                                    ");
        librotres.mostrarDatos();
        System.out.println("----------------------------------------------------");
        System.out.println(" Cambiar paginas Libro 3                            ");
        System.out.println("                                                    ");
        librotres.cambiarnumeropaginas(508);
        System.out.println("----------------------------------------------------");
        System.out.println("                                                    ");
        System.out.println(" Actualizacion de Paginas                           ");
        librotres.mostrarDatos();
        System.out.println("----------------------------------------------------");
        
    }
}