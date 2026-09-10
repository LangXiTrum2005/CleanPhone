package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34887g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            c.n().c(jSONObject.optInt("webgl"));
            c.n().a(jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
