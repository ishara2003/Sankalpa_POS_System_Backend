package lk.sankalpa.D24.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders implements SuperEntity{
    @Id
    private String o_id;
//    private String od_cusNIC;
    private String o_date;
//    private String od_itenName;
    private String od_usedQTY;
    private String od_unitPrice;
    private String o_total;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

}
