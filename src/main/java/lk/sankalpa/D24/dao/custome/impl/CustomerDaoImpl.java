package lk.sankalpa.D24.dao.custome.impl;

import lk.sankalpa.D24.dao.custome.CustomerDao;
import lk.sankalpa.D24.entity.Customer;
import org.hibernate.Session;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao{
    private final Session session;
    public CustomerDaoImpl(Session session) {
        this.session=session;
    }

    @Override
    public Customer save(Customer entity, Session session) {
        session.save(entity);
        return entity;
    }

    @Override
    public Customer update(Customer entity, Session session) {
        session.update(entity);
        return entity;
    }

    @Override
    public Customer search(String Id, Session session) {
        return null;
    }

    @Override
    public void delete(String Id, Session session) {

    }

    @Override
    public List<Customer> allData(Session session) {
        return null;
    }
}
