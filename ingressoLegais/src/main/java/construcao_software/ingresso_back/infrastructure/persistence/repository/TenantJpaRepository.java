package construcao_software.ingresso_back.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import construcao_software.ingresso_back.infrastructure.persistence.hybernate.models.TenantModel;

@Repository
public interface TenantJpaRepository extends JpaRepository<TenantModel, Long>{
    
}
