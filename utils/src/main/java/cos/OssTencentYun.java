package cos;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.meta.InsertOnly;
import com.qcloud.cos.request.UploadFileRequest;

/**
 * Created by jeremy on 2016/9/5.
 */
public class OssTencentYun {

    private static final int appID= 10027841;
    private static final String secretID = "AKID3HwNGNx8ixCuVXRBxnwodtN95axehriP";
    private static final String secretKey = "Guyu1PuhEnvhejmBV5MO90SnnKpbthCQ";

    private COSClient cosClient = null;

    private static final String bucketName = "redtree";

    public OssTencentYun(){
        COSClient cosClient = new COSClient(appID, secretID, secretKey);
        this.cosClient = cosClient;
    }

    //上传文件（覆盖）
    public String uploadFile(String cosFilePath, String localFilePath){
        UploadFileRequest fileRequest = new UploadFileRequest(bucketName, cosFilePath, localFilePath);
        fileRequest.setInsertOnly(InsertOnly.OVER_WRITE);
        String uploadResult = cosClient.uploadFile(fileRequest);
        return uploadResult;
    }

}
