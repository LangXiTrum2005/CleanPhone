package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ZU.lc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ZU {
    private static volatile ZU Lxb;
    private com.bytedance.adsdk.ugeno.lk.Lxb JXs;
    private List<com.bytedance.adsdk.ugeno.core.LD> LD;
    private Lxb ZU;
    private com.bytedance.adsdk.ugeno.core.LD.lk lc;
    private com.bytedance.adsdk.ugeno.core.lk lk;

    private ZU() {
    }

    private void JXs() {
        ArrayList arrayList = new ArrayList();
        this.LD = arrayList;
        com.bytedance.adsdk.ugeno.core.lk lkVar = this.lk;
        if (lkVar != null) {
            arrayList.addAll(lkVar.Lxb());
        }
        com.bytedance.adsdk.ugeno.core.ZU.Lxb(this.LD);
    }

    public static ZU Lxb() {
        if (Lxb == null) {
            synchronized (ZU.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new ZU();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public Lxb LD() {
        return this.ZU;
    }

    public com.bytedance.adsdk.ugeno.core.LD.lk ZU() {
        return this.lc;
    }

    public com.bytedance.adsdk.ugeno.lk.Lxb lk() {
        return this.JXs;
    }

    public void Lxb(Context context, com.bytedance.adsdk.ugeno.core.lk lkVar, Lxb lxb) {
        this.lk = lkVar;
        this.ZU = lxb;
        JXs();
    }

    public void Lxb(com.bytedance.adsdk.ugeno.lk.Lxb lxb) {
        this.JXs = lxb;
    }

    public void Lxb(com.bytedance.adsdk.ugeno.ZU.ZU zu) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.ZU.Lxb().Lxb());
        if (zu != null) {
            arrayList.addAll(zu.Lxb());
        }
        lc.Lxb(arrayList);
    }
}
