package com.smartdigimkt.expressad.atsignalcommon.webEnvCheck;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {
    public void webglState(Object obj, String str) {
        try {
            new JSONObject(str).optInt("webgl");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
