package controller;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO<T> {
	public Connection connect = ConnectionJDBC.initConnection();

	public abstract T find(int id);

	public abstract ArrayList<T> findAll();
	
	public abstract T create(T obj);

	public abstract T update(T obj);

	public abstract void delete(T obj);
}
