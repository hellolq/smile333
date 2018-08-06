package com.smile;

import com.smile.mapper.CommodityDatabaseMapper;
import com.smile.mapper.ShopGoodsCategoryDOMapper;
import com.smile.mapper.ShopGoodsDOMapper;
import com.smile.pojo.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MacketappApplicationTests {

	@Autowired
	private ShopGoodsCategoryDOMapper shopGoodsCategoryDOMapper;

	@Test
	public void contextLoads() {
		/*ShopGoodsDOExample shopGoodsDOExample = new ShopGoodsDOExample();
		ShopGoodsDOExample.Criteria criteria = shopGoodsDOExample.createCriteria();
		criteria.andCategoryidEqualTo(39);
		byte temp = 0;
		criteria.andIsdeletedEqualTo(temp);
		List<ShopGoodsDO> res = shopGoodsDOMapper.selectByExample(shopGoodsDOExample);
		System.out.println(res.size());*/
		ShopGoodsCategoryDOExample shopGoodsCategoryDOExample = new ShopGoodsCategoryDOExample();
		ShopGoodsCategoryDOExample.Criteria criteria = shopGoodsCategoryDOExample.createCriteria();
		byte temp = 0;
		criteria.andIsdeletedEqualTo(temp);
		List<ShopGoodsCategoryDO> res =
		shopGoodsCategoryDOMapper.selectByExample(shopGoodsCategoryDOExample);
		System.out.println(res.size());
	}

}
