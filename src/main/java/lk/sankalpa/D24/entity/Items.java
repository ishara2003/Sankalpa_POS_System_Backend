package lk.sankalpa.D24.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items implements SuperEntity{
    @Id
    private String id;
    private String name;
    private String qty;
    private String price;

}
