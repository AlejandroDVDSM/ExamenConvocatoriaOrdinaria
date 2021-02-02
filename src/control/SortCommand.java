package control;

import model.FilmLibrary;

public class SortCommand  implements Command {

    private FilmLibrary filmLibrary;
    private String filterBy;
    
    public SortCommand(FilmLibrary filmLibrary, String filterBy) {
        this.filmLibrary = filmLibrary;
        this.filterBy = filterBy;
    }
    
    @Override
    public void execute() {
           filmLibrary.filter(filterBy);
    }
    
}
