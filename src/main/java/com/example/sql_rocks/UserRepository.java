package com.example.sql_rocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //first part in <> : with whome to connect (Entity), what is datatype of pri key
}
