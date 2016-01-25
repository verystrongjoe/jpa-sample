package org.test.skeleton.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "expenses_family", catalog="skeleton")
public class ExpensesFamily {

	private Integer expensesFamilyId;
	private Integer companyId;
	private String icon;
	private String color;
	private Integer needQuantity;
	private Long price;
	private Long changePrice;
	private Date disableDate;
	
	@Id
	@Column(name = "expensesFamailyId", unique = true, 
	nullable = false, length = 45)
	public Integer getExpensesFamilyId() {
		return expensesFamilyId;
	}
	public void setExpensesFamilyId(Integer expensesFamailyId) {
		this.expensesFamilyId = expensesFamailyId;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getNeedQuantity() {
		return needQuantity;
	}
	public void setNeedQuantity(Integer needQuantity) {
		this.needQuantity = needQuantity;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getChangePrice() {
		return changePrice;
	}
	public void setChangePrice(Long changePrice) {
		this.changePrice = changePrice;
	}
	public Date getDisableDate() {
		return disableDate;
	}
	public void setDisableDate(Date disableDate) {
		this.disableDate = disableDate;
	}
	
}
