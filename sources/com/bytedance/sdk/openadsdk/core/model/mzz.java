package com.bytedance.sdk.openadsdk.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz {
    private ArrayList<qdl> qdl;
    private mml ud;

    public static class qdl {
        private com.bytedance.sdk.openadsdk.core.fs.mml lnr;
        private Set<com.bytedance.sdk.openadsdk.core.fs.to> mml;
        private final String qdl;
        private final String ud;

        public qdl(JSONObject jSONObject) {
            this.qdl = jSONObject.optString("vast_url");
            this.ud = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVar = new com.bytedance.sdk.openadsdk.core.fs.mml();
                this.lnr = mmlVar;
                mmlVar.qdl(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.mml = com.bytedance.sdk.openadsdk.core.fs.to.qdl(jSONArrayOptJSONArray);
            }
        }

        public String lnr() {
            return this.qdl;
        }

        public String mml() {
            return this.ud;
        }

        public JSONObject mzz() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vast_url", this.qdl);
            jSONObject.put("vast_content", this.ud);
            com.bytedance.sdk.openadsdk.core.fs.mml mmlVar = this.lnr;
            if (mmlVar != null) {
                jSONObject.put("videoTrackers", mmlVar.qdl());
            }
            if (this.mml != null) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.fs.to toVar : this.mml) {
                    if (toVar != null) {
                        jSONArray.put(toVar.mml());
                    }
                }
                jSONObject.put("viewabilityVendor", jSONArray);
            }
            return jSONObject;
        }

        public com.bytedance.sdk.openadsdk.core.fs.mml qdl() {
            return this.lnr;
        }

        public Set<com.bytedance.sdk.openadsdk.core.fs.to> ud() {
            return this.mml;
        }

        public void qdl(com.bytedance.sdk.openadsdk.core.fs.mml mmlVar) {
            this.lnr = mmlVar;
        }

        public void qdl(Set<com.bytedance.sdk.openadsdk.core.fs.to> set) {
            this.mml = set;
        }
    }

    public mzz(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            qdl qdlVar = new qdl(jSONArray.optJSONObject(i2));
            if (this.qdl == null) {
                this.qdl = new ArrayList<>();
            }
            this.qdl.add(qdlVar);
        }
    }

    public static boolean qdl(ljh ljhVar) {
        if (ljhVar == null || ljhVar.xmv()) {
            return false;
        }
        int iVz = ljhVar.vz();
        int iVxg = ljhVar.vxg();
        return (iVz == 3 || iVz == 7 || iVz == 8) && (iVxg == 5 || iVxg == 15 || iVxg == 50);
    }

    public mml lnr() {
        if (this.ud == null) {
            this.ud = new mml();
            ArrayList<qdl> arrayList = this.qdl;
            if (arrayList != null) {
                for (qdl qdlVar : arrayList) {
                    com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl = qdlVar.qdl();
                    Set<com.bytedance.sdk.openadsdk.core.fs.to> setUd = qdlVar.ud();
                    if (mmlVarQdl != null) {
                        this.ud.qdl().qdl(mmlVarQdl);
                    }
                    if (setUd != null) {
                        this.ud.ud().addAll(setUd);
                    }
                }
            }
        }
        return this.ud;
    }

    public boolean mml() {
        ArrayList<qdl> arrayList = this.qdl;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public JSONArray ud() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<qdl> arrayList = this.qdl;
        if (arrayList != null) {
            try {
                Iterator<qdl> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().mzz());
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public ArrayList<qdl> qdl() {
        return this.qdl;
    }
}
