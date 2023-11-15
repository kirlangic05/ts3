package com.ts3.ts3.service;

import com.ts3.ts3.entity.Melih;
import com.ts3.ts3.repository.MelihRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MelihService {

    @Autowired
    MelihRepo repo;
    public List<Melih> findAllMelih(){
       return repo.findAll();
    }

    public Melih findById(Long id){
       return repo.findById(id).get();
    }

    public Melih saveMelih(Melih melih){
        return repo.save(melih);
    }

    public void deleteMelih(Long id){
         repo.deleteById(id);

    }

    public Melih updateMelih(Melih melihRequest){
        Melih existingMelih= repo.findById(melihRequest.getId()).get();
        existingMelih.setId(melihRequest.getId());
        existingMelih.setEmail(melihRequest.getEmail());
        existingMelih.setName(melihRequest.getName());

        return repo.save(existingMelih);
    }




}
