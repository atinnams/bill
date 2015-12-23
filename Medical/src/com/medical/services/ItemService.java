package com.medical.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medical.bean.ItemMaster;
import com.medical.dao.ItemDAO;

@Service
public class ItemService {

    @Autowired
    @Qualifier(value = "itemMasterDAO")
    ItemDAO itemDAO;

    @Transactional
    public void save(ItemMaster t) {
        itemDAO.save(t);
    }

}
