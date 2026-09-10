package com.tiktok.util;

import com.tiktok.TikTokBusinessSdk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TTUtil {
    static {
        new TTLogger(TTUtil.class.getName(), TikTokBusinessSdk.f42661b);
    }

    public static JSONObject a(Long l2) {
        try {
            return new JSONObject().put("ts", l2);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
