package com.example.demo.Service;

import com.example.demo.Model.Parcel;
import com.example.demo.Repository.ParcelRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ParcelService {
    private final ParcelRepository parcelRepository;

    @Autowired
    public ParcelService(ParcelRepository parcelRepository) {
        this.parcelRepository = parcelRepository;
    }

    public Parcel addParcel(Parcel parcel) {
    	return parcelRepository.save(parcel);
    }

	public List<Parcel> getAllParcels() {
		return parcelRepository.findAll();
		
		
	}

	public Parcel getParcelById(Long id) {
		Optional<Parcel> optionalParcel = parcelRepository.findById(id);
        return optionalParcel.orElse(null);
		
	}


    public ResponseEntity<List<Parcel>> getAllParcelByUsername(String username) {
        List<Parcel> parcels = parcelRepository.findByUsername(username);
        if (parcels.isEmpty()) {
            // Handle case where no parcels are found for the given username
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(parcels);
        }
    }

	
    
}
