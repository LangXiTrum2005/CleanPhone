package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ResponseData;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface IActivityPackageSender {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface ResponseDataCallbackSubscriber {
        void onResponseDataCallback(ResponseData responseData);
    }

    void sendActivityPackage(ActivityPackage activityPackage, Map<String, String> map, ResponseDataCallbackSubscriber responseDataCallbackSubscriber);

    ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map);
}
