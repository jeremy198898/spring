package oss;

import cos.OssTencentYun;
import org.junit.Test;

/**
 * Created by jeremy on 2016/9/5.
 */
public class OssTest {

    @Test
    public void test()
    {
        OssTencentYun ossTencentYun = new OssTencentYun();

        //System.out.println(ossTencentYun);

        //必须加 左斜杠
        String cosFilePath = "/test/gods.xls";
        String localFilePath = "D:\\poi-excel\\goods.xls";

        System.out.println(localFilePath);

        String ret = ossTencentYun.uploadFile(cosFilePath, localFilePath);

        System.out.println(ret);

    }
}
