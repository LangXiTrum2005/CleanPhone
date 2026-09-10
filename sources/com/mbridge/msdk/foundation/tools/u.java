package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class u extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f34196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f34197x;

    public u(Context context) {
        super(context);
        this.f34197x = m0.x();
        this.f34196w = m0.h();
    }

    @Override // com.mbridge.msdk.foundation.tools.e
    public JSONObject a() {
        JSONObject jSONObjectA = super.a();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.f34197x + "");
                jSONObject.put("dmf", this.f34196w);
                return jSONObjectA;
            }
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DomainDeviceInfo", e10.getMessage());
            }
        }
        return jSONObjectA;
    }
}
