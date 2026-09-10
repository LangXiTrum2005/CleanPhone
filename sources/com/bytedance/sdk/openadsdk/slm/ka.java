package com.bytedance.sdk.openadsdk.slm;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.ironsource.L6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private static volatile ka ri;

    private ka() {
    }

    private boolean ik(com.bytedance.sdk.openadsdk.slm.ri.ka kaVar) {
        return kaVar == null;
    }

    public static void ka() {
        ri("disk_log", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.7
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jRi = ka.ri(file2);
                        j += jRi;
                        jSONObject.put(file2.getName(), jRi);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("disk_log").lr(jSONObject.toString());
            }
        });
    }

    public static void lr(final wjv wjvVar) {
        if (ig.ri(wjvVar) == null || TextUtils.isEmpty(wjvVar.mvf())) {
            return;
        }
        ri("download_gecko_start", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.14
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", wjvVar.smj());
                jSONObject.put("channel_name", wjvVar.mvf());
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("download_gecko_start").ri(wjvVar.go()).lr(jSONObject.toString());
            }
        });
    }

    public static ka ri() {
        if (ri == null) {
            synchronized (ka.class) {
                try {
                    if (ri == null) {
                        ri = new ka();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public void ik() {
        ri("blind_mode_status", true, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.5
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("blind_mode_status");
            }
        });
    }

    public void lr(final com.bytedance.sdk.openadsdk.slm.ri.ka kaVar) {
        if (ik(kaVar)) {
            return;
        }
        kaVar.ri("show_backup_endcard");
        nr.fi().ri(new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.17
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                return kaVar;
            }
        });
    }

    public static void lr() {
        dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("showFailLog") { // from class: com.bytedance.sdk.openadsdk.slm.ka.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ka.ri().ri("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    ac.ik("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public static void ri(final wjv wjvVar) {
        if (wjvVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ri("bidding_receive", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (wjvVar.go() == 3) {
                    jSONObject.put("is_icon_only", wjvVar.ory() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("bidding_receive").lr(jSONObject.toString());
            }
        });
    }

    public static void ri(wjv wjvVar, final long j) {
        if (wjvVar == null) {
            return;
        }
        ri("bidding_load", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.8
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("bidding_load").lr(jSONObject.toString());
            }
        });
    }

    public static void ri(final String str, final com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVar) {
        if (riVar == null) {
            return;
        }
        ri(str, false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.13
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObjectIk = riVar.ik();
                if (jSONObjectIk == null) {
                    jSONObjectIk = new JSONObject();
                }
                wjv wjvVarRi = riVar.ri();
                jSONObjectIk.put("req_id", wjvVarRi.jf());
                com.bytedance.sdk.openadsdk.ka.fi.lr.ik ikVarFi = riVar.fi();
                if (ikVarFi != null) {
                    ikVarFi.ri(jSONObjectIk);
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri(str).ri(wjvVarRi.go()).lr(jSONObjectIk.toString());
            }
        });
    }

    public static void ri(final wjv wjvVar, final JSONObject jSONObject) {
        if (ig.ri(wjvVar) == null || TextUtils.isEmpty(wjvVar.mvf())) {
            return;
        }
        ri("download_gecko_end", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.15
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", wjvVar.smj());
                jSONObject2.put("channel_name", wjvVar.mvf());
                jSONObject2.put("data", jSONObject);
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("download_gecko_end").ri(wjvVar.go()).lr(jSONObject2.toString());
            }
        });
    }

    public void ri(final com.bytedance.sdk.openadsdk.slm.ri.ka kaVar) {
        if (ik(kaVar)) {
            return;
        }
        kaVar.ri("express_ad_render");
        nr.fi().ri(new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.16
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                return kaVar;
            }
        });
    }

    public void ri(final long j, final long j2) {
        final long j3 = j2 - j;
        ri("general_label", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.2
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                int i = !vr.lr.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("general_label").mj(String.valueOf(j3)).lr(jSONObject.toString());
            }
        });
    }

    public void ri(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        ri(str, false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.4
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri(str).lr(jSONObject.toString());
            }
        });
    }

    public void ri(final JSONObject jSONObject) {
        if (jSONObject == null) {
            ac.ri("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            ac.ri("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            ac.ri("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            ri("ad_revenue", true, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.6
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                        jSONObject.put("uuid", aw.ik(nr.ri()));
                        String strRi = "";
                        try {
                            if (aw.ri(nr.ri()) != null) {
                                strRi = aw.ri(nr.ri());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strRi);
                        jSONObject.put(L6.H, "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("ad_revenue").lr(jSONObject.toString());
                }
            });
        }
    }

    public static long ri(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jRi = 0;
        for (File file2 : file.listFiles()) {
            jRi += ri(file2);
        }
        return jRi;
    }

    public static void ri(String str, boolean z, lr lrVar) {
        ri(str, z, -1, lrVar);
    }

    public static void ri(String str, boolean z, int i, lr lrVar) {
        if (!TextUtils.isEmpty(str) && ik.ri(str, i)) {
            nr.fi().ri(lrVar, z);
        }
    }

    public static void ri(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = jElapsedRealtime - j;
        final long j4 = jElapsedRealtime - j2;
        final long j5 = j2 - j;
        ri("ad_show_cost_time", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.9
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("ad_show_cost_time").lr(jSONObject.toString());
            }
        });
    }

    public static void ri(int i, String str) {
        ri(i, str, 0, (String) null);
    }

    public static void ri(final int i, final String str, final int i2, final String str2) {
        ri("ipv6_req", false, new lr<com.bytedance.sdk.openadsdk.slm.ri.ik>() { // from class: com.bytedance.sdk.openadsdk.slm.ka.10
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 == -1) {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    str3 = X3.g.e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("ipv6_req").lr(jSONObject.toString());
            }
        });
    }

    public static void ri(final String str, final boolean z) {
        ri("img_error_param", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.11
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("img_error_param").lr(jSONObject.toString());
            }
        });
    }

    public static void ri(final boolean z) {
        ri("web_container_reuse", false, new lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.12
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z ? 1 : 0);
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("web_container_reuse").lr(jSONObject.toString());
            }
        });
    }
}
