package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class jl implements exu, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private final boolean lnr;
    private final com.bytedance.adsdk.ud.tvp mml;
    private boolean mo;
    private final com.bytedance.adsdk.ud.qdl.ud.exu mzz;
    private final String ud;
    private final Path qdl = new Path();
    private final ud wd = new ud();

    public jl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.yt ytVar) {
        this.ud = ytVar.qdl();
        this.lnr = ytVar.lnr();
        this.mml = tvpVar;
        com.bytedance.adsdk.ud.qdl.ud.exu exuVarQdl = ytVar.ud().qdl();
        this.mzz = exuVarQdl;
        qdlVar.qdl(exuVarQdl);
        exuVarQdl.qdl(this);
    }

    private void ud() {
        this.mo = false;
        this.mml.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        if (this.mo) {
            return this.qdl;
        }
        this.qdl.reset();
        if (this.lnr) {
            this.mo = true;
            return this.qdl;
        }
        Path pathWd = this.mzz.wd();
        if (pathWd == null) {
            return this.qdl;
        }
        this.qdl.set(pathWd);
        this.qdl.setFillType(Path.FillType.EVEN_ODD);
        this.wd.qdl(this.qdl);
        this.mo = true;
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        ud();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            lnr lnrVar = list.get(i2);
            if (lnrVar instanceof jyq) {
                jyq jyqVar = (jyq) lnrVar;
                if (jyqVar.ud() == com.bytedance.adsdk.ud.lnr.ud.exc.qdl.SIMULTANEOUSLY) {
                    this.wd.qdl(jyqVar);
                    jyqVar.qdl(this);
                } else if (!(lnrVar instanceof exc)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((exc) lnrVar);
                }
            } else if (!(lnrVar instanceof exc)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((exc) lnrVar);
            }
        }
        this.mzz.qdl((List<exc>) arrayList);
    }
}
