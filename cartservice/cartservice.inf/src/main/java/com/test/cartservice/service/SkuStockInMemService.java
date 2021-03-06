package com.test.cartservice.service;

import java.util.List;

import com.test.cartservice.vo.SkuStockInMemVo;

public interface SkuStockInMemService {

	/**
	 * 往内存插入一条sku
	 * 
	 * @param boolean
	 * @return
	 */
	public boolean insert(SkuStockInMemVo vo);

	/**
	 * 删除一条内存中对应sku的库存记录
	 * 
	 * @param skuId
	 * @return
	 */
	public boolean deleteBySkuId(Long skuId);
	
	/**
	 * 删除内存中对应sku的库存记录
	 * 
	 * @param skuIdList
	 * @return
	 */
	public boolean deleteBySkuIdList(List<Long> skuIdList);


	/**
	 * 将对应sku内存中的库存增加num个
	 * 
	 * @param skuId
	 * @param num
	 * @return 返回负数Integer.minValue 代表失败
	 */
	public Integer increaseStock(Long skuId, Integer num);

	/**
	 * 将对应sku内存中的库存减少num个
	 * 
	 * @param skuId
	 * @param num
	 * @return 返回负数Integer.minValue 代表失败
	 */
	public Integer decreaseStock(Long skuId, Integer num);

	/**
	 * 获取对应sku的库存数
	 * 
	 * @param skuId
	 * @return null代表失败
	 */
	public Integer getStockBySkuId(Long skuId);

	/**
	 * 获取skuIdList对应的库存列表对象
	 * 
	 * @param so
	 * @return
	 */
	public List<SkuStockInMemVo> getStocksBySkuIdList(List<Long> skuIdList);

}
