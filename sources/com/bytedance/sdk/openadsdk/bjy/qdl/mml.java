package com.bytedance.sdk.openadsdk.bjy.qdl;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.bjy.qdl.mml;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.p004ironsource.ne;
import com.smartdigimkt.k6.b;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml<T extends mml> implements lnr {
    private String exu;
    private String fs;
    private String lnr;
    private String qdl;
    private String rq;
    private String to;
    private String tvp;
    private String ud;
    private String wd;
    private final String mml = BuildConfig.VERSION_NAME;
    private long mzz = System.currentTimeMillis() / 1000;
    private int mo = 0;
    private int jpc = 0;

    private mml() {
        try {
            this.exu = uw.qdl();
        } catch (Throwable unused) {
            this.exu = "default";
        }
    }

    private JSONObject bjy() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ne.f26256E, 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", gy.mo());
            jSONObject.put("ua", gy.mml());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private T jtx() {
        return this;
    }

    public static mml<mml> ud() {
        return new mml<>();
    }

    public String exu() {
        return this.to;
    }

    public String fs() {
        return this.tvp;
    }

    public long jpc() {
        return this.mzz;
    }

    public String lnr() {
        return this.qdl;
    }

    public String mml() {
        return this.rq;
    }

    public String mo() {
        return this.lnr;
    }

    public String mzz() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.qdl.lnr
    public JSONObject qdl() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", wd());
            jSONObject2.put("app_version", gy.jpc());
            jSONObject2.put("timestamp", jpc());
            jSONObject2.put("conn_type", jl.ud(yt.qdl()));
            jSONObject2.put("appid", TextUtils.isEmpty(tvp.ud().mml()) ? "" : tvp.ud().mml());
            jSONObject2.put(b.c.d, bjy());
            if (!TextUtils.isEmpty(lnr())) {
                jSONObject2.put("type", lnr());
            }
            jSONObject2.put("error_code", rq());
            if (!TextUtils.isEmpty(fs())) {
                jSONObject2.put("error_msg", fs());
            }
            if (!TextUtils.isEmpty(mzz())) {
                jSONObject2.put("rit", mzz());
            }
            if (!TextUtils.isEmpty(mo())) {
                jSONObject2.put("creative_id", mo());
            }
            if (tvp() > 0) {
                jSONObject2.put("adtype", tvp());
            }
            if (!TextUtils.isEmpty(to())) {
                jSONObject2.put("req_id", to());
            }
            if (!TextUtils.isEmpty(exu())) {
                jSONObject2.put("extra", exu());
            }
            String strMml = mml();
            if (TextUtils.isEmpty(strMml)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strMml);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.exu + TokenBuilder.TOKEN_DELIMITER + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strMml)) {
                jSONObject2.put("event_extra", strMml);
            }
            if (!TextUtils.isEmpty(rdp())) {
                jSONObject2.put("duration", rdp());
            }
        } catch (Throwable th) {
            aaj.lnr("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    public String rdp() {
        return this.fs;
    }

    public int rq() {
        return this.jpc;
    }

    public String to() {
        return this.wd;
    }

    public int tvp() {
        return this.mo;
    }

    public String wd() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public T jpc(String str) {
        this.fs = str;
        return (T) jtx();
    }

    public T lnr(String str) {
        this.ud = str;
        return (T) jtx();
    }

    public T mml(String str) {
        this.lnr = str;
        return (T) jtx();
    }

    public T mo(String str) {
        this.tvp = str;
        return (T) jtx();
    }

    public T mzz(String str) {
        this.wd = str;
        return (T) jtx();
    }

    public T ud(String str) {
        this.rq = str;
        return (T) jtx();
    }

    public T wd(String str) {
        this.to = str;
        return (T) jtx();
    }

    public T ud(int i2) {
        this.jpc = i2;
        return (T) jtx();
    }

    public T qdl(String str) {
        this.qdl = str;
        return (T) jtx();
    }

    public T qdl(int i2) {
        this.mo = i2;
        return (T) jtx();
    }
}
