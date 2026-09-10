package com.bytedance.sdk.openadsdk.STP;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.badlogic.gdx.utils.compression.lzma.Base;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.STP.Lxb.ZU;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static volatile lk Lxb;

    private lk() {
    }

    public static void LD(final tD tDVar) {
        if (nJ.Lxb(tDVar) == null || TextUtils.isEmpty(tDVar.oc())) {
            return;
        }
        Lxb("download_gecko_start", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.18
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", tDVar.Sv());
                jSONObject.put("channel_name", tDVar.oc());
                return ZU.LD().Lxb("download_gecko_start").Lxb(tDVar.op()).LD(jSONObject.toString());
            }
        });
    }

    public static lk Lxb() {
        if (Lxb == null) {
            synchronized (lk.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new lk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public static void ZU() {
        Lxb("disk_log", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.11
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jLxb = lk.Lxb(file2);
                        j += jLxb;
                        jSONObject.put(file2.getName(), jLxb);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return ZU.LD().Lxb("disk_log").LD(jSONObject.toString());
            }
        });
    }

    private boolean lk(ZU zu) {
        return zu == null;
    }

    public void lk() {
        Lxb("blind_mode_status", true, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.9
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                return ZU.LD().Lxb("blind_mode_status");
            }
        });
    }

    public static void lk(final String str, final String str2) {
        Lxb("playable_url_mime", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.16
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    String str3 = str;
                    Object obj = "not validate";
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "not validate";
                    }
                    jSONObject.put("original_mime", str3);
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str2));
                    if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
                        obj = mimeTypeFromExtension;
                    }
                    jSONObject.put("new_mime", obj);
                    jSONObject.put("url", str2);
                    jSONObject.put("is_same", str3.equals(obj) ? 1 : 0);
                } catch (Throwable unused) {
                }
                return ZU.LD().Lxb("playable_url_mime").LD(jSONObject.toString());
            }
        });
    }

    public void LD(final ZU zu) {
        if (lk(zu)) {
            return;
        }
        zu.Lxb("show_backup_endcard");
        kqm.JXs().Lxb(new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.21
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                return zu;
            }
        });
    }

    public static void Lxb(final tD tDVar) {
        if (tDVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Lxb("bidding_receive", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.1
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (tDVar.op() == 3) {
                    jSONObject.put("is_icon_only", tDVar.kVf() ? 1 : 0);
                }
                return ZU.LD().Lxb("bidding_receive").LD(jSONObject.toString());
            }
        });
    }

    public void LD(final String str) {
        Lxb("close_playable_test_tool", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.3
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return ZU.LD().Lxb("close_playable_test_tool").LD(jSONObject.toString());
            }
        });
    }

    public static void LD() {
        hg.lk(new OY("showFailLog") { // from class: com.bytedance.sdk.openadsdk.STP.lk.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    lk.Lxb().Lxb("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    sLN.Lxb("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public static void LD(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final ZU zuLD = ZU.LD().Lxb(str).LD(str2);
                kqm.JXs().Lxb(new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.13
                    @Override // com.bytedance.sdk.openadsdk.STP.LD
                    public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                        return zuLD;
                    }
                }, false);
            }
        } catch (Throwable th) {
            sLN.Lxb("StatsLogManager", th.getMessage());
        }
    }

    public static void Lxb(tD tDVar, final long j) {
        if (tDVar == null) {
            return;
        }
        Lxb("bidding_load", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.12
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                return ZU.LD().Lxb("bidding_load").LD(jSONObject.toString());
            }
        });
    }

    public static void Lxb(final String str, final com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb) {
        if (lxb == null) {
            return;
        }
        Lxb(str, false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.17
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObjectLk = lxb.lk();
                if (jSONObjectLk == null) {
                    jSONObjectLk = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.ZU.JXs.LD.lk lkVarZU = lxb.ZU();
                if (lkVarZU != null) {
                    lkVarZU.Lxb(jSONObjectLk);
                }
                return ZU.LD().Lxb(str).Lxb(lxb.Lxb().op()).LD(jSONObjectLk.toString());
            }
        });
    }

    public static void Lxb(final tD tDVar, final JSONObject jSONObject) {
        if (nJ.Lxb(tDVar) == null || TextUtils.isEmpty(tDVar.oc())) {
            return;
        }
        Lxb("download_gecko_end", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.19
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", tDVar.Sv());
                jSONObject2.put("channel_name", tDVar.oc());
                jSONObject2.put("data", jSONObject);
                return ZU.LD().Lxb("download_gecko_end").Lxb(tDVar.op()).LD(jSONObject2.toString());
            }
        });
    }

    public void Lxb(final ZU zu) {
        if (lk(zu)) {
            return;
        }
        zu.Lxb("express_ad_render");
        kqm.JXs().Lxb(new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.20
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                return zu;
            }
        });
    }

    public void Lxb(final String str) {
        Lxb("click_playable_test_tool", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return ZU.LD().Lxb("click_playable_test_tool").LD(jSONObject.toString());
            }
        });
    }

    public void Lxb(final String str, final int i, final String str2) {
        Lxb("use_playable_test_tool_error", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.4
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return ZU.LD().Lxb("use_playable_test_tool_error").LD(jSONObject.toString());
            }
        });
    }

    public void Lxb(final long j, final long j2) {
        final long j3 = j2 - j;
        Lxb("general_label", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.5
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                int i = !STP.LD.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return ZU.LD().Lxb("general_label").OY(String.valueOf(j3)).LD(jSONObject.toString());
            }
        });
    }

    public void Lxb(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        Lxb(str, false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.7
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                return ZU.LD().Lxb(str).LD(jSONObject.toString());
            }
        });
    }

    public void Lxb(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Lxb(str, false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.8
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                return ZU.LD().Lxb(str).LD(str2);
            }
        });
    }

    public void Lxb(final JSONObject jSONObject) {
        if (jSONObject == null) {
            Sfi.Lxb("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            Sfi.Lxb("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            Sfi.Lxb("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            Lxb("ad_revenue", true, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.10
                @Override // com.bytedance.sdk.openadsdk.STP.LD
                public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_EVENT, Base.kNumLenSymbols);
                        jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.sLN.lk(kqm.Lxb()));
                        String strLxb = "";
                        try {
                            if (com.bytedance.sdk.openadsdk.core.sLN.Lxb(kqm.Lxb()) != null) {
                                strLxb = com.bytedance.sdk.openadsdk.core.sLN.Lxb(kqm.Lxb());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strLxb);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return ZU.LD().Lxb("ad_revenue").LD(jSONObject.toString());
                }
            });
        }
    }

    public static long Lxb(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jLxb = 0;
        for (File file2 : file.listFiles()) {
            jLxb += Lxb(file2);
        }
        return jLxb;
    }

    public static void Lxb(String str, boolean z, LD ld) {
        int iLD = VVE.TA().LD(str);
        if (TextUtils.isEmpty(str) || iLD == 0 || ld == null) {
            return;
        }
        boolean z2 = iLD == 100;
        if (z2) {
            if (!z2) {
                return;
            }
        } else if (((int) ((Math.random() * 100.0d) + 1.0d)) > iLD) {
            return;
        }
        kqm.JXs().Lxb(ld, z);
    }

    public static void Lxb(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = jElapsedRealtime - j;
        final long j4 = jElapsedRealtime - j2;
        final long j5 = j2 - j;
        Lxb("ad_show_cost_time", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.lk.14
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return ZU.LD().Lxb("ad_show_cost_time").LD(jSONObject.toString());
            }
        });
    }

    public static void Lxb(int i, String str) {
        Lxb(i, str, 0, (String) null);
    }

    public static void Lxb(final int i, final String str, final int i2, final String str2) {
        Lxb("ipv6_req", false, (LD) new LD<com.bytedance.sdk.openadsdk.STP.Lxb.lk>() { // from class: com.bytedance.sdk.openadsdk.STP.lk.15
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 == -1) {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, str3);
                return ZU.LD().Lxb("ipv6_req").LD(jSONObject.toString());
            }
        });
    }
}
