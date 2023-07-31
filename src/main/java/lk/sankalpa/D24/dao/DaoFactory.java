package lk.sankalpa.D24.dao;

import lk.sankalpa.D24.dao.custome.impl.CustomerDaoImpl;
import org.hibernate.Session;

public class DaoFactory {

    private static DaoFactory daoFactory ;
    private DaoFactory() {
    }

    public static DaoFactory getInstance(){

        return daoFactory==null?(daoFactory=new DaoFactory()):daoFactory;
    }

    public <T extends SuperDao>T getDAO(Session session, DaoTypes daoType){

        switch (daoType){

            case customer:return (T)new CustomerDaoImpl(session);
            /*case STUDENT:return (T) new StudentDaoImpl(session);

            case ROOM:return (T)new RoomDaoImpl(session);

            case RESERVATION:return (T)new  ReservationDaoImpl(session);

            case USER:return (T) new UserDaoImpl(session);*/

            default:return null;
        }

    }

}
