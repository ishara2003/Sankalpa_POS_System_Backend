package lk.sankalpa.D24.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer implements SuperEntity{
    @Id
    private String nic;
    private String name;
    private String address;
    private String number;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Orders> orders=new ArrayList<>();

    public Customer(String nic, String name, String address, String number) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.number = number;
    }

}
