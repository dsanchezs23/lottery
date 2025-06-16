package com.lotterygame.lottery.service;

import com.lotterygame.lottery.mapper.Mapper;
import com.lotterygame.lottery.repository.Repository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class GenericService<Dto, Model, Type> implements Service<Dto, Type> {

    private final Repository<Model, Type> repository;
    private final Mapper<Dto, Model> mapper;

    @Autowired
    public GenericService(Repository<Model, Type> repository, Mapper<Dto, Model> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Dto createEntity(Dto dto) {
        Model model = mapper.toModel(dto);
        Model savedModel = repository.save(model);
        return mapper.toDto(savedModel);
    }

    @Override
    public Dto getEntityById(Type id) {
        Model model = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return mapper.toDto(model);
    }

    @Override
    public List<Dto> getAllEntities() {
        List<Model> models = repository.findAll();
        return models.stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void deleteEntity(Type id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Entity not found");
        }
        repository.deleteById(id);
    }

    @Override
    public Dto updateEntity(Type id, Dto dto) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Model not found");
        }
        repository.deleteById(id);
        Model model = mapper.toModel(dto);
        Model savedModel = repository.save(model);
        return mapper.toDto(savedModel);
    }
}
