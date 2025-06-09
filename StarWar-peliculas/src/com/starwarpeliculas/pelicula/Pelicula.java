package com.starwarpeliculas.pelicula;

public class Pelicula {
    private String titulo;
    private int episodio;
    private String descripcion;
    private String director;
    private String productor;
    private String fecha;


    public Pelicula(PeliculaSWAPI peliculaswapi) {
        this.titulo = peliculaswapi.title();
        this.director = peliculaswapi.director();
        this.productor = peliculaswapi.producer();
        this.descripcion = peliculaswapi.opening_crawl();
        this.episodio = Integer.valueOf(peliculaswapi.episode_id());
        this.fecha = peliculaswapi.release_date();
    }

    public String getTitulo() {
        return titulo;
    }

    //ordena una lista alfabeticamente
    public int compareTo(Pelicula otraPelicula) {
        return this.getTitulo().compareTo(otraPelicula.getTitulo());
    }

    public String toString() {
        return " (Titulo: " + titulo +
                ", episodio: " + episodio +
                ",\n" +
                "reseña: " + descripcion +
                "\n" +
                ", director: " + director +
                ", productor: " + productor +
                ", fecha: " + fecha +
                ")";
    }
}
