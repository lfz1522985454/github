/**
 * @author Administrator
 * @Title:SubjectMapper 
 * @Content:
 * @date 2018-4-11 下午9:47:48
 *
 */
package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dto.SubjectDTO;
import entity.Subject;

/**
 * @author Administrator
 * @Title:SubjectMapper 
 * @Content:
 * @date 2018-4-11 下午9:47:48
 */
public interface SubjectMapper {
	/**
	 * @author Administrator
	 * @Title:SubjectMapper 
	 * @Content:
	 * @date 2018-4-11 下午9:47:48
	 * 
	 */
	Integer selectSubjectCount(SubjectDTO dto);
	List<Subject> selectSubjectByPage(SubjectDTO dto);
	Integer deleteSubjectById(@Param("subjectId") Integer subjectId);
	Integer addSubject(Subject subject);
	Subject selectSubjectById(@Param("subjectId") Integer subjectId);
	Integer updateSubject(Subject sub);
}
