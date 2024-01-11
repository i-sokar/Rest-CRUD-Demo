package com.Example.RestCRUDDemo.Repository;

import com.Example.RestCRUDDemo.Model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository<Vendor,String> {
}
