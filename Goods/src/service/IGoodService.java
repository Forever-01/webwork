package service;


import java.util.List;

import vo.Good;

public interface IGoodService {
	//查询所有菜单
	public List<Good> query();
	//更新商品信息
	public boolean updateGood(Good good);
	//删除商品信息
	public boolean deleteGood(Good good);
	public boolean deleteChildGood(Good good);
}
