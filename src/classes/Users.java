package classes;

public class Users {
    private long id;
    private String username;
    private String email;
    private String password;
    private int user_group;

    public Users(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.setPassword(password);
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

    public Users setUserName(String username){
        this.username = username;
        return this;
    }
    public Users setEmail(String email){
        this.email = email;
//        todo: czy jest wyjatek zwiazany z email UNIQUEness
//        todo: try-catch przywysylaniu do bazy zeby
//        todo: zmienil setterem maila bo pewnie sie powtarza
//        todo:
        return this;
    }
    public Users setPassword(String password){
//        todo: zahaszowac haslo
//        todo:
        this.password = "";
        return this;
    }
    public Users setUser_group(int user_group){
        this.user_group = user_group;
//        todo: czy istnieje taka grupa
//        todo:
        return this;
    }

    public long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public int getUser_group(){
        return user_group;
    }
}
