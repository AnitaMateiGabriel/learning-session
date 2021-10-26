package com.matei.springlearnsession.repository;

import com.matei.springlearnsession.model.entity.UserRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRecord, String> {
    UserRecord findByName(String name);
}
