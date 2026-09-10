package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JXs {
    private String JXs;
    private JSONObject LD;
    private JSONObject Lxb;
    private JSONObject ZU;
    private boolean ebl;
    private JSONObject lc;
    private String lk;

    public static class Lxb {
        private List<Lxb> JXs;
        private String LD;
        private String Lxb;
        private String OY;
        private JSONObject ZU;
        private String ebl;
        private Lxb lc;
        private JSONObject lk;

        public List<Lxb> JXs() {
            return this.JXs;
        }

        public JSONObject lc() {
            return this.ZU;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("UGNode{id='");
            sb.append(this.Lxb);
            sb.append("', name='");
            return DM.m(sb, this.LD, "'}");
        }

        public JSONObject ZU() {
            return this.lk;
        }

        public String lk() {
            return this.LD;
        }

        public String LD() {
            return this.ebl;
        }

        public String Lxb() {
            return this.Lxb;
        }

        public void Lxb(String str) {
            this.LD = str;
        }

        public void Lxb(Lxb lxb) {
            if (this.JXs == null) {
                this.JXs = new ArrayList();
            }
            this.JXs.add(lxb);
        }
    }

    public JXs(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public String LD() {
        return this.lk;
    }

    public Lxb Lxb() {
        return Lxb(this.Lxb, (Lxb) null);
    }

    public boolean ZU() {
        return this.ebl;
    }

    public List<Lxb> lk() {
        if (this.LD == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.LD.keys();
        while (itKeys.hasNext()) {
            Lxb Lxb2 = Lxb(this.LD.optJSONObject(itKeys.next()), (Lxb) null);
            if (Lxb2 != null) {
                arrayList.add(Lxb2);
            }
        }
        return arrayList;
    }

    public JXs(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.Lxb = jSONObject.optJSONObject(TtmlNode.TAG_BODY);
            } else {
                this.Lxb = jSONObject.optJSONObject("main_template");
            }
            this.LD = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has(TtmlNode.TAG_BODY)) {
                    this.ebl = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.lk = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.lk = "3.0";
                    }
                } else {
                    this.lk = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.JXs = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.lk = "3.0";
                this.ebl = true;
            }
            this.ZU = jSONObject2;
            this.lc = jSONObject3;
        }
    }

    private Lxb Lxb(JSONObject jSONObject, Lxb lxb) {
        Lxb Lxb2;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        Lxb lxb2 = new Lxb();
        lxb2.Lxb = strOptString2;
        if (this.ebl && TextUtils.equals("Video", strOptString)) {
            lxb2.LD = strOptString + "V3";
        } else {
            lxb2.LD = strOptString;
        }
        lxb2.lk = jSONObject2;
        lxb2.lc = lxb;
        lxb2.ebl = this.lk;
        lxb2.OY = this.JXs;
        if (jSONObject2.has("i18n")) {
            lxb2.ZU = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            Lxb(jSONObject, lxb2.lk);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString3 = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
                String strLxb = com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObjectOptJSONObject.optString("id"), this.ZU);
                if (TextUtils.equals(strOptString3, "Template")) {
                    JSONObject jSONObject3 = this.LD;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strLxb);
                        Lxb2 = Lxb(jSONObjectOptJSONObject, lxb2);
                    } else {
                        Lxb2 = null;
                    }
                } else {
                    Lxb2 = Lxb(jSONObjectOptJSONObject, lxb2);
                }
                if (Lxb2 != null) {
                    lxb2.Lxb(Lxb2);
                }
            }
        }
        return lxb2;
    }

    private void Lxb(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.lc == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.lc.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, f.ax) && jSONObject3.has(f.ax)) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.ebl.LD.Lxb(jSONObject3.optJSONArray(f.ax), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean Lxb(Lxb lxb) {
        return (lxb == null || lxb.lk == null) ? false : true;
    }
}
