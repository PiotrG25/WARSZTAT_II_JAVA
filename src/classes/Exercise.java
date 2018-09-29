package classes;

public class Exercise {
    private int id;
    private String title;
    private String description;

    public Exercise(String title, String description){
        this.title = title;
        this.description = description;
    }

    public void saveToDB(){
        //todo: czy id == 0
        //todo: czy gdy id != 0 chcesz zmienic zawartosc
        //todo: czy wszystkie atrybuty sa wypelnione
        //todo: czy nie ma obiektu juz w taleli
        //todo: czy zmienic istniejacy obiekt
        //todo: czy prepare statement zwraca jakies wyjatki
        //todo: pobrac id z bazy i przypisac do obiektu
        //todo:
    }

    public Exercise setTitle(String title){
        this.title = title;
        return this;
    }
    public Exercise setDescription(String description){
        this.description = description;
        return this;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
}
