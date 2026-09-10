package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
class fi {
    private static volatile fi ri;
    private final Context lr;

    private fi(Context context) {
        this.lr = context == null ? com.bytedance.sdk.openadsdk.core.nr.ri() : context.getApplicationContext();
    }

    public void ri(String str, wjv wjvVar) {
        com.bytedance.sdk.openadsdk.common.lr.ri("sp_full_screen_video_new").ri(str, wjvVar);
    }

    public void ri() {
        com.bytedance.sdk.openadsdk.common.lr.ri("sp_full_screen_video_new").ri();
    }

    public void ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        if (riVar == null || riVar.di() == null || !riVar.di().bl()) {
            com.bytedance.sdk.openadsdk.common.lr.ri("sp_full_screen_video_new").ri(adSlot, riVar);
        }
    }

    public static fi ri(Context context) {
        if (ri == null) {
            synchronized (fi.class) {
                try {
                    if (ri == null) {
                        ri = new fi(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public String ri(String str, boolean z) {
        com.bytedance.sdk.openadsdk.common.lr lrVarRi = com.bytedance.sdk.openadsdk.common.lr.ri("sp_full_screen_video_new");
        String strRi = lrVarRi.ri(str, 10500000L);
        if (z && !TextUtils.isEmpty(strRi) && lrVarRi.ka(str)) {
            return null;
        }
        return strRi;
    }

    public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        return com.bytedance.sdk.openadsdk.common.lr.ri("sp_full_screen_video_new").ri(riVar, true);
    }

    public void ri(String str) {
        com.bytedance.sdk.openadsdk.common.lr.ri("sp_full_screen_video_new").ik(str);
    }
}
