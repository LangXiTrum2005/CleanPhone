package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class bgr {
    private static final ConcurrentHashMap<ri, bgr> ri = new ConcurrentHashMap<>();
    private final ri ik;
    private final Context lr;

    public enum ri {
        REWARD_VIDEO("sp_reward_video", "sp_reward_video_new", "reward_video_cache"),
        FULL_SCREEN_VIDEO("sp_full_screen_video", "sp_full_screen_video_new", "full_screen_video_cache");

        final String fi;
        final String ik;
        final String ka;

        ri(String str, String str2, String str3) {
            this.ik = str;
            this.ka = str2;
            this.fi = str3;
        }
    }

    private bgr(Context context, ri riVar) {
        this.lr = context == null ? com.bytedance.sdk.openadsdk.core.nr.ri() : context.getApplicationContext();
        this.ik = riVar;
    }

    public static bgr ri(Context context, ri riVar) {
        ConcurrentHashMap<ri, bgr> concurrentHashMap = ri;
        if (!concurrentHashMap.containsKey(riVar)) {
            synchronized (bgr.class) {
                try {
                    if (!concurrentHashMap.containsKey(riVar)) {
                        concurrentHashMap.put(riVar, new bgr(context, riVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return concurrentHashMap.get(riVar);
    }

    public void ri(String str, wjv wjvVar) {
        com.bytedance.sdk.openadsdk.common.lr.ri(this.ik.ka).ri(str, wjvVar);
    }

    public void ri() {
        com.bytedance.sdk.openadsdk.common.lr.ri(this.ik.ka).ri();
    }

    public void ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        if (riVar == null || riVar.di() == null || !riVar.di().bl()) {
            com.bytedance.sdk.openadsdk.common.lr.ri(this.ik.ka).ri(adSlot, riVar);
        }
    }

    public String ri(String str, boolean z) {
        com.bytedance.sdk.openadsdk.common.lr lrVarRi = com.bytedance.sdk.openadsdk.common.lr.ri(this.ik.ka);
        String strRi = lrVarRi.ri(str, 10500000L);
        if (z && !TextUtils.isEmpty(strRi) && lrVarRi.ka(str)) {
            return null;
        }
        return strRi;
    }

    public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        return com.bytedance.sdk.openadsdk.common.lr.ri(this.ik.ka).ri(riVar, true);
    }

    public void ri(String str) {
        com.bytedance.sdk.openadsdk.common.lr.ri(this.ik.ka).ik(str);
    }
}
