package jpa.interfaces.jpa;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jeremy on 2016/8/17.
 */
public interface IRepository<T extends Serializable>
{
    T findOne(final long id);

    List<T> findAll();

    void create(final T entity);

    T update(final  T entity);

    void delete(final T entity);

    void deleteById(final long entityId);
}
