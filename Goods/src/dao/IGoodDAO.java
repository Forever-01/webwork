package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vo.Good;

public interface IGoodDAO {
	//进行查询，返回Good对象
	public List<Good> query();
	public List<Good> queryByPid(Good good);
	//更新目录名称
	public boolean updateGood(Good good);
	//删除目录名称
	public boolean deleteGood(Good good);
	public boolean deleteChildGood(Good good);
}
