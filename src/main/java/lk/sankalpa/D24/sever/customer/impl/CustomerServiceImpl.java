package lk.sankalpa.D24.sever.customer.impl;

import lk.sankalpa.D24.dao.DaoFactory;
import lk.sankalpa.D24.dao.DaoTypes;
import lk.sankalpa.D24.dao.custome.CustomerDao;
import lk.sankalpa.D24.dto.CustomerDTO;
import lk.sankalpa.D24.sever.Converter;
import lk.sankalpa.D24.sever.customer.CustomerService;
import lk.sankalpa.D24.util.FactoryConfigeration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerServiceImpl implements CustomerService {

    private Session session;
    private CustomerDao customerDao;
    private Converter converter;

    public CustomerServiceImpl(){
        customerDao= DaoFactory.getInstance().getDAO(session, DaoTypes.customer);
        converter=new Converter();
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {

        Session session1 = FactoryConfigeration.getInstance().getSession();
        Transaction transaction = session1.beginTransaction();
        try{

            customerDao.save(converter.toCustomer(customerDTO),session1);
            transaction.commit();
            session1.close();


        }catch (Exception e){}
return customerDTO;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {

        Session session1 = FactoryConfigeration.getInstance().getSession();
        Transaction transaction = session1.beginTransaction();

        try {
            customerDao.update(converter.toCustomer(customerDTO),session1);
            transaction.commit();
            session1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customerDTO;



    }
}
