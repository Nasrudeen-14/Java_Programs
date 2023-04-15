package com.tns.AdminService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class AdminService
{
	@Autowired
	private AdminService_repository repo;
	public List<Admin>listAll()
	{
		return repo.findAll();
	}
	public Admin get(Integer tenant_id)
	{
		return repo.findById(tenant_id).get();
	}
	public void delete(Integer tenant_id)
	{
		repo.deleteById(tenant_id);
	}
	public void save(Admin tenant_id)
	{
		repo.save(tenant_id);
	}
}
