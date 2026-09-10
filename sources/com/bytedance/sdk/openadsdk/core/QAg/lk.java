package com.bytedance.sdk.openadsdk.core.QAg;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.JXs;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static boolean Lxb = false;

    public static int JXs() {
        if (kqm.ZU().sRq()) {
            return LD.LD().ebl();
        }
        return 6;
    }

    public static void LD(String str) {
        if (TextUtils.isEmpty(str) || !kqm.ZU().sRq()) {
            return;
        }
        LD.LD().LD(str);
    }

    public static void Lxb() {
        if (!Lxb && kqm.ZU().sRq()) {
            LD.LD();
            Lxb = LD.LD().lk();
        }
    }

    public static long ZU() {
        if (kqm.ZU().sRq()) {
            return LD.LD().lc();
        }
        return 0L;
    }

    public static String lc() {
        if (kqm.ZU().sRq()) {
            return LD.LD().ZU();
        }
        return null;
    }

    public static String lk() {
        return kqm.ZU().sRq() ? LD.LD().JXs() : "";
    }

    public static void LD() {
        if (kqm.ZU().sRq()) {
            LD.LD().Lxb();
        }
    }

    public static void Lxb(String str) {
        if (TextUtils.isEmpty(str) && kqm.ZU().sRq()) {
            LD.LD().Lxb(str);
        }
    }

    public static void Lxb(tD tDVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (kqm.ZU().sRq()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (tDVar != null) {
                String strXNP = tDVar.xNP();
                String strOptString = "-1";
                if (!TextUtils.isEmpty(strXNP)) {
                    map.put("request_id", strXNP);
                } else {
                    map.put("request_id", "-1");
                }
                try {
                    long j = -1;
                    if (tDVar.Mvg() != null) {
                        jOptLong = tDVar.Mvg().optLong("ad_id", -1L);
                        jOptLong2 = tDVar.Mvg().optLong("rit", -1L);
                        jOptLong3 = tDVar.Mvg().optLong("ad_slot_type", -1L);
                        strOptString = tDVar.Mvg().optString("ad_type", "-1");
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> mapHu = tDVar.Hu();
                    if (mapHu != null && (obj = mapHu.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j));
                    LD.LD().Lxb(PglSSManager.REPORT_SCENE_ADSHOW, map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> Lxb(String str, String str2) {
        if (kqm.ZU().sRq()) {
            return LD.LD().Lxb(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void Lxb(MotionEvent motionEvent) {
        if (kqm.ZU().sRq()) {
            LD.LD().Lxb(motionEvent);
        }
    }

    public static void Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (kqm.ZU().sRq()) {
                Lxb();
                if (JXs() == 0) {
                    jSONObject.put("sec_did", LD.LD().ZU());
                    String strLxb = JXs.Lxb(jSONObject.toString());
                    Map<String, String> mapLxb = LD.LD().Lxb("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strLxb != null ? strLxb.getBytes() : new byte[0]);
                    if (mapLxb != null && mapLxb.size() > 0) {
                        for (String str : mapLxb.keySet()) {
                            jSONObject.put(str, mapLxb.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strLxb);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", LD.LD().lc());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(JXs()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            sLN.Lxb("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
