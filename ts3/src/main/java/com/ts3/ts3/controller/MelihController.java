package com.ts3.ts3.controller;

import com.ts3.ts3.entity.Melih;
import com.ts3.ts3.repository.MelihRepo;
import com.ts3.ts3.service.MelihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/melo")
public class MelihController {
    @Autowired
    MelihService service;

@GetMapping
    public List<Melih> findAllMelih(){
    return service.findAllMelih();
}

@GetMapping("/{id}")
public Melih findById(@PathVariable Long id){
     return service.findById(id);
}

@PostMapping
    public Melih saveMelih(@RequestBody Melih melih){
    return service.saveMelih(melih);
}

@DeleteMapping("/{id}")
    public String deleteMelih(@PathVariable Long id){
     service.deleteMelih(id);
    return id+" Silme işlemi tamamlandı.";
}

@PutMapping("/{id}")
    public Melih updateMelih(@RequestBody Melih melih){
    return service.updateMelih(melih);
}

}
