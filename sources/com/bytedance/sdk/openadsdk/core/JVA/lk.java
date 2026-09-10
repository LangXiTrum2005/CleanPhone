package com.bytedance.sdk.openadsdk.core.JVA;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.sLN;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static String Lxb = "";

    public static boolean LD(tD tDVar) {
        return tDVar != null && tDVar.id() == 10;
    }

    public static boolean Lxb(int i) {
        return i == 10 || i == 9;
    }

    private static JSONArray lk(tD tDVar) {
        try {
            tD.Lxb lxbRW = tDVar.rW();
            if (lxbRW == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(lxbRW.JVA());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", tDVar.xr());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                        jSONObject3.put("button_text", tDVar.xr());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static JSONObject Lxb(tD tDVar, String str) {
        JSONObject jSONObjectJD = tDVar.JD();
        try {
            jSONObjectJD.put("show_dislike", tDVar.FV());
            jSONObjectJD.put(bc.N, sLN.LD());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strLc = QAg.LD().lc();
                int iEbl = QAg.LD().ebl();
                jSONObject.put("app_name", strLc);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iEbl)));
                jSONObjectJD.put("open_app_info", jSONObject);
            }
            jSONObjectJD.put(bc.x, AnalyticsConstants.SDK_TYPE);
            JSONArray jSONArrayLk = lk(tDVar);
            if (jSONArrayLk != null) {
                jSONObjectJD.put("dpa_data", jSONArrayLk);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
        }
        return jSONObjectJD;
    }

    public static boolean Lxb(tD tDVar) {
        return tDVar != null && tDVar.id() == 7;
    }

    public static String Lxb() {
        return Lxb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject Lxb(tD tDVar, com.bytedance.sdk.openadsdk.core.JVA.JXs.lk lkVar) {
        lkVar.Lxb(bc.aC);
        String strKqm = "";
        Lxb = "";
        JSONObject jSONObject = 0;
        try {
            tD.Lxb lxbRW = tDVar.rW();
            if (lxbRW != null) {
                strKqm = lxbRW.kqm();
                if (TextUtils.isEmpty(strKqm) && !TextUtils.isEmpty(lxbRW.VVE()) && !TextUtils.isEmpty(lxbRW.lc())) {
                    strKqm = com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb().Lxb(bc.aC, lxbRW.lc(), lxbRW.VVE());
                }
            }
            try {
                if (!TextUtils.isEmpty(strKqm)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(strKqm);
                        try {
                            Lxb = "getTemplate success";
                            lkVar.LD("local");
                            return jSONObject2;
                        } catch (JSONException unused) {
                            String strConcat = "parse json exception data is ".concat(String.valueOf(strKqm));
                            Lxb = strConcat;
                            lkVar.Lxb(2, strConcat, "local");
                            return null;
                        }
                    } catch (JSONException unused2) {
                    }
                } else {
                    String str = "local data is null id is " + lxbRW.lc() + " md5 is " + lxbRW.VVE();
                    Lxb = str;
                    lkVar.Lxb(3, str, "net");
                    return null;
                }
            } catch (Throwable th) {
                jSONObject = lxbRW;
                th = th;
                String strL = AbstractC3888ke0.l(th, new StringBuilder("get template error "));
                Lxb = strL;
                lkVar.Lxb(2, strL, "local");
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
