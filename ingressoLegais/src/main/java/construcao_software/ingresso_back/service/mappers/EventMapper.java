package construcao_software.ingresso_back.service.mappers;

import construcao_software.ingresso_back.service.dtos.EventDTO;
import construcao_software.ingresso_back.domain.entities.EventEntity;
import construcao_software.ingresso_back.infrastructure.persistence.hybernate.models.EventModel;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    private final ModelMapper modelMapper;

    @Autowired
    public EventMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    // Converter Model para Entity
    public EventEntity toEntity(EventModel model) {
        return modelMapper.map(model, EventEntity.class);
    }

    // Converter Entity para Model
    public EventModel toEntity(EventEntity entity) {
        return modelMapper.map(entity, EventModel.class);
    }

    // Converter Entity para DTO
    public EventDTO toDTO(EventEntity entity) {
        return modelMapper.map(entity, EventDTO.class);
    }

    // Converter DTO para Entity
    public EventEntity toEntity(EventDTO dto) {
        return modelMapper.map(dto, EventEntity.class);
    }
}