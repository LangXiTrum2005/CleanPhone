package com.bytedance.sdk.component.mo.qdl.qdl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.wd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements mml {
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl fs;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl jpc;
    private com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.ud lnr;
    private wd mml;
    private com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mzz mo;
    private com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mo mzz;
    private com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mml qdl;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl rq;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl to;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl tvp;
    private com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl ud;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl wd;

    public lnr() {
        Context contextMo = jpc.wd().mo();
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl()) {
            this.wd = jpc.wd().fs();
            this.qdl = new com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mml(contextMo, this.wd);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz()) {
            if (jpc.wd().to() != null) {
                this.tvp = jpc.wd().to();
            } else {
                this.tvp = jpc.wd().exu();
            }
            this.lnr = new com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.ud(contextMo, this.tvp);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.ud()) {
            this.jpc = jpc.wd().exu();
            this.ud = new com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl(contextMo, this.jpc);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr()) {
            this.to = jpc.wd().exu();
            this.mml = new wd(contextMo, this.to);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mml()) {
            this.rq = jpc.wd().rdp();
            this.mzz = new com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mo(contextMo, this.rq);
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mo()) {
            this.fs = jpc.wd().bjy();
            this.mo = new com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mzz(contextMo, this.fs);
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, int i2) {
        if (qdlVar == null) {
            return;
        }
        try {
            qdlVar.ud(System.currentTimeMillis());
            if (qdlVar.mml() == 0 && qdlVar.mzz() == 1) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl()) {
                    this.qdl.qdl(qdlVar);
                    return;
                }
                return;
            }
            if (qdlVar.mml() == 3 && qdlVar.mzz() == 2) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz()) {
                    this.lnr.qdl(qdlVar);
                    return;
                }
                return;
            }
            if (qdlVar.mml() == 0 && qdlVar.mzz() == 2) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.ud()) {
                    this.ud.qdl(qdlVar);
                    return;
                }
                return;
            }
            if (qdlVar.mml() == 1 && qdlVar.mzz() == 2) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr()) {
                    this.mml.qdl(qdlVar);
                }
            } else if (qdlVar.mml() == 1 && qdlVar.mzz() == 3) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mml()) {
                    this.mzz.qdl(qdlVar);
                }
            } else if (qdlVar.mml() == 2 && qdlVar.mzz() == 3 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mo()) {
                this.mo.qdl(qdlVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.hkc(), 1);
        }
    }

    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> ud(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, int i2) {
        if (qdlVar.mml() == 0 && qdlVar.mzz() == 1 && com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl()) {
            if (this.wd.ud() <= i2) {
                return null;
            }
            List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl = this.qdl.qdl(this.wd.ud() - i2, "_id");
            if (listQdl != null && listQdl.size() != 0) {
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.bqt(), 1);
            }
            return listQdl;
        }
        if (qdlVar.mml() == 3 && qdlVar.mzz() == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz()) {
            if (this.tvp.ud() > i2) {
                return this.lnr.qdl(this.tvp.ud() - i2, "_id");
            }
        } else if (qdlVar.mml() == 0 && qdlVar.mzz() == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.ud()) {
            if (this.jpc.ud() > i2) {
                List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl2 = this.ud.qdl(this.jpc.ud() - i2, "_id");
                if (listQdl2 != null && listQdl2.size() != 0) {
                    com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.koa(), 1);
                }
                return listQdl2;
            }
        } else if (qdlVar.mml() == 1 && qdlVar.mzz() == 2 && com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr()) {
            if (this.to.ud() > i2) {
                List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl3 = this.mml.qdl(this.to.ud() - i2, "_id");
                if (listQdl3 != null && listQdl3.size() != 0) {
                    com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.vu(), 1);
                }
                return listQdl3;
            }
        } else if (qdlVar.mml() == 1 && qdlVar.mzz() == 3 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mml()) {
            if (this.rq.ud() > i2) {
                List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl4 = this.mzz.qdl(this.rq.ud() - i2, "_id");
                if (listQdl4 != null && listQdl4.size() != 0) {
                    com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.rc(), 1);
                }
                return listQdl4;
            }
        } else if (qdlVar.mml() == 2 && qdlVar.mzz() == 3 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mo() && this.fs.ud() > i2) {
            return this.mo.qdl(this.fs.ud() - i2, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public void qdl(int i2, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar = list.get(0);
        if (i2 == 200 || i2 == -1) {
            com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl qdlVar2 = com.bytedance.sdk.component.mo.qdl.ud.mml.mml;
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar2.taz(), list.size());
            if (i2 != 200) {
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar2.sy(), list.size());
            }
            if (qdlVar.mml() == 0 && qdlVar.mzz() == 1) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl()) {
                    this.qdl.ud(list);
                    return;
                }
                return;
            }
            if (qdlVar.mml() == 3 && qdlVar.mzz() == 2) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz()) {
                    this.lnr.ud(list);
                    return;
                }
                return;
            }
            if (qdlVar.mml() == 0 && qdlVar.mzz() == 2) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.ud()) {
                    this.ud.ud(list);
                    return;
                }
                return;
            }
            if (qdlVar.mml() == 1 && qdlVar.mzz() == 2) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr()) {
                    this.mml.ud(list);
                }
            } else if (qdlVar.mml() == 1 && qdlVar.mzz() == 3) {
                if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mml()) {
                    this.mzz.ud(list);
                }
            } else if (qdlVar.mml() == 2 && qdlVar.mzz() == 3 && com.bytedance.sdk.component.mo.qdl.ud.qdl.mo()) {
                this.mo.ud(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int i2, int i3, List<String> list) {
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl()) {
            List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl = this.qdl.qdl("_id");
            if (qdl(listQdl, list)) {
                listQdl.size();
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.ljh(), 1);
                return listQdl;
            }
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz()) {
            List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl2 = this.lnr.qdl("_id");
            if (qdl(listQdl2, list)) {
                listQdl2.size();
                return listQdl2;
            }
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.ud()) {
            List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl3 = this.ud.qdl("_id");
            if (qdl(listQdl3, list)) {
                listQdl3.size();
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.bch(), 1);
                return listQdl3;
            }
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr()) {
            List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listUd = this.mml.ud("_id");
            if (qdl(listUd, list)) {
                listUd.size();
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.uw(), 1);
                return listUd;
            }
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mml()) {
            List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listUd2 = this.mzz.ud("_id");
            if (qdl(listUd2, list)) {
                listUd2.size();
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.xmv(), 1);
                return listUd2;
            }
        }
        if (!com.bytedance.sdk.component.mo.qdl.ud.qdl.mo()) {
            return null;
        }
        List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listUd3 = this.mo.ud("_id");
        if (!qdl(listUd3, list)) {
            return null;
        }
        listUd3.size();
        return listUd3;
    }

    private boolean qdl(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.mo.qdl.mml.qdl> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.mo.qdl.mml.qdl next = it.next();
                    if (next != null) {
                        String strLnr = next.lnr();
                        if (!TextUtils.isEmpty(strLnr) && list2.contains(strLnr)) {
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

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public boolean qdl(int i2, boolean z2) {
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mzz mzzVar;
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mo moVar;
        wd wdVar;
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl qdlVar;
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.ud udVar;
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mml mmlVar;
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl() && (mmlVar = this.qdl) != null && mmlVar.qdl(i2)) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.rdp(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.mzz() && (udVar = this.lnr) != null && udVar.qdl(i2)) {
            return true;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.ud() && (qdlVar = this.ud) != null && qdlVar.qdl(i2)) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.bjy(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.mo.qdl.ud.qdl.lnr() && (wdVar = this.mml) != null && wdVar.qdl(i2)) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.jtx(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.mo.qdl.ud.qdl.mml() || (moVar = this.mzz) == null || !moVar.qdl(i2)) {
            return com.bytedance.sdk.component.mo.qdl.ud.qdl.mo() && (mzzVar = this.mo) != null && mzzVar.qdl(i2);
        }
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.yt(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public void qdl(int i2, long j) {
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.qdl(i2, j);
        }
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.ud udVar = this.lnr;
        if (udVar != null) {
            udVar.qdl(i2, j);
        }
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl qdlVar = this.ud;
        if (qdlVar != null) {
            qdlVar.qdl(i2, j);
        }
        wd wdVar = this.mml;
        if (wdVar != null) {
            wdVar.qdl(i2, j);
        }
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mo moVar = this.mzz;
        if (moVar != null) {
            moVar.qdl(i2, j);
        }
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mzz mzzVar = this.mo;
        if (mzzVar != null) {
            mzzVar.qdl(i2, j);
        }
    }
}
