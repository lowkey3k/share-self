package com.baomidou.springboot.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.springboot.entity.Article;
import com.baomidou.springboot.entity.Video;
import com.baomidou.springboot.response.ResponseMessage;
import com.baomidou.springboot.service.IArticleService;
import com.baomidou.springboot.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description:    视频上传接口
* @Author:         LiHaitao
* @CreateDate:     2018/8/6 15:44
* @UpdateUser:
* @UpdateDate:     2018/8/6 15:44
* @UpdateRemark:
* @Version:        1.0.0
*/
@RestController
@RequestMapping("/article_video")
public class VideoArticleController extends ApiController {

    @Autowired
    private IVideoService videoService;

    @Autowired
    private IArticleService articleService;



    @RequestMapping("/add")
    public ResponseMessage addPhotoByArticle(@RequestParam("video") String videoName, @RequestParam("id")String id){
       Article article=articleService.selectById(Long.parseLong(id));
        Video video=new Video();
        video.setArticle(article);
        video.setUrl(videoName);
        videoService.insert(video);
        return ResponseMessage.ok();
    }
}