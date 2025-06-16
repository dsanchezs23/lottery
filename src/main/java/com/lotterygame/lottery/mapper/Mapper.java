package com.lotterygame.lottery.mapper;

import com.lotterygame.lottery.dto.UserDTO;
import com.lotterygame.lottery.model.User;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper<DTO, Model> {
    DTO toDto(Model model);
    Model toModel(DTO dto);
}
