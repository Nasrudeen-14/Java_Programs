package com.tns.AdminService;
import java.util.List;
import javax.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AdminService_Controller 
{
	@Autowired
	private AdminService service;
	@GetMapping("/adminservice")
	public List<Admin>list()
	{
		return service.listAll();
	}
	@GetMapping("/adminservice/{tenant_id}")
	public ResponseEntity<Admin> get(@PathVariable Integer tenant_id)
	{
		try
		{
			Admin adm=service.get(tenant_id);
			return new ResponseEntity<Admin>(adm,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/adminservice")
	public void add(@RequestBody Admin ad)
	{
		service.save(ad);
	}
	@DeleteMapping("/adminservice/{tenant_id}")
	public void delete(@PathVariable Integer tenant_id)
	{
		service.delete(tenant_id);
	}
	@PutMapping("/adminservice/{tenant_id}")
	public ResponseEntity<?> update(@RequestBody Admin ad,@PathVariable Integer tenant_id)
	{
		Admin existad=service.get(tenant_id);
		service.save(ad);
		return new ResponseEntity<>(HttpStatus.OK);
	}	
}
