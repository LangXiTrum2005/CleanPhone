package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private JSONObject di;
    private String fi;
    private String ik;
    private float jbs;
    private JSONObject ka;
    private JSONObject lr;
    private float mj;
    private JSONObject ri;
    private boolean xha;

    public static class ri {
        private ri di;
        private LinkedList<ri> fi;
        private JSONObject ik;
        private boolean jbs;
        private JSONObject ka;
        private String lr;
        private String mj;
        private boolean qt;
        private String ri;
        private String xha;

        public JSONObject di() {
            return this.ka;
        }

        public List<ri> fi() {
            return this.fi;
        }

        public String toString() {
            return "UGNode{id='" + this.ri + "', name='" + this.lr + "'}";
        }

        public JSONObject ka() {
            return this.ik;
        }

        public String ik() {
            return this.lr;
        }

        public String lr() {
            return this.xha;
        }

        public void lr(boolean z) {
            this.qt = z;
        }

        public String ri() {
            return this.ri;
        }

        public void lr(ri riVar) {
            if (this.fi == null) {
                this.fi = new LinkedList<>();
            }
            this.fi.addLast(riVar);
        }

        public void ri(String str) {
            this.lr = str;
        }

        public void ri(boolean z) {
            this.jbs = z;
        }

        public void ri(ri riVar) {
            if (this.fi == null) {
                this.fi = new LinkedList<>();
            }
            this.fi.add(riVar);
        }

        public void ri(int i, ri riVar) {
            if (this.fi == null) {
                this.fi = new LinkedList<>();
            }
            this.fi.add(i, riVar);
        }
    }

    public xha(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private ri fi() {
        if (!ka()) {
            return ri(this.ri, (ri) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f = this.mj;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put("width", f);
            }
            float f2 = this.jbs;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put("height", f2);
            }
            JSONObject jSONObject2 = this.ka;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        ri riVar = new ri();
        riVar.lr = "View";
        riVar.ri = "virtualNode";
        riVar.ik = jSONObject;
        riVar.di = null;
        riVar.xha = this.ik;
        riVar.mj = this.fi;
        riVar.ri(ri(this.ri, riVar));
        return riVar;
    }

    public List<ri> ik() {
        if (this.lr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.lr.keys();
        while (itKeys.hasNext()) {
            ri riVarRi = ri(this.lr.optJSONObject(itKeys.next()), (ri) null);
            if (riVarRi != null) {
                arrayList.add(riVarRi);
            }
        }
        return arrayList;
    }

    public boolean ka() {
        return this.xha;
    }

    public String lr() {
        return this.ik;
    }

    public ri ri() {
        return fi();
    }

    public xha(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.ri = jSONObject.optJSONObject("body");
            } else {
                this.ri = jSONObject.optJSONObject("main_template");
            }
            this.lr = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.xha = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.ik = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.ik = "3.0";
                    }
                } else {
                    this.ik = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.fi = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.ik = "3.0";
                this.xha = true;
            }
            this.ka = jSONObject2;
            this.di = jSONObject3;
        }
    }

    public static boolean ka(ri riVar) {
        return (riVar == null || riVar.ik == null) ? false : true;
    }

    public boolean lr(ri riVar) {
        JSONObject jSONObjectKa;
        if (riVar == null || (jSONObjectKa = riVar.ka()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectKa.optString("height"), "match_parent");
    }

    public void ri(float f, float f2) {
        this.mj = f;
        this.jbs = f2;
    }

    private ri ri(JSONObject jSONObject, ri riVar) {
        String strOptString;
        String strOptString2;
        ri riVarRi;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            strOptString = jSONObject.optString("type");
        } else {
            strOptString = jSONObject.optString("name");
        }
        String strOptString3 = jSONObject.optString("id");
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
        ri riVar2 = new ri();
        riVar2.ri = strOptString3;
        if (!this.xha || !TextUtils.equals("Video", strOptString)) {
            riVar2.lr = strOptString;
        } else {
            riVar2.lr = strOptString + "V3";
        }
        riVar2.ik = jSONObject2;
        riVar2.di = riVar;
        riVar2.xha = this.ik;
        riVar2.mj = this.fi;
        if (jSONObject2.has("i18n")) {
            riVar2.ka = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            ri(jSONObject, riVar2.ik);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObject.has("type")) {
                    strOptString2 = jSONObject.optString("type");
                } else {
                    strOptString2 = jSONObject.optString("name");
                }
                String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectOptJSONObject.optString("id"), this.ka);
                if (TextUtils.equals(strOptString2, "Template")) {
                    JSONObject jSONObject3 = this.lr;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strRi);
                        riVarRi = ri(jSONObjectOptJSONObject, riVar2);
                    } else {
                        riVarRi = null;
                    }
                } else {
                    riVarRi = ri(jSONObjectOptJSONObject, riVar2);
                }
                if (riVarRi != null) {
                    riVarRi.lr(lr(riVarRi));
                    riVarRi.ri(ri(riVarRi));
                }
                if (ik(riVarRi)) {
                    i++;
                    riVar2.lr(riVarRi);
                } else if (riVarRi != null) {
                    riVar2.ri(i2 - i, riVarRi);
                }
            }
        }
        return riVar2;
    }

    public boolean ik(ri riVar) {
        JSONObject jSONObjectKa;
        if (riVar == null || (jSONObjectKa = riVar.ka()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectKa.optString(X3.i.L), "absolute");
    }

    public boolean ri(ri riVar) {
        JSONObject jSONObjectKa;
        if (riVar == null || (jSONObjectKa = riVar.ka()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectKa.optString("width"), "match_parent");
    }

    private void ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.di == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.di.optString(jSONObject2.optString("targetId"));
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
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.xha.lr.ri(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
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
}
