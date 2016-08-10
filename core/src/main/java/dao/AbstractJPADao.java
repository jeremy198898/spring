package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by jeremy on 2016/8/10.
 */
public abstract class AbstractJPADao <T extends Serializable>
{
    private Class<T> clazz;

    @PersistenceContext
    private EntityManager em;

    public final void setClazz(final Class<T> clazz) {
        this.clazz = clazz;
    }

    public T findOne(final long id) {
        return em.find(clazz, id);
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll(){
        return em.createQuery("from "+clazz.getName()).getResultList();
    }

    public void create(final T entity)
    {
        em.persist(entity);
    }

    public T update(final T entity)
    {
        return em.merge(entity);
    }

    public void delete(final T entity)
    {
        em.remove(entity);
    }

    public void deleteById(final long id)
    {
        final  T entity = findOne(id);
        delete(entity);
    }

}
