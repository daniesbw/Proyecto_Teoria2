/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.ls.neo4j.proyecto_neo;

/**
 *
 * @author Daniel
 */
public class Usuario {
    private String login;
    private String pass;
    private String rol;

    public Usuario() {
    }

    public Usuario(String login, String pass, String rol) {
        this.login = login;
        this.pass = pass;
        this.rol = rol;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", pass=" + pass + ", rol=" + rol + '}';
    }
    
}
