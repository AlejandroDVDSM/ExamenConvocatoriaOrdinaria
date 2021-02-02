package app;

import control.*;
import java.util.ArrayList;
import java.util.List;
import model.FilmLibrary;
import view.*;

public class Main {

    private Command command;
    private Display display;
    private List<String[]> filmLibrary = new ArrayList<>();
    
    public static void main(String[] args) {
        Main main = new Main();
        main.addFilm();
        main.execute();
    }

    private void addFilm() {
        String film1[] = {"Drama", "New", "2550", "4.7", "Carátula 1", "The Pianist", "2002", "Roman Polanski", "Adrien Brody", "2h 30m"};
        String film2[] = {"Crime", "Old", "3607", "5", "Carátula 2", "Reservoir Dogs", "1992", "Quentin Tarantino", "Steve Buscemi", "1h 40m"};
        String film3[] = {"Crime", "Old", "3892", "5", "Carátula 3", "Pulp Fiction", "1994", "Quentin Tarantino", "Saumel L. Jackson", "2h 58m"};
        String film4[] = {"Science Fiction", "New", "102", "4.5", "Carátula 4", "Arrival", "2016", "Denis Villeneuve", "Amy Adams", "1h 58m"};
        String film5[] = {"Science Fiction", "Old", "5200", "4.7", "Carátula 5", "Interstellar", "2014", "Christopher Nolan", "Matthew McConaughey", "2h 49m"};
        String film6[] = {"Adventure", "Old", "9505", "3.8", "Carátula 6", "Indiana Jones and the Raiders of the Lost Ark", "2014", "Steven Spielberg", "Harrison Ford", "1h 55m"};
        
        filmLibrary.add(film1);
        filmLibrary.add(film2);
        filmLibrary.add(film3);
        filmLibrary.add(film4);
        filmLibrary.add(film5);
        filmLibrary.add(film6);
    }
    
    private void execute() {
        
        display = new MockDisplay();
        FilmLibrary films = new FilmLibrary(filmLibrary, 2);
        command = new SortCommand(films, "3500");
        command.execute();
        display.display(films);
    }
}
