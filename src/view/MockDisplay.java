package view;

import model.FilmLibrary;

public class MockDisplay implements Display {

    private FilmLibrary filmLibrary;
    
    @Override
    public void display(FilmLibrary filmLibrary) {
          this.filmLibrary = filmLibrary;
          System.out.println(filmLibrary.toString());
    }
}
