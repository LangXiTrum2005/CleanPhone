package com.bytedance.sdk.openadsdk.STP.Lxb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.LD.Lxb.STP;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    public static int Lxb = -10;
    private long JXs;
    private final int LD;
    private boolean OY;
    private String QAg;
    private long ZU;
    private int ebl;
    private int lc;
    private String lk;
    private int nBu;

    public JXs(int i) {
        this.LD = i;
    }

    public static void lk() {
    }

    public JXs LD(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.lc = bytes.length;
        }
        return this;
    }

    public JXs Lxb(String str) {
        this.lk = str;
        return this;
    }

    public JXs ZU(String str) {
        this.QAg = str;
        return this;
    }

    public JXs Lxb(STP stp) {
        byte[] bArr;
        if (stp != null) {
            if (stp.lc == STP.Lxb.STRING_TYPE && !TextUtils.isEmpty(stp.Lxb())) {
                this.lc = stp.Lxb().getBytes().length;
            }
            if (stp.lc == STP.Lxb.BYTE_ARRAY_TYPE && (bArr = stp.JXs) != null) {
                this.lc = bArr.length;
            }
        }
        return this;
    }

    public JXs lk(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.ebl = bytes.length;
        }
        return this;
    }

    public void LD() {
        this.JXs = SystemClock.elapsedRealtime() - this.ZU;
    }

    public void Lxb() {
        this.ZU = SystemClock.elapsedRealtime();
    }

    public JXs Lxb(int i) {
        this.nBu = i;
        return this;
    }

    public JXs Lxb(boolean z) {
        this.OY = z;
        return this;
    }
}
