/**
 * @author Administrator
 * @Title:SubjectController 
 * @Content:
 * @date 2018-4-11 下午10:15:39
 *
 */
package controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import entity.Subject;

import service.SubjectService;
import dto.SubjectDTO;

/**
 * @author Administrator
 * @Title:SubjectController 
 * @Content:
 * @date 2018-4-11 下午10:15:39
 */
@Controller
@RequestMapping("/sub")
public class SubjectController {
	@Resource
	private SubjectService subjectService;
	@RequestMapping("/page.do")
	@ResponseBody
	public Map<String,Object> selectSubjectByPageTest(SubjectDTO dto){
		Map<String,Object> map=new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(subjectService.selectSubjectCount(dto));
		map.put("page", dto);
		map.put("subList", subjectService.selectSubjectByPage(dto));
		System.out.println(JSON.toJSONString(map));
		return map;
		
	}
	@RequestMapping("/del.do")
	@ResponseBody
	public boolean deleteById(Integer subjectId) {
		System.out.println("================����ɾ��==============");
		return subjectService.deleteSubjectById(subjectId) > 0 ? true : false;

	}

	@RequestMapping(value = "/addSubject.do", method = RequestMethod.POST)
	@ResponseBody
	public boolean addSubject(Subject subject) {
		System.out.println("================��������==============");
		return subjectService.addSubject(subject) > 0 ? true : false;

	}
	@RequestMapping(value = "/selById.do", method = RequestMethod.POST)
	@ResponseBody
	public Subject selById(Integer subjectId) {
		System.out.println("================�����ѯ����ʵ�����==============");
		return subjectService.selectSubjectById(subjectId);

	}
	
	@RequestMapping(value = "/upd.do", method = RequestMethod.POST)
	@ResponseBody
	public boolean upd(Subject subject) {
		System.out.println("================�����޸�==============");
		return subjectService.updateSubject(subject) > 0 ? true : false;

	}
}
