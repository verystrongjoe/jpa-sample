package org.test.skeleton.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expenses_note", catalog="skeleton")
public class ExpensesNote {

	private Integer expenseNoteId;
	private Integer userId;
	private Integer companyId;
	private Integer description;
	private Integer status;
	private Date createdAt;
	private Date updatedAt;
	private Date startDate;
	private Date endDate;
	
	
	@Id
	@Column(name = "expenseNoteId", unique = true, 
	nullable = false, length = 45)
	public Integer getExpenseNoteId() {
		return expenseNoteId;
	}
	public void setExpenseNoteId(Integer expenseNoteId) {
		this.expenseNoteId = expenseNoteId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getDescription() {
		return description;
	}
	public void setDescription(Integer description) {
		this.description = description;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	
	
	
}
