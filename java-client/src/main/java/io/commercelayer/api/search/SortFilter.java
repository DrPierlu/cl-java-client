package io.commercelayer.api.search;

import java.util.ArrayList;
import java.util.List;

import io.commercelayer.api.search.SortParam.OrderType;

public class SortFilter implements RequestFilter {

	private static final long serialVersionUID = -6656674582184819393L;
	
	private List<SortParam> sortParams = new ArrayList<>();

	public List<SortParam> getSortParams() {
		return this.sortParams;
	}

	public void addSortParam(OrderType type, String field) {
		this.sortParams.add(new SortParam(type, field));
	}

	public void addSortParam(SortParam param) {
		this.sortParams.add(param);
	}

}
