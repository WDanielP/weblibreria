package com.distribuida.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

@Repository
public class AutorDAOImpl implements AutorDAO{
	


	//SELECT *FROM Cliente --->>SQL
	//from Cliente  --->>HQL
	//SELECT cl.* FROM CLIENTE AS cl --->>> SQL
	//SELECT CL FROM Cliente cl  ----HQL
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Autor> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Autor",Autor.class).getResultList();
		
	}
	

	@Override
	@Transactional
	public Autor findOne(int id) {
		Session session =sessionFactory.getCurrentSession();
		return session.get(Autor.class,id);
	}

	@Override
	@Transactional
	public void add(Autor autor) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(autor);

	}

	@Override
	@Transactional
	public void up(Autor autor) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(autor);

	}

	@Override
	@Transactional
	public void del(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
