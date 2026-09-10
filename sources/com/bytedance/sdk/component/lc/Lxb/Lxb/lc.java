package com.bytedance.sdk.component.lc.Lxb.Lxb;

import com.bytedance.sdk.component.lc.Lxb.Lxb.LD.ebl;
import com.bytedance.sdk.component.lc.Lxb.OY;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class lc implements ZU {
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb JVA;
    private ebl JXs;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.LD.JXs LD;
    JXs Lxb = OY.ebl().ZU();
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb NXR;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb OY;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb QAg;
    private Queue<String> STP;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.LD.LD ZU;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.LD.lc ebl;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.LD.lk lc;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.LD.Lxb lk;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb nBu;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb sLN;

    public lc(Queue<String> queue) {
        this.STP = queue;
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbSLN = OY.ebl().sLN();
            this.OY = lxbSLN;
            this.LD = new com.bytedance.sdk.component.lc.Lxb.Lxb.LD.JXs(lxbSLN, queue);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs()) {
            if (OY.ebl().nBu() != null) {
                this.nBu = OY.ebl().nBu();
            } else {
                this.nBu = OY.ebl().NXR();
            }
            this.ZU = new com.bytedance.sdk.component.lc.Lxb.Lxb.LD.LD(this.nBu, queue);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbNXR = OY.ebl().NXR();
            this.QAg = lxbNXR;
            this.lk = new com.bytedance.sdk.component.lc.Lxb.Lxb.LD.Lxb(lxbNXR, queue);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbNXR2 = OY.ebl().NXR();
            this.JVA = lxbNXR2;
            this.JXs = new ebl(lxbNXR2, queue);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbSTP = OY.ebl().STP();
            this.sLN = lxbSTP;
            this.lc = new com.bytedance.sdk.component.lc.Lxb.Lxb.LD.lk(lxbSTP, queue);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbIeN = OY.ebl().IeN();
            this.NXR = lxbIeN;
            this.ebl = new com.bytedance.sdk.component.lc.Lxb.Lxb.LD.lc(lxbIeN, queue);
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public void Lxb(int i, long j) {
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, int i) {
        try {
            byte bZU = lxb.ZU();
            byte bJXs = lxb.JXs();
            if (bZU == 0 && bJXs == 1 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb()) {
                this.LD.Lxb(lxb);
                return;
            }
            if (bZU == 3 && bJXs == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs()) {
                this.ZU.Lxb(lxb);
                return;
            }
            if (bZU == 0 && bJXs == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD()) {
                this.lk.Lxb(lxb);
                return;
            }
            if (bZU == 1 && bJXs == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk()) {
                this.JXs.Lxb(lxb);
                return;
            }
            if (bZU == 1 && bJXs == 3 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU()) {
                this.lc.Lxb(lxb);
            } else if (bZU == 2 && bJXs == 3 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc()) {
                this.ebl.Lxb(lxb);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public void Lxb(int i, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb = list.get(0);
        byte bJXs = lxb.JXs();
        byte bZU = lxb.ZU();
        if (bZU == 0 && bJXs == 1 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb()) {
            this.LD.Lxb(i, list);
            return;
        }
        if (bZU == 3 && bJXs == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs()) {
            this.ZU.Lxb(i, list);
            return;
        }
        if (bZU == 0 && bJXs == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD()) {
            this.lk.Lxb(i, list);
            return;
        }
        if (bZU == 1 && bJXs == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk()) {
            this.JXs.Lxb(i, list);
            return;
        }
        if (bZU == 1 && bJXs == 3 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU()) {
            this.lc.Lxb(i, list);
        } else if (bZU == 2 && bJXs == 3 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc()) {
            this.ebl.Lxb(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> Lxb(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb;
        List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb2;
        List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb3;
        List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb4;
        List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb5;
        List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb6;
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb() && this.LD.LD(i, i2) && (listLxb6 = this.LD.Lxb(i, i2)) != null && listLxb6.size() != 0) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.brP(), 1);
            return listLxb6;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs() && this.ZU.LD(i, i2) && (listLxb5 = this.ZU.Lxb(i, i2)) != null && listLxb5.size() != 0) {
            return listLxb5;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD() && this.lk.LD(i, i2) && (listLxb4 = this.lk.Lxb(i, i2)) != null && listLxb4.size() != 0) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.tD(), 1);
            return listLxb4;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk() && this.JXs.LD(i, i2) && (listLxb3 = this.JXs.Lxb(i, i2)) != null && listLxb3.size() != 0) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.DY(), 1);
            return listLxb3;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU() && this.lc.LD(i, i2) && (listLxb2 = this.lc.Lxb(i, i2)) != null && listLxb2.size() != 0) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.Sfi(), 1);
            return listLxb2;
        }
        if (!com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc() || !this.ebl.LD(i, i2) || (listLxb = this.ebl.Lxb(i, i2)) == null || listLxb.size() == 0) {
            return null;
        }
        return listLxb;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public boolean Lxb(int i, boolean z) {
        com.bytedance.sdk.component.lc.Lxb.Lxb.LD.lc lcVar;
        com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb;
        com.bytedance.sdk.component.lc.Lxb.Lxb.LD.lk lkVar;
        com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb2;
        ebl eblVar;
        com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb3;
        com.bytedance.sdk.component.lc.Lxb.Lxb.LD.Lxb lxb4;
        com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb5;
        com.bytedance.sdk.component.lc.Lxb.Lxb.LD.LD ld;
        com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb6;
        com.bytedance.sdk.component.lc.Lxb.Lxb.LD.JXs jXs;
        com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb7;
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb() && (jXs = this.LD) != null && (lxb7 = this.OY) != null && jXs.LD(i, lxb7.Lxb())) {
            return true;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs() && (ld = this.ZU) != null && (lxb6 = this.nBu) != null && ld.LD(i, lxb6.Lxb())) {
            return true;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD() && (lxb4 = this.lk) != null && (lxb5 = this.QAg) != null && lxb4.LD(i, lxb5.Lxb())) {
            return true;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk() && (eblVar = this.JXs) != null && (lxb3 = this.JVA) != null && eblVar.LD(i, lxb3.Lxb())) {
            return true;
        }
        if (!com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU() || (lkVar = this.lc) == null || (lxb2 = this.sLN) == null || !lkVar.LD(i, lxb2.Lxb())) {
            return com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc() && (lcVar = this.ebl) != null && (lxb = this.NXR) != null && lcVar.LD(i, lxb.Lxb());
        }
        return true;
    }
}
