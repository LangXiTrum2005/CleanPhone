package com.smartdigimkt.sdk.api;

import android.content.Context;
import android.webkit.GeolocationPermissions;
import com.smartdigimkt.l8.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IExHandler {
    String fillCDataParam(String str);

    void fillRequestData(JSONObject jSONObject, a aVar);

    void fillRequestData(JSONObject jSONObject, a aVar, int i2);

    void fillRequestDeviceData(JSONObject jSONObject, int i2);

    void fillTestDeviceData(JSONObject jSONObject, a aVar);

    String getAid(Context context);

    String getDefaultMarketSchemePackageName();

    String getUniqueId(Context context);

    void initDeviceInfo(Context context);

    boolean initPlugin(Context context);

    boolean isContainsPlStr(String str);

    boolean onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback);

    void resetSSID();

    void startRefreshes(long j);
}
