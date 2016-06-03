package com.cainiao.patterns.template.change;


public class QueryCallBack implements StatementCallback<String> {

	@Override
	public String doInStatement() {
		System.out.println("execute query callback.");
		return "query:";
	}


}
