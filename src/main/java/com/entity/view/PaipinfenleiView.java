package com.entity.view;

import com.entity.PaipinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拍品分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 09:08:45
 */
@TableName("paipinfenlei")
public class PaipinfenleiView  extends PaipinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PaipinfenleiView(){
	}
 
 	public PaipinfenleiView(PaipinfenleiEntity paipinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, paipinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
