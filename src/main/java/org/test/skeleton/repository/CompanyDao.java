package org.test.skeleton.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.test.skeleton.entity.Company;

@Transactional
@NoRepositoryBean
public interface CompanyDao extends CrudRepository<Company, Long> {

}
