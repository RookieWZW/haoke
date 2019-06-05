package cn.haoke.dubbo.api.controller;

import cn.haoke.dubbo.api.service.PicUploadService;
import cn.haoke.dubbo.api.vo.PicUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by RookieWangZhiWei on 2019/6/5.
 */
@Controller
@RequestMapping("pic/upload")
public class PicUploadController {

    @Autowired
    private PicUploadService picUploadService;

    @PostMapping
    @ResponseBody
    public PicUploadResult upload(@RequestParam("file") MultipartFile uploadFile) {
        return this.picUploadService.upload(uploadFile);
    }
}
