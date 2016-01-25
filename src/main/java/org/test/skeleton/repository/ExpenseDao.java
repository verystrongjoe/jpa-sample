package org.test.skeleton.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.test.skeleton.entity.Expense;


@Transactional
@NoRepositoryBean
public interface ExpenseDao extends CrudRepository<Expense, Long> {

}
