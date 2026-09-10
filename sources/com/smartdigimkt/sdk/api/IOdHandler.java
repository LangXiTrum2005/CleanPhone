package com.smartdigimkt.sdk.api;

import android.content.Context;
import com.smartdigimkt.l8.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IOdHandler {
    boolean checkDebuggerDevice(Context context, String str);

    String fillCDataParam(String str);

    void fillRequestData(JSONObject jSONObject, a aVar, int i2);

    void fillTestDeviceData(JSONObject jSONObject, a aVar);

    String getUniqueId(Context context);

    void initDeviceInfo(Context context);
}
