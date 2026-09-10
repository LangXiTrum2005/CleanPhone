package com.bytedance.sdk.openadsdk.core.sLN.LD;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends lk implements Comparable<LD> {
    private final float Lxb;

    public static class Lxb {
        private final float LD;
        private final String Lxb;
        private lk.EnumC0110lk lk = lk.EnumC0110lk.TRACKING_URL;
        private boolean ZU = false;

        public Lxb(String str, float f) {
            this.Lxb = str;
            this.LD = f;
        }

        public LD Lxb() {
            return new LD(this.LD, this.Lxb, this.lk, Boolean.valueOf(this.ZU));
        }
    }

    public JSONObject LD() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", lk());
        jSONObject.put("trackingFraction", this.Lxb);
        return jSONObject;
    }

    public boolean Lxb(float f) {
        return this.Lxb <= f && !JXs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sLN.LD.lk
    public void j_() {
        super.j_();
    }

    private LD(float f, String str, lk.EnumC0110lk enumC0110lk, Boolean bool) {
        super(str, enumC0110lk, bool);
        this.Lxb = f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public int compareTo(LD ld) {
        if (ld == null) {
            return 1;
        }
        float f = this.Lxb;
        float f2 = ld.Lxb;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }
}
