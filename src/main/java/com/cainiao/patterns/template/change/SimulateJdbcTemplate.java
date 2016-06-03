package com.cainiao.patterns.template.change;


/**
 * spring jdbcTemplate,hibernateTemplate 模板方法+回调方式
 * 
 * @author vinfai
 * 
 */
public class SimulateJdbcTemplate {
	
	public <T> T execute(StatementCallback<T> action,String sql){
		//模板操作
		//1.open connenet
		openConnection();
		//2.执行操作
		T result = action.doInStatement();
		//3.关闭连接
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

