package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ud.exu;
import com.p004ironsource.d9;
import com.smartdigimkt.x.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mo {
    private static HashMap<String, String> wd;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.lnr lnr;
    private qdl mml;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.mml mo;
    private lnr mzz;
    private JSONObject qdl;
    private JSONObject ud;

    public static class qdl {
        boolean lnr;
        float qdl;
        float ud;

        public static qdl qdl(JSONObject jSONObject) {
            qdl qdlVar = new qdl();
            if (jSONObject != null) {
                qdlVar.qdl = (float) jSONObject.optDouble("width");
                qdlVar.ud = (float) jSONObject.optDouble("height");
                qdlVar.lnr = jSONObject.optBoolean("isLandscape");
            }
            return qdlVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        wd = map;
        map.put("subtitle", "description");
        wd.put("source", "source|app.app_name");
        wd.put("screenshot", "dynamic_creative.screenshot");
    }

    public mo(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.qdl = jSONObject;
        this.ud = jSONObject2;
        this.lnr = new com.bytedance.sdk.component.adexpress.dynamic.mml.lnr(jSONObject2);
        this.mml = qdl.qdl(jSONObject3);
        this.mo = com.bytedance.sdk.component.adexpress.dynamic.mml.mml.qdl(jSONObject4);
    }

    private void ud(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        com.bytedance.sdk.component.adexpress.dynamic.mml.lnr lnrVar;
        Object objQdl;
        Object objQdl2;
        Object objQdl3;
        Object objQdl4;
        if (jpcVar == null || (lnrVar = this.lnr) == null || (objQdl = lnrVar.qdl("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objQdl);
        if (TextUtils.isEmpty(strValueOf) || (objQdl2 = this.lnr.qdl("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objQdl2);
        if (TextUtils.isEmpty(strValueOf2) || (objQdl3 = this.lnr.qdl("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objQdl3);
        if (TextUtils.isEmpty(strValueOf3) || (objQdl4 = this.lnr.qdl("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objQdl4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objQdl5 = this.lnr.qdl("app.app_name");
        Object objQdl6 = this.lnr.qdl("source");
        if (objQdl5 == null && objQdl6 == null) {
            return;
        }
        if (objQdl5 == null) {
            objQdl5 = objQdl6;
        }
        String strValueOf5 = String.valueOf(objQdl5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        jpcVar.qdl("imageUrl", strValueOf);
        jpcVar.qdl("title", strValueOf2);
        jpcVar.qdl("description", strValueOf3);
        jpcVar.qdl("icon", strValueOf4);
        jpcVar.qdl("app_name", strValueOf5);
        jpcVar.qdl(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mml.jpc qdl(double d, int i2, double d2, String str, exu exuVar) {
        JSONObject jSONObject;
        this.lnr.qdl();
        try {
            jSONObject = new JSONObject(this.mo.ud);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVarQdl = qdl(mml.qdl(this.qdl, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc) null);
        qdl(jpcVarQdl);
        mzz mzzVar = new mzz(d, i2, d2, str, exuVar);
        mzz.qdl qdlVar = new mzz.qdl();
        qdl qdlVar2 = this.mml;
        qdlVar.qdl = qdlVar2.qdl;
        qdlVar.ud = qdlVar2.ud;
        qdlVar.lnr = 0.0f;
        mzzVar.qdl(qdlVar);
        mzzVar.qdl(jpcVarQdl, 0.0f, 0.0f);
        mzzVar.qdl();
        com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar = mzzVar.qdl;
        if (udVar.mml == 65536.0f) {
            return null;
        }
        return udVar.mo;
    }

    private void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        int iQdl;
        if (jpcVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr() != null) {
            iQdl = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().bjy();
        } else {
            iQdl = com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl());
        }
        int iUd = com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), iQdl);
        qdl qdlVar = this.mml;
        float fMin = qdlVar.lnr ? qdlVar.qdl : Math.min(qdlVar.qdl, iUd);
        if (this.mml.ud == 0.0f) {
            jpcVar.mzz(fMin);
            jpcVar.to().mzz().to("auto");
            jpcVar.mo(0.0f);
        } else {
            jpcVar.mzz(fMin);
            int iUd2 = com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl()));
            qdl qdlVar2 = this.mml;
            jpcVar.mo(qdlVar2.lnr ? qdlVar2.ud : Math.min(qdlVar2.ud, iUd2));
            jpcVar.to().mzz().to("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mml.jpc qdl(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.mo != null) {
                lnr lnrVar = new lnr();
                this.mzz = lnrVar;
                JSONObject jSONObjectQdl = lnrVar.qdl(this.mo.qdl, iOptInt, jSONObject);
                if (jSONObjectQdl != null) {
                    jSONObject = jSONObjectQdl;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVarQdl = qdl(jSONObject);
        jpcVarQdl.qdl(jpcVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            jpcVarQdl.qdl((List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>) null);
            return jpcVarQdl;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i2);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = jpcVarQdl.to().mzz().nz();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i3 = 0; i3 < length; i3++) {
                    com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVarQdl2 = qdl(jSONArrayOptJSONArray2.optJSONObject(i3), jpcVarQdl);
                    if (com.bytedance.sdk.component.adexpress.mml.ud() && "skip-with-time".equals(jpcVarQdl.to().ud()) && !d9.h.T.equals(jpcVarQdl.ljh()) && !TextUtils.isEmpty(jpcVarQdl.ljh())) {
                        jpcVarQdl2.lnr(jpcVarQdl.ljh());
                    }
                    arrayList.add(jpcVarQdl2);
                    arrayList3.add(jpcVarQdl2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            jpcVarQdl.qdl(arrayList);
        }
        if (arrayList2.size() > 0) {
            jpcVarQdl.ud(arrayList2);
        }
        return jpcVarQdl;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mml.jpc qdl(JSONObject jSONObject) {
        String strQdl;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        tvp.qdl(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectQdl = tvp.qdl(strOptString, tvp.qdl(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = new com.bytedance.sdk.component.adexpress.dynamic.mml.jpc();
        if (TextUtils.isEmpty(strOptString2)) {
            jpcVar.ud(String.valueOf(jpcVar.hashCode()));
        } else {
            jpcVar.ud(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            ud(jpcVar);
            jpcVar.lnr((float) jSONObjectOptJSONObject.optDouble("x"));
            jpcVar.mml((float) jSONObjectOptJSONObject.optDouble("y"));
            jpcVar.mzz((float) jSONObjectOptJSONObject.optDouble("width"));
            jpcVar.mo((float) jSONObjectOptJSONObject.optDouble("height"));
            jpcVar.wd(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.mml.mzz mzzVar = new com.bytedance.sdk.component.adexpress.dynamic.mml.mzz();
            mzzVar.qdl(strOptString);
            mzzVar.ud(jSONObjectOptJSONObject.optString("data"));
            mzzVar.lnr(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarQdl = com.bytedance.sdk.component.adexpress.dynamic.mml.mo.qdl(jSONObjectOptJSONObject);
            mzzVar.qdl(moVarQdl);
            com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarQdl2 = com.bytedance.sdk.component.adexpress.dynamic.mml.mo.qdl(jSONObjectQdl);
            if (moVarQdl2 == null) {
                mzzVar.ud(moVarQdl);
            } else {
                mzzVar.ud(moVarQdl2);
            }
            qdl(moVarQdl);
            qdl(moVarQdl2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.ud) != null) {
                qdl(mzzVar, jSONObject2.optInt("image_mode"));
            }
            String strUd = mzzVar.ud();
            com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = mzzVar.mzz();
            if (wd.containsKey(strUd) && !moVarMzz.zlt()) {
                moVarMzz.aaj(wd.get(strUd));
            }
            if (moVarMzz.zlt()) {
                strQdl = mzzVar.lnr();
            } else {
                strQdl = qdl(mzzVar.lnr());
            }
            if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                if (TextUtils.equals(strUd, "star") || TextUtils.equals(strUd, "text_star")) {
                    strQdl = qdl("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strUd, "score-count") || TextUtils.equals(strUd, "score-count-type-1") || TextUtils.equals(strUd, "score-count-type-2")) {
                    strQdl = qdl("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strUd) && moVarQdl.gsp()) {
                    strQdl = qdl("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(qdl()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                StringBuilder sbX = a.x(strQdl, "adx:");
                sbX.append(qdl());
                mzzVar.ud(sbX.toString());
            } else {
                mzzVar.ud(strQdl);
            }
            jpcVar.qdl(mzzVar);
        }
        return jpcVar;
    }

    private void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.mzz mzzVar, int i2) {
        int iLastIndexOf;
        if (i2 != 5 && i2 != 15 && i2 != 50 && i2 != 154) {
            mzzVar.qdl(d.c.k);
            String strQdl = tvp.qdl(d.c.k);
            com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = mzzVar.mzz();
            moVarMzz.aaj(strQdl);
            mzzVar.wd().aaj(strQdl);
            String strQdl2 = tvp.qdl(d.c.k, "clickArea");
            if (!TextUtils.isEmpty(strQdl2)) {
                moVarMzz.bjy(strQdl2);
                mzzVar.wd().bjy(strQdl2);
            }
            JSONObject jSONObjectHcs = moVarMzz.hcs();
            if (jSONObjectHcs != null) {
                moVarMzz.ljh(jSONObjectHcs.optString("imageLottieTosPath"));
                moVarMzz.fs(jSONObjectHcs.optBoolean("animationsLoop"));
                moVarMzz.xmv(jSONObjectHcs.optInt("lottieAppNameMaxLength"));
                moVarMzz.koa(jSONObjectHcs.optInt("lottieAdDescMaxLength"));
                moVarMzz.bqt(jSONObjectHcs.optInt("lottieAdTitleMaxLength"));
            }
            mzzVar.ud(strQdl);
            if (strQdl != null && (iLastIndexOf = strQdl.lastIndexOf(com.thinkup.core.common.n.mo.ono)) > 0) {
                String strSubstring = strQdl.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", qdl(strSubstring + ".width"));
                    jSONObject.put("height", qdl(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                mzzVar.lnr(jSONObject.toString());
            }
            moVarMzz.vm();
            return;
        }
        mzzVar.qdl("video");
        String strQdl3 = tvp.qdl("video");
        mzzVar.mzz().aaj(strQdl3);
        String strQdl4 = tvp.qdl("video", "clickArea");
        if (!TextUtils.isEmpty(strQdl4)) {
            mzzVar.mzz().bjy(strQdl4);
            mzzVar.wd().bjy(strQdl4);
        }
        mzzVar.wd().aaj(strQdl3);
        mzzVar.ud(strQdl3);
        mzzVar.mzz().od();
    }

    private String qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.lnr.ud(str2)) {
                String strValueOf = String.valueOf(this.lnr.qdl(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String qdl() {
        Object objQdl;
        com.bytedance.sdk.component.adexpress.dynamic.mml.lnr lnrVar = this.lnr;
        return (lnrVar == null || (objQdl = lnrVar.qdl("adx_name")) == null) ? "" : String.valueOf(objQdl);
    }

    private void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVar) {
        if (moVar == null) {
            return;
        }
        String strVu = moVar.vu();
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            String strLnr = com.bytedance.sdk.component.adexpress.mml.wd.lnr(com.bytedance.sdk.component.adexpress.mml.qdl());
            if (com.smartdigimkt.d2.a.S.equals(strLnr)) {
                strLnr = "cn";
            }
            if (!TextUtils.isEmpty(strLnr) && moVar.mo() != null) {
                String strOptString = moVar.mo().optString(strLnr);
                if (!TextUtils.isEmpty(strOptString)) {
                    strVu = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strVu)) {
            return;
        }
        int iIndexOf = strVu.indexOf("{{");
        int iIndexOf2 = strVu.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strQdl = qdl(strVu.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb = new StringBuilder(strVu.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strQdl)) {
                sb.append(strQdl);
            }
            sb.append(strVu.substring(iIndexOf2 + 2));
            moVar.fs(sb.toString());
            return;
        }
        moVar.fs(strVu);
    }
}
