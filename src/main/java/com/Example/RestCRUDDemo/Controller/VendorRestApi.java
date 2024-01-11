package com.Example.RestCRUDDemo.Controller;

import com.Example.RestCRUDDemo.Model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorRestApi {

    Vendor vendor;


    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(String vendorId){
        return  vendor;
//                Vendor("1","vendor 1","egypt","010139439");
    }

    @PostMapping
    public String postVendor(@RequestBody Vendor vendor){
        this.vendor=vendor;
        return "Vendor Created";
    }


    @PutMapping
    public String putVendor(@RequestBody Vendor vendor){
        this.vendor=vendor;
        return "Vendor has been updated";
    }
//
    @DeleteMapping("{vendorID}")
    public String deleteVendor(String vendorID){
        this.vendor=null;
        return "Vendor has been changed to null";
    }
}
