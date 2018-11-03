package com.xd.util;

public class PageUtil {
	private int page = 0;
	private int pageSize =1;
	private int dataCount = 0;
	private int maxPage = 0;
	public PageUtil(int page, int pageSize, int dataCount) {
		super();
		if (pageSize<1) {
			pageSize = 1;
		}
		this.maxPage = dataCount%pageSize==0?dataCount/pageSize:dataCount/pageSize+1;
		if (maxPage <= 0) {
			this.page = 0;
		} else {
			if (page>0) {
				this.page = page;
				if (page>maxPage) {
					this.page = maxPage;
				}
			} else {
				this.page = 1;
			}
		}
		this.dataCount = dataCount;
		this.pageSize = pageSize;
	}
	public void setPage(int page) {
		if (maxPage <= 0) {
			this.page = 0;
		} else {
			if (page>0) {
				this.page = page;
				if (page>maxPage) {
					this.page = maxPage;
				}
			} else {
				this.page = 1;
			}
		}
	}
	public void setPageSize(int pageSize) {
		if (pageSize<1) {
			pageSize = 1;
		}
		this.pageSize = pageSize;
		this.maxPage = dataCount%pageSize==0?dataCount/pageSize:dataCount/pageSize+1;
	}
	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
		this.maxPage = dataCount%pageSize==0?dataCount/pageSize:dataCount/pageSize+1;
	}
	public int getPage(){
		return page;
	}
	public int getMaxPage(){
		return maxPage;
	}
	public int getOracleStart(){
		return (page-1)*pageSize+1;
	}
	public int getMySqlStart(){
		return (page-1)*pageSize;
	}
	public int getOracleEnd(){
		return getOracleStart()+pageSize-1;
	}
}