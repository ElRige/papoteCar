package com.pmm.papotecar;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Long> {

    Example findOneByFirst(String first);
}
