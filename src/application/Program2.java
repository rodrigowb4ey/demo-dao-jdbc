package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		List<Department> list = new ArrayList<>();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		list = departmentDao.findAll();
		System.out.println(list);
		
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		departmentDao.deleteById(5);
		
	}

}
