package com.sena.empleados_crud.controller;

import com.sena.empleados_crud.model.Empleado;
import com.sena.empleados_crud.repository.EmpleadoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin(origins = "*") // Permite que el frontend se conecte sin bloqueos
public class EmpleadoController {

    private final EmpleadoRepository repository;

    public EmpleadoController(EmpleadoRepository repository) {
        this.repository = repository;
    }

    // Listar todos los empleados
    @GetMapping
    public List<Empleado> listarTodos() {
        return repository.findAll();
    }

    // Guardar un nuevo empleado
    @PostMapping
    public Empleado guardar(@RequestBody Empleado empleado) {
        return repository.save(empleado);
    }
}
