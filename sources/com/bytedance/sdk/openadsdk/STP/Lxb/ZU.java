package com.bytedance.sdk.openadsdk.STP.Lxb;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.STP.Lxb.ZU;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.bc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU<T extends ZU> implements lk {
    private String JVA;
    private String LD;
    private String Lxb;
    private String QAg;
    private String ebl;
    private String lk;
    private String nBu;
    private String sLN;
    private final String ZU = BuildConfig.VERSION_NAME;
    private long JXs = System.currentTimeMillis() / 1000;
    private int lc = 0;
    private int OY = 0;

    @JProtect
    private JSONObject IeN() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(bc.x, 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", nJ.JXs());
            jSONObject.put(ay.d, nJ.lk());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static ZU<ZU> LD() {
        return new ZU<>();
    }

    private T VVE() {
        return this;
    }

    public int JVA() {
        return this.OY;
    }

    public String JXs() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.openadsdk.STP.Lxb.lk
    @JProtect
    public JSONObject Lxb() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", ebl());
            jSONObject2.put("app_version", nJ.ebl());
            jSONObject2.put("timestamp", OY());
            jSONObject2.put("conn_type", IeN.LD(kqm.Lxb()));
            jSONObject2.put("appid", TextUtils.isEmpty(QAg.LD().ZU()) ? "" : QAg.LD().ZU());
            jSONObject2.put("device_info", IeN());
            if (!TextUtils.isEmpty(lk())) {
                jSONObject2.put("type", lk());
            }
            jSONObject2.put("error_code", JVA());
            if (!TextUtils.isEmpty(sLN())) {
                jSONObject2.put("error_msg", sLN());
            }
            if (!TextUtils.isEmpty(JXs())) {
                jSONObject2.put("rit", JXs());
            }
            if (!TextUtils.isEmpty(lc())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, lc());
            }
            if (QAg() > 0) {
                jSONObject2.put("adtype", QAg());
            }
            if (!TextUtils.isEmpty(nBu())) {
                jSONObject2.put("req_id", nBu());
            }
            if (!TextUtils.isEmpty(NXR())) {
                jSONObject2.put("extra", NXR());
            }
            String strZU = ZU();
            if (TextUtils.isEmpty(strZU)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strZU);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strZU)) {
                jSONObject2.put("event_extra", strZU);
            }
            if (!TextUtils.isEmpty(STP())) {
                jSONObject2.put("duration", STP());
            }
        } catch (Throwable th) {
            sLN.Lxb("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    public String NXR() {
        return this.nBu;
    }

    public long OY() {
        return this.JXs;
    }

    public int QAg() {
        return this.lc;
    }

    public String STP() {
        return this.sLN;
    }

    public String ZU() {
        return this.JVA;
    }

    public String ebl() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String lc() {
        return this.lk;
    }

    public String lk() {
        return this.Lxb;
    }

    public String nBu() {
        return this.ebl;
    }

    public String sLN() {
        return this.QAg;
    }

    public T JXs(String str) {
        this.ebl = str;
        return (T) VVE();
    }

    public T LD(String str) {
        this.JVA = str;
        return (T) VVE();
    }

    public T OY(String str) {
        this.sLN = str;
        return (T) VVE();
    }

    public T ZU(String str) {
        this.lk = str;
        return (T) VVE();
    }

    public T ebl(String str) {
        this.nBu = str;
        return (T) VVE();
    }

    public T lc(String str) {
        this.QAg = str;
        return (T) VVE();
    }

    public T lk(String str) {
        this.LD = str;
        return (T) VVE();
    }

    public T LD(int i) {
        this.OY = i;
        return (T) VVE();
    }

    public T Lxb(String str) {
        this.Lxb = str;
        return (T) VVE();
    }

    public T Lxb(int i) {
        this.lc = i;
        return (T) VVE();
    }
}
