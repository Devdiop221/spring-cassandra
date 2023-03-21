package com.devdiop.cassandra.springcassandraintegration.repo;

import com.devdiop.cassandra.springcassandraintegration.model.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface StudentRepository extends CassandraRepository<Student, Integer> {
}
