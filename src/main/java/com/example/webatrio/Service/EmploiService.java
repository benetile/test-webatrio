package com.example.webatrio.Service;

import com.example.webatrio.model.Emploi;
import com.example.webatrio.model.Personne;
import com.example.webatrio.repositories.EmploiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EmploiService implements EmploiRepository{

    @Autowired
    private EmploiRepository emploiRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends Emploi> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Emploi> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Emploi> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Emploi getOne(Long aLong) {
        return null;
    }

    @Override
    public Emploi getById(Long aLong) {
        return null;
    }

    @Override
    public Emploi getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Emploi> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Emploi> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Emploi> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Emploi> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Emploi> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Emploi> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Emploi, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Emploi> S save(S entity) {
        return emploiRepository.save(entity);
    }

    @Override
    public <S extends Emploi> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Emploi> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Emploi> findAll() {
        return null;
    }

    @Override
    public List<Emploi> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Emploi entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Emploi> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Emploi> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Emploi> findAll(Pageable pageable) {
        return null;
    }


    @Override
    public Optional<Emploi> findByNom(String nom) {
        return Optional.empty();
    }
}
