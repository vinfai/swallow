package com.cainiao.patterns.template.change;

/**
 * 回调接口
 * @author vinfai
 *
 */
public interface StatementCallback<T> {
	
	T doInStatement();
}
