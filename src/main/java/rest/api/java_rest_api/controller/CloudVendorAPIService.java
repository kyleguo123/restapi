package rest.api.java_rest_api.controller;

import org.springframework.web.bind.annotation.*;
import rest.api.java_rest_api.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorID)
    {
        return  cloudVendor;
//          return new CloudVendor("C1","Vendor 1",
//                "Address One", "xxxx");
    }

    @PostMapping
    public String createCloudVendorDatils(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDatils(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDatils(String vendorID)
    {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}
