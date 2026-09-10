package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nr implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, aw {
    private boolean di;
    private final com.bytedance.adsdk.lr.ri.lr.aw fi;
    private final boolean ik;
    private final com.bytedance.adsdk.lr.jbs ka;
    private final String lr;
    private final Path ri = new Path();
    private final lr xha = new lr();

    public nr(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.bu buVar) {
        this.lr = buVar.ri();
        this.ik = buVar.ik();
        this.ka = jbsVar;
        com.bytedance.adsdk.lr.ri.lr.aw awVarRi = buVar.lr().ri();
        this.fi = awVarRi;
        riVar.ri(awVarRi);
        awVarRi.ri(this);
    }

    private void lr() {
        this.di = false;
        this.ka.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.aw
    public Path ka() {
        if (this.di) {
            return this.ri;
        }
        this.ri.reset();
        if (this.ik) {
            this.di = true;
            return this.ri;
        }
        Path pathXha = this.fi.xha();
        if (pathXha == null) {
            return this.ri;
        }
        this.ri.set(pathXha);
        this.ri.setFillType(Path.FillType.EVEN_ODD);
        this.xha.ri(this.ri);
        this.di = true;
        return this.ri;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        lr();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            ik ikVar = list.get(i);
            if (ikVar instanceof ihz) {
                ihz ihzVar = (ihz) ikVar;
                if (ihzVar.lr() == com.bytedance.adsdk.lr.ik.lr.tan.ri.SIMULTANEOUSLY) {
                    this.xha.ri(ihzVar);
                    ihzVar.ri(this);
                } else if (!(ikVar instanceof tan)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((tan) ikVar);
                }
            } else if (!(ikVar instanceof tan)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((tan) ikVar);
            }
        }
        this.fi.ri((List<tan>) arrayList);
    }
}
