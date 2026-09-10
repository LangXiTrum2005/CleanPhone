package com.bytedance.adsdk.ugeno.mml;

import com.applovin.impl.Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mo {
    private qdl qdl;
    private List<qdl> ud;

    public static class qdl {
        private String lnr = "global";
        private String mml;
        private Map<String, Object> mo;
        private Map<String, String> mzz;
        private String qdl;
        private String ud;

        public Map<String, String> lnr() {
            return this.mzz;
        }

        public String mml() {
            return this.qdl;
        }

        public String mzz() {
            return this.ud;
        }

        public String qdl() {
            return this.lnr;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Action{scheme='");
            sb.append(this.lnr);
            sb.append("', name='");
            sb.append(this.mml);
            sb.append("', params=");
            sb.append(this.mzz);
            sb.append(", host='");
            sb.append(this.ud);
            sb.append("', origin='");
            sb.append(this.qdl);
            sb.append("', extra=");
            return Z.o(sb, this.mo, AbstractJsonLexerKt.END_OBJ);
        }

        public String ud() {
            return this.mml;
        }

        public void lnr(String str) {
            this.qdl = str;
        }

        public void mml(String str) {
            this.ud = str;
        }

        public void qdl(String str) {
            this.lnr = str;
        }

        public void ud(String str) {
            this.mml = str;
        }

        public void qdl(Map<String, String> map) {
            this.mzz = map;
        }

        public void ud(Map<String, Object> map) {
            this.mo = map;
        }
    }

    public qdl qdl() {
        return this.qdl;
    }

    public List<qdl> ud() {
        return this.ud;
    }

    public static mo qdl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        mo moVar = new mo();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        moVar.qdl = fs.qdl(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            qdl qdlVarQdl = fs.qdl(jSONArrayOptJSONArray.optString(i2), jSONObject2);
            if (qdlVarQdl != null) {
                arrayList.add(qdlVarQdl);
            }
        }
        moVar.ud = arrayList;
        return moVar;
    }
}
