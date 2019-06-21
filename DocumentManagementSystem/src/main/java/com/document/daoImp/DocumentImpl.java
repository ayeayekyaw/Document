package com.document.daoImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.document.dao.Document;
import com.document.entity.Account;


@Repository
public class DocumentImpl implements Document {
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<Account> getAccount() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Account.class).list();
	}

	@Override
	public void saveAccount(Account account) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(account);

	}

}
