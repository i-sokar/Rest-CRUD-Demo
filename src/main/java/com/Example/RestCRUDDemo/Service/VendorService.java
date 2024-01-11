package com.Example.RestCRUDDemo.Service;

import com.Example.RestCRUDDemo.Model.Vendor;

import java.util.List;

public interface VendorService {

    public String CreateVendor(Vendor vendor);

    public String updateVendor(Vendor vendor);

    public String deleteVendor(String vendorid);

    public Vendor getVendor(String vendorid);

    public List<Vendor> getAllVendors();


}