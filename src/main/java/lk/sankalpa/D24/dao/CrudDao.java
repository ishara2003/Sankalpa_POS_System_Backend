package lk.sankalpa.D24.dao;

import lk.sankalpa.D24.entity.SuperEntity;
import org.hibernate.Session;

import java.util.List;

public interface CrudDao<T extends SuperEntity, K> extends SuperDao  {

    T save(T entity, Session session);
    T update(T entity , Session session);
    T search(K Id , Session session);
    void delete(K Id , Session session);
    List<T> allData(  Session session);

}
