package com.bytedance.sdk.openadsdk.core.JVA.ZU;

import com.bytedance.adsdk.ugeno.core.IeN;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends NXR {
    private IeN LD;
    private JSONObject Lxb;
    private float ZU;
    private float lk;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.JVA.ZU.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0091Lxb extends NXR.Lxb {
        private IeN LD;
        private JSONObject Lxb;
        private float ZU;
        private float lk;

        public C0091Lxb LD(float f) {
            this.ZU = f;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.LD.NXR.Lxb
        /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
        public Lxb Lxb() {
            return new Lxb(this);
        }

        public C0091Lxb Lxb(JSONObject jSONObject) {
            this.Lxb = jSONObject;
            return this;
        }

        public C0091Lxb Lxb(IeN ieN) {
            this.LD = ieN;
            return this;
        }

        public C0091Lxb Lxb(float f) {
            this.lk = f;
            return this;
        }
    }

    public Lxb(C0091Lxb c0091Lxb) {
        super(c0091Lxb);
        this.Lxb = c0091Lxb.Lxb;
        this.LD = c0091Lxb.LD;
        this.lk = c0091Lxb.lk;
        this.ZU = c0091Lxb.ZU;
    }

    public IeN Ivz() {
        return this.LD;
    }

    public JSONObject KPU() {
        return this.Lxb;
    }

    public float foI() {
        return this.ZU;
    }

    public float id() {
        return this.lk;
    }
}
