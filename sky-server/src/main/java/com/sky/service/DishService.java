package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * 新增菜品接口
 */
public interface DishService {
    /**
     * 新增菜品,口味数据
     * @param dishDTO
     */
    public  void saveWithFlavor(DishDTO dishDTO);


}
