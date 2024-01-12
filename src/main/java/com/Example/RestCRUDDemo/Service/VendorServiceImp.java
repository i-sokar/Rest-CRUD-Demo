package com.Example.RestCRUDDemo.Service;

import com.Example.RestCRUDDemo.Model.Vendor;
import com.Example.RestCRUDDemo.Repository.VendorRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendorServiceImp implements VendorService{

    VendorRepo vendorRepo;

    public VendorServiceImp(VendorRepo vendorRepo) {
        this.vendorRepo = vendorRepo;
    }

    @Override
    public String CreateVendor(Vendor vendor) {
        vendorRepo.save(vendor);
        return "vendor saved in the DB";
    }

    @Override
    public String updateVendor(Vendor vendor) {
        vendorRepo.save(vendor);
        return "vendor updated in the DB";
    }

    @Override
    public String deleteVendor(String vendorid) {
        vendorRepo.deleteById(vendorid);
        return "vendor Deleted";
    }

    @Override
    public Vendor getVendor(String vendorid) {
        return vendorRepo.findById(vendorid).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepo.findAll();
    }
}
