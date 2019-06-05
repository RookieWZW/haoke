package cn.haoke.dubbo.api.service;

import cn.haoke.dubbo.api.config.AliyunConfig;
import cn.haoke.dubbo.api.vo.PicUploadResult;
import com.aliyun.oss.OSS;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayInputStream;

import java.io.ByteArrayInputStream;

/**
 * Created by RookieWangZhiWei on 2019/6/5.
 */
@Service
public class PicUploadService {

    private static final String[] IMAGE_TYPE = new String[]{".bmp", ".jpg",
            ".jpeg", ".gif", ".png"};


    @Autowired
    private OSS ossClient;

    @Autowired
    private AliyunConfig aliyunConfig;

    public PicUploadResult upload(MultipartFile uploadFile) {
        boolean isLegal = false;

        for (String type : IMAGE_TYPE) {
            if (StringUtils.endsWithIgnoreCase(uploadFile.getOriginalFilename(), type)) {
                isLegal = true;
                break;
            }
        }
            PicUploadResult fileUploadResult = new PicUploadResult();
            if (!isLegal){
                fileUploadResult.setStatus("error");
                return  fileUploadResult;
            }

            String fileName = uploadFile.getOriginalFilename();
            String filePath = getFilePath(fileName);

            try {
                ossClient.putObject(aliyunConfig.getBucketName(),filePath,new ByteArrayInputStream(uploadFile.getBytes()));

            }catch (Exception e){
                e.printStackTrace();
                fileUploadResult.setStatus("error");
                return fileUploadResult;
            }

            fileUploadResult.setStatus("done");
            fileUploadResult.setName(this.aliyunConfig.getUrlPrefix()+filePath);
            fileUploadResult.setUid(String.valueOf(System.currentTimeMillis()));

            return fileUploadResult;

    }
    private String getFilePath(String sourceFileName){
        DateTime dateTime = new DateTime();
        return "images/" + dateTime.toString("yyyy")
                + "/" + dateTime.toString("MM") + "/"
                + dateTime.toString("dd") + "/" + System.currentTimeMillis() +
                RandomUtils.nextInt(100, 9999) + "." +
                StringUtils.substringAfterLast(sourceFileName, ".");
    }
}
