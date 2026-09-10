package com.bytedance.sdk.openadsdk.ZU.Lxb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.CSn;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.HD;
import com.bytedance.sdk.openadsdk.utils.foI;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private final String JXs;
    private int LD;
    private long Lxb;
    private final boolean ZU;
    private final Context lk;

    public static class Lxb {
        private static final lk Lxb = new lk();
    }

    private String JXs() {
        if (DeviceUtils.lk(this.lk)) {
            return "tv";
        }
        return DeviceUtils.LD(this.lk) ? "android_pad" : "android";
    }

    public static lk Lxb() {
        return Lxb.Lxb;
    }

    private int ZU() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    @JProtect
    private String lc() {
        StringBuilder sb = new StringBuilder();
        try {
            if (CSn.JXs()) {
                sb.append("MIUI-");
            } else if (CSn.LD()) {
                sb.append("FLYME-");
            } else {
                String strSTP = CSn.STP();
                if (CSn.Lxb(strSTP)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strSTP)) {
                    sb.append(strSTP);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    private boolean lk() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public List<com.bytedance.sdk.openadsdk.ZU.Lxb> LD(List<com.bytedance.sdk.openadsdk.ZU.Lxb> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.ZU.Lxb lxb : list) {
            try {
                JSONObject jSONObjectLk = lxb.lk();
                jSONObjectLk.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.ZU.Lxb(lxb.Lxb, jSONObjectLk));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    private lk() {
        this.ZU = lk();
        this.lk = kqm.Lxb().getApplicationContext();
        this.JXs = JXs();
    }

    public String Lxb(List<com.bytedance.sdk.openadsdk.ZU.Lxb> list) {
        return nJ.JXs((list.size() <= 0 || list.get(0) == null || list.get(0).lk() == null) ? "" : list.get(0).lk().optString("app_log_url"));
    }

    private void Lxb(com.bytedance.sdk.openadsdk.ZU.Lxb lxb, boolean z) {
        if (lxb == null) {
            return;
        }
        try {
            String strOptString = z ? lxb.lk().optJSONObject("params").optString("log_extra", "") : lxb.lk().optString("log_extra", "");
            long jLxb = tD.Lxb(strOptString);
            int iZU = tD.ZU(strOptString);
            if (jLxb == 0) {
                jLxb = this.Lxb;
            }
            this.Lxb = jLxb;
            if (iZU == 0) {
                iZU = this.LD;
            }
            this.LD = iZU;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("AdLogParamsGenerate", "getInfoFromLogExtra exception", e.getMessage());
        }
    }

    @SuppressLint({"HardwareIds"})
    @JProtect
    public JSONObject LD() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ay.d, nJ.lk());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", nJ.ebl());
            jSONObject.put("sim_op", Lxb(this.lk));
            jSONObject.put("root", this.ZU ? 1 : 0);
            jSONObject.put(bc.M, ZU());
            jSONObject.put(bc.Q, HD.Lxb(this.lk));
            jSONObject.put(bc.x, AnalyticsConstants.SDK_TYPE);
            jSONObject.put(bc.y, Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put(bc.ai, this.JXs);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put(bc.F, Build.BRAND);
            jSONObject.put(bc.H, Build.MANUFACTURER);
            jSONObject.put(bc.N, Locale.getDefault().getLanguage());
            jSONObject.put(bc.z, le.ZU(this.lk) + "x" + le.lk(this.lk));
            jSONObject.put("display_density", Lxb(le.ebl(this.lk)));
            jSONObject.put("density_dpi", le.ebl(this.lk));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", com.bytedance.sdk.openadsdk.core.sLN.Lxb(this.lk));
            jSONObject.put("rom", lc());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.LD);
            jSONObject.put("uid", this.Lxb);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().LD());
            jSONObject.put("locale_language", DeviceUtils.ZU());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.JXs() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.LD() ? 1 : 0);
            com.bytedance.sdk.openadsdk.core.settings.lc lcVarZU = kqm.ZU();
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.tD.Lxb(this.lk, "tt_choose_language"));
            if (lcVarZU.KPU("mnc")) {
                jSONObject.put("mnc", foI.lk());
            }
            if (lcVarZU.KPU("mcc")) {
                jSONObject.put("mcc", foI.LD());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public JSONObject Lxb(List<com.bytedance.sdk.openadsdk.ZU.Lxb> list, long j, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            Lxb(list.get(0), z);
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.ZU.Lxb> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().Lxb(z));
            }
            if (z) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put(NotificationCompat.CATEGORY_EVENT, jSONArray);
            }
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.ZU.Lxb> Lxb(List<com.bytedance.sdk.openadsdk.ZU.Lxb> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.ZU.Lxb lxb : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectLk = lxb.lk();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, jSONObjectLk.optString("label"));
                long jOptLong = jSONObjectLk.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.ZU.lc.lk.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectLk.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectLk.opt(next));
                    }
                }
                if (z) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.ZU.lc(lxb.Lxb, jSONObject));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    private String Lxb(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String Lxb(int i) {
        if (i == 120) {
            return "ldpi";
        }
        if (i == 160) {
            return "mdpi";
        }
        if (i == 240) {
            return "hdpi";
        }
        if (i == 320) {
            return "xhdpi";
        }
        if (i == 480) {
            return "xxhdpi";
        }
        if (i != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }
}
