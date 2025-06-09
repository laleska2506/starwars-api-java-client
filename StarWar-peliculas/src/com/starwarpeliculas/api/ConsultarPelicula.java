package com.starwarpeliculas.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.starwarpeliculas.pelicula.Pelicula;
import com.starwarpeliculas.pelicula.PeliculaSWAPI;

public class ConsultarPelicula {
    private final Gson gson;

    public ConsultarPelicula() {
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public Pelicula obtenerPelicula(int busqueda) throws IOException, InterruptedException{
        String direccion = "https://swapi.py4e.com/api/films/"+busqueda+"/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        PeliculaSWAPI peliculaswapi = gson.fromJson(json, PeliculaSWAPI.class);
        return new Pelicula(peliculaswapi);
    }
}
