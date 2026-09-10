package com.bytedance.sdk.component.mo.qdl.qdl;

import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.qdl.ud.wd;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class mo implements mml {
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl exu;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl fs;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl jpc;
    private com.bytedance.sdk.component.mo.qdl.qdl.ud.qdl lnr;
    private com.bytedance.sdk.component.mo.qdl.qdl.ud.ud mml;
    private com.bytedance.sdk.component.mo.qdl.qdl.ud.lnr mo;
    private wd mzz;
    mzz qdl = jpc.wd().mml();
    private Queue<String> rdp;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl rq;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl to;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl tvp;
    private com.bytedance.sdk.component.mo.qdl.qdl.ud.mzz ud;
    private com.bytedance.sdk.component.mo.qdl.qdl.ud.mo wd;

    public mo(Queue<String> queue) {
        this.rdp = queue;
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl()) {
            com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVarFs = jpc.wd().fs();
            this.jpc = qdlVarFs;
            this.ud = new com.bytedance.sdk.component.mo.qdl.qdl.ud.mzz(qdlVarFs, queue);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz()) {
            if (jpc.wd().to() != null) {
                this.to = jpc.wd().to();
            } else {
                this.to = jpc.wd().exu();
            }
            this.mml = new com.bytedance.sdk.component.mo.qdl.qdl.ud.ud(this.to, queue);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.ud()) {
            com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVarExu = jpc.wd().exu();
            this.tvp = qdlVarExu;
            this.lnr = new com.bytedance.sdk.component.mo.qdl.qdl.ud.qdl(qdlVarExu, queue);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr()) {
            com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVarExu2 = jpc.wd().exu();
            this.rq = qdlVarExu2;
            this.mzz = new wd(qdlVarExu2, queue);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mml()) {
            com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVarRdp = jpc.wd().rdp();
            this.fs = qdlVarRdp;
            this.mo = new com.bytedance.sdk.component.mo.qdl.qdl.ud.lnr(qdlVarRdp, queue);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mo()) {
            com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVarBjy = jpc.wd().bjy();
            this.exu = qdlVarBjy;
            this.wd = new com.bytedance.sdk.component.mo.qdl.qdl.ud.mo(qdlVarBjy, queue);
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public void qdl(int i2, long j) {
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, int i2) {
        try {
            byte bMml = qdlVar.mml();
            byte bMzz = qdlVar.mzz();
            if (bMml == 0 && bMzz == 1 && com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl()) {
                this.ud.qdl(qdlVar);
                return;
            }
            if (bMml == 3 && bMzz == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz()) {
                this.mml.qdl(qdlVar);
                return;
            }
            if (bMml == 0 && bMzz == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.ud()) {
                this.lnr.qdl(qdlVar);
                return;
            }
            if (bMml == 1 && bMzz == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr()) {
                this.mzz.qdl(qdlVar);
                return;
            }
            if (bMml == 1 && bMzz == 3 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mml()) {
                this.mo.qdl(qdlVar);
            } else if (bMml == 2 && bMzz == 3 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mo()) {
                this.wd.qdl(qdlVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public void qdl(int i2, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar = list.get(0);
        byte bMzz = qdlVar.mzz();
        byte bMml = qdlVar.mml();
        if (bMml == 0 && bMzz == 1 && com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl()) {
            this.ud.qdl(i2, list);
            return;
        }
        if (bMml == 3 && bMzz == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz()) {
            this.mml.qdl(i2, list);
            return;
        }
        if (bMml == 0 && bMzz == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.ud()) {
            this.lnr.qdl(i2, list);
            return;
        }
        if (bMml == 1 && bMzz == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr()) {
            this.mzz.qdl(i2, list);
            return;
        }
        if (bMml == 1 && bMzz == 3 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mml()) {
            this.mo.qdl(i2, list);
        } else if (bMml == 2 && bMzz == 3 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mo()) {
            this.wd.qdl(i2, list);
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int i2, int i3, List<String> list) {
        List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl;
        List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl2;
        List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl3;
        List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl4;
        List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl5;
        List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl6;
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl() && this.ud.ud(i2, i3) && (listQdl6 = this.ud.qdl(i2, i3)) != null && listQdl6.size() != 0) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.jl(), 1);
            return listQdl6;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz() && this.mml.ud(i2, i3) && (listQdl5 = this.mml.qdl(i2, i3)) != null && listQdl5.size() != 0) {
            return listQdl5;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.ud() && this.lnr.ud(i2, i3) && (listQdl4 = this.lnr.qdl(i2, i3)) != null && listQdl4.size() != 0) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.exc(), 1);
            return listQdl4;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr() && this.mzz.ud(i2, i3) && (listQdl3 = this.mzz.qdl(i2, i3)) != null && listQdl3.size() != 0) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.aaj(), 1);
            return listQdl3;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mml() && this.mo.ud(i2, i3) && (listQdl2 = this.mo.qdl(i2, i3)) != null && listQdl2.size() != 0) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.jyq(), 1);
            return listQdl2;
        }
        if (!com.bytedance.sdk.component.mo.qdl.ud.qdl.mo() || !this.wd.ud(i2, i3) || (listQdl = this.wd.qdl(i2, i3)) == null || listQdl.size() == 0) {
            return null;
        }
        return listQdl;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public boolean qdl(int i2, boolean z2) {
        com.bytedance.sdk.component.mo.qdl.qdl.ud.mo moVar;
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar;
        com.bytedance.sdk.component.mo.qdl.qdl.ud.lnr lnrVar;
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar2;
        wd wdVar;
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar3;
        com.bytedance.sdk.component.mo.qdl.qdl.ud.qdl qdlVar4;
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar5;
        com.bytedance.sdk.component.mo.qdl.qdl.ud.ud udVar;
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar6;
        com.bytedance.sdk.component.mo.qdl.qdl.ud.mzz mzzVar;
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar7;
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl() && (mzzVar = this.ud) != null && (qdlVar7 = this.jpc) != null && mzzVar.ud(i2, qdlVar7.qdl())) {
            return true;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz() && (udVar = this.mml) != null && (qdlVar6 = this.to) != null && udVar.ud(i2, qdlVar6.qdl())) {
            return true;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.ud() && (qdlVar4 = this.lnr) != null && (qdlVar5 = this.tvp) != null && qdlVar4.ud(i2, qdlVar5.qdl())) {
            return true;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr() && (wdVar = this.mzz) != null && (qdlVar3 = this.rq) != null && wdVar.ud(i2, qdlVar3.qdl())) {
            return true;
        }
        if (!com.bytedance.sdk.component.mo.qdl.ud.qdl.mml() || (lnrVar = this.mo) == null || (qdlVar2 = this.fs) == null || !lnrVar.ud(i2, qdlVar2.qdl())) {
            return com.bytedance.sdk.component.mo.qdl.ud.qdl.mo() && (moVar = this.wd) != null && (qdlVar = this.exu) != null && moVar.ud(i2, qdlVar.qdl());
        }
        return true;
    }
}
