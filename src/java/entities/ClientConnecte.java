/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Mesmerus
 */
public class ClientConnecte {

    private  boolean connected;
    private static Client cli;

    public ClientConnecte(Client cli) {
        ClientConnecte.cli=cli;
    }
    public  boolean getConnected() {
        return connected;
    }
    public void setConnected(boolean conn) {
        connected = conn;
    }
    public static void setCli(Client cli) {
        ClientConnecte.cli = cli;
    }
    public static Client getCli() {
        return cli;
    }
}
