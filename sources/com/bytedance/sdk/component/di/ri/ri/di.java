package com.bytedance.sdk.component.di.ri.ri;

import com.bytedance.sdk.component.di.ri.ri.lr.xha;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class di implements ka {
    private com.bytedance.sdk.component.di.ri.ka.lr.ri aw;
    private Queue<String> bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.component.di.ri.ka.lr.ri f18049co;
    private com.bytedance.sdk.component.di.ri.ri.lr.ik di;
    private xha fi;
    private com.bytedance.sdk.component.di.ri.ri.lr.ri ik;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri jbs;
    private com.bytedance.sdk.component.di.ri.ri.lr.lr ka;
    private com.bytedance.sdk.component.di.ri.ri.lr.fi lr;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri mj;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri qt;
    fi ri = com.bytedance.sdk.component.di.ri.xha.di().ik();
    private com.bytedance.sdk.component.di.ri.ka.lr.ri sf;
    private com.bytedance.sdk.component.di.ri.ri.lr.di xha;

    public di(Queue<String> queue) {
        this.bgr = queue;
        if (com.bytedance.sdk.component.di.ri.lr.ri.ri()) {
            com.bytedance.sdk.component.di.ri.ka.lr.ri riVarSf = com.bytedance.sdk.component.di.ri.xha.di().sf();
            this.mj = riVarSf;
            this.lr = new com.bytedance.sdk.component.di.ri.ri.lr.fi(riVarSf, queue);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.fi()) {
            if (com.bytedance.sdk.component.di.ri.xha.di().jbs() != null) {
                this.qt = com.bytedance.sdk.component.di.ri.xha.di().jbs();
            } else {
                this.qt = com.bytedance.sdk.component.di.ri.xha.di().co();
            }
            this.ka = new com.bytedance.sdk.component.di.ri.ri.lr.lr(this.qt, queue);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.lr()) {
            com.bytedance.sdk.component.di.ri.ka.lr.ri riVarCo = com.bytedance.sdk.component.di.ri.xha.di().co();
            this.jbs = riVarCo;
            this.ik = new com.bytedance.sdk.component.di.ri.ri.lr.ri(riVarCo, queue);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ik()) {
            com.bytedance.sdk.component.di.ri.ka.lr.ri riVarCo2 = com.bytedance.sdk.component.di.ri.xha.di().co();
            this.sf = riVarCo2;
            this.fi = new xha(riVarCo2, queue);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ka()) {
            com.bytedance.sdk.component.di.ri.ka.lr.ri riVarAw = com.bytedance.sdk.component.di.ri.xha.di().aw();
            this.f18049co = riVarAw;
            this.di = new com.bytedance.sdk.component.di.ri.ri.lr.ik(riVarAw, queue);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.di()) {
            com.bytedance.sdk.component.di.ri.ka.lr.ri riVarBgr = com.bytedance.sdk.component.di.ri.xha.di().bgr();
            this.aw = riVarBgr;
            this.xha = new com.bytedance.sdk.component.di.ri.ri.lr.di(riVarBgr, queue);
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public void ri(int i, long j) {
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar, int i) {
        try {
            byte bKa = riVar.ka();
            byte bFi = riVar.fi();
            if (bKa == 0 && bFi == 1 && com.bytedance.sdk.component.di.ri.lr.ri.ri()) {
                this.lr.ri(riVar);
                return;
            }
            if (bKa == 3 && bFi == 2 && com.bytedance.sdk.component.di.ri.lr.ri.fi()) {
                this.ka.ri(riVar);
                return;
            }
            if (bKa == 0 && bFi == 2 && com.bytedance.sdk.component.di.ri.lr.ri.lr()) {
                this.ik.ri(riVar);
                return;
            }
            if (bKa == 1 && bFi == 2 && com.bytedance.sdk.component.di.ri.lr.ri.ik()) {
                this.fi.ri(riVar);
                return;
            }
            if (bKa == 1 && bFi == 3 && com.bytedance.sdk.component.di.ri.lr.ri.ka()) {
                this.di.ri(riVar);
            } else if (bKa == 2 && bFi == 3 && com.bytedance.sdk.component.di.ri.lr.ri.di()) {
                this.xha.ri(riVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public void ri(int i, List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.di.ri.ka.ri riVar = list.get(0);
        byte bFi = riVar.fi();
        byte bKa = riVar.ka();
        if (bKa == 0 && bFi == 1 && com.bytedance.sdk.component.di.ri.lr.ri.ri()) {
            this.lr.ri(i, list);
            return;
        }
        if (bKa == 3 && bFi == 2 && com.bytedance.sdk.component.di.ri.lr.ri.fi()) {
            this.ka.ri(i, list);
            return;
        }
        if (bKa == 0 && bFi == 2 && com.bytedance.sdk.component.di.ri.lr.ri.lr()) {
            this.ik.ri(i, list);
            return;
        }
        if (bKa == 1 && bFi == 2 && com.bytedance.sdk.component.di.ri.lr.ri.ik()) {
            this.fi.ri(i, list);
            return;
        }
        if (bKa == 1 && bFi == 3 && com.bytedance.sdk.component.di.ri.lr.ri.ka()) {
            this.di.ri(i, list);
        } else if (bKa == 2 && bFi == 3 && com.bytedance.sdk.component.di.ri.lr.ri.di()) {
            this.xha.ri(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public List<com.bytedance.sdk.component.di.ri.ka.ri> ri(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.di.ri.ka.ri> listRi;
        List<com.bytedance.sdk.component.di.ri.ka.ri> listRi2;
        List<com.bytedance.sdk.component.di.ri.ka.ri> listRi3;
        List<com.bytedance.sdk.component.di.ri.ka.ri> listRi4;
        List<com.bytedance.sdk.component.di.ri.ka.ri> listRi5;
        List<com.bytedance.sdk.component.di.ri.ka.ri> listRi6;
        if (com.bytedance.sdk.component.di.ri.lr.ri.ri() && this.lr.lr(i, i2) && (listRi6 = this.lr.ri(i, i2)) != null && listRi6.size() != 0) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.nr(), 1);
            return listRi6;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.fi() && this.ka.lr(i, i2) && (listRi5 = this.ka.ri(i, i2)) != null && listRi5.size() != 0) {
            return listRi5;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.lr() && this.ik.lr(i, i2) && (listRi4 = this.ik.ri(i, i2)) != null && listRi4.size() != 0) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.tan(), 1);
            return listRi4;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ik() && this.fi.lr(i, i2) && (listRi3 = this.fi.ri(i, i2)) != null && listRi3.size() != 0) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.ac(), 1);
            return listRi3;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ka() && this.di.lr(i, i2) && (listRi2 = this.di.ri(i, i2)) != null && listRi2.size() != 0) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.ihz(), 1);
            return listRi2;
        }
        if (!com.bytedance.sdk.component.di.ri.lr.ri.di() || !this.xha.lr(i, i2) || (listRi = this.xha.ri(i, i2)) == null || listRi.size() == 0) {
            return null;
        }
        return listRi;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public boolean ri(int i, boolean z) {
        com.bytedance.sdk.component.di.ri.ri.lr.di diVar;
        com.bytedance.sdk.component.di.ri.ka.lr.ri riVar;
        com.bytedance.sdk.component.di.ri.ri.lr.ik ikVar;
        com.bytedance.sdk.component.di.ri.ka.lr.ri riVar2;
        xha xhaVar;
        com.bytedance.sdk.component.di.ri.ka.lr.ri riVar3;
        com.bytedance.sdk.component.di.ri.ri.lr.ri riVar4;
        com.bytedance.sdk.component.di.ri.ka.lr.ri riVar5;
        com.bytedance.sdk.component.di.ri.ri.lr.lr lrVar;
        com.bytedance.sdk.component.di.ri.ka.lr.ri riVar6;
        com.bytedance.sdk.component.di.ri.ri.lr.fi fiVar;
        com.bytedance.sdk.component.di.ri.ka.lr.ri riVar7;
        if (com.bytedance.sdk.component.di.ri.lr.ri.ri() && (fiVar = this.lr) != null && (riVar7 = this.mj) != null && fiVar.lr(i, riVar7.ri())) {
            return true;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.fi() && (lrVar = this.ka) != null && (riVar6 = this.qt) != null && lrVar.lr(i, riVar6.ri())) {
            return true;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.lr() && (riVar4 = this.ik) != null && (riVar5 = this.jbs) != null && riVar4.lr(i, riVar5.ri())) {
            return true;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ik() && (xhaVar = this.fi) != null && (riVar3 = this.sf) != null && xhaVar.lr(i, riVar3.ri())) {
            return true;
        }
        if (!com.bytedance.sdk.component.di.ri.lr.ri.ka() || (ikVar = this.di) == null || (riVar2 = this.f18049co) == null || !ikVar.lr(i, riVar2.ri())) {
            return com.bytedance.sdk.component.di.ri.lr.ri.di() && (diVar = this.xha) != null && (riVar = this.aw) != null && diVar.lr(i, riVar.ri());
        }
        return true;
    }
}
