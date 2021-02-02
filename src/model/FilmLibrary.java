package model;

import java.util.ArrayList;
import java.util.List;

public class FilmLibrary {
    
    private List<String []> films;
    private List<String []> filmsFiltered;
    private int fieldToFilter;
    
    public FilmLibrary(List<String[]> films, int fieldtoFilter) {
        this.films = films;
        filmsFiltered = new ArrayList<String []>();
        this.fieldToFilter = fieldtoFilter;
    }
    
    public void filter(String filterBy) {
        switch (fieldToFilter) {
            case 2:
                for(String[] film : films) {
                    if(Integer.valueOf(film[fieldToFilter]) >= Integer.valueOf(filterBy)) {
                        filmsFiltered.add(film);
                    }
                }   break;
            case 3:
                for(String[] film : films) {
                    if(Double.valueOf(film[fieldToFilter]) >= Double.valueOf(filterBy)) {
                        filmsFiltered.add(film);
                    }
                }   break;
            default:
                for(String[] film : films) {
                    if(film[fieldToFilter].equals(filterBy)) {
                        filmsFiltered.add(film);
                    }
                }   break;
        }
    }
        
    @Override
    public String toString() {
        
        String res = "";
        
        for(String[] strings : filmsFiltered) {
            for(int i = 0; i < strings.length; i++) {
                res += strings[i] +", ";
            }
            res += "\n";
        }
        
        return res;
    }
}
