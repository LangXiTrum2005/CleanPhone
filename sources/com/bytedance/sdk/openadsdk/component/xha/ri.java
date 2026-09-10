package com.bytedance.sdk.openadsdk.component.xha;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.di;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.wjv.fi;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static Boolean lr;
    private static AtomicInteger ri = new AtomicInteger(0);
    private static Integer ik = null;

    public static int co() {
        if (ik == null) {
            int iRi = fi.ri("aoa_preload_size", 10);
            ik = Integer.valueOf(iRi);
            if (iRi < 0) {
                ik = 10;
            }
        }
        return ik.intValue();
    }

    public static boolean di() {
        return nr.ka().sf() == 1;
    }

    public static boolean fi() {
        return fi.ri("aoa_cache_opt_enable", 0) == 1;
    }

    public static int ik() {
        return ri.incrementAndGet();
    }

    public static int jbs() {
        int iRi = fi.ri("aoa_cache_refresh_time", 72000000);
        if (iRi < 60000) {
            return 72000000;
        }
        return iRi;
    }

    public static int ka() {
        return vr.lr.get() ? 1 : 2;
    }

    public static File lr(String str) {
        return new File(di.ri(nr.ri()).lr(), str);
    }

    public static int mj() {
        if (fi()) {
            return fi.ri("aoa_cache_count", 3);
        }
        return 1;
    }

    public static int qt() {
        int iRi = fi.ri("aoa_cache_poll_interval", 3600000);
        if (iRi < 60000) {
            return 3600000;
        }
        return iRi;
    }

    public static File ri(String str) {
        return new File(CacheDirFactory.getICacheDir(0).lr() + File.separator + str);
    }

    public static boolean sf() {
        if (lr == null) {
            boolean z = false;
            boolean z2 = fi.ri("open_ad_ugen_backup_enable", 0) == 1;
            boolean z3 = fi.ri("express_backup_type", 0) == 1;
            if (z2 && z3) {
                z = true;
            }
            lr = Boolean.valueOf(z);
        }
        return lr.booleanValue();
    }

    public static int xha() {
        return ri.get() == 0 ? fi.ri("aoa_cold_load_timeout", 3500) : fi.ri("aoa_hot_load_timeout", 3500);
    }

    public static void ri(File file) {
        if (file == null) {
            return;
        }
        try {
            xha.lr(file);
        } catch (Throwable unused) {
        }
    }

    public static void ri(Context context) {
        try {
            di.ri(context).ri();
            if (fi()) {
                com.bytedance.sdk.openadsdk.common.nr.ri().lr();
            }
        } catch (Throwable unused) {
        }
    }

    public static long lr() {
        return SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
    }

    public static String ri() {
        return di.ri(nr.ri()).lr().getAbsolutePath();
    }

    public static void ri(JSONObject jSONObject, int i, boolean z) {
        try {
            String strMj = qt.lr().mj();
            int iJbs = qt.lr().jbs();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", strMj);
            if (!z) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iJbs)));
            } else if (qt.lr().jbs() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", nr.ka().wjv(String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e) {
            ac.ik("TTAppOpenUtils", e.getMessage());
        }
    }

    public static int ri(wjv wjvVar, int i) {
        return i - wjvVar.mf();
    }

    public static void ri(int i) {
        Map<String, AdSlot> mapIk;
        if (!fi() || (mapIk = com.bytedance.sdk.openadsdk.common.nr.ri().ik()) == null || mapIk.size() == 0) {
            return;
        }
        mapIk.size();
        for (AdSlot adSlot : mapIk.values()) {
            if (adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm())) {
                try {
                    adSlot.setCacheScene(i);
                    di.ri(nr.ri()).ri(adSlot);
                } catch (Throwable unused) {
                    adSlot.toString();
                }
            }
        }
    }

    public static boolean ri(AdSlot adSlot) {
        Map<String, Object> requestExtraMap;
        return (adSlot == null || (requestExtraMap = adSlot.getRequestExtraMap()) == null || requestExtraMap.get("is_from_m") != Boolean.TRUE) ? false : true;
    }
}
