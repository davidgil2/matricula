package com.example.demo.controllers;

import com.example.demo.dto.MateriaGrupoDto;
import com.example.demo.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Ruta rar, y los nombres
@RestController
@RequestMapping("/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping()
    public List<MateriaGrupoDto> obtenerMateriaPorCodigo(@RequestParam("codigo") Integer codigo) {
        return this.materiaService.obtenerPorCodigo(codigo);
    }

}