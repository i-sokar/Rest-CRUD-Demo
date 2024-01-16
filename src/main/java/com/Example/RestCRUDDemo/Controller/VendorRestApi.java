package com.Example.RestCRUDDemo.Controller;

import com.Example.RestCRUDDemo.Model.Vendor;
import com.Example.RestCRUDDemo.Response.ResponseHandler;
import com.Example.RestCRUDDemo.Service.VendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    }
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getVendorDetails(@PathVariable("vendorId") String vendorId){
        return ResponseHandler.responseBuilder("Requested Vendor details", HttpStatus.OK,vendorService.getVendor(vendorId));
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
