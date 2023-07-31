package lk.sankalpa.D24.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order_Details implements SuperEntity{
    @Id
    private String od_id;
    private String od_cusNIC;
    private String od_date;
    private String od_itenName;
    private String od_usedQTY;
    private String od_unitPrice;
    private String od_total;

}
