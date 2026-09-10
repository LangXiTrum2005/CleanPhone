package com.bytedance.sdk.openadsdk.core.co;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.qt;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.ironsource.L6;
import com.ironsource.X3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static String ri = "";

    private static JSONArray ik(wjv wjvVar) {
        try {
            wjv.ri riVarSez = wjvVar.sez();
            if (riVarSez == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(riVarSez.jbs());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt(InMobiNetworkValues.DESCRIPTION, jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", wjvVar.skk());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                        jSONObject3.put("button_text", wjvVar.skk());
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

    public static boolean lr(wjv wjvVar) {
        return wjvVar != null && wjvVar.hpn() == 10;
    }

    public static boolean ri(int i) {
        return i == 10 || i == 9;
    }

    public static JSONObject ri(wjv wjvVar, String str) {
        JSONObject jSONObjectAw = wjvVar.aw(false);
        try {
            jSONObjectAw.put("show_dislike", wjvVar.nlk());
            jSONObjectAw.put("language", aw.lr());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strMj = qt.lr().mj();
                int iJbs = qt.lr().jbs();
                jSONObject.put("app_name", strMj);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iJbs)));
                jSONObjectAw.put("open_app_info", jSONObject);
            }
            jSONObjectAw.put(L6.F, X3.d);
            JSONArray jSONArrayIk = ik(wjvVar);
            if (jSONArrayIk != null) {
                jSONObjectAw.put("dpa_data", jSONArrayIk);
            }
            return jSONObjectAw;
        } catch (Throwable th) {
            ac.ik("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
            return jSONObjectAw;
        }
    }

    public static boolean ri(wjv wjvVar) {
        return wjvVar != null && wjvVar.hpn() == 7;
    }

    public static String ri() {
        return ri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static JSONObject ri(wjv wjvVar, com.bytedance.sdk.openadsdk.core.co.xha.ik ikVar) {
        ikVar.ri("ad");
        String strVr = "";
        ri = "";
        ?? r4 = 0;
        try {
            wjv.ri riVarSez = wjvVar.sez();
            if (riVarSez != null) {
                strVr = riVarSez.vr();
                if (TextUtils.isEmpty(strVr) && !TextUtils.isEmpty(riVarSez.bgr()) && !TextUtils.isEmpty(riVarSez.ka())) {
                    strVr = com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri("ad", riVarSez.ka(), riVarSez.bgr());
                }
            }
            try {
                if (!TextUtils.isEmpty(strVr)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strVr);
                        try {
                            ri = "getTemplate success";
                            ikVar.lr("local");
                            return jSONObject;
                        } catch (JSONException unused) {
                            String strConcat = "parse json exception data is ".concat(String.valueOf(strVr));
                            ri = strConcat;
                            ikVar.ri(2, strConcat, "local");
                            return null;
                        }
                    } catch (JSONException unused2) {
                    }
                } else {
                    String str = "local data is null id is " + riVarSez.ka() + " md5 is " + riVarSez.bgr();
                    ri = str;
                    ikVar.ri(3, str, "net");
                    return null;
                }
            } catch (Throwable th) {
                r4 = riVarSez;
                th = th;
                String str2 = "get template error " + th.getMessage();
                ri = str2;
                ikVar.ri(2, str2, "local");
                return r4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
