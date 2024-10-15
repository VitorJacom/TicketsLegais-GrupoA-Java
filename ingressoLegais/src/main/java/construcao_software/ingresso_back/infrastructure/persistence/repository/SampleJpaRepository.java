package construcao_software.ingresso_back.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import construcao_software.ingresso_back.infrastructure.persistence.hybernate.models.SampleModel;


@Repository
public interface SampleJpaRepository extends JpaRepository<SampleModel, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário
}