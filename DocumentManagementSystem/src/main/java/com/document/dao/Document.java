package com.document.dao;

import java.util.List;

import com.document.entity.Account;

public interface  Document {

	public List<Account> getAccount();

	public void saveAccount(Account account);

}
