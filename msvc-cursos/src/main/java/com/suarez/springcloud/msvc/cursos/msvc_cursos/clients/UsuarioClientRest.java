package com.suarez.springcloud.msvc.cursos.msvc_cursos.clients;

import com.suarez.springcloud.msvc.cursos.msvc_cursos.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "msvc-usuarios", url = "msvc-usuarios:8001")
public interface UsuarioClientRest {

    @GetMapping("/{id}")
    Usuario detalle(@PathVariable Long id);

    @PostMapping("/")
    Usuario crear(@RequestBody Usuario usuario);

    @GetMapping("/usuarios-por-curso")
    List<Usuario> obtenerALumnosPOrCurso(@RequestParam Iterable<Long> ids);
}
