package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillionaireService {
    //@Autowired
    private BillionaireRepository billRepo;

    public Optional<Billionaire> findByid(int id){
        return billRepo.findById(id);
    }
    public void createBillionaire(Billionaire inputBilly){
        billRepo.save(inputBilly);
    }

    @Autowired
    BillionaireService(BillionaireRepository repo){
        billRepo = repo;
    }
}
