package com.bytedance.sdk.component.OY.lk.Lxb;

import android.text.TextUtils;
import com.bytedance.sdk.component.OY.lk.LD;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private long JXs;
    private int LD = 0;
    private String Lxb;
    private long ZU;
    private long lc;
    private long lk;

    public long JXs() {
        return this.JXs;
    }

    public int LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public long ZU() {
        return this.ZU;
    }

    public long lc() {
        return this.lc;
    }

    public long lk() {
        return this.lk;
    }

    public String toString() {
        return this.Lxb + " times=" + this.LD + ",waitMaxTime=" + this.JXs + ",runMaxTime=" + this.lc + ",runTotalTime=" + this.ZU + ",waitTotalTime=" + this.lk;
    }

    public void Lxb(LD ld) {
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(this.Lxb)) {
                    this.Lxb = ld.LD();
                }
                this.lk += ld.lc();
                this.ZU += ld.ebl();
                this.JXs = Math.max(this.JXs, ld.lc());
                this.lc = Math.max(this.lc, ld.ebl());
                this.LD++;
            } catch (Throwable th) {
                throw th;
            }
        }
        ld.lc();
        ld.ebl();
        toString();
    }
}
