package com.bytedance.sdk.component.adexpress.dynamic.JXs;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    protected LD LD;
    public com.bytedance.sdk.component.adexpress.dynamic.ZU.LD Lxb;
    private Lxb ZU;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.OY lk;

    public static class Lxb {
        float LD;
        float Lxb;
        float lk;
    }

    public JXs(double d, int i, double d2, String str, NXR nxr) {
        this.LD = new LD(d, i, d2, str, nxr);
    }

    public void Lxb(Lxb lxb) {
        this.ZU = lxb;
    }

    public void Lxb() {
        this.LD.Lxb();
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, float f, float f2) {
        if (oy != null) {
            this.lk = oy;
        }
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy2 = this.lk;
        float fOY = oy2.OY();
        float fQAg = oy2.QAg();
        float f3 = TextUtils.equals(oy2.nBu().JXs().foI(), "fixed") ? fQAg : 65536.0f;
        this.LD.Lxb();
        this.LD.lk(oy2, fOY, f3);
        LD.lk lkVarLxb = this.LD.Lxb(oy2);
        com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ld = new com.bytedance.sdk.component.adexpress.dynamic.ZU.LD();
        ld.Lxb = f;
        ld.LD = f2;
        if (lkVarLxb != null) {
            fOY = lkVarLxb.Lxb;
        }
        ld.lk = fOY;
        if (lkVarLxb != null) {
            fQAg = lkVarLxb.LD;
        }
        ld.ZU = fQAg;
        ld.JXs = "root";
        ld.QAg = 1280.0f;
        ld.lc = oy2;
        oy2.lk(f);
        ld.lc.ZU(ld.LD);
        ld.lc.JXs(ld.lk);
        ld.lc.lc(ld.ZU);
        com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ldLxb = Lxb(ld, 0.0f);
        this.Lxb = ldLxb;
        Lxb(ldLxb);
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ld) {
        if (ld == null) {
            return;
        }
        ld.lc.nBu().LD();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.LD>> list = ld.ebl;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ZU.LD> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.LD> it = list2.iterator();
                while (it.hasNext()) {
                    Lxb(it.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0317  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f4  */
    public com.bytedance.sdk.component.adexpress.dynamic.ZU.LD Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ld, float f) {
        float fLxb;
        float fLxb2;
        float f2;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVar;
        float fLxb3;
        float fLxb4;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ld2;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg qAgLxb;
        float f3;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg qAg;
        LD.lk lkVarLxb;
        LD.lk lkVarLxb2;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ld3 = ld;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy = ld3.lc;
        if (oy == null) {
            return ld3;
        }
        oy.Sfi();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> listKqm = oy.kqm();
        if (listKqm == null || listKqm.size() <= 0) {
            return ld3;
        }
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = oy.nBu().JXs();
        float fKqm = lcVarJXs.kqm();
        float fVVE = lcVarJXs.VVE();
        float fSTP = lcVarJXs.STP();
        float fIeN = lcVarJXs.IeN();
        float fSLN = lcVarJXs.sLN();
        String strDR = lcVarJXs.dR();
        String strNDz = lcVarJXs.NDz();
        float f4 = ld3.Lxb + fIeN;
        float f5 = ld3.LD + fKqm;
        float f6 = fSLN * 2.0f;
        float f7 = ((ld3.lk - fIeN) - fVVE) - f6;
        float f8 = ((ld3.ZU - fKqm) - fSTP) - f6;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg qAg2 = new com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg(f4, f5);
        if (ld3.ebl == null) {
            ld3.ebl = new ArrayList();
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> it = listKqm.iterator();
        float f9 = 0.0f;
        while (it.hasNext()) {
            LD.lk lkVarLxb3 = this.LD.Lxb(it.next());
            if (lkVarLxb3 != null) {
                f9 += lkVarLxb3.LD;
            }
        }
        String str = "space-between";
        String str2 = "space-around";
        if (f9 >= f8) {
            fLxb = 0.0f;
            fLxb2 = 0.0f;
        } else {
            if (TextUtils.equals(strNDz, TtmlNode.CENTER)) {
                fLxb = (f8 - f9) / 2.0f;
            } else if (TextUtils.equals(strNDz, "flex-end")) {
                fLxb = f8 - f9;
            } else if (TextUtils.equals(strNDz, "space-around")) {
                fLxb = nBu.Lxb((f8 - f9) / (listKqm.size() + 1));
                fLxb2 = fLxb;
            } else if (!TextUtils.equals(strNDz, "space-between") || listKqm.size() <= 1) {
                fLxb = 0.0f;
            } else {
                fLxb2 = nBu.Lxb((f8 - f9) / (listKqm.size() - 1));
                fLxb = 0.0f;
            }
            fLxb2 = 0.0f;
        }
        qAg2.LD += fLxb;
        float f10 = f;
        int i = 0;
        while (i < listKqm.size()) {
            List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list = listKqm.get(i);
            int i2 = i + 1;
            List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> list2 = listKqm;
            if (i2 >= ld3.ebl.size()) {
                int size = (i2 - ld3.ebl.size()) + 1;
                int i3 = 0;
                while (i3 < size) {
                    ld3.ebl.add(new ArrayList());
                    i3++;
                    size = size;
                    fLxb2 = fLxb2;
                }
                f2 = fLxb2;
            } else {
                f2 = fLxb2;
            }
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it2 = list.iterator();
            float f11 = 0.0f;
            while (true) {
                lcVar = lcVarJXs;
                if (!it2.hasNext()) {
                    break;
                }
                com.bytedance.sdk.component.adexpress.dynamic.ZU.OY next = it2.next();
                com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs2 = next.nBu().JXs();
                String strKPU = lcVarJXs2.KPU();
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it3 = it2;
                int iSS = lcVarJXs2.SS();
                if (!TextUtils.equals(strKPU, "flex") && iSS != 1 && iSS != 2 && (lkVarLxb2 = this.LD.Lxb(next)) != null) {
                    f11 += lkVarLxb2.Lxb;
                }
                lcVarJXs = lcVar;
                it2 = it3;
            }
            float fMax = Math.max(f7 - f11, 0.0f);
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it4 = list.iterator();
            float f12 = 0.0f;
            while (it4.hasNext()) {
                com.bytedance.sdk.component.adexpress.dynamic.ZU.OY next2 = it4.next();
                com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs3 = next2.nBu().JXs();
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it5 = it4;
                if (lcVarJXs3.SS() != 1 && lcVarJXs3.SS() != 2 && (lkVarLxb = this.LD.Lxb(next2)) != null) {
                    f12 += lkVarLxb.Lxb;
                }
                it4 = it5;
            }
            if (f12 >= f7) {
                fLxb3 = 0.0f;
                fLxb4 = 0.0f;
            } else {
                if (TextUtils.equals(strDR, TtmlNode.CENTER)) {
                    fLxb3 = (f7 - f12) / 2.0f;
                } else if (TextUtils.equals(strDR, "flex-end")) {
                    fLxb3 = f7 - f12;
                } else if (TextUtils.equals(strDR, str2)) {
                    fLxb3 = nBu.Lxb((f7 - f12) / (list.size() + 1));
                    fLxb4 = fLxb3;
                } else if (!TextUtils.equals(strDR, str) || list.size() <= 1) {
                    fLxb3 = 0.0f;
                } else {
                    fLxb4 = nBu.Lxb((f7 - f12) / (list.size() - 1.0f));
                    fLxb3 = 0.0f;
                }
                fLxb4 = 0.0f;
            }
            qAg2.Lxb += fLxb3;
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it6 = list.iterator();
            float fMax2 = 0.0f;
            while (it6.hasNext()) {
                com.bytedance.sdk.component.adexpress.dynamic.ZU.OY next3 = it6.next();
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it7 = it6;
                float f13 = this.LD.Lxb(next3) != null ? this.LD.Lxb(next3).LD : 0.0f;
                com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs4 = next3.nBu().JXs();
                String str3 = str;
                fMax2 = Math.max(fMax2, (lcVarJXs4.SS() == 1 || lcVarJXs4.SS() == 2) ? 0.0f : f13);
                it6 = it7;
                str = str3;
            }
            String str4 = str;
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it8 = list.iterator();
            f10 = f10;
            while (it8.hasNext()) {
                com.bytedance.sdk.component.adexpress.dynamic.ZU.OY next4 = it8.next();
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it9 = it8;
                LD.lk lkVarLxb4 = this.LD.Lxb(next4);
                String str5 = str2;
                com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs5 = next4.nBu().JXs();
                String str6 = strDR;
                float fSRq = lcVarJXs5.sRq();
                float f14 = f10;
                float fJZE = lcVarJXs5.JZE();
                float f15 = f7;
                float fOf = lcVarJXs5.Of();
                float f16 = fLxb4;
                float fLd = lcVarJXs5.Ld();
                com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg qAg3 = qAg2;
                float f17 = lkVarLxb4 == null ? 0.0f : lkVarLxb4.Lxb;
                float f18 = lkVarLxb4 == null ? 0.0f : lkVarLxb4.LD;
                com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy2 = oy;
                float f19 = TextUtils.equals(oy.lk(), "root") ? i2 : f14;
                int i4 = i2;
                if (lcVarJXs5.SS() == 1) {
                    ld2 = ld;
                    qAgLxb = Lxb(ld2, lcVarJXs5, (f17 - fJZE) - fLd, (f18 - fSRq) - fOf);
                } else {
                    ld2 = ld;
                    qAgLxb = qAg3;
                }
                com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg qAgLxb2 = lcVarJXs5.SS() == 2 ? Lxb(lcVarJXs5, this.LD.Lxb(this.lk), new LD.lk((f17 - fJZE) - fLd, (f18 - fSRq) - fOf)) : qAgLxb;
                String strHu = lcVar.Hu();
                if (fMax2 > f18 && !TextUtils.equals(strHu, "flex-start")) {
                    strHu.getClass();
                    if (strHu.equals(TtmlNode.CENTER)) {
                        f3 = (fMax2 - f18) / 2.0f;
                    } else {
                        f3 = !strHu.equals("flex-end") ? 0.0f : fMax2 - f18;
                    }
                }
                com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ld4 = new com.bytedance.sdk.component.adexpress.dynamic.ZU.LD();
                ld4.Lxb = qAgLxb2.Lxb + fLd;
                ld4.LD = qAgLxb2.LD + fSRq + f3;
                ld4.lk = (f17 - fJZE) - fLd;
                ld4.ZU = (f18 - fSRq) - fOf;
                ld4.JXs = ld2.JXs + "." + next4.lk();
                ld4.OY = ld2;
                ld4.lc = next4;
                fMax = fMax;
                ld4.QAg = fMax;
                List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list3 = list;
                ld4.nBu = list3;
                next4.lk(ld4.Lxb);
                ld4.lc.ZU(ld4.LD);
                ld4.lc.JXs(ld4.lk);
                ld4.lc.lc(ld4.ZU);
                float f20 = f19;
                ld2.ebl.get(i4).add(Lxb(ld4, f20));
                if (lcVarJXs5.SS() == 1) {
                    qAg = qAg3;
                } else if (lcVarJXs5.SS() != 2) {
                    qAg = qAg3;
                    qAg.Lxb = f17 + f16 + qAg.Lxb;
                } else {
                    qAg = qAg3;
                }
                list = list3;
                f10 = f20;
                qAg2 = qAg;
                i2 = i4;
                strDR = str6;
                str2 = str5;
                f7 = f15;
                fLxb4 = f16;
                oy = oy2;
                it8 = it9;
            }
            com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg qAg4 = qAg2;
            qAg4.Lxb = f4;
            qAg4.LD = fMax2 + f2 + qAg4.LD;
            ld3 = ld;
            i = i2;
            strDR = strDR;
            listKqm = list2;
            lcVarJXs = lcVar;
            fLxb2 = f2;
            str = str4;
            oy = oy;
        }
        return ld3;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVar, LD.lk lkVar, LD.lk lkVar2) {
        float fWi = lcVar.Wi();
        float fRo = lcVar.ro();
        float fOc = lcVar.oc();
        float fGS = lcVar.gS();
        boolean zWbY = lcVar.wbY();
        boolean zFD = lcVar.FD();
        boolean zAe = lcVar.ae();
        boolean zXr = lcVar.xr();
        if (!zWbY) {
            if (zFD) {
                float f = this.ZU.Lxb;
                fWi = ((f != 0.0f ? Math.min(f, lkVar.Lxb) : lkVar.Lxb) - fOc) - lkVar2.Lxb;
            } else {
                fWi = 0.0f;
            }
        }
        if (!zAe) {
            if (zXr) {
                float f2 = this.ZU.LD;
                if (f2 == 0.0f) {
                    f2 = lkVar.LD;
                }
                fRo = (f2 - fGS) - lkVar2.LD;
            } else {
                fRo = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg(fWi, fRo);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.LD ld, com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVar, float f, float f2) {
        float fC;
        float f3;
        float f4;
        float f5 = ld.Lxb;
        float fC2 = ld.LD;
        float fWi = lcVar.Wi();
        float fRo = lcVar.ro();
        float fOc = lcVar.oc();
        float fGS = lcVar.gS();
        boolean zWbY = lcVar.wbY();
        boolean zFD = lcVar.FD();
        boolean zAe = lcVar.ae();
        boolean zXr = lcVar.xr();
        String strLXE = lcVar.LXE();
        float f6 = ld.lk;
        float f7 = ld.ZU;
        if (TextUtils.equals(strLXE, "0")) {
            if (zWbY) {
                fC = ld.Lxb + fWi;
            } else if (zFD) {
                fC = ((ld.Lxb + f6) - fOc) - f;
            }
            if (zAe) {
                fC = f5;
                f4 = ld.LD;
                fC2 = f4 + fRo;
            } else if (zXr) {
                f3 = ld.LD;
                fC2 = ((f3 + f7) - fGS) - f2;
            }
        } else {
            if (TextUtils.equals(strLXE, "1")) {
                fC = DM.c(f6, f, 2.0f, ld.Lxb);
                if (zAe) {
                    f4 = ld.LD;
                    fC2 = f4 + fRo;
                } else if (zXr) {
                    f3 = ld.LD;
                    fC2 = ((f3 + f7) - fGS) - f2;
                }
            } else if (TextUtils.equals(strLXE, "2")) {
                fC2 = DM.c(f7, f2, 2.0f, ld.LD);
                if (zWbY) {
                    fC = ld.Lxb + fWi;
                } else {
                    fC = zFD ? ((ld.Lxb + f6) - fOc) - f : f5;
                }
            } else if (TextUtils.equals(strLXE, ExifInterface.GPS_MEASUREMENT_3D)) {
                fC = DM.c(f6, f, 2.0f, ld.Lxb);
                fC2 = DM.c(f7, f2, 2.0f, ld.LD);
            } else {
                fC = f5;
            }
            fC2 = fC2;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.ZU.QAg(fC, fC2);
    }
}
