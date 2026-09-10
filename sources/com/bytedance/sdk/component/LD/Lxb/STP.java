package com.bytedance.sdk.component.LD.Lxb;

/* JADX INFO: loaded from: classes2.dex */
public class STP {
    public byte[] JXs;
    public String ZU;
    public Lxb lc;
    public QAg lk;

    public enum Lxb {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public STP() {
    }

    public String Lxb() {
        return this.ZU;
    }

    public STP(QAg qAg, String str, Lxb lxb) {
        this.lk = qAg;
        this.ZU = str;
        this.lc = lxb;
    }

    public static STP Lxb(QAg qAg, String str) {
        return new STP(qAg, str, Lxb.STRING_TYPE);
    }

    public static STP Lxb(QAg qAg, byte[] bArr) {
        return new STP(qAg, bArr, Lxb.BYTE_ARRAY_TYPE);
    }

    public STP(QAg qAg, byte[] bArr, Lxb lxb) {
        this.lk = qAg;
        this.JXs = bArr;
        this.lc = lxb;
    }
}
