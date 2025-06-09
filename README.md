# Consumo de API de Star Wars en Java

Este proyecto es una aplicación Java sencilla que consume la API pública de Star Wars ([SWAPI](https://swapi.py4e.com/api/films/1/)) para obtener y mostrar información sobre películas. Además, gestiona una colección de películas locales almacenadas en un archivo JSON.

## Funcionalidades

- Conexión con la API REST de Star Wars.
- Extracción de datos como título, director, apertura y fecha de estreno.
- Lectura de un archivo `peliculas.json` con películas locales.
- Cálculo de evaluaciones y duración de películas.
- Aplicación del principio de **Responsabilidad Única** (Single Responsibility Principle - SRP).

## Tecnologías utilizadas

- Java 11+
- `HttpURLConnection` o `HttpClient` (dependiendo de la implementación)
- Librería JSON (puedes usar `Gson`, `Jackson` o `org.json`)
- Archivos `.json` para persistencia local de películas

## Estructura del proyecto

```plaintext
src/
├── Main.java
├── StarWarsApiClient.java
├── Pelicula.java
├── GestorDePeliculas.java
peliculas.json

```

## Ejemplo de uso

Al ejecutar el programa, verás en consola información como:

Título: A New Hope
Director: George Lucas
Estreno: 1977-05-25
Introducción: It is a period of civil war...

También puedes ver las películas almacenadas localmente desde `peliculas.json`.

## Ejemplo de archivo `peliculas.json`

```
json
[
  {
    "Nombre": "Matrix",
    "FechaDeLanzamiento": 1993,
    "IncluidoEnElPlan": false,
    "SumaDeLasEvaluaciones": 0.0,
    "TotalDeEvaluaciones": 0,
    "DuracionEnMinutos": 60
  },
  ...
]
```
