package com.Example.RestCRUDDemo.Repository;

import com.Example.RestCRUDDemo.Model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VendorRepo extends JpaRepository<Vendor,String> {
}
