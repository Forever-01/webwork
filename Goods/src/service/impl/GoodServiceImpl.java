package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IGoodDAO;
import service.IGoodService;
import vo.Good;

@Service
public class GoodServiceImpl implements IGoodService {

	@Autowired
	private IGoodDAO dao;

	@Override
	public List<Good> query() {
		return dao.query();
	}
		
	@Override
	public boolean updateGood(Good good) {
		return dao.updateGood(good);
	}

	@Override
	public boolean deleteGood(Good good) {
//		删除节点判断是否还有子节点，有则直接删除
		List<Good> many =  dao.queryByPid(good);
		if(many != null){
			for(int i = 0;i<many.size();i++){
				deleteChildGood(many.get(i));
				many =  dao.queryByPid(good);
//				if(many.get(i).getId()){
//					
//				}
			}
		}
		return dao.deleteGood(good);
	}

	@Override
	public boolean deleteChildGood(Good good) {
		return dao.deleteChildGood(good);
	}

	
}
