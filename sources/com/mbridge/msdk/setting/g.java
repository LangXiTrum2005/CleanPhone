package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends b {
    public static g F(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.b(new JSONObject(str));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("Setting", "parseSetting", e10);
            }
            return null;
        }
    }

    public String R0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", k());
            jSONObject.put("cfc", m());
            jSONObject.put("cfb", H0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, c0());
            jSONObject.put("awct", i());
            jSONObject.put("rurl", O0());
            jSONObject.put("ujds", P0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, d0());
            jSONObject.put("tcto", u0());
            jSONObject.put("mv_wildcard", R());
            jSONObject.put("is_startup_crashsystem", G());
            jSONObject.put("sfct", r0());
            jSONObject.put("pcrn", Y());
            jSONObject.put("adct", e());
            jSONObject.put("atrqt", h());
            jSONObject.put("omsdkjs_url", W());
            jSONObject.put("mcs", P());
            jSONObject.put("GDPR_area", K0());
            jSONObject.put("alrbs", f());
            jSONObject.put(UserDataStore.CITY, u());
            jSONObject.put("new_pipeline_id", b0());
            jSONObject.put("isDefault", F());
            jSONObject.put("st_net", t0());
            jSONObject.put("vtag", B0());
            jSONObject.put("e_str", y());
            jSONObject.put("rk", h0());
            return jSONObject.toString();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("Setting", "toJSON", th2);
            return null;
        }
    }
}
