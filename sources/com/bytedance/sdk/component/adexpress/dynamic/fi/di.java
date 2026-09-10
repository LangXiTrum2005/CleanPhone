package com.bytedance.sdk.component.adexpress.dynamic.fi;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.lr.aw;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private static HashMap<String, String> xha;
    private com.bytedance.sdk.component.adexpress.dynamic.ka.ka di;
    private ik fi;
    private com.bytedance.sdk.component.adexpress.dynamic.ka.ik ik;
    private ri ka;
    private JSONObject lr;
    private JSONObject ri;

    public static class ri {
        boolean ik;
        float lr;
        float ri;

        public static ri ri(JSONObject jSONObject) {
            ri riVar = new ri();
            if (jSONObject != null) {
                riVar.ri = (float) jSONObject.optDouble("width");
                riVar.lr = (float) jSONObject.optDouble("height");
                riVar.ik = jSONObject.optBoolean("isLandscape");
            }
            return riVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        xha = map;
        map.put("subtitle", InMobiNetworkValues.DESCRIPTION);
        xha.put("source", "source|app.app_name");
        xha.put("screenshot", "dynamic_creative.screenshot");
    }

    public di(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.ri = jSONObject;
        this.lr = jSONObject2;
        this.ik = new com.bytedance.sdk.component.adexpress.dynamic.ka.ik(jSONObject2);
        this.ka = ri.ri(jSONObject3);
        this.di = com.bytedance.sdk.component.adexpress.dynamic.ka.ka.ri(jSONObject4);
    }

    private void lr(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        com.bytedance.sdk.component.adexpress.dynamic.ka.ik ikVar;
        Object objRi;
        Object objRi2;
        Object objRi3;
        Object objRi4;
        if (mjVar == null || (ikVar = this.ik) == null || (objRi = ikVar.ri("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objRi);
        if (TextUtils.isEmpty(strValueOf) || (objRi2 = this.ik.ri("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objRi2);
        if (TextUtils.isEmpty(strValueOf2) || (objRi3 = this.ik.ri(InMobiNetworkValues.DESCRIPTION)) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objRi3);
        if (TextUtils.isEmpty(strValueOf3) || (objRi4 = this.ik.ri("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objRi4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objRi5 = this.ik.ri("app.app_name");
        Object objRi6 = this.ik.ri("source");
        if (objRi5 == null && objRi6 == null) {
            return;
        }
        if (objRi5 == null) {
            objRi5 = objRi6;
        }
        String strValueOf5 = String.valueOf(objRi5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        mjVar.ri("imageUrl", strValueOf);
        mjVar.ri("title", strValueOf2);
        mjVar.ri(InMobiNetworkValues.DESCRIPTION, strValueOf3);
        mjVar.ri("icon", strValueOf4);
        mjVar.ri("app_name", strValueOf5);
        mjVar.ri(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ka.mj ri(double d, int i, double d2, String str, aw awVar) {
        JSONObject jSONObject;
        this.ik.ri();
        try {
            jSONObject = new JSONObject(this.di.lr);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVarRi = ri(ka.ri(this.ri, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.ka.mj) null);
        ri(mjVarRi);
        fi fiVar = new fi(d, i, d2, str, awVar);
        fi.ri riVar = new fi.ri();
        ri riVar2 = this.ka;
        riVar.ri = riVar2.ri;
        riVar.lr = riVar2.lr;
        riVar.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fiVar.ri(riVar);
        fiVar.ri(mjVarRi, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fiVar.ri();
        com.bytedance.sdk.component.adexpress.dynamic.ka.lr lrVar = fiVar.ri;
        if (lrVar.ka == 65536.0f) {
            return null;
        }
        return lrVar.di;
    }

    private void ri(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        int iRi;
        if (mjVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik() != null) {
            iRi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().slm();
        } else {
            iRi = com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri());
        }
        int iLr = com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), iRi);
        ri riVar = this.ka;
        float fMin = riVar.ik ? riVar.ri : Math.min(riVar.ri, iLr);
        if (this.ka.lr == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            mjVar.fi(fMin);
            mjVar.qt().fi().qt("auto");
            mjVar.di(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            mjVar.fi(fMin);
            int iLr2 = com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri()));
            ri riVar2 = this.ka;
            mjVar.di(riVar2.ik ? riVar2.lr : Math.min(riVar2.lr, iLr2));
            mjVar.qt().fi().qt("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ka.mj ri(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.di != null) {
                ik ikVar = new ik();
                this.fi = ikVar;
                JSONObject jSONObjectRi = ikVar.ri(this.di.ri, iOptInt, jSONObject);
                if (jSONObjectRi != null) {
                    jSONObject = jSONObjectRi;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVarRi = ri(jSONObject);
        mjVarRi.ri(mjVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            mjVarRi.ri((List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>) null);
            return mjVarRi;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = mjVarRi.qt().fi().pc();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVarRi2 = ri(jSONArrayOptJSONArray2.optJSONObject(i2), mjVarRi);
                    if (com.bytedance.sdk.component.adexpress.ka.lr() && "skip-with-time".equals(mjVarRi.qt().lr()) && !X3.i.T.equals(mjVarRi.wjv()) && !TextUtils.isEmpty(mjVarRi.wjv())) {
                        mjVarRi2.ik(mjVarRi.wjv());
                    }
                    arrayList.add(mjVarRi2);
                    arrayList3.add(mjVarRi2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            mjVarRi.ri(arrayList);
        }
        if (arrayList2.size() > 0) {
            mjVarRi.lr(arrayList2);
        }
        return mjVarRi;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ka.mj ri(JSONObject jSONObject) {
        String strRi;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        jbs.ri(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectRi = jbs.ri(strOptString, jbs.ri(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar = new com.bytedance.sdk.component.adexpress.dynamic.ka.mj();
        if (TextUtils.isEmpty(strOptString2)) {
            mjVar.lr(String.valueOf(mjVar.hashCode()));
        } else {
            mjVar.lr(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            lr(mjVar);
            mjVar.ik((float) jSONObjectOptJSONObject.optDouble("x"));
            mjVar.ka((float) jSONObjectOptJSONObject.optDouble("y"));
            mjVar.fi((float) jSONObjectOptJSONObject.optDouble("width"));
            mjVar.di((float) jSONObjectOptJSONObject.optDouble("height"));
            mjVar.xha(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.ka.fi fiVar = new com.bytedance.sdk.component.adexpress.dynamic.ka.fi();
            fiVar.ri(strOptString);
            fiVar.lr(jSONObjectOptJSONObject.optString("data"));
            fiVar.ik(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarRi = com.bytedance.sdk.component.adexpress.dynamic.ka.di.ri(jSONObjectOptJSONObject);
            fiVar.ri(diVarRi);
            com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarRi2 = com.bytedance.sdk.component.adexpress.dynamic.ka.di.ri(jSONObjectRi);
            if (diVarRi2 == null) {
                fiVar.lr(diVarRi);
            } else {
                fiVar.lr(diVarRi2);
            }
            ri(diVarRi);
            ri(diVarRi2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.lr) != null) {
                ri(fiVar, jSONObject2.optInt("image_mode"));
            }
            String strLr = fiVar.lr();
            com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = fiVar.fi();
            if (xha.containsKey(strLr) && !diVarFi.xm()) {
                diVarFi.ac(xha.get(strLr));
            }
            if (diVarFi.xm()) {
                strRi = fiVar.ik();
            } else {
                strRi = ri(fiVar.ik());
            }
            if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                if (TextUtils.equals(strLr, "star") || TextUtils.equals(strLr, "text_star")) {
                    strRi = ri("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strLr, "score-count") || TextUtils.equals(strLr, "score-count-type-1") || TextUtils.equals(strLr, "score-count-type-2")) {
                    strRi = ri("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strLr) && diVarRi.adz()) {
                    strRi = ri("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(ri()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                fiVar.lr(strRi + "adx:" + ri());
            } else {
                fiVar.lr(strRi);
            }
            mjVar.ri(fiVar);
        }
        return mjVar;
    }

    private void ri(com.bytedance.sdk.component.adexpress.dynamic.ka.fi fiVar, int i) {
        int iLastIndexOf;
        if (i != 5 && i != 15 && i != 50 && i != 154) {
            fiVar.ri("image");
            String strRi = jbs.ri("image");
            com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = fiVar.fi();
            diVarFi.ac(strRi);
            fiVar.xha().ac(strRi);
            String strRi2 = jbs.ri("image", "clickArea");
            if (!TextUtils.isEmpty(strRi2)) {
                diVarFi.vr(strRi2);
                fiVar.xha().vr(strRi2);
            }
            JSONObject jSONObjectRbz = diVarFi.rbz();
            if (jSONObjectRbz != null) {
                diVarFi.wjv(jSONObjectRbz.optString("imageLottieTosPath"));
                diVarFi.co(jSONObjectRbz.optBoolean("animationsLoop"));
                diVarFi.su(jSONObjectRbz.optInt("lottieAppNameMaxLength"));
                diVarFi.zf(jSONObjectRbz.optInt("lottieAdDescMaxLength"));
                diVarFi.igq(jSONObjectRbz.optInt("lottieAdTitleMaxLength"));
            }
            fiVar.lr(strRi);
            if (strRi != null && (iLastIndexOf = strRi.lastIndexOf(".")) > 0) {
                String strSubstring = strRi.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", ri(strSubstring + ".width"));
                    jSONObject.put("height", ri(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                fiVar.ik(jSONObject.toString());
            }
            diVarFi.bfa();
            return;
        }
        fiVar.ri("video");
        String strRi3 = jbs.ri("video");
        fiVar.fi().ac(strRi3);
        String strRi4 = jbs.ri("video", "clickArea");
        if (!TextUtils.isEmpty(strRi4)) {
            fiVar.fi().vr(strRi4);
            fiVar.xha().vr(strRi4);
        }
        fiVar.xha().ac(strRi3);
        fiVar.lr(strRi3);
        fiVar.fi().amj();
    }

    private String ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.ik.lr(str2)) {
                String strValueOf = String.valueOf(this.ik.ri(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String ri() {
        Object objRi;
        com.bytedance.sdk.component.adexpress.dynamic.ka.ik ikVar = this.ik;
        return (ikVar == null || (objRi = ikVar.ri("adx_name")) == null) ? "" : String.valueOf(objRi);
    }

    private void ri(com.bytedance.sdk.component.adexpress.dynamic.ka.di diVar) {
        if (diVar == null) {
            return;
        }
        String strDw = diVar.dw();
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            String strIk = com.bytedance.sdk.component.adexpress.ka.xha.ik(com.bytedance.sdk.component.adexpress.ka.ri());
            if ("zh".equals(strIk)) {
                strIk = "cn";
            }
            if (!TextUtils.isEmpty(strIk) && diVar.di() != null) {
                String strOptString = diVar.di().optString(strIk);
                if (!TextUtils.isEmpty(strOptString)) {
                    strDw = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strDw)) {
            return;
        }
        int iIndexOf = strDw.indexOf("{{");
        int iIndexOf2 = strDw.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strRi = ri(strDw.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb = new StringBuilder(strDw.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strRi)) {
                sb.append(strRi);
            }
            sb.append(strDw.substring(iIndexOf2 + 2));
            diVar.co(sb.toString());
            return;
        }
        diVar.co(strDw);
    }
}
