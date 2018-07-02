/**
 * @author Administrator
 * @Title:SubjectService 
 * @Content:
 * @date 2018-4-11 下午10:07:47
 *
 */
package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dto.SubjectDTO;
import entity.Subject;

/**
 * @author Administrator
 * @Title:SubjectService 
 * @Content:
 * @date 2018-4-11 下午10:07:47
 */
public interface SubjectService {
	/**
	 * @author Administrator
	 * @Title:SubjectService 
	 * @Content:
	 * @date 2018-4-11 下午10:07:47
	 * 
	 */
	Integer selectSubjectCount(SubjectDTO dto);
	List<Subject> selectSubjectByPage(SubjectDTO dto);
	Integer deleteSubjectById(@Param("subjectId") Integer subjectId);
	Integer addSubject(Subject subject);
	Subject selectSubjectById(@Param("subjectId") Integer subjectId);
	Integer updateSubject(Subject sub);
}
