package controller;

import java.sql.Connection;

public abstract class DAO<T> {
	public Connection connect = ConnectionJDBC.initConnection();
	
	public abstract T find(int id);
	
	public abstract T create(T obj);
}