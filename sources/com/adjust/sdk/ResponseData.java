package com.adjust.sdk;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ResponseData {
    public ActivityKind activityKind;
    public ActivityPackage activityPackage;
    public String adid;
    public Long askIn;
    public AdjustAttribution attribution;
    public Long continueIn;
    public JSONObject controlParams;
    public JSONObject jsonResponse;
    public String message;
    public String resolvedDeeplink;
    public Long retryIn;
    public Map<String, String> sendingParameters;
    public Map<String, String> signedParameters;
    public String timestamp;
    public TrackingState trackingState;
    public boolean success = false;
    public boolean willRetry = false;

    public static ResponseData buildResponseData(ActivityPackage activityPackage, Map<String, String> map, Map<String, String> map2) {
        ResponseData sessionResponseData;
        ActivityKind activityKind = activityPackage.getActivityKind();
        switch (x0.f7063a[activityKind.ordinal()]) {
            case 1:
                sessionResponseData = new SessionResponseData(activityPackage);
                break;
            case 2:
                sessionResponseData = new SdkClickResponseData();
                break;
            case 3:
                sessionResponseData = new AttributionResponseData();
                break;
            case 4:
                sessionResponseData = new EventResponseData(activityPackage);
                break;
            case 5:
                sessionResponseData = new PurchaseVerificationResponseData();
                break;
            case 6:
                sessionResponseData = new ThirdPartySharingResponseData();
                break;
            default:
                sessionResponseData = new ResponseData();
                break;
        }
        sessionResponseData.activityKind = activityKind;
        sessionResponseData.activityPackage = activityPackage;
        sessionResponseData.sendingParameters = map;
        sessionResponseData.signedParameters = map2;
        return sessionResponseData;
    }

    public String toString() {
        return Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
