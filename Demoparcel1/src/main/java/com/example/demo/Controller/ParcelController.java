package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Model.Parcel;

import com.example.demo.Service.ParcelService;

@RestController
@RequestMapping("/parcels")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ParcelController {
    private ParcelService parcelService;

    public ParcelController(ParcelService parcelService) {
        this.parcelService=parcelService;
    }
    
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Parcel> getParcelById(@PathVariable Long id) {
    	
    	Parcel parcel = parcelService.getParcelById(id);
    	if(parcel==null) {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    	return new ResponseEntity<>(parcel,HttpStatus.OK);
    }
    
    
    
    @GetMapping("/getall")
    public ResponseEntity<List<Parcel>> getAllParcels() {
        List<Parcel> parcellist = parcelService.getAllParcels();
        if(parcellist.isEmpty()) {
        	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(parcellist,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Parcel> addParcel(@RequestBody Parcel parcel) {
        Parcel addedParcel = parcelService.addParcel(parcel);
        return new ResponseEntity<>(addedParcel, HttpStatus.CREATED);
        }

        @GetMapping("/fetchbyusername/{uname}")
        public ResponseEntity<List<Parcel>> getAllParcelsbyusername(@PathVariable String uname) {
          return parcelService.getAllParcelByUsername(uname);




        }
    
  
    
   
}
