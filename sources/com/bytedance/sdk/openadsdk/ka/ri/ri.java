package com.bytedance.sdk.openadsdk.ka.ri;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dw;
import com.bytedance.sdk.openadsdk.utils.fr;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.igq;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.C3724ra;
import com.ironsource.L6;
import com.ironsource.X3;
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
public class ri {
    private static volatile ri di;
    private final String fi;
    private Context ik;
    private final boolean ka = ik();
    private int lr;
    private long ri;

    private ri() {
        Context contextRi = nr.ri();
        if (contextRi != null) {
            this.ik = contextRi.getApplicationContext();
        }
        this.fi = fi();
    }

    private String di() {
        StringBuilder sb = new StringBuilder();
        try {
            if (igq.fi()) {
                sb.append("MIUI-");
            } else if (igq.lr()) {
                sb.append("FLYME-");
            } else {
                String strBgr = igq.bgr();
                if (igq.ri(strBgr)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strBgr)) {
                    sb.append(strBgr);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    private String fi() {
        if (DeviceUtils.ik(this.ik)) {
            return "tv";
        }
        return DeviceUtils.lr(this.ik) ? "android_pad" : "android";
    }

    private int ka() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static ri ri() {
        if (di == null) {
            synchronized (ri.class) {
                try {
                    if (di == null) {
                        di = new ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return di;
    }

    public List<com.bytedance.sdk.openadsdk.ka.ri> ik(List<com.bytedance.sdk.openadsdk.ka.ri> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.ka.ri riVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectIk = riVar.ik();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, jSONObjectIk.optString("label"));
                long jOptLong = jSONObjectIk.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.ka.di.ik.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectIk.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectIk.opt(next));
                    }
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.ka.di(riVar.ri, jSONObject));
            } catch (Exception e) {
                ac.ik("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    public List<String> lr(List<com.bytedance.sdk.openadsdk.ka.ri> list) {
        JSONArray jSONArrayOptJSONArray = (list.isEmpty() || list.get(0) == null || list.get(0).ik() == null) ? null : list.get(0).ik().optJSONArray("app_log_url_back");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strDi = ig.di(jSONArrayOptJSONArray.optString(i));
                if (!TextUtils.isEmpty(strDi)) {
                    arrayList.add(strDi);
                }
            }
        }
        return arrayList;
    }

    public String ri(List<com.bytedance.sdk.openadsdk.ka.ri> list) {
        String strOptString;
        if (list.size() > 0 && list.get(0) != null && list.get(0).ik() != null) {
            strOptString = list.get(0).ik().optString("app_log_url");
        } else {
            strOptString = "";
        }
        return ig.fi(strOptString);
    }

    public JSONObject lr() {
        Context contextRi;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.ik == null && (contextRi = nr.ri()) != null) {
                this.ik = contextRi.getApplicationContext();
            }
            jSONObject.put(L6.d0, ig.ka());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", ig.mj());
            jSONObject.put("sim_op", ri(this.ik));
            jSONObject.put("root", this.ka ? 1 : 0);
            jSONObject.put("timezone", ka());
            jSONObject.put("access", fr.ri(this.ik));
            jSONObject.put(L6.F, X3.d);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.fi);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", qd.fi(this.ik) + "x" + qd.ik(this.ik));
            jSONObject.put("display_density", ri(qd.qt(this.ik)));
            jSONObject.put("density_dpi", qd.qt(this.ik));
            jSONObject.put(C3724ra.b, "1371");
            jSONObject.put("device_id", aw.ri(this.ik));
            jSONObject.put("rom", di());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.lr);
            jSONObject.put("uid", this.ri);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr());
            jSONObject.put("locale_language", DeviceUtils.ka());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.fi() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.lr() ? 1 : 0);
            sf sfVarKa = nr.ka();
            Context context = this.ik;
            if (context != null) {
                jSONObject.put("force_language", uq.ri(context, "tt_choose_language"));
            }
            if (sfVarKa.igq("mnc")) {
                jSONObject.put("mnc", dw.ik());
            }
            if (sfVarKa.igq("mcc")) {
                jSONObject.put("mcc", dw.lr());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void ri(com.bytedance.sdk.openadsdk.ka.ri riVar) {
        if (riVar == null) {
            return;
        }
        try {
            String strOptString = riVar.ik().optJSONObject("params").optString("log_extra", "");
            long jRi = wjv.ri(strOptString);
            int iKa = wjv.ka(strOptString);
            if (jRi == 0) {
                jRi = this.ri;
            }
            this.ri = jRi;
            if (iKa == 0) {
                iKa = this.lr;
            }
            this.lr = iKa;
        } catch (Exception e) {
            ac.ik("AdLogParamsGenerate", "getInfoFromLogExtra exception", e.getMessage());
        }
    }

    public JSONObject ri(List<com.bytedance.sdk.openadsdk.ka.ri> list, long j, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            ri(list.get(0));
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.ka.ri> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().ka());
            }
            jSONObject2.put("event_v3", jSONArray);
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    private boolean ik() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    private String ri(Context context) {
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

    private String ri(int i) {
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
