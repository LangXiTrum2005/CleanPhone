package com.bytedance.sdk.component.lc.Lxb;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private static OY NXR;
    private static volatile com.bytedance.sdk.component.lc.Lxb.JXs.Lxb nBu;
    private long IeN;
    private volatile com.bytedance.sdk.component.lc.Lxb.LD.lk JVA;
    private volatile com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb JXs;
    private volatile com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb LD;
    private volatile Context Lxb;
    private volatile boolean OY;
    private volatile JXs QAg;
    private final AtomicBoolean STP = new AtomicBoolean(false);
    private volatile com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb ZU;
    private volatile com.bytedance.sdk.component.lc.Lxb.Lxb.JXs ebl;
    private volatile com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lc;
    private volatile com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lk;
    private volatile Map<Integer, com.bytedance.sdk.component.lc.Lxb.LD.lk> sLN;

    private OY() {
    }

    public static com.bytedance.sdk.component.lc.Lxb.JXs.Lxb JXs() {
        if (nBu == null) {
            synchronized (OY.class) {
                try {
                    if (nBu == null) {
                        nBu = new com.bytedance.sdk.component.lc.Lxb.JXs.LD();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nBu;
    }

    public static synchronized OY ebl() {
        try {
            if (NXR == null) {
                NXR = new OY();
            }
        } catch (Throwable th) {
            throw th;
        }
        return NXR;
    }

    public com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb IeN() {
        return this.JXs;
    }

    public void JVA() {
        com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.lk();
    }

    public boolean LD() {
        return this.OY;
    }

    public boolean Lxb() {
        return this.STP.get();
    }

    public com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb NXR() {
        return this.lk;
    }

    public com.bytedance.sdk.component.lc.Lxb.LD.lk OY() {
        return this.JVA;
    }

    public void QAg() {
        com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.LD();
    }

    public com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb STP() {
        return this.ZU;
    }

    public JXs VVE() {
        return this.QAg;
    }

    public com.bytedance.sdk.component.lc.Lxb.Lxb.JXs ZU() {
        return this.ebl;
    }

    public long kqm() {
        return this.IeN * 86400000;
    }

    public Context lc() {
        return this.Lxb;
    }

    public Map<Integer, com.bytedance.sdk.component.lc.Lxb.LD.lk> lk() {
        return this.sLN;
    }

    public com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb nBu() {
        return this.lc;
    }

    public com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb sLN() {
        return this.LD;
    }

    public void LD(boolean z) {
        this.OY = z;
    }

    public void Lxb(boolean z) {
        this.STP.set(z);
    }

    public void ZU(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        this.ZU = lxb;
    }

    public void lk(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        this.lk = lxb;
    }

    public void LD(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        this.LD = lxb;
    }

    public void Lxb(com.bytedance.sdk.component.lc.Lxb.Lxb.JXs jXs) {
        this.ebl = jXs;
    }

    public void Lxb(Context context) {
        this.Lxb = context;
    }

    public void Lxb(com.bytedance.sdk.component.lc.Lxb.LD.lk lkVar) {
        this.JVA = lkVar;
    }

    public void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        this.lc = lxb;
    }

    public void JXs(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        this.JXs = lxb;
    }

    public void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null) {
            return;
        }
        lxb.Lxb(System.currentTimeMillis());
        com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.Lxb(lxb, lxb.ZU());
    }

    public void Lxb(String str, boolean z) {
        com.bytedance.sdk.component.lc.Lxb.lc.Lxb.Lxb().Lxb(str, z);
    }

    public void Lxb(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.lc.Lxb.lc.Lxb.Lxb().Lxb(str, list, z, map, i, str2);
    }

    public void Lxb(JXs jXs) {
        this.QAg = jXs;
    }

    public void Lxb(long j) {
        this.IeN = j;
    }
}
