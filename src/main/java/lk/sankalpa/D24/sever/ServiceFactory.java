package lk.sankalpa.D24.sever;


import lk.sankalpa.D24.sever.customer.impl.CustomerServiceImpl;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance(){
        return serviceFactory==null?(serviceFactory=new ServiceFactory()):serviceFactory;
    }

    public <T extends SuperService> T getService(ServiceTypes serviceType) {
        switch (serviceType){

            case CUSTOMER:return (T)new CustomerServiceImpl();

            /*case STUDENT:return (T) new StudentServiceImpl();
            case ROOM:return (T) new RoomServiceImpl();
            case RESERVATION:return (T) new ReservationServiceImpl();
            case USER:return (T) new UserServiceImpl();
*/
            default:return null;
        }

    }


}
