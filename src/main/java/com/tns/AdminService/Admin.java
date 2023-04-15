package com.tns.AdminService;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admin 
{
	private Integer tenant_id;
	private String tenant_username;
	private String tenant_password;
	private String tenant_address;
	private String tenant_email;
	private Integer tenant_numb;
	private String tenant_shoplist;
	private String tenant_salesdata;
	private String tenant_finance;
	public Admin() {
		super();
	}
	public Admin(Integer tenant_id, String tenant_username, String tenant_password, String tenant_address,
			String tenant_email, Integer tenant_numb, String tenant_shoplist, String tenant_salesdata,
			String tenant_finance) {
		super();
		this.tenant_id = tenant_id;
		this.tenant_username = tenant_username;
		this.tenant_password = tenant_password;
		this.tenant_address = tenant_address;
		this.tenant_email = tenant_email;
		this.tenant_numb = tenant_numb;
		this.tenant_shoplist = tenant_shoplist;
		this.tenant_salesdata = tenant_salesdata;
		this.tenant_finance = tenant_finance;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(Integer tenant_id) {
		this.tenant_id = tenant_id;
	}
	public String getTenant_username() {
		return tenant_username;
	}
	public void setTenant_username(String tenant_username) {
		this.tenant_username = tenant_username;
	}
	public String getTenant_password() {
		return tenant_password;
	}
	public void setTenant_password(String tenant_password) {
		this.tenant_password = tenant_password;
	}
	public String getTenant_address() {
		return tenant_address;
	}
	public void setTenant_address(String tenant_address) {
		this.tenant_address = tenant_address;
	}
	public String getTenant_email() {
		return tenant_email;
	}
	public void setTenant_email(String tenant_email) {
		this.tenant_email = tenant_email;
	}
	public Integer getTenant_numb() {
		return tenant_numb;
	}
	public void setTenant_numb(Integer tenant_numb) {
		this.tenant_numb = tenant_numb;
	}
	public String getTenant_shoplist() {
		return tenant_shoplist;
	}
	public void setTenant_shoplist(String tenant_shoplist) {
		this.tenant_shoplist = tenant_shoplist;
	}
	public String getTenant_salesdata() {
		return tenant_salesdata;
	}
	public void setTenant_salesdata(String tenant_salesdata) {
		this.tenant_salesdata = tenant_salesdata;
	}
	public String getTenant_finance() {
		return tenant_finance;
	}
	public void setTenant_finance(String tenant_finance) {
		this.tenant_finance = tenant_finance;
	}
	public String toString()
	{
		return("Tenant id:"+tenant_id+" Tenant Username:"+tenant_username+" Tenant password:"+tenant_password+" Tenant Address:"+tenant_address+" Tenant E.mail:"+tenant_email+" Tenant Contact Number:"+tenant_numb+" Tenant Shop Name: "+tenant_shoplist+" Tenant Sales data:"+tenant_salesdata+" Tenant Rent Status per Month:"+tenant_finance);
	}
}
