package com.bytedance.sdk.openadsdk.core.fs.ud;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends lnr implements Comparable<ud> {
    private final float qdl;

    public static class qdl {
        private lnr.EnumC0114lnr lnr = lnr.EnumC0114lnr.TRACKING_URL;
        private boolean mml = false;
        private final String qdl;
        private final float ud;

        public qdl(String str, float f) {
            this.qdl = str;
            this.ud = f;
        }

        public ud qdl() {
            return new ud(this.ud, this.qdl, this.lnr, Boolean.valueOf(this.mml));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.fs.ud.lnr
    public void j_() {
        super.j_();
    }

    public boolean qdl(float f) {
        return this.qdl <= f && !mzz();
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject ud() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", lnr());
        jSONObject.put("trackingFraction", this.qdl);
        return jSONObject;
    }

    private ud(float f, String str, lnr.EnumC0114lnr enumC0114lnr, Boolean bool) {
        super(str, enumC0114lnr, bool);
        this.qdl = f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(ud udVar) {
        if (udVar == null) {
            return 1;
        }
        float f = this.qdl;
        float f2 = udVar.qdl;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }
}
