package com.w.wx;

import com.alibaba.fastjson.JSONObject;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class QRCode {
    @Test
    public void erweima() throws WriterException, IOException {
        //生成二维码
        //定义json格式的字符串,使用fastjson
        JSONObject jsonObject=new JSONObject();

        jsonObject.put("亚洲舞王","尼古拉斯赵四");
        jsonObject.put("东邪西毒","南帝北丐");
        String content= jsonObject.toString();//转换为json格式的字符串
        System.out.println(jsonObject);

        //二维码的宽高
        int width=200;
        int height=200;
        //创建map集合
        Map<EncodeHintType,Object> hintTypeObjectMap=new HashMap<EncodeHintType, Object>();
        hintTypeObjectMap.put(EncodeHintType.CHARACTER_SET,"utf-8");
        //创建一个矩阵对象
        BitMatrix bitMatrix=new MultiFormatWriter().encode(content,BarcodeFormat.QR_CODE,width,height,hintTypeObjectMap);

        //生成的路径
        String filePath="E:/";
        String fileName="QRCode.jpg";
        //创建一个路径对象
        Path path = FileSystems.getDefault().getPath(filePath, fileName);
        //将矩阵对象生成图片
        MatrixToImageWriter.writeToPath(bitMatrix,"jpg",path);

        System.out.println("成功生成二维码");

    }
}
