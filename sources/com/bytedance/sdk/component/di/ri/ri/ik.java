package com.bytedance.sdk.component.di.ri.ri;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.di.ri.ri.ri.ri.xha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements ka {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.component.di.ri.ka.lr.ri f18050co;
    private com.bytedance.sdk.component.di.ri.ri.ri.ri.fi di;
    private com.bytedance.sdk.component.di.ri.ri.ri.ri.di fi;
    private com.bytedance.sdk.component.di.ri.ri.ri.ri.lr ik;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri jbs;
    private xha ka;
    private com.bytedance.sdk.component.di.ri.ri.ri.ri.ri lr;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri mj;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri qt;
    private com.bytedance.sdk.component.di.ri.ri.ri.ri.ka ri;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri sf;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri xha;

    public ik() {
        Context contextFi = com.bytedance.sdk.component.di.ri.xha.di().fi();
        if (com.bytedance.sdk.component.di.ri.lr.ri.ri()) {
            this.xha = com.bytedance.sdk.component.di.ri.xha.di().sf();
            this.ri = new com.bytedance.sdk.component.di.ri.ri.ri.ri.ka(contextFi, this.xha);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.fi()) {
            if (com.bytedance.sdk.component.di.ri.xha.di().jbs() != null) {
                this.jbs = com.bytedance.sdk.component.di.ri.xha.di().jbs();
            } else {
                this.jbs = com.bytedance.sdk.component.di.ri.xha.di().co();
            }
            this.ik = new com.bytedance.sdk.component.di.ri.ri.ri.ri.lr(contextFi, this.jbs);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.lr()) {
            this.mj = com.bytedance.sdk.component.di.ri.xha.di().co();
            this.lr = new com.bytedance.sdk.component.di.ri.ri.ri.ri.ri(contextFi, this.mj);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ik()) {
            this.qt = com.bytedance.sdk.component.di.ri.xha.di().co();
            this.ka = new xha(contextFi, this.qt);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ka()) {
            this.sf = com.bytedance.sdk.component.di.ri.xha.di().aw();
            this.fi = new com.bytedance.sdk.component.di.ri.ri.ri.ri.di(contextFi, this.sf);
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.di()) {
            this.f18050co = com.bytedance.sdk.component.di.ri.xha.di().bgr();
            this.di = new com.bytedance.sdk.component.di.ri.ri.ri.ri.fi(contextFi, this.f18050co);
        }
    }

    public List<com.bytedance.sdk.component.di.ri.ka.ri> lr(com.bytedance.sdk.component.di.ri.ka.ri riVar, int i) {
        if (riVar.ka() == 0 && riVar.fi() == 1 && com.bytedance.sdk.component.di.ri.lr.ri.ri()) {
            if (this.xha.lr() <= i) {
                return null;
            }
            List<com.bytedance.sdk.component.di.ri.ka.ri> listRi = this.ri.ri(this.xha.lr() - i, "_id");
            if (listRi != null && listRi.size() != 0) {
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.igq(), 1);
            }
            return listRi;
        }
        if (riVar.ka() == 3 && riVar.fi() == 2 && com.bytedance.sdk.component.di.ri.lr.ri.fi()) {
            if (this.jbs.lr() > i) {
                return this.ik.ri(this.jbs.lr() - i, "_id");
            }
        } else if (riVar.ka() == 0 && riVar.fi() == 2 && com.bytedance.sdk.component.di.ri.lr.ri.lr()) {
            if (this.mj.lr() > i) {
                List<com.bytedance.sdk.component.di.ri.ka.ri> listRi2 = this.lr.ri(this.mj.lr() - i, "_id");
                if (listRi2 != null && listRi2.size() != 0) {
                    com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.zf(), 1);
                }
                return listRi2;
            }
        } else if (riVar.ka() == 1 && riVar.fi() == 2 && com.bytedance.sdk.component.di.ri.lr.ri.ik()) {
            if (this.qt.lr() > i) {
                List<com.bytedance.sdk.component.di.ri.ka.ri> listRi3 = this.ka.ri(this.qt.lr() - i, "_id");
                if (listRi3 != null && listRi3.size() != 0) {
                    com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.dw(), 1);
                }
                return listRi3;
            }
        } else if (riVar.ka() == 1 && riVar.fi() == 3 && com.bytedance.sdk.component.di.ri.lr.ri.ka()) {
            if (this.sf.lr() > i) {
                List<com.bytedance.sdk.component.di.ri.ka.ri> listRi4 = this.fi.ri(this.sf.lr() - i, "_id");
                if (listRi4 != null && listRi4.size() != 0) {
                    com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.ory(), 1);
                }
                return listRi4;
            }
        } else if (riVar.ka() == 2 && riVar.fi() == 3 && com.bytedance.sdk.component.di.ri.lr.ri.di() && this.f18050co.lr() > i) {
            return this.di.ri(this.f18050co.lr() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar, int i) {
        if (riVar == null) {
            return;
        }
        try {
            riVar.lr(System.currentTimeMillis());
            if (riVar.ka() == 0 && riVar.fi() == 1) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.ri()) {
                    this.ri.ri(riVar);
                    return;
                }
                return;
            }
            if (riVar.ka() == 3 && riVar.fi() == 2) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.fi()) {
                    this.ik.ri(riVar);
                    return;
                }
                return;
            }
            if (riVar.ka() == 0 && riVar.fi() == 2) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.lr()) {
                    this.lr.ri(riVar);
                    return;
                }
                return;
            }
            if (riVar.ka() == 1 && riVar.fi() == 2) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.ik()) {
                    this.ka.ri(riVar);
                }
            } else if (riVar.ka() == 1 && riVar.fi() == 3) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.ka()) {
                    this.fi.ri(riVar);
                }
            } else if (riVar.ka() == 2 && riVar.fi() == 3 && com.bytedance.sdk.component.di.ri.lr.ri.di()) {
                this.di.ri(riVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.xd(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public void ri(int i, List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.di.ri.ka.ri riVar = list.get(0);
        if (i == 200 || i == -1) {
            com.bytedance.sdk.component.di.ri.lr.ri.ri riVar2 = com.bytedance.sdk.component.di.ri.lr.ka.ka;
            com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar2.rzk(), list.size());
            if (i != 200) {
                com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar2.gcp(), list.size());
            }
            if (riVar.ka() == 0 && riVar.fi() == 1) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.ri()) {
                    this.ri.lr(list);
                    return;
                }
                return;
            }
            if (riVar.ka() == 3 && riVar.fi() == 2) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.fi()) {
                    this.ik.lr(list);
                    return;
                }
                return;
            }
            if (riVar.ka() == 0 && riVar.fi() == 2) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.lr()) {
                    this.lr.lr(list);
                    return;
                }
                return;
            }
            if (riVar.ka() == 1 && riVar.fi() == 2) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.ik()) {
                    this.ka.lr(list);
                }
            } else if (riVar.ka() == 1 && riVar.fi() == 3) {
                if (com.bytedance.sdk.component.di.ri.lr.ri.ka()) {
                    this.fi.lr(list);
                }
            } else if (riVar.ka() == 2 && riVar.fi() == 3 && com.bytedance.sdk.component.di.ri.lr.ri.di()) {
                this.di.lr(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public List<com.bytedance.sdk.component.di.ri.ka.ri> ri(int i, int i2, List<String> list) {
        if (com.bytedance.sdk.component.di.ri.lr.ri.ri()) {
            List<com.bytedance.sdk.component.di.ri.ka.ri> listRi = this.ri.ri("_id");
            if (ri(listRi, list)) {
                listRi.size();
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.wjv(), 1);
                return listRi;
            }
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.fi()) {
            List<com.bytedance.sdk.component.di.ri.ka.ri> listRi2 = this.ik.ri("_id");
            if (ri(listRi2, list)) {
                listRi2.size();
                return listRi2;
            }
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.lr()) {
            List<com.bytedance.sdk.component.di.ri.ka.ri> listRi3 = this.lr.ri("_id");
            if (ri(listRi3, list)) {
                listRi3.size();
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.ay(), 1);
                return listRi3;
            }
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ik()) {
            List<com.bytedance.sdk.component.di.ri.ka.ri> listLr = this.ka.lr("_id");
            if (ri(listLr, list)) {
                listLr.size();
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.fr(), 1);
                return listLr;
            }
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ka()) {
            List<com.bytedance.sdk.component.di.ri.ka.ri> listLr2 = this.fi.lr("_id");
            if (ri(listLr2, list)) {
                listLr2.size();
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.su(), 1);
                return listLr2;
            }
        }
        if (!com.bytedance.sdk.component.di.ri.lr.ri.di()) {
            return null;
        }
        List<com.bytedance.sdk.component.di.ri.ka.ri> listLr3 = this.di.lr("_id");
        if (!ri(listLr3, list)) {
            return null;
        }
        listLr3.size();
        return listLr3;
    }

    private boolean ri(List<com.bytedance.sdk.component.di.ri.ka.ri> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.di.ri.ka.ri> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.di.ri.ka.ri next = it.next();
                    if (next != null) {
                        String strIk = next.ik();
                        if (!TextUtils.isEmpty(strIk) && list2.contains(strIk)) {
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

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public boolean ri(int i, boolean z) {
        com.bytedance.sdk.component.di.ri.ri.ri.ri.fi fiVar;
        com.bytedance.sdk.component.di.ri.ri.ri.ri.di diVar;
        xha xhaVar;
        com.bytedance.sdk.component.di.ri.ri.ri.ri.ri riVar;
        com.bytedance.sdk.component.di.ri.ri.ri.ri.lr lrVar;
        com.bytedance.sdk.component.di.ri.ri.ri.ri.ka kaVar;
        if (com.bytedance.sdk.component.di.ri.lr.ri.ri() && (kaVar = this.ri) != null && kaVar.ri(i)) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.bgr(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.fi() && (lrVar = this.ik) != null && lrVar.ri(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.lr() && (riVar = this.lr) != null && riVar.ri(i)) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.vr(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.di.ri.lr.ri.ik() && (xhaVar = this.ka) != null && xhaVar.ri(i)) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.slm(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.di.ri.lr.ri.ka() || (diVar = this.fi) == null || !diVar.ri(i)) {
            return com.bytedance.sdk.component.di.ri.lr.ri.di() && (fiVar = this.di) != null && fiVar.ri(i);
        }
        com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.bu(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public void ri(int i, long j) {
        com.bytedance.sdk.component.di.ri.ri.ri.ri.ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.ri(i, j);
        }
        com.bytedance.sdk.component.di.ri.ri.ri.ri.lr lrVar = this.ik;
        if (lrVar != null) {
            lrVar.ri(i, j);
        }
        com.bytedance.sdk.component.di.ri.ri.ri.ri.ri riVar = this.lr;
        if (riVar != null) {
            riVar.ri(i, j);
        }
        xha xhaVar = this.ka;
        if (xhaVar != null) {
            xhaVar.ri(i, j);
        }
        com.bytedance.sdk.component.di.ri.ri.ri.ri.di diVar = this.fi;
        if (diVar != null) {
            diVar.ri(i, j);
        }
        com.bytedance.sdk.component.di.ri.ri.ri.ri.fi fiVar = this.di;
        if (fiVar != null) {
            fiVar.ri(i, j);
        }
    }
}
