package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class brP implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, NXR {
    private final com.bytedance.adsdk.LD.Lxb.LD.NXR JXs;
    private final String LD;
    private final com.bytedance.adsdk.LD.QAg ZU;
    private boolean lc;
    private final boolean lk;
    private final Path Lxb = new Path();
    private final LD ebl = new LD();

    public brP(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.kqm kqmVar) {
        this.LD = kqmVar.Lxb();
        this.lk = kqmVar.lk();
        this.ZU = qAg;
        com.bytedance.adsdk.LD.Lxb.LD.NXR nxrLxb = kqmVar.LD().Lxb();
        this.JXs = nxrLxb;
        lxb.Lxb(nxrLxb);
        nxrLxb.Lxb(this);
    }

    private void LD() {
        this.lc = false;
        this.ZU.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        LD();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.NXR
    public Path ZU() {
        if (this.lc) {
            return this.Lxb;
        }
        this.Lxb.reset();
        if (this.lk) {
            this.lc = true;
            return this.Lxb;
        }
        Path pathEbl = this.JXs.ebl();
        if (pathEbl == null) {
            return this.Lxb;
        }
        this.Lxb.set(pathEbl);
        this.Lxb.setFillType(Path.FillType.EVEN_ODD);
        this.ebl.Lxb(this.Lxb);
        this.lc = true;
        return this.Lxb;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            lk lkVar = list.get(i);
            if (lkVar instanceof Sfi) {
                Sfi sfi = (Sfi) lkVar;
                if (sfi.LD() == com.bytedance.adsdk.LD.lk.LD.tD.Lxb.SIMULTANEOUSLY) {
                    this.ebl.Lxb(sfi);
                    sfi.Lxb(this);
                } else if (!(lkVar instanceof tD)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((tD) lkVar);
                }
            } else if (!(lkVar instanceof tD)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((tD) lkVar);
            }
        }
        this.JXs.Lxb((List<tD>) arrayList);
    }
}
