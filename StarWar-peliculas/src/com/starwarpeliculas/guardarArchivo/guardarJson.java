package com.starwarpeliculas.guardarArchivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.starwarpeliculas.pelicula.Pelicula;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class guardarJson {
    public static void guardarJson(List<?> lista, String nombreArchivo) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileWriter fw = new FileWriter(nombreArchivo)) {
            gson.toJson(lista, fw);
        }
    }
}
