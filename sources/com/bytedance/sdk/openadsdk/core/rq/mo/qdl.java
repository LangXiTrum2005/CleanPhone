package com.bytedance.sdk.openadsdk.core.rq.mo;

import com.bytedance.adsdk.ugeno.core.jl;
import com.bytedance.sdk.component.adexpress.ud.exu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends exu {
    private float lnr;
    private float mml;
    private boolean mzz;
    private JSONObject qdl;
    private jl ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.rq.mo.qdl$qdl, reason: collision with other inner class name */
    public static class C0125qdl extends exu.qdl {
        private float lnr;
        private float mml;
        private boolean mzz;
        private JSONObject qdl;
        private jl ud;

        public C0125qdl mo(boolean z2) {
            this.mzz = z2;
            return this;
        }

        public C0125qdl ud(float f) {
            this.mml = f;
            return this;
        }

        public C0125qdl qdl(JSONObject jSONObject) {
            this.qdl = jSONObject;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.ud.exu.qdl
        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public qdl qdl() {
            return new qdl(this);
        }

        public C0125qdl qdl(jl jlVar) {
            this.ud = jlVar;
            return this;
        }

        public C0125qdl qdl(float f) {
            this.lnr = f;
            return this;
        }
    }

    public qdl(C0125qdl c0125qdl) {
        super(c0125qdl);
        this.qdl = c0125qdl.qdl;
        this.ud = c0125qdl.ud;
        this.lnr = c0125qdl.lnr;
        this.mml = c0125qdl.mml;
        this.mzz = c0125qdl.mzz;
    }

    public jl ekw() {
        return this.ud;
    }

    public boolean hkc() {
        return this.mzz;
    }

    public JSONObject kdv() {
        return this.qdl;
    }

    public float rc() {
        return this.mml;
    }

    public float vu() {
        return this.lnr;
    }
}
