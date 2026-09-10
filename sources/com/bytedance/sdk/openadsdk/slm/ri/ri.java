package com.bytedance.sdk.openadsdk.slm.ri;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    float aw;
    int bgr;
    int bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    float f18165co;
    int di;
    float fi;
    float ik;
    float jbs;
    float ka;
    int lr;
    float mj;
    int qt;
    String ri;
    float sf;
    float slm;
    String vr;
    float xha;
    int nr = -1;
    String tan = "";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.ri.ri$ri, reason: collision with other inner class name */
    public static class C0275ri {
        ri ri = new ri();

        public C0275ri di(float f) {
            this.ri.di(f);
            return this;
        }

        public C0275ri fi(float f) {
            this.ri.fi(f);
            return this;
        }

        public C0275ri ik(float f) {
            this.ri.ik(f);
            return this;
        }

        public C0275ri jbs(float f) {
            this.ri.jbs(f);
            return this;
        }

        public C0275ri ka(float f) {
            this.ri.ka(f);
            return this;
        }

        public C0275ri lr(float f) {
            this.ri.lr(f);
            return this;
        }

        public C0275ri mj(float f) {
            this.ri.mj(f);
            return this;
        }

        public C0275ri qt(float f) {
            this.ri.qt(f);
            return this;
        }

        public C0275ri ri(String str) {
            this.ri.lr(str);
            return this;
        }

        public C0275ri xha(float f) {
            this.ri.xha(f);
            return this;
        }

        public C0275ri ik(int i) {
            this.ri.di(i);
            return this;
        }

        public C0275ri lr(int i) {
            this.ri.fi(i);
            return this;
        }

        public C0275ri ri(int i) {
            this.ri.lr(i);
            return this;
        }

        public C0275ri lr(String str) {
            this.ri.ik(str);
            return this;
        }

        public C0275ri ri(float f) {
            this.ri.ri(f);
            return this;
        }

        public ri ri() {
            return this.ri;
        }
    }

    public float aw() {
        return this.sf;
    }

    public float bgr() {
        return this.f18165co;
    }

    public String bu() {
        return this.vr;
    }

    public int co() {
        return this.qt;
    }

    public float di() {
        return this.ka;
    }

    public float fi() {
        return this.ik;
    }

    public String ik() {
        return this.ri;
    }

    public float jbs() {
        return this.xha;
    }

    public int ka() {
        return this.lr;
    }

    public String lr() {
        return this.tan;
    }

    public int mj() {
        return this.di;
    }

    public float nr() {
        return this.slm;
    }

    public float qt() {
        return this.mj;
    }

    public int ri() {
        return this.nr;
    }

    public float sf() {
        return this.jbs;
    }

    public int slm() {
        return this.bgr;
    }

    public int tan() {
        return this.bu;
    }

    public BigDecimal vr() {
        return new BigDecimal(this.aw).setScale(3, RoundingMode.HALF_UP);
    }

    public float xha() {
        return this.fi;
    }

    public void di(float f) {
        this.jbs = f;
    }

    public void fi(float f) {
        this.mj = f;
    }

    public void ik(float f) {
        this.fi = f;
    }

    public void jbs(float f) {
        this.aw = f;
    }

    public void ka(float f) {
        this.xha = f;
    }

    public void lr(String str) {
        this.ri = str;
    }

    public void mj(float f) {
        this.f18165co = f;
    }

    public void qt(float f) {
        this.slm = f;
    }

    public void ri(int i) {
        this.nr = i;
    }

    public void xha(float f) {
        this.sf = f;
    }

    public void di(int i) {
        this.bu = i;
    }

    public void fi(int i) {
        this.bgr = i;
    }

    public void ik(int i) {
        this.di = i;
    }

    public void ka(int i) {
        this.qt = i;
    }

    public void lr(int i) {
        this.lr = i;
    }

    public void ri(String str) {
        this.tan = str;
    }

    public void ik(String str) {
        this.vr = str;
    }

    public void lr(float f) {
        this.ka = f;
    }

    public void ri(float f) {
        this.ik = f;
    }
}
