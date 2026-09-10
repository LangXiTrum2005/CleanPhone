package com.bytedance.sdk.openadsdk.ZU.Lxb;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    public static AtomicInteger Lxb = new AtomicInteger(0);
    public static AtomicInteger LD = new AtomicInteger(0);
    public static AtomicInteger lk = new AtomicInteger(0);
    public static AtomicInteger ZU = new AtomicInteger(0);
    public static AtomicInteger JXs = new AtomicInteger(0);
    public static AtomicInteger lc = new AtomicInteger(0);
    public static AtomicInteger ebl = new AtomicInteger(0);
    public static AtomicInteger OY = new AtomicInteger(0);
    public static AtomicInteger QAg = new AtomicInteger(0);

    public static void JXs() {
        try {
            if (DeviceUtils.LD()) {
                return;
            }
            QAg.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void LD() {
        try {
            com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void Lxb() {
        try {
            long jLxb = com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (jLxb > 0 && System.currentTimeMillis() - jLxb >= 86400000) {
                LD();
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (jLxb <= 0 || jLxb > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int iOptInt = jSONObject.optInt("load_get_ad_version", 0);
            if (iOptInt >= 5702 && (iOptInt < 5800 || iOptInt >= 5802)) {
                Lxb.addAndGet(jSONObject.optInt("load_times"));
                LD.addAndGet(jSONObject.optInt("load_success"));
                lk.addAndGet(jSONObject.optInt("load_fail"));
                ZU.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                JXs.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                lc.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                ebl.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                OY.addAndGet(jSONObject.optInt("load_fail_by_io"));
                QAg.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static JSONObject ZU() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", Lxb.get());
            jSONObject.put("load_success", LD.get());
            jSONObject.put("load_fail", lk.get());
            jSONObject.put("load_fail_in_background", QAg.get());
            jSONObject.put("load_success_and_parse_success", ZU.get());
            jSONObject.put("load_success_and_parse_fail", JXs.get());
            jSONObject.put("load_success_and_no_ad", lc.get());
            jSONObject.put("load_fail_by_no_net", ebl.get());
            jSONObject.put("load_fail_by_io", OY.get());
            jSONObject.put("load_get_ad_version", BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void lk() {
        try {
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_get_ad", "get_ad_event_key", ZU().toString());
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
            com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
