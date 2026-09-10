package com.bytedance.sdk.component.lc.Lxb.Lxb;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ebl;
import com.bytedance.sdk.component.lc.Lxb.OY;
import com.umeng.analytics.pro.bg;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements ZU {
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb JVA;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lc JXs;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.Lxb LD;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ZU Lxb;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb OY;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb QAg;
    private ebl ZU;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb ebl;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.JXs lc;
    private com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.LD lk;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb nBu;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb sLN;

    public lk() {
        Context contextLc = OY.ebl().lc();
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbSLN = OY.ebl().sLN();
            this.ebl = lxbSLN;
            this.Lxb = new com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ZU(contextLc, lxbSLN);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs()) {
            if (OY.ebl().nBu() != null) {
                this.QAg = OY.ebl().nBu();
            } else {
                this.QAg = OY.ebl().NXR();
            }
            this.lk = new com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.LD(contextLc, this.QAg);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbNXR = OY.ebl().NXR();
            this.OY = lxbNXR;
            this.LD = new com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.Lxb(contextLc, lxbNXR);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbNXR2 = OY.ebl().NXR();
            this.nBu = lxbNXR2;
            this.ZU = new ebl(contextLc, lxbNXR2);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbSTP = OY.ebl().STP();
            this.JVA = lxbSTP;
            this.JXs = new com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lc(contextLc, lxbSTP);
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc()) {
            com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxbIeN = OY.ebl().IeN();
            this.sLN = lxbIeN;
            this.lc = new com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.JXs(contextLc, lxbIeN);
        }
    }

    public List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> LD(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, int i) {
        if (lxb.ZU() == 0 && lxb.JXs() == 1 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb()) {
            if (this.ebl.LD() <= i) {
                return null;
            }
            List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb = this.Lxb.Lxb(this.ebl.LD() - i, bg.d);
            if (listLxb != null && listLxb.size() != 0) {
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.foI(), 1);
            }
            return listLxb;
        }
        if (lxb.ZU() == 3 && lxb.JXs() == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs()) {
            if (this.QAg.LD() > i) {
                return this.lk.Lxb(this.QAg.LD() - i, bg.d);
            }
        } else if (lxb.ZU() == 0 && lxb.JXs() == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD()) {
            if (this.OY.LD() > i) {
                List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb2 = this.LD.Lxb(this.OY.LD() - i, bg.d);
                if (listLxb2 != null && listLxb2.size() != 0) {
                    com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.KPU(), 1);
                }
                return listLxb2;
            }
        } else if (lxb.ZU() == 1 && lxb.JXs() == 2 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk()) {
            if (this.nBu.LD() > i) {
                List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb3 = this.ZU.Lxb(this.nBu.LD() - i, bg.d);
                if (listLxb3 != null && listLxb3.size() != 0) {
                    com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.Ivz(), 1);
                }
                return listLxb3;
            }
        } else if (lxb.ZU() == 1 && lxb.JXs() == 3 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU()) {
            if (this.JVA.LD() > i) {
                List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb4 = this.JXs.Lxb(this.JVA.LD() - i, bg.d);
                if (listLxb4 != null && listLxb4.size() != 0) {
                    com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.nE(), 1);
                }
                return listLxb4;
            }
        } else if (lxb.ZU() == 2 && lxb.JXs() == 3 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc() && this.sLN.LD() > i) {
            return this.lc.Lxb(this.sLN.LD() - i, bg.d);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, int i) {
        if (lxb == null) {
            return;
        }
        try {
            lxb.LD(System.currentTimeMillis());
            if (lxb.ZU() == 0 && lxb.JXs() == 1) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb()) {
                    this.Lxb.Lxb(lxb);
                    return;
                }
                return;
            }
            if (lxb.ZU() == 3 && lxb.JXs() == 2) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs()) {
                    this.lk.Lxb(lxb);
                    return;
                }
                return;
            }
            if (lxb.ZU() == 0 && lxb.JXs() == 2) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD()) {
                    this.LD.Lxb(lxb);
                    return;
                }
                return;
            }
            if (lxb.ZU() == 1 && lxb.JXs() == 2) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk()) {
                    this.ZU.Lxb(lxb);
                }
            } else if (lxb.ZU() == 1 && lxb.JXs() == 3) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU()) {
                    this.JXs.Lxb(lxb);
                }
            } else if (lxb.ZU() == 2 && lxb.JXs() == 3 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc()) {
                this.lc.Lxb(lxb);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.CG(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public void Lxb(int i, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb = list.get(0);
        if (i == 200 || i == -1) {
            com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb lxb2 = com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU;
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb2.uxf(), list.size());
            if (i != 200) {
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb2.SS(), list.size());
            }
            if (lxb.ZU() == 0 && lxb.JXs() == 1) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb()) {
                    this.Lxb.LD(list);
                    return;
                }
                return;
            }
            if (lxb.ZU() == 3 && lxb.JXs() == 2) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs()) {
                    this.lk.LD(list);
                    return;
                }
                return;
            }
            if (lxb.ZU() == 0 && lxb.JXs() == 2) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD()) {
                    this.LD.LD(list);
                    return;
                }
                return;
            }
            if (lxb.ZU() == 1 && lxb.JXs() == 2) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk()) {
                    this.ZU.LD(list);
                }
            } else if (lxb.ZU() == 1 && lxb.JXs() == 3) {
                if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU()) {
                    this.JXs.LD(list);
                }
            } else if (lxb.ZU() == 2 && lxb.JXs() == 3 && com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc()) {
                this.lc.LD(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> Lxb(int i, int i2, List<String> list) {
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb()) {
            List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb = this.Lxb.Lxb(bg.d);
            if (Lxb(listLxb, list)) {
                listLxb.size();
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.eK(), 1);
                return listLxb;
            }
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs()) {
            List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb2 = this.lk.Lxb(bg.d);
            if (Lxb(listLxb2, list)) {
                listLxb2.size();
                return listLxb2;
            }
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD()) {
            List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb3 = this.LD.Lxb(bg.d);
            if (Lxb(listLxb3, list)) {
                listLxb3.size();
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.aH(), 1);
                return listLxb3;
            }
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk()) {
            List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLD = this.ZU.LD(bg.d);
            if (Lxb(listLD, list)) {
                listLD.size();
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.CSn(), 1);
                return listLD;
            }
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU()) {
            List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLD2 = this.JXs.LD(bg.d);
            if (Lxb(listLD2, list)) {
                listLD2.size();
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.id(), 1);
                return listLD2;
            }
        }
        if (!com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc()) {
            return null;
        }
        List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLD3 = this.lc.LD(bg.d);
        if (!Lxb(listLD3, list)) {
            return null;
        }
        listLD3.size();
        return listLD3;
    }

    private boolean Lxb(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.lc.Lxb.ZU.Lxb next = it.next();
                    if (next != null) {
                        String strLk = next.lk();
                        if (!TextUtils.isEmpty(strLk) && list2.contains(strLk)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public boolean Lxb(int i, boolean z) {
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.JXs jXs;
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lc lcVar;
        ebl eblVar;
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.Lxb lxb;
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.LD ld;
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ZU zu;
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb() && (zu = this.Lxb) != null && zu.Lxb(i)) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.STP(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.JXs() && (ld = this.lk) != null && ld.Lxb(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.LD() && (lxb = this.LD) != null && lxb.Lxb(i)) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.IeN(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lk() && (eblVar = this.ZU) != null && eblVar.Lxb(i)) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.VVE(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.lc.Lxb.LD.Lxb.ZU() || (lcVar = this.JXs) == null || !lcVar.Lxb(i)) {
            return com.bytedance.sdk.component.lc.Lxb.LD.Lxb.lc() && (jXs = this.lc) != null && jXs.Lxb(i);
        }
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.kqm(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public void Lxb(int i, long j) {
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ZU zu = this.Lxb;
        if (zu != null) {
            zu.Lxb(i, j);
        }
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.LD ld = this.lk;
        if (ld != null) {
            ld.Lxb(i, j);
        }
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.Lxb lxb = this.LD;
        if (lxb != null) {
            lxb.Lxb(i, j);
        }
        ebl eblVar = this.ZU;
        if (eblVar != null) {
            eblVar.Lxb(i, j);
        }
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lc lcVar = this.JXs;
        if (lcVar != null) {
            lcVar.Lxb(i, j);
        }
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.JXs jXs = this.lc;
        if (jXs != null) {
            jXs.Lxb(i, j);
        }
    }
}
