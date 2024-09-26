package construcao_software.ingresso_back.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import construcao_software.ingresso_back.persistence.SampleEntity;


@Repository
public interface SampleJpaRepository extends JpaRepository<SampleEntity, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário

}