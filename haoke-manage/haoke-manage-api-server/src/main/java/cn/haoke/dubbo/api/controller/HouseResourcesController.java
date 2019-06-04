package cn.haoke.dubbo.api.controller;

import cn.haoke.dubbo.api.service.HouseResourcesService;
import cn.haoke.dubbo.server.pojo.HouseResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by RookieWangZhiWei on 2019/6/4.
 */
@Controller
@RequestMapping("house/resources")
public class HouseResourcesController {

    @Autowired
    private HouseResourcesService houseResourcesService;


    /**
     *
     * @param houseResources
     * @return 新增房源
     */
    @PostMapping
    @ResponseBody
    public ResponseEntity<Void> save(@RequestBody HouseResources houseResources) {
        try {
            System.out.println(houseResources);
            boolean bool = this.houseResourcesService.save(houseResources);
            if (bool) {
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("ok");
    }

}
