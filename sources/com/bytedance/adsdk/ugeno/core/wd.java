package com.bytedance.adsdk.ugeno.core;

import android.support.v4.media.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wd {
    private float jpc;
    private String lnr;
    private JSONObject mml;
    private JSONObject mo;
    private String mzz;
    private JSONObject qdl;
    private float tvp;
    private JSONObject ud;
    private boolean wd;

    public static class qdl {
        private String jpc;
        private JSONObject lnr;
        private JSONObject mml;
        private qdl mo;
        private LinkedList<qdl> mzz;
        private String qdl;
        private boolean to;
        private boolean tvp;
        private String ud;
        private String wd;

        public JSONObject mo() {
            return this.mml;
        }

        public List<qdl> mzz() {
            return this.mzz;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("UGNode{id='");
            sb.append(this.qdl);
            sb.append("', name='");
            return a.r(sb, this.ud, "'}");
        }

        public JSONObject mml() {
            return this.lnr;
        }

        public String lnr() {
            return this.ud;
        }

        public String ud() {
            return this.wd;
        }

        public String qdl() {
            return this.qdl;
        }

        public void ud(boolean z2) {
            this.to = z2;
        }

        public void qdl(String str) {
            this.ud = str;
        }

        public void ud(qdl qdlVar) {
            if (this.mzz == null) {
                this.mzz = new LinkedList<>();
            }
            this.mzz.addLast(qdlVar);
        }

        public void qdl(boolean z2) {
            this.tvp = z2;
        }

        public void qdl(qdl qdlVar) {
            if (this.mzz == null) {
                this.mzz = new LinkedList<>();
            }
            this.mzz.add(qdlVar);
        }

        public void qdl(int i2, qdl qdlVar) {
            if (this.mzz == null) {
                this.mzz = new LinkedList<>();
            }
            this.mzz.add(i2, qdlVar);
        }
    }

    public wd(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private qdl mzz() {
        if (!mml()) {
            return qdl(this.qdl, (qdl) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f = this.jpc;
            if (f > 0.0f) {
                jSONObject.put("width", f);
            }
            float f2 = this.tvp;
            if (f2 > 0.0f) {
                jSONObject.put("height", f2);
            }
            JSONObject jSONObject2 = this.mml;
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
        qdl qdlVar = new qdl();
        qdlVar.ud = "View";
        qdlVar.qdl = "virtualNode";
        qdlVar.lnr = jSONObject;
        qdlVar.mo = null;
        qdlVar.wd = this.lnr;
        qdlVar.jpc = this.mzz;
        qdlVar.qdl(qdl(this.qdl, qdlVar));
        return qdlVar;
    }

    public List<qdl> lnr() {
        if (this.ud == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.ud.keys();
        while (itKeys.hasNext()) {
            qdl qdlVarQdl = qdl(this.ud.optJSONObject(itKeys.next()), (qdl) null);
            if (qdlVarQdl != null) {
                arrayList.add(qdlVarQdl);
            }
        }
        return arrayList;
    }

    public boolean mml() {
        return this.wd;
    }

    public qdl qdl() {
        return mzz();
    }

    public String ud() {
        return this.lnr;
    }

    public wd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.qdl = jSONObject.optJSONObject("body");
            } else {
                this.qdl = jSONObject.optJSONObject("main_template");
            }
            this.ud = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.wd = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.lnr = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.lnr = "3.0";
                    }
                } else {
                    this.lnr = jSONObjectOptJSONObject.optString(com.smartdigimkt.b0.a.s1);
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.mzz = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.lnr = "3.0";
                this.wd = true;
            }
            this.mml = jSONObject2;
            this.mo = jSONObject3;
        }
    }

    public static boolean mml(qdl qdlVar) {
        return (qdlVar == null || qdlVar.lnr == null) ? false : true;
    }

    public void qdl(float f, float f2) {
        this.jpc = f;
        this.tvp = f2;
    }

    public boolean ud(qdl qdlVar) {
        JSONObject jSONObjectMml;
        if (qdlVar == null || (jSONObjectMml = qdlVar.mml()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectMml.optString("height"), "match_parent");
    }

    private qdl qdl(JSONObject jSONObject, qdl qdlVar) {
        String strOptString;
        String strOptString2;
        qdl qdlVarQdl;
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
        qdl qdlVar2 = new qdl();
        qdlVar2.qdl = strOptString3;
        if (!this.wd || !TextUtils.equals("Video", strOptString)) {
            qdlVar2.ud = strOptString;
        } else {
            qdlVar2.ud = strOptString + "V3";
        }
        qdlVar2.lnr = jSONObject2;
        qdlVar2.mo = qdlVar;
        qdlVar2.wd = this.lnr;
        qdlVar2.jpc = this.mzz;
        if (jSONObject2.has("i18n")) {
            qdlVar2.mml = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            qdl(jSONObject, qdlVar2.lnr);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                if (jSONObject.has("type")) {
                    strOptString2 = jSONObject.optString("type");
                } else {
                    strOptString2 = jSONObject.optString("name");
                }
                String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectOptJSONObject.optString("id"), this.mml);
                if (TextUtils.equals(strOptString2, "Template")) {
                    JSONObject jSONObject3 = this.ud;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strQdl);
                        qdlVarQdl = qdl(jSONObjectOptJSONObject, qdlVar2);
                    } else {
                        qdlVarQdl = null;
                    }
                } else {
                    qdlVarQdl = qdl(jSONObjectOptJSONObject, qdlVar2);
                }
                if (qdlVarQdl != null) {
                    qdlVarQdl.ud(ud(qdlVarQdl));
                    qdlVarQdl.qdl(qdl(qdlVarQdl));
                }
                if (lnr(qdlVarQdl)) {
                    i2++;
                    qdlVar2.ud(qdlVarQdl);
                } else if (qdlVarQdl != null) {
                    qdlVar2.qdl(i3 - i2, qdlVarQdl);
                }
            }
        }
        return qdlVar2;
    }

    public boolean lnr(qdl qdlVar) {
        JSONObject jSONObjectMml;
        if (qdlVar == null || (jSONObjectMml = qdlVar.mml()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectMml.optString("position"), "absolute");
    }

    public boolean qdl(qdl qdlVar) {
        JSONObject jSONObjectMml;
        if (qdlVar == null || (jSONObjectMml = qdlVar.mml()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectMml.optString("width"), "match_parent");
    }

    private void qdl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.mo == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.mo.optString(jSONObject2.optString("targetId"));
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
                            com.bytedance.adsdk.ugeno.wd.ud.qdl(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
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
