
package cine;


public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String mostrarInfo() {
        return "Título: "+titulo+","+
                " "+"Autor: "+autor+","+
                " "+"Páginas: "+paginas;
    }
}
