package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class slm implements com.bytedance.sdk.component.adexpress.ik {
    public JSONObject aw;
    public boolean bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f18141co;
    public final long di;
    public final long fi;
    public final float ik;
    public JSONObject jbs;
    public final float ka;
    public final float lr;
    public int mj;
    public SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> qt;
    public final float ri;
    public final boolean sf;
    public int vr;
    public final String xha;

    public static class ri {
        private JSONObject aw;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private int f18142co;
        private float di;
        private float fi;
        private long ik;
        private String jbs;
        private float ka;
        private long lr;
        private int mj;
        private int qt;
        private JSONObject sf;
        private boolean vr;
        private float xha;
        private boolean bgr = false;
        protected SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> ri = new SparseArray<>();

        public ri ik(int i) {
            this.mj = i;
            return this;
        }

        public ri ka(float f) {
            this.xha = f;
            return this;
        }

        public ri lr(int i) {
            this.qt = i;
            return this;
        }

        public ri ri(int i) {
            this.f18142co = i;
            return this;
        }

        public ri ik(float f) {
            this.di = f;
            return this;
        }

        public ri lr(long j) {
            this.ik = j;
            return this;
        }

        public ri ri(JSONObject jSONObject) {
            this.sf = jSONObject;
            return this;
        }

        public ri lr(float f) {
            this.fi = f;
            return this;
        }

        public ri ri(boolean z) {
            this.vr = z;
            return this;
        }

        public ri lr(JSONObject jSONObject) {
            this.aw = jSONObject;
            return this;
        }

        public ri ri(long j) {
            this.lr = j;
            return this;
        }

        public ri lr(boolean z) {
            this.bgr = z;
            return this;
        }

        public ri ri(float f) {
            this.ka = f;
            return this;
        }

        public ri ri(String str) {
            this.jbs = str;
            return this;
        }

        public ri ri(SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray) {
            this.ri = sparseArray;
            return this;
        }

        public slm ri() {
            return new slm(this);
        }
    }

    private slm(ri riVar) {
        this.bgr = false;
        this.ri = riVar.xha;
        this.lr = riVar.di;
        this.ik = riVar.fi;
        this.ka = riVar.ka;
        this.fi = riVar.ik;
        this.di = riVar.lr;
        this.xha = riVar.jbs;
        this.qt = riVar.ri;
        this.sf = riVar.vr;
        this.mj = riVar.qt;
        this.jbs = riVar.sf;
        this.f18141co = riVar.f18142co;
        this.aw = riVar.aw;
        this.bgr = riVar.bgr;
        this.vr = riVar.mj;
    }
}
