package com.example.videoTutorial.repository;

import com.example.videoTutorial.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}