package com.net128.test.app.inheritentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/w")
public class WController {
    @Autowired
    private WRepository wRepository;

    @GetMapping
    public List<W> getAllW() {
        return wRepository.findAll();
    }

    @GetMapping("/{id}")
    public W getWById(@PathVariable Long id) {
        return wRepository.findById(id).orElse(null);
    }

    @PostMapping
    public W createW(@RequestBody W x) {
        return wRepository.save(x);
    }

    @PutMapping
    public W updateW(@RequestBody W updatedW) {
        return wRepository.save(updatedW);
    }

    @DeleteMapping("/{id}")
    public void deleteW(@PathVariable Long id) {
        wRepository.deleteById(id);
    }
}
