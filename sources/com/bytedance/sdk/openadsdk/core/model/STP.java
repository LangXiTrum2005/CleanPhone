package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class STP implements com.bytedance.sdk.component.adexpress.lk {
    public final boolean IeN;
    public final String JVA;
    public final long JXs;
    public final float LD;
    public final float Lxb;
    public JSONObject NXR;
    public final int OY;
    public final int QAg;
    public SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> STP;
    public int VVE;
    public final float ZU;
    public boolean brP;
    public final int ebl;
    public JSONObject kqm;
    public final long lc;
    public final float lk;
    public final int nBu;
    public int sLN;

    public static class Lxb {
        private int IeN;
        private int JVA;
        private float JXs;
        private long LD;
        private int NXR;
        private int OY;
        private int QAg;
        private JSONObject STP;
        private JSONObject VVE;
        private float ZU;
        private boolean brP;
        private float ebl;
        private float lc;
        private long lk;
        private int nBu;
        private String sLN;
        private boolean kqm = false;
        protected SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> Lxb = new SparseArray<>();

        public Lxb JXs(int i) {
            this.nBu = i;
            return this;
        }

        public Lxb LD(int i) {
            this.NXR = i;
            return this;
        }

        public Lxb Lxb(int i) {
            this.IeN = i;
            return this;
        }

        public Lxb ZU(float f) {
            this.ebl = f;
            return this;
        }

        public Lxb lc(int i) {
            this.JVA = i;
            return this;
        }

        public Lxb lk(float f) {
            this.lc = f;
            return this;
        }

        public Lxb LD(long j) {
            this.lk = j;
            return this;
        }

        public Lxb Lxb(JSONObject jSONObject) {
            this.STP = jSONObject;
            return this;
        }

        public Lxb ZU(int i) {
            this.QAg = i;
            return this;
        }

        public Lxb lk(int i) {
            this.OY = i;
            return this;
        }

        public Lxb LD(float f) {
            this.JXs = f;
            return this;
        }

        public Lxb Lxb(boolean z) {
            this.brP = z;
            return this;
        }

        public Lxb LD(JSONObject jSONObject) {
            this.VVE = jSONObject;
            return this;
        }

        public Lxb Lxb(long j) {
            this.LD = j;
            return this;
        }

        public Lxb LD(boolean z) {
            this.kqm = z;
            return this;
        }

        public Lxb Lxb(float f) {
            this.ZU = f;
            return this;
        }

        public Lxb Lxb(String str) {
            this.sLN = str;
            return this;
        }

        public Lxb Lxb(SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray) {
            this.Lxb = sparseArray;
            return this;
        }

        public STP Lxb() {
            return new STP(this);
        }
    }

    private STP(@NonNull Lxb lxb) {
        this.brP = false;
        this.Lxb = lxb.ebl;
        this.LD = lxb.lc;
        this.lk = lxb.JXs;
        this.ZU = lxb.ZU;
        this.JXs = lxb.lk;
        this.lc = lxb.LD;
        this.ebl = lxb.OY;
        this.OY = lxb.QAg;
        this.QAg = lxb.nBu;
        this.nBu = lxb.JVA;
        this.JVA = lxb.sLN;
        this.STP = lxb.Lxb;
        this.IeN = lxb.brP;
        this.sLN = lxb.NXR;
        this.NXR = lxb.STP;
        this.VVE = lxb.IeN;
        this.kqm = lxb.VVE;
        this.brP = lxb.kqm;
    }
}
