package org.example.springcloud.msvc.usuarios.msvc_usuarios.repositories;

import org.example.springcloud.msvc.usuarios.msvc_usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

}
