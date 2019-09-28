package com.chaoqi.springboot_test.web;
import com.chaoqi.springboot_test.tool.QRCodeUtil;
import com.google.zxing.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 二维码调用前端控制器
 */
@RequestMapping("/Qrcode")
@RestController
public class QrcodeController {

    /**
     * 生成二维码
     */
    @GetMapping("/create")
    public void productcode() {
        QRCodeUtil.zxingCodeCreate("https://www.cnblogs.com/moonofqin/", "D:/qrcode/", 500, "D:/qrcode/abcd.jpg");

    }


    /**
     * 解析二维码
     */
    @GetMapping("/test")
    public String analysiscode() {
        Result result = QRCodeUtil.zxingCodeAnalyze("D:/qrcode/709.jpg");
        System.err.println("二维码解析内容：" + result.toString());
        return result.toString();
    }
}