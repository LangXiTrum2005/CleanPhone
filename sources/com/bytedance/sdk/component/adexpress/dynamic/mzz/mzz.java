package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ud.exu;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    private com.bytedance.sdk.component.adexpress.dynamic.mml.jpc lnr;
    private qdl mml;
    public com.bytedance.sdk.component.adexpress.dynamic.mml.ud qdl;
    protected ud ud;

    public static class qdl {
        float lnr;
        float qdl;
        float ud;
    }

    public mzz(double d, int i2, double d2, String str, exu exuVar) {
        this.ud = new ud(d, i2, d2, str, exuVar);
    }

    public void qdl(qdl qdlVar) {
        this.mml = qdlVar;
    }

    public void qdl() {
        this.ud.qdl();
    }

    public void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, float f, float f2) {
        if (jpcVar != null) {
            this.lnr = jpcVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar2 = this.lnr;
        float fJpc = jpcVar2.jpc();
        float fTvp = jpcVar2.tvp();
        float f3 = TextUtils.equals(jpcVar2.to().mzz().bqt(), "fixed") ? fTvp : 65536.0f;
        this.ud.qdl();
        this.ud.lnr(jpcVar2, fJpc, f3);
        ud.lnr lnrVarQdl = this.ud.qdl(jpcVar2);
        com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar = new com.bytedance.sdk.component.adexpress.dynamic.mml.ud();
        udVar.qdl = f;
        udVar.ud = f2;
        if (lnrVarQdl != null) {
            fJpc = lnrVarQdl.qdl;
        }
        udVar.lnr = fJpc;
        if (lnrVarQdl != null) {
            fTvp = lnrVarQdl.ud;
        }
        udVar.mml = fTvp;
        udVar.mzz = "root";
        udVar.tvp = 1280.0f;
        udVar.mo = jpcVar2;
        jpcVar2.lnr(f);
        udVar.mo.mml(udVar.ud);
        udVar.mo.mzz(udVar.lnr);
        udVar.mo.mo(udVar.mml);
        com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVarQdl = qdl(udVar, 0.0f);
        this.qdl = udVarQdl;
        qdl(udVarQdl);
    }

    public void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar) {
        if (udVar == null) {
            return;
        }
        udVar.mo.to().ud();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.ud>> list = udVar.wd;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.mml.ud> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.ud> it = list2.iterator();
                while (it.hasNext()) {
                    qdl(it.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0340  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:95:0x021e  */
    public com.bytedance.sdk.component.adexpress.dynamic.mml.ud qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar, float f) {
        float fQdl;
        float fQdl2;
        float fQdl3;
        float fQdl4;
        float f2;
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = udVar.mo;
        if (jpcVar != null) {
            jpcVar.jyq();
            List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> listYt = jpcVar.yt();
            if (listYt != null && listYt.size() > 0) {
                com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = jpcVar.to().mzz();
                float fYt = moVarMzz.yt();
                float fJtx = moVarMzz.jtx();
                float fRdp = moVarMzz.rdp();
                float fBjy = moVarMzz.bjy();
                float fFs = moVarMzz.fs();
                String strAg = moVarMzz.ag();
                String strWc = moVarMzz.wc();
                float f3 = udVar.qdl + fBjy;
                float f4 = udVar.ud + fYt;
                float f5 = (udVar.lnr - fBjy) - fJtx;
                float f6 = 2.0f;
                float f7 = fFs * 2.0f;
                float f8 = f5 - f7;
                float f9 = ((udVar.mml - fYt) - fRdp) - f7;
                com.bytedance.sdk.component.adexpress.dynamic.mml.tvp tvpVar = new com.bytedance.sdk.component.adexpress.dynamic.mml.tvp(f3, f4);
                if (udVar.wd == null) {
                    udVar.wd = new ArrayList();
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> it = listYt.iterator();
                float f10 = 0.0f;
                while (it.hasNext()) {
                    float f11 = f6;
                    ud.lnr lnrVarQdl = this.ud.qdl(it.next());
                    if (lnrVarQdl != null) {
                        f10 += lnrVarQdl.ud;
                    }
                    f6 = f11;
                }
                float f12 = f6;
                String str = "space-between";
                String str2 = "space-around";
                if (f10 >= f9) {
                    fQdl = 0.0f;
                    fQdl2 = 0.0f;
                } else {
                    if (TextUtils.equals(strWc, TtmlNode.CENTER)) {
                        fQdl2 = (f9 - f10) / f12;
                    } else if (TextUtils.equals(strWc, "flex-end")) {
                        fQdl2 = f9 - f10;
                    } else if (TextUtils.equals(strWc, "space-around")) {
                        fQdl2 = to.qdl((f9 - f10) / (listYt.size() + 1));
                        fQdl = fQdl2;
                    } else {
                        if (!TextUtils.equals(strWc, "space-between") || listYt.size() <= 1) {
                            fQdl = 0.0f;
                        } else {
                            fQdl = to.qdl((f9 - f10) / (listYt.size() - 1));
                        }
                        fQdl2 = 0.0f;
                    }
                    fQdl = 0.0f;
                }
                tvpVar.ud += fQdl2;
                float f13 = f;
                int i2 = 0;
                while (i2 < listYt.size()) {
                    List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list = listYt.get(i2);
                    i2++;
                    float f14 = fQdl;
                    if (i2 >= udVar.wd.size()) {
                        int i3 = 0;
                        for (int size = (i2 - udVar.wd.size()) + 1; i3 < size; size = size) {
                            udVar.wd.add(new ArrayList());
                            i3++;
                        }
                    }
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it2 = list.iterator();
                    float f15 = 0.0f;
                    while (true) {
                        it2 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc next = it2.next();
                        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz2 = next.to().mzz();
                        float f16 = f15;
                        String strKoa = moVarMzz2.koa();
                        List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> list2 = listYt;
                        int iSy = moVarMzz2.sy();
                        moVarMzz = moVarMzz;
                        if (TextUtils.equals(strKoa, "flex") || iSy == 1 || iSy == 2) {
                            f15 = f16;
                        } else {
                            ud.lnr lnrVarQdl2 = this.ud.qdl(next);
                            f15 = lnrVarQdl2 != null ? f16 + lnrVarQdl2.qdl : f16;
                        }
                        listYt = list2;
                    }
                    List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> list3 = listYt;
                    com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVar = moVarMzz;
                    float fMax = Math.max(f8 - f15, 0.0f);
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it3 = list.iterator();
                    float f17 = 0.0f;
                    while (it3.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc next2 = it3.next();
                        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz3 = next2.to().mzz();
                        it3 = it3;
                        float f18 = f17;
                        if (moVarMzz3.sy() == 1 || moVarMzz3.sy() == 2) {
                            f17 = f18;
                        } else {
                            ud.lnr lnrVarQdl3 = this.ud.qdl(next2);
                            f17 = lnrVarQdl3 != null ? f18 + lnrVarQdl3.qdl : f18;
                        }
                    }
                    float f19 = f17;
                    if (f19 >= f8) {
                        fQdl3 = 0.0f;
                        fQdl4 = 0.0f;
                    } else {
                        if (TextUtils.equals(strAg, TtmlNode.CENTER)) {
                            fQdl3 = (f8 - f19) / f12;
                        } else if (TextUtils.equals(strAg, "flex-end")) {
                            fQdl3 = f8 - f19;
                        } else if (TextUtils.equals(strAg, str2)) {
                            fQdl3 = to.qdl((f8 - f19) / (list.size() + 1));
                            fQdl4 = fQdl3;
                        } else if (!TextUtils.equals(strAg, str) || list.size() <= 1) {
                            fQdl3 = 0.0f;
                        } else {
                            fQdl4 = to.qdl((f8 - f19) / (list.size() - 1.0f));
                            fQdl3 = 0.0f;
                        }
                        fQdl4 = 0.0f;
                    }
                    tvpVar.qdl += fQdl3;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it4 = list.iterator();
                    float fMax2 = 0.0f;
                    while (it4.hasNext()) {
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it5 = it4;
                        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc next3 = it4.next();
                        float f20 = fQdl4;
                        float f21 = this.ud.qdl(next3) != null ? this.ud.qdl(next3).ud : 0.0f;
                        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz4 = next3.to().mzz();
                        fMax2 = Math.max(fMax2, (moVarMzz4.sy() == 1 || moVarMzz4.sy() == 2) ? 0.0f : f21);
                        it4 = it5;
                        fQdl4 = f20;
                    }
                    float f22 = fQdl4;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it6 = list.iterator();
                    while (it6.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc next4 = it6.next();
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it7 = it6;
                        ud.lnr lnrVarQdl4 = this.ud.qdl(next4);
                        float f23 = fMax2;
                        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz5 = next4.to().mzz();
                        String str3 = str;
                        float fYh = moVarMzz5.yh();
                        float fIrn = moVarMzz5.irn();
                        float fWak = moVarMzz5.wak();
                        float fGt = moVarMzz5.gt();
                        float f24 = lnrVarQdl4 == null ? 0.0f : lnrVarQdl4.qdl;
                        float f25 = lnrVarQdl4 == null ? 0.0f : lnrVarQdl4.ud;
                        float f26 = f24;
                        if (TextUtils.equals(jpcVar.lnr(), "root")) {
                            f13 = i2;
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.mml.tvp tvpVarQdl = moVarMzz5.sy() == 2 ? qdl(moVarMzz5, this.ud.qdl(this.lnr), new ud.lnr((f26 - fIrn) - fGt, (f25 - fYh) - fWak)) : moVarMzz5.sy() == 1 ? qdl(udVar, moVarMzz5, (f26 - fIrn) - fGt, (f25 - fYh) - fWak) : tvpVar;
                        String strRzg = moVar.rzg();
                        if (f23 <= f25 || TextUtils.equals(strRzg, "flex-start")) {
                            f2 = 0.0f;
                        } else {
                            strRzg.getClass();
                            if (strRzg.equals(TtmlNode.CENTER)) {
                                f2 = (f23 - f25) / f12;
                            } else if (strRzg.equals("flex-end")) {
                                f2 = f23 - f25;
                            } else {
                                f2 = 0.0f;
                            }
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar2 = new com.bytedance.sdk.component.adexpress.dynamic.mml.ud();
                        udVar2.qdl = tvpVarQdl.qdl + fGt;
                        udVar2.ud = tvpVarQdl.ud + fYh + f2;
                        udVar2.lnr = (f26 - fIrn) - fGt;
                        udVar2.mml = (f25 - fYh) - fWak;
                        udVar2.mzz = udVar.mzz + com.thinkup.core.common.n.mo.ono + next4.lnr();
                        udVar2.jpc = udVar;
                        udVar2.mo = next4;
                        udVar2.tvp = fMax;
                        udVar2.to = list;
                        next4.lnr(udVar2.qdl);
                        udVar2.mo.mml(udVar2.ud);
                        udVar2.mo.mzz(udVar2.lnr);
                        udVar2.mo.mo(udVar2.mml);
                        udVar.wd.get(i2).add(qdl(udVar2, f13));
                        if (moVarMzz5.sy() != 1 && moVarMzz5.sy() != 2) {
                            tvpVar.qdl = f26 + f22 + tvpVar.qdl;
                        }
                        it6 = it7;
                        str = str3;
                        fMax2 = f23;
                        str2 = str2;
                        strAg = strAg;
                    }
                    tvpVar.qdl = f3;
                    tvpVar.ud = fMax2 + f14 + tvpVar.ud;
                    fQdl = f14;
                    f8 = f8;
                    moVarMzz = moVar;
                    listYt = list3;
                }
            }
        }
        return udVar;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.mml.tvp qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVar, ud.lnr lnrVar, ud.lnr lnrVar2) {
        float fTqd = moVar.tqd();
        float fLq = moVar.lq();
        float fFzn = moVar.fzn();
        float fGg = moVar.gg();
        boolean zMlb = moVar.mlb();
        boolean zLte = moVar.lte();
        boolean zDk = moVar.dk();
        boolean zIjp = moVar.ijp();
        if (!zMlb) {
            if (zLte) {
                float f = this.mml.qdl;
                fTqd = ((f != 0.0f ? Math.min(f, lnrVar.qdl) : lnrVar.qdl) - fFzn) - lnrVar2.qdl;
            } else {
                fTqd = 0.0f;
            }
        }
        if (!zDk) {
            if (zIjp) {
                float f2 = this.mml.ud;
                if (f2 == 0.0f) {
                    f2 = lnrVar.ud;
                }
                fLq = (f2 - fGg) - lnrVar2.ud;
            } else {
                fLq = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.mml.tvp(fTqd, fLq);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.mml.tvp qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar, com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVar, float f, float f2) {
        float f3;
        float f4;
        float f5 = udVar.qdl;
        float f6 = udVar.ud;
        float fTqd = moVar.tqd();
        float fLq = moVar.lq();
        float fFzn = moVar.fzn();
        float fGg = moVar.gg();
        boolean zMlb = moVar.mlb();
        boolean zLte = moVar.lte();
        boolean zDk = moVar.dk();
        boolean zIjp = moVar.ijp();
        String strCar = moVar.car();
        float f7 = udVar.lnr;
        float f8 = udVar.mml;
        if (TextUtils.equals(strCar, "0")) {
            if (zMlb) {
                f5 = udVar.qdl + fTqd;
            } else if (zLte) {
                f5 = ((udVar.qdl + f7) - fFzn) - f;
            }
            if (zDk) {
                f4 = udVar.ud;
                f6 = f4 + fLq;
            } else if (zIjp) {
                f3 = udVar.ud;
                f6 = ((f3 + f8) - fGg) - f2;
            }
        } else if (TextUtils.equals(strCar, "1")) {
            f5 = udVar.qdl + ((f7 - f) / 2.0f);
            if (zDk) {
                f4 = udVar.ud;
                f6 = f4 + fLq;
            } else if (zIjp) {
                f3 = udVar.ud;
                f6 = ((f3 + f8) - fGg) - f2;
            }
        } else if (TextUtils.equals(strCar, "2")) {
            f6 = udVar.ud + ((f8 - f2) / 2.0f);
            if (zMlb) {
                f5 = udVar.qdl + fTqd;
            } else if (zLte) {
                f5 = ((udVar.qdl + f7) - fFzn) - f;
            }
        } else if (TextUtils.equals(strCar, "3")) {
            f5 = udVar.qdl + ((f7 - f) / 2.0f);
            f6 = ((f8 - f2) / 2.0f) + udVar.ud;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.mml.tvp(f5, f6);
    }
}
