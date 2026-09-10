package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jtx implements com.bytedance.sdk.component.adexpress.lnr {
    public int bjy;
    public JSONObject exu;
    public int fs;
    public int jpc;
    public final float lnr;
    public final float mml;
    public final long mo;
    public final long mzz;
    public final float qdl;
    public boolean rdp;
    public final boolean rq;
    public SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> to;
    public JSONObject tvp;
    public final float ud;
    public final String wd;

    public static class qdl {
        private boolean bjy;
        private JSONObject exu;
        private int fs;
        private int jpc;
        private long lnr;
        private float mml;
        private float mo;
        private float mzz;
        private JSONObject rq;
        private int to;
        private String tvp;
        private long ud;
        private float wd;
        private boolean rdp = false;
        protected SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> qdl = new SparseArray<>();

        public qdl lnr(int i2) {
            this.jpc = i2;
            return this;
        }

        public qdl mml(float f) {
            this.wd = f;
            return this;
        }

        public qdl qdl(int i2) {
            this.fs = i2;
            return this;
        }

        public qdl ud(int i2) {
            this.to = i2;
            return this;
        }

        public qdl lnr(float f) {
            this.mo = f;
            return this;
        }

        public qdl qdl(JSONObject jSONObject) {
            this.rq = jSONObject;
            return this;
        }

        public qdl ud(long j) {
            this.lnr = j;
            return this;
        }

        public qdl qdl(boolean z2) {
            this.bjy = z2;
            return this;
        }

        public qdl ud(float f) {
            this.mzz = f;
            return this;
        }

        public qdl qdl(long j) {
            this.ud = j;
            return this;
        }

        public qdl ud(JSONObject jSONObject) {
            this.exu = jSONObject;
            return this;
        }

        public qdl qdl(float f) {
            this.mml = f;
            return this;
        }

        public qdl ud(boolean z2) {
            this.rdp = z2;
            return this;
        }

        public qdl qdl(String str) {
            this.tvp = str;
            return this;
        }

        public qdl qdl(SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray) {
            this.qdl = sparseArray;
            return this;
        }

        public jtx qdl() {
            return new jtx(this);
        }
    }

    private jtx(qdl qdlVar) {
        this.rdp = false;
        this.qdl = qdlVar.wd;
        this.ud = qdlVar.mo;
        this.lnr = qdlVar.mzz;
        this.mml = qdlVar.mml;
        this.mzz = qdlVar.lnr;
        this.mo = qdlVar.ud;
        this.wd = qdlVar.tvp;
        this.to = qdlVar.qdl;
        this.rq = qdlVar.bjy;
        this.jpc = qdlVar.to;
        this.tvp = qdlVar.rq;
        this.fs = qdlVar.fs;
        this.exu = qdlVar.exu;
        this.rdp = qdlVar.rdp;
        this.bjy = qdlVar.jpc;
    }
}
