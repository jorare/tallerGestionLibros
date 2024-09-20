public class Libro {


    String titulo;
    String autor;
    int numerodePaginas;
    int  anoPublicacion;


    public Libro(String titulo, String autor, int numerodePaginas, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodePaginas = numerodePaginas;
        this.anoPublicacion = anoPublicacion;
    }

    public void mostrarDatos(){
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El numero de pagina es: " + numerodePaginas);
        System.out.println("El año de publicacion es: " + anoPublicacion);
    }


    public void cambiartitulo(String titulo){
        this.titulo = titulo;
    }


    public void cambiarautor(String autor){
        this.autor = autor;
    }

    public void cambiarnumeropaginas(int numerodePaginas){
        this.numerodePaginas = numerodePaginas;
    }

    public void cambiarpublicacion(int anoPublicacion){
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumerodePaginas() {
        return numerodePaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }
}
