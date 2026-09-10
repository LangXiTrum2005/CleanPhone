package com.bytedance.sdk.openadsdk.core.sf;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.fi;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.ironsource.Bc;
import com.ironsource.C3414a2;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static boolean ri = false;

    public static String di() {
        if (nr.ka().rzk()) {
            return lr.lr().ka();
        }
        return null;
    }

    public static int fi() {
        if (nr.ka().rzk()) {
            return lr.lr().xha();
        }
        return 6;
    }

    public static String ik() {
        return nr.ka().rzk() ? lr.lr().fi() : "";
    }

    public static long ka() {
        if (nr.ka().rzk()) {
            return lr.lr().di();
        }
        return 0L;
    }

    public static void lr(String str) {
        if (TextUtils.isEmpty(str) || !nr.ka().rzk()) {
            return;
        }
        lr.lr().lr(str);
    }

    public static void ri() {
        if (!ri && nr.ka().rzk()) {
            lr.lr();
            ri = lr.lr().ik();
        }
    }

    public static void lr() {
        if (nr.ka().rzk()) {
            lr.lr().ri();
        }
    }

    public static void ri(String str) {
        if (nr.ka().rzk()) {
            lr.lr().ri(str);
        }
    }

    public static void ri(Map<String, Object> map) {
        if (nr.ka().rzk()) {
            lr.lr().ri(map);
        }
    }

    public static void ri(wjv wjvVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (nr.ka().rzk()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (wjvVar != null) {
                String strJf = wjvVar.jf();
                boolean zIsEmpty = TextUtils.isEmpty(strJf);
                String strOptString = C3414a2.f;
                if (!zIsEmpty) {
                    map.put("request_id", strJf);
                } else {
                    map.put("request_id", C3414a2.f);
                }
                try {
                    long j = -1;
                    if (wjvVar.ljo() != null) {
                        jOptLong = wjvVar.ljo().optLong("ad_id", -1L);
                        jOptLong2 = wjvVar.ljo().optLong("rit", -1L);
                        jOptLong3 = wjvVar.ljo().optLong("ad_slot_type", -1L);
                        strOptString = wjvVar.ljo().optString("ad_type", C3414a2.f);
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> mapIyl = wjvVar.iyl();
                    if (mapIyl != null && (obj = mapIyl.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j));
                    lr.lr().ri("AdShow", map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> ri(String str, String str2) {
        if (nr.ka().rzk()) {
            return lr.lr().ri(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void ri(MotionEvent motionEvent) {
        if (nr.ka().rzk()) {
            lr.lr().ri(motionEvent);
        }
    }

    public static void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (nr.ka().rzk()) {
                ri();
                if (fi() == 0) {
                    jSONObject.put("sec_did", lr.lr().ka());
                    String strRi = fi.ri(jSONObject.toString());
                    Map<String, String> mapRi = lr.lr().ri("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strRi != null ? strRi.getBytes() : new byte[0]);
                    if (mapRi != null && mapRi.size() > 0) {
                        for (String str : mapRi.keySet()) {
                            jSONObject.put(str, mapRi.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strRi);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", lr.lr().di());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(fi()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            ac.ik("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", Bc.e);
            } catch (JSONException unused) {
            }
        }
    }
}
