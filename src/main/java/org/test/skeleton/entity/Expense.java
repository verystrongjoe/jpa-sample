package org.test.skeleton.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "expenses", catalog="skeleton")
public class Expense {
	
	private Integer expenseId;
	private Integer noteId;
	private String description;
	
	private Integer categoryId;
	private Integer familyId;
	private Integer payModeId;
	private Integer quantity;
	private Float price;
	private Float amount;
	private String pathToPhoto;
	private Integer clientId;
	private Integer projectId;
	private Date createdAt;
	private Date updatedAt;
	private Integer currencyId;
	
	@Id
	@Column(name = "expenseId", unique = true, 
		nullable = false, length = 45)
	public Integer getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(Integer expenseId) {
		this.expenseId = expenseId;
	}
	public Integer getNoteId() {
		return noteId;
	}
	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getFamilyId() {
		return familyId;
	}
	public void setFamilyId(Integer familyId) {
		this.familyId = familyId;
	}
	public Integer getPayModeId() {
		return payModeId;
	}
	public void setPayModeId(Integer payModeId) {
		this.payModeId = payModeId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getPathToPhoto() {
		return pathToPhoto;
	}
	public void setPathToPhoto(String pathToPhoto) {
		this.pathToPhoto = pathToPhoto;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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
	public Integer getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

}
