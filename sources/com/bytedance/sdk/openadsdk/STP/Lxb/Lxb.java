package com.bytedance.sdk.openadsdk.STP.Lxb;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    String IeN;
    float JVA;
    float JXs;
    int LD;
    String Lxb;
    float NXR;
    float OY;
    float QAg;
    int STP;
    float VVE;
    float ZU;
    float ebl;
    int kqm;
    int lc;
    float lk;
    int nBu;
    float sLN;
    int brP = -1;
    String tD = "";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.STP.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0076Lxb {
        Lxb Lxb = new Lxb();

        public C0076Lxb JXs(float f) {
            this.Lxb.JXs(f);
            return this;
        }

        public C0076Lxb LD(float f) {
            this.Lxb.LD(f);
            return this;
        }

        public C0076Lxb Lxb(String str) {
            this.Lxb.LD(str);
            return this;
        }

        public C0076Lxb OY(float f) {
            this.Lxb.OY(f);
            return this;
        }

        public C0076Lxb QAg(float f) {
            this.Lxb.QAg(f);
            return this;
        }

        public C0076Lxb ZU(float f) {
            this.Lxb.ZU(f);
            return this;
        }

        public C0076Lxb ebl(float f) {
            this.Lxb.ebl(f);
            return this;
        }

        public C0076Lxb lc(float f) {
            this.Lxb.lc(f);
            return this;
        }

        public C0076Lxb lk(float f) {
            this.Lxb.lk(f);
            return this;
        }

        public C0076Lxb nBu(float f) {
            this.Lxb.nBu(f);
            return this;
        }

        public C0076Lxb LD(int i) {
            this.Lxb.JXs(i);
            return this;
        }

        public C0076Lxb Lxb(int i) {
            this.Lxb.LD(i);
            return this;
        }

        public C0076Lxb lk(int i) {
            this.Lxb.lc(i);
            return this;
        }

        public C0076Lxb LD(String str) {
            this.Lxb.lk(str);
            return this;
        }

        public C0076Lxb Lxb(float f) {
            this.Lxb.Lxb(f);
            return this;
        }

        public Lxb Lxb() {
            return this.Lxb;
        }
    }

    public BigDecimal IeN() {
        return new BigDecimal(this.NXR).setScale(3, RoundingMode.HALF_UP);
    }

    public float JVA() {
        return this.QAg;
    }

    public float JXs() {
        return this.lk;
    }

    public String LD() {
        return this.tD;
    }

    public int Lxb() {
        return this.brP;
    }

    public float NXR() {
        return this.JVA;
    }

    public int OY() {
        return this.lc;
    }

    public float QAg() {
        return this.ebl;
    }

    public float STP() {
        return this.sLN;
    }

    public int VVE() {
        return this.STP;
    }

    public int ZU() {
        return this.LD;
    }

    public float brP() {
        return this.VVE;
    }

    public float ebl() {
        return this.JXs;
    }

    public String kqm() {
        return this.IeN;
    }

    public float lc() {
        return this.ZU;
    }

    public String lk() {
        return this.Lxb;
    }

    public float nBu() {
        return this.OY;
    }

    public int sLN() {
        return this.nBu;
    }

    public int tD() {
        return this.kqm;
    }

    public void JXs(float f) {
        this.OY = f;
    }

    public void LD(String str) {
        this.Lxb = str;
    }

    public void Lxb(int i) {
        this.brP = i;
    }

    public void OY(float f) {
        this.sLN = f;
    }

    public void QAg(float f) {
        this.NXR = f;
    }

    public void ZU(float f) {
        this.ebl = f;
    }

    public void ebl(float f) {
        this.JVA = f;
    }

    public void lc(float f) {
        this.QAg = f;
    }

    public void lk(float f) {
        this.JXs = f;
    }

    public void nBu(float f) {
        this.VVE = f;
    }

    public void JXs(int i) {
        this.STP = i;
    }

    public void LD(int i) {
        this.LD = i;
    }

    public void Lxb(String str) {
        this.tD = str;
    }

    public void ZU(int i) {
        this.nBu = i;
    }

    public void lc(int i) {
        this.kqm = i;
    }

    public void lk(int i) {
        this.lc = i;
    }

    public void LD(float f) {
        this.ZU = f;
    }

    public void Lxb(float f) {
        this.lk = f;
    }

    public void lk(String str) {
        this.IeN = str;
    }
}
