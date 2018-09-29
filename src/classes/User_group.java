package classes;

public class User_group {
    private int id;
    private String name;

    public User_group(String name){
        this.name = name;
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

    public User_group setName(String name){
        this.name = name;
        return this;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
