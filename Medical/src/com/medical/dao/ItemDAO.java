package com.medical.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.medical.bean.ItemMaster;

@Repository
@Qualifier(value = "itemMasterDAO")
public class ItemDAO {

    @Autowired()
    private SessionFactory sessionFactory;
    Session session = null;

    public void save(ItemMaster t) {

        session = sessionFactory.getCurrentSession();
        session.save(t);
        session.flush();

    }

}
