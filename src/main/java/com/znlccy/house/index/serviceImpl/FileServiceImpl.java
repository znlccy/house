package com.znlccy.house.index.serviceImpl;

import com.google.common.collect.Lists;
import com.znlccy.house.index.service.FileService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/24 22:51
 * @version: v.1.0.0
 * @introduce: 文件实现类
 */

@Service
public class FileServiceImpl implements FileService {

    @Value("${file.path}")
    private String filePath;

    @Override
    public List<String> getImagePath(List<MultipartFile> files) {
        List<String> paths = Lists.newArrayList();
        files.forEach(file -> {
            File localFile = null;
            if (!file.isEmpty()) {
                try {
                    localFile = saveToLocal(file,filePath);
                    String path = StringUtils.substringAfterLast(localFile.getAbsolutePath(), filePath);
                    paths.add(path);
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });
        return null;
    }

    private File saveToLocal(MultipartFile file, String filePath2) {
        return null;
    }
}
