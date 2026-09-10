package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.controller.a;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBInterstitialHandler {
    private a mController;
    private String unitId;

    public MBInterstitialHandler(Context context, Map<String, Object> map) {
        if (this.mController == null) {
            this.mController = new a();
        }
        if (map != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            this.unitId = str;
            if (!TextUtils.isEmpty(str)) {
                String strE = v0.e(str);
                if (!TextUtils.isEmpty(strE)) {
                    v0.d(str, strE);
                }
            }
        }
        this.mController.a(context, map);
        if (c.n().d() != null || context == null) {
            return;
        }
        c.n().b(context);
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.mController;
        return aVar != null ? aVar.a() : "";
    }

    public String getRequestId() {
        a aVar = this.mController;
        return aVar != null ? aVar.b() : "";
    }

    public void preload() {
        try {
            a aVar = this.mController;
            if (aVar != null) {
                aVar.f();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setInterstitialListener(InterstitialListener interstitialListener) {
        try {
            a aVar = this.mController;
            if (aVar != null) {
                aVar.a(interstitialListener);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void show() {
        try {
            this.mController.j();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
