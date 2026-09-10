package com.bytedance.sdk.component.adexpress.dynamic.fi;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.lr.aw;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private com.bytedance.sdk.component.adexpress.dynamic.ka.mj ik;
    private ri ka;
    protected lr lr;
    public com.bytedance.sdk.component.adexpress.dynamic.ka.lr ri;

    public static class ri {
        float ik;
        float lr;
        float ri;
    }

    public fi(double d, int i, double d2, String str, aw awVar) {
        this.lr = new lr(d, i, d2, str, awVar);
    }

    public void ri(ri riVar) {
        this.ka = riVar;
    }

    public void ri() {
        this.lr.ri();
    }

    public void ri(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, float f, float f2) {
        if (mjVar != null) {
            this.ik = mjVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar2 = this.ik;
        float fMj = mjVar2.mj();
        float fJbs = mjVar2.jbs();
        float f3 = TextUtils.equals(mjVar2.qt().fi().igq(), "fixed") ? fJbs : 65536.0f;
        this.lr.ri();
        this.lr.ik(mjVar2, fMj, f3);
        lr.ik ikVarRi = this.lr.ri(mjVar2);
        com.bytedance.sdk.component.adexpress.dynamic.ka.lr lrVar = new com.bytedance.sdk.component.adexpress.dynamic.ka.lr();
        lrVar.ri = f;
        lrVar.lr = f2;
        if (ikVarRi != null) {
            fMj = ikVarRi.ri;
        }
        lrVar.ik = fMj;
        if (ikVarRi != null) {
            fJbs = ikVarRi.lr;
        }
        lrVar.ka = fJbs;
        lrVar.fi = "root";
        lrVar.jbs = 1280.0f;
        lrVar.di = mjVar2;
        mjVar2.ik(f);
        lrVar.di.ka(lrVar.lr);
        lrVar.di.fi(lrVar.ik);
        lrVar.di.di(lrVar.ka);
        com.bytedance.sdk.component.adexpress.dynamic.ka.lr lrVarRi = ri(lrVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.ri = lrVarRi;
        ri(lrVarRi);
    }

    public void ri(com.bytedance.sdk.component.adexpress.dynamic.ka.lr lrVar) {
        if (lrVar == null) {
            return;
        }
        lrVar.di.qt().lr();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ka.lr>> list = lrVar.xha;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ka.lr> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.lr> it = list2.iterator();
                while (it.hasNext()) {
                    ri(it.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0340  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0219  */
    public com.bytedance.sdk.component.adexpress.dynamic.ka.lr ri(com.bytedance.sdk.component.adexpress.dynamic.ka.lr lrVar, float f) {
        float fRi;
        float fRi2;
        float fRi3;
        float fRi4;
        float f2;
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar = lrVar.di;
        if (mjVar != null) {
            mjVar.ihz();
            List<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> listBu = mjVar.bu();
            if (listBu != null && listBu.size() > 0) {
                com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = mjVar.qt().fi();
                float fBu = diVarFi.bu();
                float fSlm = diVarFi.slm();
                float fBgr = diVarFi.bgr();
                float fVr = diVarFi.vr();
                float fCo = diVarFi.co();
                String strJc = diVarFi.jc();
                String strKt = diVarFi.kt();
                float f3 = lrVar.ri + fVr;
                float f4 = lrVar.lr + fBu;
                float f5 = (lrVar.ik - fVr) - fSlm;
                float f6 = 2.0f;
                float f7 = fCo * 2.0f;
                float f8 = f5 - f7;
                float f9 = ((lrVar.ka - fBu) - fBgr) - f7;
                com.bytedance.sdk.component.adexpress.dynamic.ka.jbs jbsVar = new com.bytedance.sdk.component.adexpress.dynamic.ka.jbs(f3, f4);
                if (lrVar.xha == null) {
                    lrVar.xha = new ArrayList();
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> it = listBu.iterator();
                float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (it.hasNext()) {
                    float f11 = f6;
                    lr.ik ikVarRi = this.lr.ri(it.next());
                    if (ikVarRi != null) {
                        f10 += ikVarRi.lr;
                    }
                    f6 = f11;
                }
                float f12 = f6;
                String str = "space-between";
                String str2 = "space-around";
                int i = 1;
                if (f10 >= f9) {
                    fRi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    fRi2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    if (TextUtils.equals(strKt, TtmlNode.CENTER)) {
                        fRi2 = (f9 - f10) / f12;
                    } else if (TextUtils.equals(strKt, "flex-end")) {
                        fRi2 = f9 - f10;
                    } else if (TextUtils.equals(strKt, "space-around")) {
                        fRi2 = qt.ri((f9 - f10) / (listBu.size() + 1));
                        fRi = fRi2;
                    } else {
                        if (!TextUtils.equals(strKt, "space-between") || listBu.size() <= 1) {
                            fRi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            fRi = qt.ri((f9 - f10) / (listBu.size() - 1));
                        }
                        fRi2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    fRi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                jbsVar.lr += fRi2;
                float f13 = f;
                int i2 = 0;
                while (i2 < listBu.size()) {
                    List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list = listBu.get(i2);
                    i2++;
                    int i3 = i;
                    if (i2 >= lrVar.xha.size()) {
                        int i4 = 0;
                        for (int size = (i2 - lrVar.xha.size()) + 1; i4 < size; size = size) {
                            lrVar.xha.add(new ArrayList());
                            i4++;
                        }
                    }
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it2 = list.iterator();
                    float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (true) {
                        it2 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.ka.mj next = it2.next();
                        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi2 = next.qt().fi();
                        float f15 = f14;
                        String strZf = diVarFi2.zf();
                        float f16 = fRi;
                        int iGcp = diVarFi2.gcp();
                        f13 = f13;
                        if (TextUtils.equals(strZf, "flex") || iGcp == i3 || iGcp == 2) {
                            f14 = f15;
                        } else {
                            lr.ik ikVarRi2 = this.lr.ri(next);
                            f14 = ikVarRi2 != null ? f15 + ikVarRi2.ri : f15;
                        }
                        fRi = f16;
                        i3 = 1;
                    }
                    float f17 = fRi;
                    float f18 = f13;
                    float fMax = Math.max(f8 - f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it3 = list.iterator();
                    float f19 = 0.0f;
                    while (it3.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.ka.mj next2 = it3.next();
                        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi3 = next2.qt().fi();
                        it3 = it3;
                        float f20 = f19;
                        if (diVarFi3.gcp() == 1 || diVarFi3.gcp() == 2) {
                            f19 = f20;
                        } else {
                            lr.ik ikVarRi3 = this.lr.ri(next2);
                            f19 = ikVarRi3 != null ? f20 + ikVarRi3.ri : f20;
                        }
                    }
                    float f21 = f19;
                    if (f21 >= f8) {
                        fRi3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        fRi4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        if (TextUtils.equals(strJc, TtmlNode.CENTER)) {
                            fRi3 = (f8 - f21) / f12;
                        } else if (TextUtils.equals(strJc, "flex-end")) {
                            fRi3 = f8 - f21;
                        } else if (TextUtils.equals(strJc, str2)) {
                            fRi3 = qt.ri((f8 - f21) / (list.size() + 1));
                            fRi4 = fRi3;
                        } else if (!TextUtils.equals(strJc, str) || list.size() <= 1) {
                            fRi3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            fRi4 = qt.ri((f8 - f21) / (list.size() - 1.0f));
                            fRi3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fRi4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    jbsVar.ri += fRi3;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it4 = list.iterator();
                    float fMax2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (it4.hasNext()) {
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it5 = it4;
                        com.bytedance.sdk.component.adexpress.dynamic.ka.mj next3 = it4.next();
                        float f22 = fRi4;
                        float f23 = this.lr.ri(next3) != null ? this.lr.ri(next3).lr : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi4 = next3.qt().fi();
                        fMax2 = Math.max(fMax2, (diVarFi4.gcp() == 1 || diVarFi4.gcp() == 2) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f23);
                        it4 = it5;
                        fRi4 = f22;
                    }
                    float f24 = fRi4;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it6 = list.iterator();
                    while (it6.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.ka.mj next4 = it6.next();
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it7 = it6;
                        lr.ik ikVarRi4 = this.lr.ri(next4);
                        String str3 = str;
                        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi5 = next4.qt().fi();
                        String str4 = strJc;
                        float fTnn = diVarFi5.tnn();
                        float fBnj = diVarFi5.bnj();
                        float fFe = diVarFi5.fe();
                        float fTa = diVarFi5.ta();
                        float f25 = ikVarRi4 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ikVarRi4.ri;
                        float f26 = ikVarRi4 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ikVarRi4.lr;
                        float f27 = f25;
                        float f28 = TextUtils.equals(mjVar.ik(), "root") ? i2 : f18;
                        float f29 = fMax2;
                        com.bytedance.sdk.component.adexpress.dynamic.ka.jbs jbsVarRi = diVarFi5.gcp() == 2 ? ri(diVarFi5, this.lr.ri(this.ik), new lr.ik((f27 - fBnj) - fTa, (f26 - fTnn) - fFe)) : diVarFi5.gcp() == 1 ? ri(lrVar, diVarFi5, (f27 - fBnj) - fTa, (f26 - fTnn) - fFe) : jbsVar;
                        String strHws = diVarFi.hws();
                        if (f29 <= f26 || TextUtils.equals(strHws, "flex-start")) {
                            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            strHws.getClass();
                            if (strHws.equals(TtmlNode.CENTER)) {
                                f2 = (f29 - f26) / f12;
                            } else if (strHws.equals("flex-end")) {
                                f2 = f29 - f26;
                            } else {
                                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.ka.lr lrVar2 = new com.bytedance.sdk.component.adexpress.dynamic.ka.lr();
                        lrVar2.ri = jbsVarRi.ri + fTa;
                        lrVar2.lr = jbsVarRi.lr + fTnn + f2;
                        lrVar2.ik = (f27 - fBnj) - fTa;
                        lrVar2.ka = (f26 - fTnn) - fFe;
                        lrVar2.fi = lrVar.fi + "." + next4.ik();
                        lrVar2.mj = lrVar;
                        lrVar2.di = next4;
                        lrVar2.jbs = fMax;
                        lrVar2.qt = list;
                        next4.ik(lrVar2.ri);
                        lrVar2.di.ka(lrVar2.lr);
                        lrVar2.di.fi(lrVar2.ik);
                        lrVar2.di.di(lrVar2.ka);
                        lrVar.xha.get(i2).add(ri(lrVar2, f28));
                        if (diVarFi5.gcp() != 1 && diVarFi5.gcp() != 2) {
                            jbsVar.ri += f27 + f24;
                        }
                        f18 = f28;
                        strJc = str4;
                        str = str3;
                        fMax2 = f29;
                        f8 = f8;
                        str2 = str2;
                        it6 = it7;
                    }
                    jbsVar.ri = f3;
                    jbsVar.lr += fMax2 + f17;
                    i = 1;
                    listBu = listBu;
                    f13 = f18;
                    fRi = f17;
                }
            }
        }
        return lrVar;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.ka.jbs ri(com.bytedance.sdk.component.adexpress.dynamic.ka.di diVar, lr.ik ikVar, lr.ik ikVar2) {
        float fUd = diVar.ud();
        float fQmx = diVar.qmx();
        float fHpn = diVar.hpn();
        float fId = diVar.id();
        boolean zNd = diVar.nd();
        boolean zZb = diVar.zb();
        boolean zAac = diVar.aac();
        boolean zXe = diVar.xe();
        if (!zNd) {
            if (zZb) {
                float f = this.ka.ri;
                fUd = ((f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.min(f, ikVar.ri) : ikVar.ri) - fHpn) - ikVar2.ri;
            } else {
                fUd = 0.0f;
            }
        }
        if (!zAac) {
            if (zXe) {
                float f2 = this.ka.lr;
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = ikVar.lr;
                }
                fQmx = (f2 - fId) - ikVar2.lr;
            } else {
                fQmx = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.ka.jbs(fUd, fQmx);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.ka.jbs ri(com.bytedance.sdk.component.adexpress.dynamic.ka.lr lrVar, com.bytedance.sdk.component.adexpress.dynamic.ka.di diVar, float f, float f2) {
        float f3;
        float f4;
        float f5 = lrVar.ri;
        float f6 = lrVar.lr;
        float fUd = diVar.ud();
        float fQmx = diVar.qmx();
        float fHpn = diVar.hpn();
        float fId = diVar.id();
        boolean zNd = diVar.nd();
        boolean zZb = diVar.zb();
        boolean zAac = diVar.aac();
        boolean zXe = diVar.xe();
        String strTw = diVar.tw();
        float f7 = lrVar.ik;
        float f8 = lrVar.ka;
        if (TextUtils.equals(strTw, "0")) {
            if (zNd) {
                f5 = lrVar.ri + fUd;
            } else if (zZb) {
                f5 = ((lrVar.ri + f7) - fHpn) - f;
            }
            if (zAac) {
                f4 = lrVar.lr;
                f6 = f4 + fQmx;
            } else if (zXe) {
                f3 = lrVar.lr;
                f6 = ((f3 + f8) - fId) - f2;
            }
        } else if (TextUtils.equals(strTw, "1")) {
            f5 = lrVar.ri + ((f7 - f) / 2.0f);
            if (zAac) {
                f4 = lrVar.lr;
                f6 = f4 + fQmx;
            } else if (zXe) {
                f3 = lrVar.lr;
                f6 = ((f3 + f8) - fId) - f2;
            }
        } else if (TextUtils.equals(strTw, "2")) {
            f6 = lrVar.lr + ((f8 - f2) / 2.0f);
            if (zNd) {
                f5 = lrVar.ri + fUd;
            } else if (zZb) {
                f5 = ((lrVar.ri + f7) - fHpn) - f;
            }
        } else if (TextUtils.equals(strTw, "3")) {
            f5 = lrVar.ri + ((f7 - f) / 2.0f);
            f6 = lrVar.lr + ((f8 - f2) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.ka.jbs(f5, f6);
    }
}
