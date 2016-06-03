package com.cainiao.patterns.template.change;


public class UpdateCallBack implements StatementCallback<Long> {

	@Override
	public Long doInStatement() {
		System.out.println("execute update callback.");
		return Math.abs(Math.round(Math.random()));
	}

}
