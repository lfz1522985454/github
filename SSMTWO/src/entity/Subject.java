/**
 * @author Administrator
 * @Title:Subject 
 * @Content:
 * @date 2018-4-11 下午9:41:25
 *
 */
package entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Administrator
 * @Title:Subject 
 * @Content:
 * @date 2018-4-11 下午9:41:25
 */
public class Subject implements Serializable {
	private Integer subjectId;
	private String subjectName;
	private Integer gradeId;
	
	@JSONField(format="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createDate;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public Subject(Integer subjectId, String subjectName, Integer gradeId, Date createDate) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeId = gradeId;
		this.createDate = createDate;
	}



	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	

	
}
