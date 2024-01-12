package com.Example.RestCRUDDemo.Controller;

import com.Example.RestCRUDDemo.Model.Vendor;
import com.Example.RestCRUDDemo.Service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorRestApi {

    VendorService vendorService;

    public VendorRestApi(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping()
    public List<Vendor> getAllVendorDetails(){
        return  vendorService.getAllVendors();
//                Vendor("1","vendor 1","egypt","010139439");
    }
    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(@PathVariable("vendorId") String vendorId){
        return  vendorService.getVendor(vendorId);
//                Vendor("1","vendor 1","egypt","010139439");
    }

    @PostMapping
    public String createVendor(@RequestBody Vendor vendor){
        vendorService.CreateVendor(vendor);
        return "Vendor Created";
    }


    @PutMapping
    public String putVendor(@RequestBody Vendor vendor){
       vendorService.updateVendor(vendor);
        return "Vendor has been updated";
    }
//
    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") String vendorId){
        vendorService.deleteVendor(vendorId);
        return "Vendor has been changed to null";
    }
}
