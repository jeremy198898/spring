package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jeremy on 2016/8/11.
 */
@Entity
@Table(name = "t_department")
public class Department implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
