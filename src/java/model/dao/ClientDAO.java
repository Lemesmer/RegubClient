package model.dao;

import entities.Client;
import java.util.ArrayList;
import java.util.List;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mesmerus
 */
public class ClientDAO {

    public Client checkLogin(String email, String motDePasse) {
        List<Client> list = new ArrayList<Client>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = "from Client as cli where cli.email=? and cli.motDePasse=?";
        Query query = session.createQuery(SQL_QUERY);
        query.setParameter(0, email);
        query.setParameter(1, motDePasse);
        list = query.list();
        System.out.println("LA LISTE:   " + list.listIterator(0));
        if ((list.size() > 0)) {
            return list.get(0);
        }
        session.close();
        return null;
    }
}
