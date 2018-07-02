package util;

public class Page {
	private Integer pageIndex;
	private Integer pageCount;
	private Integer pageSize;
	private Integer rowCount;
	private Integer fromTo;

	public Integer getFromTo() {
		return (pageIndex - 1) * this.pageSize;
	}

	public Integer getPageCount() {
		if (rowCount / pageSize == 0) {
			pageCount = rowCount / pageSize;
		} else {
			pageCount = rowCount / pageSize + 1;
		}
		return pageCount;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
}
