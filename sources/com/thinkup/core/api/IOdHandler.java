package com.thinkup.core.api;

import android.content.Context;
import com.thinkup.core.oo.m;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IOdHandler {
    boolean checkDebuggerDevice(Context context, String str);

    String fillCDataParam(String str);

    void fillRequestData(JSONObject jSONObject, m mVar, int i2);

    void fillTestDeviceData(JSONObject jSONObject, m mVar);

    String getUniqueId(Context context);

    void initDeviceInfo(Context context);
}
