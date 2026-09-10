package com.mbridge.msdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.out.DeveloperTransferIdInfo;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface MBridgeSDK {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Deprecated
    public enum PLUGIN_LOAD_STATUS {
        INITIAL,
        INCOMPLETED,
        COMPLETED
    }

    boolean getConsentStatus(Context context);

    Map<String, String> getMBConfigurationMap(String str, String str2);

    Map<String, String> getMBConfigurationMap(String str, String str2, String str3);

    Map<String, String> getMBConfigurationMap(String str, String str2, String str3, boolean z10);

    Map<String, String> getMBConfigurationMap(String str, String str2, boolean z10);

    @Deprecated
    PLUGIN_LOAD_STATUS getStatus();

    @Deprecated
    void init(Map<String, String> map, Application application);

    @Deprecated
    void init(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener);

    void init(Map<String, String> map, Context context);

    void init(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener);

    @Deprecated
    void initAsync(Map<String, String> map, Application application);

    @Deprecated
    void initAsync(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener);

    @Deprecated
    void initAsync(Map<String, String> map, Context context);

    @Deprecated
    void initAsync(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener);

    void preload(Map<String, Object> map);

    @Deprecated
    void preloadFrame(Map<String, Object> map);

    void release();

    void setAllowAcquireIds(boolean z10);

    void setAllowTransferIdsIfLimit(boolean z10);

    void setConsentStatus(Context context);

    void setConsentStatus(Context context, int i10);

    void setConsentStatus(Context context, OnCompletionListener onCompletionListener);

    void setCoppaStatus(Context context, boolean z10);

    void setDeveloperIds(DeveloperTransferIdInfo developerTransferIdInfo);

    void setDoNotTrackStatus(Context context, boolean z10);

    @Deprecated
    void setDoNotTrackStatus(boolean z10);

    void setPlayVideoMute(int i10, int i11);

    @Deprecated
    void setThirdPartyFeatures(Map<String, Object> map);

    void setUserPrivateInfoType(Context context, String str, int i10);

    @Deprecated
    void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper);

    void updateDialogWeakActivity(WeakReference<Activity> weakReference);

    AuthorityInfoBean userPrivateInfo(Context context);
}
