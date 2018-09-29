package classes;

import java.sql.Connection;
import java.sql.SQLException;

public class Users {
    private int id;
    private String username;
    private String email;
    private String password;
    private int user_group;

    public Users(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.setPassword(password);
    }

    public void saveToDB(Connection conn) throws SQLException {
        //todo: czy jest wyjatek zwiazany z email UNIQUEness
        //todo: try-catch przywysylaniu do bazy zeby
        //todo: zmienil setterem maila bo pewnie sie powtarza
        if(id == 0){
            //todo: zapisz do bazy
            //todo: czy wszystkie atrybuty sa wypelnione

            //todo: czy istnieje taka grupa user_group
        }else{
            //todo: zmien dane w bazie danych
            //todo: czy wszystkie atrybuty sa wypelnione

            //todo: pobrac id z bazy i przypisac do obiektu
            //todo: czy istnieje taka grupa user_group
        }
    }
    public static Users loadUserById(Connection conn, long id) throws SQLException {
//        todo: rowniez wyszukiwac po emailu
//        todo: test: czy metoda nie zwrocila nulla
//        todo: czy obiekt ma szystkie dane takie same jak w recordzie
//        todo:
        return null;
    }
    public static Users[] loadAllUsers(Connection conn) throws SQLException {
//        todo:
//        todo: test: czy ne zwraca nulla
//        todo: czy dlugosc tablicy jest taka sama jak ilosc rekordow w tablicy
//        todo: czy argumenty sie zgadzaja(sprawdzic przynajmniej jeden)
//        todo:
        return null;
    }
    public void delete(Connection conn) throws SQLException{
//        todo: usunac obiekt ktory jest w bazie danych(id != 0)
//        todo: jezeli go tam nie ma nic nie robid
//        todo: gdy usuniemy obiekt zmieniamy jego id na 0
//        todo:
    }
    public static Users[] loadAllByGroupId(Connection conn, int id) throws SQLException {
//        todo: pobranie wszystkich uzytkownikow z grupy
//        todo:
        return null;
    }

    public Users setUserName(String username){
        this.username = username;
        return this;
    }
    public Users setEmail(String email){
        this.email = email;
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
        return this;
    }

    public int getId(){
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
