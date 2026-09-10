package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.utils.UMUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class as {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(Context context, String str, String str2) {
        return context == null ? str2 : UMEnvelopeBuild.imprintProperty(context, str, str2);
    }

    public static void a(Context context, String str) {
        try {
            Class<?> cls = Class.forName("com.uyumao.sdk.UYMManager");
            Method declaredMethod = cls.getDeclaredMethod("processEvent", Context.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(cls, context, str);
            }
        } catch (Throwable unused) {
        }
    }

    public static Map<String, String> a() {
        HashMap mapV = AbstractC3950lJ.v(bc.bi, com.umeng.commonsdk.internal.a.e);
        if (!TextUtils.isEmpty(UMUtils.VALUE_ANALYTICS_VERSION)) {
            mapV.put(bc.bj, UMUtils.VALUE_ANALYTICS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_GAME_VERSION)) {
            mapV.put(bc.bk, UMUtils.VALUE_GAME_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_PUSH_VERSION)) {
            mapV.put(bc.bl, UMUtils.VALUE_PUSH_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_SHARE_VERSION)) {
            mapV.put(bc.bm, UMUtils.VALUE_SHARE_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_APM_VERSION)) {
            mapV.put(bc.bn, UMUtils.VALUE_APM_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_VERIFY_VERSION)) {
            mapV.put(bc.bo, UMUtils.VALUE_VERIFY_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_SMS_VERSION)) {
            mapV.put(bc.bp, UMUtils.VALUE_SMS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
            mapV.put(bc.bq, UMUtils.VALUE_REC_VERSION_NAME);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_VISUAL_VERSION)) {
            mapV.put(bc.br, UMUtils.VALUE_VISUAL_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
            mapV.put(bc.bs, UMUtils.VALUE_ASMS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_LINK_VERSION)) {
            mapV.put(bc.bt, UMUtils.VALUE_LINK_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ABTEST_VERSION)) {
            mapV.put(bc.bu, UMUtils.VALUE_ABTEST_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ANTI_VERSION)) {
            mapV.put(bc.bv, UMUtils.VALUE_ANTI_VERSION);
        }
        return mapV;
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        String str;
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String strValueOf = String.valueOf(itKeys.next());
                if (!TextUtils.isEmpty(strValueOf) && (str = (String) jSONObject.get(strValueOf)) != null) {
                    map.put(strValueOf, str);
                }
            } catch (Throwable unused) {
            }
        }
        return map;
    }
}
