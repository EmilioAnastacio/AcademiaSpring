package br.com.webcko.academia.repository;

import br.com.webcko.academia.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public List<Cliente> findByNome(final String nome);
}
