/**
 * @author Administrator
 * @Title:SubjectServiceImpl 
 * @Content:
 * @date 2018-4-11 下午10:09:05
 *
 */
package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.SubjectMapper;
import dto.SubjectDTO;
import entity.Subject;
import service.SubjectService;

/**
 * @author Administrator
 * @Title:SubjectServiceImpl 
 * @Content:
 * @date 2018-4-11 下午10:09:05
 */
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {
		@Resource
		private SubjectMapper subjectMapper;
		
	public Integer selectSubjectCount(SubjectDTO dto) {
		// TODO Auto-generated method stub
		return this.subjectMapper.selectSubjectCount(dto);
	}

	/* @see service.SubjectService#selectSubjectByPage(dto.SubjectDTO)
	 * 2018-4-11 下午10:09:05
	 * Administrator
	 */
	public List<Subject> selectSubjectByPage(SubjectDTO dto) {
		// TODO Auto-generated method stub
		return this.subjectMapper.selectSubjectByPage(dto);
	}

	/* @see service.SubjectService#deleteSubjectById(java.lang.Integer)
	 * 2018-4-11 下午10:09:05
	 * Administrator
	 */
	public Integer deleteSubjectById(Integer subjectId) {
		// TODO Auto-generated method stub
		return this.subjectMapper.deleteSubjectById(subjectId);
	}

	/* @see service.SubjectService#addSubject(entity.Subject)
	 * 2018-4-11 下午10:09:05
	 * Administrator
	 */
	public Integer addSubject(Subject subject) {
		// TODO Auto-generated method stub
		return this.subjectMapper.addSubject(subject);
	}

	/* @see service.SubjectService#selectSubjectById(java.lang.Integer)
	 * 2018-4-11 下午10:09:05
	 * Administrator
	 */
	public Subject selectSubjectById(Integer subjectId) {
		// TODO Auto-generated method stub
		return this.subjectMapper.selectSubjectById(subjectId);
	}

	/* @see service.SubjectService#updateSubject(entity.Subject)
	 * 2018-4-11 下午10:09:05
	 * Administrator
	 */
	public Integer updateSubject(Subject sub) {
		// TODO Auto-generated method stub
		return this.subjectMapper.updateSubject(sub);
	}

}
