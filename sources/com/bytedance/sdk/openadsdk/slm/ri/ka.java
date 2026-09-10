package com.bytedance.sdk.openadsdk.slm.ri;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.nr;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.slm.ri.ka;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.su;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka<T extends ka> implements ik {
    private String aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f18164co;
    private String ik;
    private String jbs;
    private String lr;
    private String qt;
    private String ri;
    private String sf;
    private String xha;
    private final String ka = BuildConfig.VERSION_NAME;
    private long fi = System.currentTimeMillis() / 1000;
    private int di = 0;
    private int mj = 0;

    private ka() {
        try {
            this.aw = su.ri();
        } catch (Throwable unused) {
            this.aw = com.unity3d.ads.BuildConfig.FLAVOR;
        }
    }

    public static ka<ka> lr() {
        return new ka<>();
    }

    private JSONObject vr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(L6.F, 1);
            jSONObject.put(L6.B, Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", ig.di());
            jSONObject.put(L6.d0, ig.ka());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String aw() {
        return this.qt;
    }

    public String bgr() {
        return this.f18164co;
    }

    public String co() {
        return this.jbs;
    }

    public String di() {
        return this.ik;
    }

    public String fi() {
        return this.lr;
    }

    public String ik() {
        return this.ri;
    }

    public int jbs() {
        return this.di;
    }

    public String ka() {
        return this.sf;
    }

    public long mj() {
        return this.fi;
    }

    public String qt() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.openadsdk.slm.ri.ik
    public JSONObject ri() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", xha());
            jSONObject2.put("app_version", ig.mj());
            jSONObject2.put("timestamp", mj());
            jSONObject2.put("conn_type", nr.lr(com.bytedance.sdk.openadsdk.core.nr.ri()));
            jSONObject2.put("appid", TextUtils.isEmpty(qt.lr().ka()) ? "" : qt.lr().ka());
            jSONObject2.put("device_info", vr());
            if (!TextUtils.isEmpty(ik())) {
                jSONObject2.put("type", ik());
            }
            jSONObject2.put("error_code", sf());
            if (!TextUtils.isEmpty(co())) {
                jSONObject2.put("error_msg", co());
            }
            if (!TextUtils.isEmpty(fi())) {
                jSONObject2.put("rit", fi());
            }
            if (!TextUtils.isEmpty(di())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, di());
            }
            if (jbs() > 0) {
                jSONObject2.put("adtype", jbs());
            }
            if (!TextUtils.isEmpty(qt())) {
                jSONObject2.put("req_id", qt());
            }
            if (!TextUtils.isEmpty(aw())) {
                jSONObject2.put("extra", aw());
            }
            String strKa = ka();
            if (TextUtils.isEmpty(strKa)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strKa);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.aw + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strKa)) {
                jSONObject2.put("event_extra", strKa);
            }
            if (!TextUtils.isEmpty(bgr())) {
                jSONObject2.put(IronSourceConstants.EVENTS_DURATION, bgr());
            }
        } catch (Throwable th) {
            ac.ik("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    public int sf() {
        return this.mj;
    }

    public String xha() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public T di(String str) {
        this.jbs = str;
        return (T) slm();
    }

    public T fi(String str) {
        this.xha = str;
        return (T) slm();
    }

    public T ik(String str) {
        this.lr = str;
        return (T) slm();
    }

    public T ka(String str) {
        this.ik = str;
        return (T) slm();
    }

    public T lr(String str) {
        this.sf = str;
        return (T) slm();
    }

    public T mj(String str) {
        this.f18164co = str;
        return (T) slm();
    }

    public T xha(String str) {
        this.qt = str;
        return (T) slm();
    }

    public T lr(int i) {
        this.mj = i;
        return (T) slm();
    }

    private T slm() {
        return this;
    }

    public T ri(String str) {
        this.ri = str;
        return (T) slm();
    }

    public T ri(int i) {
        this.di = i;
        return (T) slm();
    }
}
