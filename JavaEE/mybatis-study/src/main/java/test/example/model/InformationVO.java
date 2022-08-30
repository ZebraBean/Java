package test.example.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 文物信息管理
 * 
 * @author rpj
 * @email 1349889154@qq.com
 * @date 2022-04-18 22:56:02
 */
@Data
public class InformationVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
		
	//序列
	private Integer id;
			
	//类型
	private String type;
			
	//名称
	private String name;
			
	//描述
	private String description;
			
	//朝代
	private String dynasty;
			
	//价格
	private String price;
			
	//图片
	private String picture;
			
	//证明文件
	private String document;
			
	//数量
	private Integer num;

	//库存
	private Integer repertory;
			
	//创建人
	private String createUser;
			
	//审核状态
	private String approveStatus;

	//审核意见
	private String approveComment;

	//展示或交易
	private String status;
}