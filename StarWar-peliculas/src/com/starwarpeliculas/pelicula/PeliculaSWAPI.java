package com.starwarpeliculas.pelicula;

public record PeliculaSWAPI(String title,
                            int episode_id,
                            String opening_crawl,
                            String director,
                            String producer,
                            String release_date) {
}
