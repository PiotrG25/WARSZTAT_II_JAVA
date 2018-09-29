package classes;

public class Solution {
    private int id;
    private String created;
    private String updated;
    private String description;
    private int exercise_id;
    private long users_id;

    public Solution(String created, String updated, String description, int exercise_id, long users_id){
        setCreated(created);
        setUpdated(updated);
        this.description = description;
        setExercise_id(exercise_id);
        setUsers_is(users_id);
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

    public Solution setCreated(String created){
        if(isDateTime(created)){
            this.created = created;
        }else{
            System.err.println("Niewłaściwy format czasu, możesz skożystać z metody toDateTime");
            return null;
        }
        return this;
    }
    public Solution setUpdated(String updated){
        if(isDateTime(updated)){
            this.updated = updated;
        }else{
            System.err.println("Niewłaściwy format czasu, możesz skożystać z metody toDateTime");
            return null;
        }
        return this;
    }
    public Solution setDescription(String description){
        this.description = description;
        return this;
    }
    public Solution setExercise_id(int exercise_id){
//        todo: czy istnieje takie id
//        todo: takie zadanie
//        todo:
        this.exercise_id = exercise_id;
        return this;
    }
    public Solution setUsers_is(long users_id){
//        todo: czy istnieje takie id
//        todo: taki uzytkownik
//        todo:
        this.users_id = users_id;
        return this;
    }

    public int getId(){
        return id;
    }
    public String getCreated(){
        return created;
    }
    public String getUpdated(){
        return updated;
    }
    public String getDescription(){
        return description;
    }
    public int getExercise_id(){
        return exercise_id;
    }
    public long getUsers_id(){
        return users_id;
    }

    public static String toDateTime(int YY, int MM, int DD, int hh, int mm, int ss){
//        todo: czy dziala?
        String date = "";

        if(YY < 1000) date += "0";
        if(YY < 100) date += "0";
        if(YY < 10) date += "0";

        date += YY;
        date += "-";

        if(MM < 10) date += "0";

        date += MM;
        date += "-";

        if(DD < 10) date += "0";

        date += DD;
        date += " ";

        if(hh < 10) date += "0";

        date += hh;
        date += ":";

        if(mm < 10) date += "0";

        date += mm;
        date += ":";

        if(ss < 10) date += "0";

        date += ss;

        return date;
    }
    public static boolean isDateTime(String date){
//        'YYYY-MM-DD hh:mm:ss'
//        todo: czy dziala?
        boolean yes = true;

        int[] digitIndex = {0,1,2,3,5,6,8,9,11,12,14,15,17,18};
        int[] minusIndex = {4,7};
        int[] pointsIndex = {13,16};
        int spaceIndex = 10;

        if(date.length() > 19) yes = false;

        for(int i : digitIndex){
            if(!Character.isDigit(date.charAt(i)))
                yes = false;
        }

        for(int i : minusIndex){
            if(date.charAt(i) != '-') yes = false;
        }

        for(int i : pointsIndex){
            if(date.charAt(i) != ':') yes = false;
        }

        if(date.charAt(spaceIndex) != ' ') yes = false;

        return yes;
    }
}