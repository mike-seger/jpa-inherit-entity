package com.net128.test.app.inheritentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/x")
public class XController {
    @Autowired
    private XRepository xRepository;

    @GetMapping
    public List<X> getAllX() {
        return xRepository.findAll();
    }

    @GetMapping("/{id}")
    public X getXById(@PathVariable Long id) {
        return xRepository.findById(id).orElse(null);
    }

    @PostMapping
    public X createX(@RequestBody X x) {
        return xRepository.save(x);
    }

    @PutMapping
    public X updateX(@RequestBody X updatedX) {
        return xRepository.save(updatedX);
    }

    @DeleteMapping("/{id}")
    public void deleteX(@PathVariable Long id) {
        xRepository.deleteById(id);
    }
}
