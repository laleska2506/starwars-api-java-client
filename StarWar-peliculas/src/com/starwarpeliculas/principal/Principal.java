package com.starwarpeliculas.principal;

import com.starwarpeliculas.api.ConsultarPelicula;
import com.starwarpeliculas.guardarArchivo.guardarJson;
import com.starwarpeliculas.pelicula.Pelicula;
import com.starwarpeliculas.pelicula.PeliculaSWAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws RuntimeException, IOException {
        //crear una aplicacion para consultar peliculas mediante la api de SWAPI
        //crear menu para que el usuario elija la pelicula que quiere buscar
        //generar un archivo .json con los datos de la pelicula

        Scanner sc = new Scanner(System.in);
        List<Pelicula> peliculas = new ArrayList<Pelicula>();
        ConsultarPelicula consultarPelicula = new ConsultarPelicula();

        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido a tu busqueda de peliculas de StarWars");
            System.out.println("--------------------------------------------------");
            System.out.println(" 1. Que pelicula quieres buscar (1-6) ?");
            System.out.println(" 2. Salir");
            System.out.println("--------------------------------------------------");
            System.out.println("Ingrese su opcion:");
            var opcion = sc.nextLine();

            if (opcion.equals("1")) {
                System.out.println("Que pelicula quieres buscar (1-6) ?");
                var busqueda = Integer.valueOf(sc.nextLine());
                try {
                    Pelicula pelicula = consultarPelicula.obtenerPelicula(busqueda);
                    System.out.println(pelicula.toString());
                    peliculas.add(pelicula);
                } catch (NumberFormatException e) {
                    System.out.println("Numero no encontrado: " + e.getMessage());
                } catch (RuntimeException | InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (opcion.equals("2")) {
                break;
            }
        }

        guardarJson.guardarJson(peliculas, "peliculasStarWars.json");
        System.out.println("Finalizo tu busqueda de peliculas!!");
    }
}
