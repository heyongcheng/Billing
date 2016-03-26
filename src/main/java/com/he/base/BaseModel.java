package com.he.base;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseModel {
	/**当前页**/
    private int page;
    /**每页显示条数**/
    private int rows;
    /**查询开始记录**/
    public int getStart(){
    	return ((page > 0 ? page : 1) - 1) * (rows > 0 ? rows : 1);
    }
}
