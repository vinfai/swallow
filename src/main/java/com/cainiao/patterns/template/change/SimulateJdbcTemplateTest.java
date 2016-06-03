package com.cainiao.patterns.template.change;

/**
 * 
 * @author vinfai
 *
 */
public class SimulateJdbcTemplateTest {
	
	public static void main(String[] args) {
		SimulateJdbcTemplate template = new SimulateJdbcTemplate();
		String sql = "select * from report";
		String updateSql = "update report set a=1";
		template.execute(new QueryCallBack(), sql);
		template.execute(new UpdateCallBack(), updateSql);
		String r = template.execute(new StatementCallback<String>() {
			@Override
			public String doInStatement() {
				System.out.println("do result now.");
				return "do something else.";
			}
		}, updateSql);
		System.out.println(r);
	}
}
