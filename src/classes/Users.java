package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {
    private int id;
    private String username;
    private String email;
    private String password;
    private int user_group_id;

    public Users(String username, String email, String password, int user_group_id){
        this.username = username;
        this.email = email;
        this.setPassword(password);
        this.user_group_id = user_group_id;
    }

    public void saveToDB(Connection conn) throws SQLException {
        //todo: czy jest wyjatek zwiazany z email UNIQUEness
        //todo: zmienil setterem maila bo pewnie sie powtarza
        if(id == 0){
            String insert = "INSERT INTO users (username, email, password, user_group_id) VALUES (?, ?, ?, ?);";
            PreparedStatement pstm = conn.prepareStatement(insert);
            if(this.allSet()){
                pstm.setString(1, username);
                pstm.setString(3, email);
                pstm.setString(2, password);
                pstm.setInt(4, user_group_id);
            }else{
                System.err.println("Brakuje kilku argumentów");
                return;
            }
            //todo: ogarnac to zwracanie ID po exequtiecie
//            ResultSet rs = pstm.executeUpdate();
            //todo: zapisz do bazy
            //todo: czy wszystkie atrybuty sa wypelnione

            //todo: czy istnieje takie id w user_group user_group_id
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
    public Users setUser_group_id(int user_group_id){
        this.user_group_id = user_group_id;
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
    public int getUser_group_id(){
        return user_group_id;
    }

    private boolean allSet(){
        boolean yes = true;
        if(this.username == null) yes = false;
        if(this.email == null) yes = false;
        if(this.password == null) yes = false;
        if(this.user_group_id == 0) yes = false;
        return yes;
    }
}
