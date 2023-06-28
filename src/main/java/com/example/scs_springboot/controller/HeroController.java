package com.example.scs_springboot.controller;

import com.example.scs_springboot.entity.Hero;
import org.springframework.web.bind.annotation.*;


/**
 * @author: 蛋宝
 * @date: 2023/6/28 14:23
 * @description:
 */
@RestController
@RequestMapping("/heroes")
public class HeroController {
    @GetMapping("/{id}")
//    public Hero getHero(@PathVariable("id") int id) {
//        // 根据ID从数据库或其他地方获取Hero对象
//        // 假设这里是一个简单的演示，直接创建并返回一个Hero对象
//        return new Hero("Superman", "Clark Kent", 10, List.of("Flight", "Super Strength", "Heat Vision"));
//    }

    @PostMapping("/")
    public Hero createHero(@RequestBody Hero hero) {
        // 将传入的Hero对象保存到数据库或其他地方
        // 返回保存后的Hero对象
        return hero;
    }

    @PutMapping("/{id}")
    public Hero updateHero(@PathVariable("id") int id, @RequestBody Hero hero) {
        // 根据ID从数据库或其他地方获取原始的Hero对象
        // 更新原始Hero对象的属性
        // 返回更新后的Hero对象
        return hero;
    }

    @DeleteMapping("/{id}")
    public void deleteHero(@PathVariable("id") int id) {
        // 根据ID从数据库或其他地方删除Hero对象
    }
}


