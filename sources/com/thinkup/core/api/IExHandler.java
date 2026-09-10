package com.thinkup.core.api;

import android.content.Context;
import android.webkit.GeolocationPermissions;
import com.thinkup.core.common.mm.o0;
import com.thinkup.core.oo.m;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IExHandler {
    void addPlLoadStateListener(o0 o0Var);

    TUEventInterface createDataFetchListener(TUBaseAdAdapter tUBaseAdAdapter, BaseAd baseAd, TUEventInterface tUEventInterface);

    String fillCDataParam(String str);

    void fillRequestData(JSONObject jSONObject, m mVar);

    void fillRequestData(JSONObject jSONObject, m mVar, int i2);

    void fillRequestDeviceData(JSONObject jSONObject, int i2);

    void fillTestDeviceData(JSONObject jSONObject, m mVar);

    String getAid(Context context);

    JSONObject getCnDInfo();

    String getDefaultMarketSchemePackageName();

    String getUniqueId(Context context);

    void initDeviceInfo(Context context);

    boolean isContainsPlStr(String str);

    boolean onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback);

    void resetSSID();

    void startPlugin(Context context);

    void startRefreshes(long j);

    void uploadAegisData(m mVar);
}
