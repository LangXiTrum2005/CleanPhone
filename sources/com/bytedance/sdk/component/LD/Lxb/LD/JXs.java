package com.bytedance.sdk.component.LD.Lxb.LD;

/* JADX INFO: loaded from: classes2.dex */
final class JXs {
    boolean JXs;
    int LD;
    final byte[] Lxb;
    boolean ZU;
    JXs ebl;
    JXs lc;
    int lk;

    public JXs() {
        this.Lxb = new byte[8192];
        this.JXs = true;
        this.ZU = false;
    }

    public final JXs LD() {
        JXs jXs = this.lc;
        JXs jXs2 = jXs != this ? jXs : null;
        JXs jXs3 = this.ebl;
        if (jXs3 != null) {
            jXs3.lc = jXs;
        }
        JXs jXs4 = this.lc;
        if (jXs4 != null) {
            jXs4.ebl = jXs3;
        }
        this.lc = null;
        this.ebl = null;
        return jXs2;
    }

    public final JXs Lxb() {
        this.ZU = true;
        return new JXs(this.Lxb, this.LD, this.lk, true, false);
    }

    public final JXs Lxb(JXs jXs) {
        jXs.ebl = this;
        jXs.lc = this.lc;
        this.lc.ebl = jXs;
        this.lc = jXs;
        return jXs;
    }

    public JXs(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.Lxb = bArr;
        this.LD = i;
        this.lk = i2;
        this.ZU = z;
        this.JXs = z2;
    }
}
