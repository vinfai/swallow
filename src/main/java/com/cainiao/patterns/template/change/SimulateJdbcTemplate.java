package com.cainiao.patterns.template.change;


/**
 * spring jdbcTemplate,hibernateTemplate ģ�巽��+�ص���ʽ
 * 
 * @author vinfai
 * 
 */
public class SimulateJdbcTemplate {
	
	public <T> T execute(StatementCallback<T> action,String sql){
		//ģ�����
		//1.open connenet
		openConnection();
		//2.ִ�в���
		T result = action.doInStatement();
		//3.�ر�����
		closeConnection();
		return result;
	}
	
	private void openConnection(){
		System.out.println("open connection.");
	}
	
	private void closeConnection(){
		System.out.println("close connection.");
	}
	
}

