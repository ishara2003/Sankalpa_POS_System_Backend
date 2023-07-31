package lk.sankalpa.D24.dto;

import lk.sankalpa.D24.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {


        private String nic;
        private String name;
        private String address;
        private String number;
        private List<Orders>orders=new ArrayList<>();

        public CustomerDTO(String nic, String name, String address, String number) {
                this.nic = nic;
                this.name = name;
                this.address = address;
                this.number = number;
        }
}
