package controlador.pelicula;

import controlador.tda.cola.Cola;
import controlador.tda.cola.ColaServices;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeException;
import modelo.Pelicula;
import modelo.Ratings;

/**
 * @author K.G
 */
public class ControladorPelicula {

    private Pelicula pelicula;
    private ColaServices<Pelicula> listaPeliculas;

    public ControladorPelicula() {
        listaPeliculas = new ColaServices(0);
    }

    public void ingresoDatosPeliculas(String tile, int year, String rated, String released, String runtime, String genre, String director, String writer, String actors, String plot, String language, String country, String awards, String poster, String metascore, String imdbRating, String imdbVotes, String imdbID, String type, String dvd, String boxOffice, String production, String website, boolean response) {
        Cola<Ratings> ratings = new Cola(0);
        pelicula = new Pelicula(tile, year, rated, released, runtime, genre, director, writer, actors, plot, language, country, awards, poster, ratings, metascore, imdbRating, imdbVotes, imdbID, type, dvd, boxOffice, production, website, response);
        listaPeliculas.push(pelicula);
    }

    public boolean ingresoRatings(int pos, String source, String value) throws PosicionException, TopeException {
        try {
            Ratings dato = new Ratings(source, value);
            listaPeliculas.getCola().obtenerDato(pos).getRatings().queue(dato);
            return true;
        } catch (PosicionException | TopeException e) {
            return false;
        }
    }

    public ColaServices<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public String mostrarInformacion(int pos) {
        String info = "-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_--_-_-_-_-_-_- _-_ -_-_-_ -_  PELICULA -_-_-_-_-_-_- _-_-_-_-_-_-_-_-_--_-_-_-_-_-_- _-_ -_-_-_ -_\n---------------------------------------------------------------------------------------------------------------------------------";
        try {
            info += "\nTitle : " + listaPeliculas.getCola().obtenerDato(pos).getTile();
            info += "\nYear : " + listaPeliculas.getCola().obtenerDato(pos).getYear();
            info += "\nReat : " + listaPeliculas.getCola().obtenerDato(pos).getRated();
            info += "\nReleased : " + listaPeliculas.getCola().obtenerDato(pos).getReleased();
            info += "\nRuntime : " + listaPeliculas.getCola().obtenerDato(pos).getRuntime();
            info += "\nGenre : " + listaPeliculas.getCola().obtenerDato(pos).getGenre();
            info += "\nDirector : " + listaPeliculas.getCola().obtenerDato(pos).getDirector();
            info += "\nWrite : " + listaPeliculas.getCola().obtenerDato(pos).getWriter();
            info += "\nActors: " + listaPeliculas.getCola().obtenerDato(pos).getActors();
            info += "\nPlot : " + listaPeliculas.getCola().obtenerDato(pos).getPlot();
            info += "\nLanguaje : " + listaPeliculas.getCola().obtenerDato(pos).getLanguage();
            info += "\nCountry : " + listaPeliculas.getCola().obtenerDato(pos).getCountry();
            info += "\nAwards : " + listaPeliculas.getCola().obtenerDato(pos).getAwards();
            info += "\nPoster : " + listaPeliculas.getCola().obtenerDato(pos).getPoster();
            info += "\nMetascore : " + listaPeliculas.getCola().obtenerDato(pos).getMetascore();
            info += "\nImdb Rating : " + listaPeliculas.getCola().obtenerDato(pos).getImdbRating();
            info += "\nImdb Votes : " + listaPeliculas.getCola().obtenerDato(pos).getImdbVotes();
            info += "\nImdb ID : " + listaPeliculas.getCola().obtenerDato(pos).getImdbID();
            info += "\nType : " + listaPeliculas.getCola().obtenerDato(pos).getType();
            info += "\nDVD : " + listaPeliculas.getCola().obtenerDato(pos).getDvd();
            info += "\nBox Office : " + listaPeliculas.getCola().obtenerDato(pos).getBoxOffice();
            info += "\nProduction : " + listaPeliculas.getCola().obtenerDato(pos).getProduction();
            info += "\nWebsite : " + listaPeliculas.getCola().obtenerDato(pos).getWebsite();
            info += "\nPesponse : " + listaPeliculas.getCola().obtenerDato(pos).isResponse();
            info += "\n---------------------------------------------------------------------------------------------------------------------------------";
            if (listaPeliculas.getCola().obtenerDato(pos).getRatings().getTope() == 0) {
                for (int i = 0; i < listaPeliculas.getCola().obtenerDato(pos).getRatings().getSize(); i++) {
                    info += "\n--------------------------------------------------------- RATINGS " + i + " ---------------------------------------------------------";
                    info += "\nSource : " + listaPeliculas.getCola().obtenerDato(pos).getRatings().obtenerDato(i).getSource();
                    info += "\t\t|\t Value : " + listaPeliculas.getCola().obtenerDato(pos).getRatings().obtenerDato(i).getValue();
                }
            }
            info += "\n---------------------------------------------------------------------------------------------------------------------------------";
        } catch (PosicionException e) {
            System.out.println("Error mostrarInformacion: " + e);
        }
        return info;
    }

}
