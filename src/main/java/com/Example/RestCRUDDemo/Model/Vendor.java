package com.Example.RestCRUDDemo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vendor")
public class Vendor {

    @Id
    private String vendorId;
    @Column(name = "name")
    private String vendorName;
    @Column(name = "address")
    private String vendorAddress;
    @Column(name = "phone")
    private String vendorPhoneNumber;
}
