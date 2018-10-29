package com.znlccy.house.index.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/24 22:21
 * @version: v.1.0.0
 * @introduce: 文件服务接口
 */
public interface FileReceptionService {

   List<String> getImagePath(List<MultipartFile> files);
}
