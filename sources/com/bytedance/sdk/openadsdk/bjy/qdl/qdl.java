package com.bytedance.sdk.openadsdk.bjy.qdl;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    String bjy;
    float exu;
    float fs;
    float jpc;
    float jtx;
    float lnr;
    float mml;
    int mo;
    float mzz;
    String qdl;
    int rdp;
    float rq;
    int to;
    float tvp;
    int ud;
    float wd;
    int yt;
    int jl = -1;
    String exc = "";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.bjy.qdl.qdl$qdl, reason: collision with other inner class name */
    public static class C0104qdl {
        qdl qdl = new qdl();

        public C0104qdl jpc(float f) {
            this.qdl.jpc(f);
            return this;
        }

        public C0104qdl lnr(float f) {
            this.qdl.lnr(f);
            return this;
        }

        public C0104qdl mml(float f) {
            this.qdl.mml(f);
            return this;
        }

        public C0104qdl mo(float f) {
            this.qdl.mo(f);
            return this;
        }

        public C0104qdl mzz(float f) {
            this.qdl.mzz(f);
            return this;
        }

        public C0104qdl qdl(String str) {
            this.qdl.ud(str);
            return this;
        }

        public C0104qdl to(float f) {
            this.qdl.to(f);
            return this;
        }

        public C0104qdl tvp(float f) {
            this.qdl.tvp(f);
            return this;
        }

        public C0104qdl ud(float f) {
            this.qdl.ud(f);
            return this;
        }

        public C0104qdl wd(float f) {
            this.qdl.wd(f);
            return this;
        }

        public C0104qdl lnr(int i2) {
            this.qdl.mo(i2);
            return this;
        }

        public C0104qdl qdl(int i2) {
            this.qdl.ud(i2);
            return this;
        }

        public C0104qdl ud(int i2) {
            this.qdl.mzz(i2);
            return this;
        }

        public C0104qdl qdl(float f) {
            this.qdl.qdl(f);
            return this;
        }

        public C0104qdl ud(String str) {
            this.qdl.lnr(str);
            return this;
        }

        public qdl qdl() {
            return this.qdl;
        }
    }

    public BigDecimal bjy() {
        return new BigDecimal(this.exu).setScale(3, RoundingMode.HALF_UP);
    }

    public int exc() {
        return this.yt;
    }

    public float exu() {
        return this.rq;
    }

    public int fs() {
        return this.to;
    }

    public float jl() {
        return this.jtx;
    }

    public int jpc() {
        return this.mo;
    }

    public int jtx() {
        return this.rdp;
    }

    public String lnr() {
        return this.qdl;
    }

    public int mml() {
        return this.ud;
    }

    public float mo() {
        return this.mml;
    }

    public float mzz() {
        return this.lnr;
    }

    public int qdl() {
        return this.jl;
    }

    public float rdp() {
        return this.fs;
    }

    public float rq() {
        return this.tvp;
    }

    public float to() {
        return this.jpc;
    }

    public float tvp() {
        return this.wd;
    }

    public String ud() {
        return this.exc;
    }

    public float wd() {
        return this.mzz;
    }

    public String yt() {
        return this.bjy;
    }

    public void jpc(float f) {
        this.fs = f;
    }

    public void lnr(float f) {
        this.mzz = f;
    }

    public void mml(float f) {
        this.wd = f;
    }

    public void mo(float f) {
        this.tvp = f;
    }

    public void mzz(float f) {
        this.jpc = f;
    }

    public void qdl(int i2) {
        this.jl = i2;
    }

    public void to(float f) {
        this.jtx = f;
    }

    public void tvp(float f) {
        this.exu = f;
    }

    public void ud(String str) {
        this.qdl = str;
    }

    public void wd(float f) {
        this.rq = f;
    }

    public void lnr(int i2) {
        this.mo = i2;
    }

    public void mml(int i2) {
        this.to = i2;
    }

    public void mo(int i2) {
        this.yt = i2;
    }

    public void mzz(int i2) {
        this.rdp = i2;
    }

    public void qdl(String str) {
        this.exc = str;
    }

    public void ud(int i2) {
        this.ud = i2;
    }

    public void lnr(String str) {
        this.bjy = str;
    }

    public void qdl(float f) {
        this.lnr = f;
    }

    public void ud(float f) {
        this.mml = f;
    }
}
