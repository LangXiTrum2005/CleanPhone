package com.mbridge.msdk.video.signal.impl;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class p extends g {
    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(X3.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
