package com.bytedance.sdk.component.adexpress.dynamic.JXs;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private static HashMap<String, String> ebl;
    private lk JXs;
    private JSONObject LD;
    private JSONObject Lxb;
    private Lxb ZU;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.ZU lc;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.lk lk;

    public static class Lxb {
        float LD;
        float Lxb;
        boolean lk;

        public static Lxb Lxb(JSONObject jSONObject) {
            Lxb lxb = new Lxb();
            if (jSONObject != null) {
                lxb.Lxb = (float) jSONObject.optDouble("width");
                lxb.LD = (float) jSONObject.optDouble("height");
                lxb.lk = jSONObject.optBoolean("isLandscape");
            }
            return lxb;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        ebl = map;
        map.put("subtitle", "description");
        ebl.put("source", "source|app.app_name");
        ebl.put("screenshot", "dynamic_creative.screenshot");
    }

    public lc(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.Lxb = jSONObject;
        this.LD = jSONObject2;
        this.lk = new com.bytedance.sdk.component.adexpress.dynamic.ZU.lk(jSONObject2);
        this.ZU = Lxb.Lxb(jSONObject3);
        this.lc = com.bytedance.sdk.component.adexpress.dynamic.ZU.ZU.Lxb(jSONObject4);
    }

    private void LD(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lk lkVar;
        Object objLxb;
        Object objLxb2;
        Object objLxb3;
        Object objLxb4;
        if (oy == null || (lkVar = this.lk) == null || (objLxb = lkVar.Lxb("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objLxb);
        if (TextUtils.isEmpty(strValueOf) || (objLxb2 = this.lk.Lxb(CampaignEx.JSON_KEY_TITLE)) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objLxb2);
        if (TextUtils.isEmpty(strValueOf2) || (objLxb3 = this.lk.Lxb("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objLxb3);
        if (TextUtils.isEmpty(strValueOf3) || (objLxb4 = this.lk.Lxb(RewardPlus.ICON)) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objLxb4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objLxb5 = this.lk.Lxb("app.app_name");
        Object objLxb6 = this.lk.Lxb("source");
        if (objLxb5 == null && objLxb6 == null) {
            return;
        }
        if (objLxb5 == null) {
            objLxb5 = objLxb6;
        }
        String strValueOf5 = String.valueOf(objLxb5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        oy.Lxb("imageUrl", strValueOf);
        oy.Lxb(CampaignEx.JSON_KEY_TITLE, strValueOf2);
        oy.Lxb("description", strValueOf3);
        oy.Lxb(RewardPlus.ICON, strValueOf4);
        oy.Lxb("app_name", strValueOf5);
        oy.Lxb(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ZU.OY Lxb(double d, int i, double d2, String str, NXR nxr) {
        JSONObject jSONObject;
        this.lk.Lxb();
        try {
            jSONObject = new JSONObject(this.lc.LD);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oyLxb = Lxb(ZU.Lxb(this.Lxb, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY) null);
        Lxb(oyLxb);
        JXs jXs = new JXs(d, i, d2, str, nxr);
        JXs.Lxb lxb = new JXs.Lxb();
        Lxb lxb2 = this.ZU;
        lxb.Lxb = lxb2.Lxb;
        lxb.LD = lxb2.LD;
        lxb.lk = 0.0f;
        jXs.Lxb(lxb);
        jXs.Lxb(oyLxb, 0.0f, 0.0f);
        jXs.Lxb();
        com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ld = jXs.Lxb;
        if (ld.ZU == 65536.0f) {
            return null;
        }
        return ld.lc;
    }

    private void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        int iLxb;
        if (oy == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk() != null) {
            iLxb = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().IeN();
        } else {
            iLxb = com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb());
        }
        int iLD = com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), iLxb);
        Lxb lxb = this.ZU;
        float fMin = lxb.lk ? lxb.Lxb : Math.min(lxb.Lxb, iLD);
        if (this.ZU.LD == 0.0f) {
            oy.JXs(fMin);
            oy.nBu().JXs().nBu("auto");
            oy.lc(0.0f);
        } else {
            oy.JXs(fMin);
            int iLD2 = com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb()));
            Lxb lxb2 = this.ZU;
            oy.lc(lxb2.lk ? lxb2.LD : Math.min(lxb2.LD, iLD2));
            oy.nBu().JXs().nBu("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ZU.OY Lxb(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.lc != null) {
                lk lkVar = new lk();
                this.JXs = lkVar;
                JSONObject jSONObjectLxb = lkVar.Lxb(this.lc.Lxb, iOptInt, jSONObject);
                if (jSONObjectLxb != null) {
                    jSONObject = jSONObjectLxb;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oyLxb = Lxb(jSONObject);
        oyLxb.Lxb(oy);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            oyLxb.Lxb((List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>) null);
            return oyLxb;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = oyLxb.nBu().JXs().MGT();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oyLxb2 = Lxb(jSONArrayOptJSONArray2.optJSONObject(i2), oyLxb);
                    if (com.bytedance.sdk.component.adexpress.ZU.LD() && "skip-with-time".equals(oyLxb.nBu().LD()) && !"transparent".equals(oyLxb.eK()) && !TextUtils.isEmpty(oyLxb.eK())) {
                        oyLxb2.lk(oyLxb.eK());
                    }
                    arrayList.add(oyLxb2);
                    arrayList3.add(oyLxb2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            oyLxb.Lxb(arrayList);
        }
        if (arrayList2.size() > 0) {
            oyLxb.LD(arrayList2);
        }
        return oyLxb;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ZU.OY Lxb(JSONObject jSONObject) {
        String strLxb;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        QAg.Lxb(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectLxb = QAg.Lxb(strOptString, QAg.Lxb(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy = new com.bytedance.sdk.component.adexpress.dynamic.ZU.OY();
        if (TextUtils.isEmpty(strOptString2)) {
            oy.LD(String.valueOf(oy.hashCode()));
        } else {
            oy.LD(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            LD(oy);
            oy.lk((float) jSONObjectOptJSONObject.optDouble("x"));
            oy.ZU((float) jSONObjectOptJSONObject.optDouble("y"));
            oy.JXs((float) jSONObjectOptJSONObject.optDouble("width"));
            oy.lc((float) jSONObjectOptJSONObject.optDouble("height"));
            oy.ebl(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.ZU.JXs jXs = new com.bytedance.sdk.component.adexpress.dynamic.ZU.JXs();
            jXs.Lxb(strOptString);
            jXs.LD(jSONObjectOptJSONObject.optString("data"));
            jXs.lk(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarLxb = com.bytedance.sdk.component.adexpress.dynamic.ZU.lc.Lxb(jSONObjectOptJSONObject);
            jXs.Lxb(lcVarLxb);
            com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarLxb2 = com.bytedance.sdk.component.adexpress.dynamic.ZU.lc.Lxb(jSONObjectLxb);
            if (lcVarLxb2 == null) {
                jXs.LD(lcVarLxb);
            } else {
                jXs.LD(lcVarLxb2);
            }
            Lxb(lcVarLxb);
            Lxb(lcVarLxb2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.LD) != null) {
                Lxb(jXs, jSONObject2.optInt("image_mode"));
            }
            String strLD = jXs.LD();
            com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = jXs.JXs();
            if (ebl.containsKey(strLD) && !lcVarJXs.Sv()) {
                lcVarJXs.DY(ebl.get(strLD));
            }
            if (lcVarJXs.Sv()) {
                strLxb = jXs.lk();
            } else {
                strLxb = Lxb(jXs.lk());
            }
            if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                if (TextUtils.equals(strLD, "star") || TextUtils.equals(strLD, "text_star")) {
                    strLxb = Lxb("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strLD, "score-count") || TextUtils.equals(strLD, "score-count-type-1") || TextUtils.equals(strLD, "score-count-type-2")) {
                    strLxb = Lxb("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strLD) && lcVarLxb.Bj()) {
                    strLxb = Lxb("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(Lxb()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                StringBuilder sbQ = DM.q(strLxb, "adx:");
                sbQ.append(Lxb());
                jXs.LD(sbQ.toString());
            } else {
                jXs.LD(strLxb);
            }
            oy.Lxb(jXs);
        }
        return oy;
    }

    private void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.JXs jXs, int i) {
        int iLastIndexOf;
        if (i != 5 && i != 15 && i != 50 && i != 154) {
            jXs.Lxb("image");
            String strLxb = QAg.Lxb("image");
            com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = jXs.JXs();
            lcVarJXs.DY(strLxb);
            jXs.ebl().DY(strLxb);
            String strLxb2 = QAg.Lxb("image", "clickArea");
            if (!TextUtils.isEmpty(strLxb2)) {
                lcVarJXs.IeN(strLxb2);
                jXs.ebl().IeN(strLxb2);
            }
            JSONObject jSONObjectBg = lcVarJXs.Bg();
            if (jSONObjectBg != null) {
                lcVarJXs.eK(jSONObjectBg.optString("imageLottieTosPath"));
                lcVarJXs.sLN(jSONObjectBg.optBoolean("animationsLoop"));
                lcVarJXs.id(jSONObjectBg.optInt("lottieAppNameMaxLength"));
                lcVarJXs.KPU(jSONObjectBg.optInt("lottieAdDescMaxLength"));
                lcVarJXs.foI(jSONObjectBg.optInt("lottieAdTitleMaxLength"));
            }
            jXs.LD(strLxb);
            if (strLxb != null && (iLastIndexOf = strLxb.lastIndexOf(".")) > 0) {
                String strSubstring = strLxb.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", Lxb(strSubstring + ".width"));
                    jSONObject.put("height", Lxb(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                jXs.lk(jSONObject.toString());
            }
            lcVarJXs.HN();
            return;
        }
        jXs.Lxb("video");
        String strLxb3 = QAg.Lxb("video");
        jXs.JXs().DY(strLxb3);
        String strLxb4 = QAg.Lxb("video", "clickArea");
        if (!TextUtils.isEmpty(strLxb4)) {
            jXs.JXs().IeN(strLxb4);
            jXs.ebl().IeN(strLxb4);
        }
        jXs.ebl().DY(strLxb3);
        jXs.LD(strLxb3);
        jXs.JXs().Zg();
    }

    private String Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.lk.LD(str2)) {
                String strValueOf = String.valueOf(this.lk.Lxb(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String Lxb() {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lk lkVar = this.lk;
        if (lkVar == null) {
            return "";
        }
        return String.valueOf(lkVar.Lxb("adx_name"));
    }

    private void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVar) {
        if (lcVar == null) {
            return;
        }
        String strIvz = lcVar.Ivz();
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            String strLk = com.bytedance.sdk.component.adexpress.ZU.OY.lk(com.bytedance.sdk.component.adexpress.ZU.Lxb());
            if ("zh".equals(strLk)) {
                strLk = "cn";
            }
            if (!TextUtils.isEmpty(strLk) && lcVar.lc() != null) {
                String strOptString = lcVar.lc().optString(strLk);
                if (!TextUtils.isEmpty(strOptString)) {
                    strIvz = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strIvz)) {
            return;
        }
        int iIndexOf = strIvz.indexOf("{{");
        int iIndexOf2 = strIvz.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strLxb = Lxb(strIvz.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb = new StringBuilder(strIvz.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strLxb)) {
                sb.append(strLxb);
            }
            sb.append(strIvz.substring(iIndexOf2 + 2));
            lcVar.sLN(sb.toString());
            return;
        }
        lcVar.sLN(strIvz);
    }
}
