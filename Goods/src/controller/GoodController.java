package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.IGoodService;
import vo.Good;

@Controller
public class GoodController {
	
	@Autowired
	private IGoodService goodService;
//	获取目录菜单
	@RequestMapping(value="/goods.do",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> checkGoods(String pId){
		Map<String,Object> map = new HashMap<String, Object>();
		List<Good> list = goodService.query();
		if(list!=null){
			map.put("code", 1);
			map.put("menu", list);
		}else{
			map.put("code", 0);
		}
		return map;
	}
	
//	更新目录菜单
	@RequestMapping(value="/updateGood.do",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateGoods(Good good){
		Map<String,Object> map = new HashMap<String, Object>();
		if(goodService.updateGood(good)){
			map.put("code", 1);
			map.put("menu", goodService.updateGood(good));
		}else{
			map.put("code", 0);
		}
		return map;
	}
	
//	删除目录菜单
	@RequestMapping(value="/deleteGood.do",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> deleteGoods(Good good){
		Map<String,Object> map = new HashMap<String, Object>();
//		if(goodService.deleteGood(good)){
//			map.put("code", 1);
//			map.put("menu", goodService.deleteGood(good));
//		}else{
//			map.put("code", 0);
//		}
		return map;
	}
}
