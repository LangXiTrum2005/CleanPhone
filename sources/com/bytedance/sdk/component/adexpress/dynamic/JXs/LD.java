package com.bytedance.sdk.component.adexpress.dynamic.JXs;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private double JXs;
    private String OY;
    private NXR QAg;
    private double ebl;
    private int lc;
    public Map<String, lk> Lxb = new HashMap();
    public Map<String, lk> LD = new HashMap();
    public Map<String, lk> lk = new HashMap();
    private double ZU = Math.random();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.JXs.LD$LD, reason: collision with other inner class name */
    public static class C0055LD {
        float JXs;
        int LD;
        float Lxb;
        double ZU;
        int lk;

        public static JSONObject Lxb(C0055LD c0055ld) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0055ld.Lxb);
                jSONObject.put("letterSpacing", c0055ld.LD);
                jSONObject.put("lineHeight", c0055ld.ZU);
                jSONObject.put("maxWidth", c0055ld.JXs);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0055ld.lk);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public static class Lxb implements Cloneable {
        boolean LD;
        float Lxb;
        float lk;

        public Object clone() {
            try {
                return (Lxb) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    public static class lk {
        float LD;
        float Lxb;

        public lk() {
        }

        public lk(float f, float f2) {
            this.Lxb = f;
            this.LD = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.Lxb + ", height=" + this.LD + '}';
        }
    }

    public LD(double d, int i, double d2, String str, NXR nxr) {
        this.JXs = d;
        this.lc = i;
        this.ebl = d2;
        this.OY = str;
        this.QAg = nxr;
    }

    private lk JXs(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, float f, float f2) {
        String str = oy.lk() + "_" + f + "_" + f2;
        if (this.lk.containsKey(str)) {
            return this.lk.get(str);
        }
        lk lkVarLc = lc(oy, f, f2);
        this.lk.put(str, lkVarLc);
        return lkVarLc;
    }

    private lk lc(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, float f, float f2) {
        new lk();
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = oy.nBu().JXs();
        oy.nBu().lk();
        lcVarJXs.Sv();
        float fBrP = lcVarJXs.brP();
        int iNs = lcVarJXs.Ns();
        double dLpq = lcVarJXs.Lpq();
        int iUxf = lcVarJXs.uxf();
        boolean zJJ = lcVarJXs.JJ();
        boolean zNu = lcVarJXs.Nu();
        int iVU = lcVarJXs.VU();
        C0055LD c0055ld = new C0055LD();
        c0055ld.Lxb = fBrP;
        c0055ld.LD = iNs;
        c0055ld.lk = iUxf;
        c0055ld.ZU = dLpq;
        c0055ld.JXs = f;
        return Lxb(oy.nBu().lk(), c0055ld, zJJ, zNu, iVU, oy);
    }

    public lk LD(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, float f, float f2) {
        lk lkVar = new lk();
        if (oy.nBu().JXs() == null) {
            return lkVar;
        }
        lk lkVarJXs = JXs(oy, f, f2);
        float f3 = lkVarJXs.Lxb;
        float f4 = lkVarJXs.LD;
        lkVar.Lxb = Math.min(f3, f);
        lkVar.LD = Math.min(f4, f2);
        return lkVar;
    }

    public lk Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, float f, float f2) {
        float f3;
        if (TextUtils.isEmpty(oy.nBu().lk()) && oy.nBu().JXs().bG() == null) {
            return new lk(0.0f, 0.0f);
        }
        if (AbstractC5044xl.u(oy, "creative-playable-bait")) {
            return new lk(0.0f, 0.0f);
        }
        float fOY = oy.OY();
        float fQAg = oy.QAg();
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = oy.nBu().JXs();
        String strKPU = lcVarJXs.KPU();
        String strFoI = lcVarJXs.foI();
        float fNXR = oy.NXR();
        float fSTP = oy.STP();
        float fIeN = oy.IeN();
        float fVVE = oy.VVE();
        if (TextUtils.equals(strKPU, "fixed")) {
            f = Math.min(fOY, f);
            if (TextUtils.equals(strFoI, "auto")) {
                f3 = LD(oy, f - fIeN, f2 - fVVE).LD;
                fQAg = f3 + fVVE;
            }
        } else if (TextUtils.equals(strKPU, "auto")) {
            lk lkVarLD = LD(oy, f - fIeN, f2 - fVVE);
            f = lkVarLD.Lxb + fIeN;
            if (TextUtils.equals(strFoI, "auto")) {
                f3 = lkVarLD.LD;
                fQAg = f3 + fVVE;
            }
        } else if (!TextUtils.equals(strKPU, "flex")) {
            f = fOY;
        } else if (TextUtils.equals(strFoI, "auto")) {
            f3 = LD(oy, f - fIeN, f2 - fVVE).LD;
            fQAg = f3 + fVVE;
        }
        if (TextUtils.equals(strFoI, "scale")) {
            float fRound = Math.round((f - fNXR) / fQAg) + fSTP;
            if (fRound > f2) {
                f = Math.round((f2 - fSTP) * fQAg) + fNXR;
            } else {
                f2 = fRound;
            }
        } else if (TextUtils.equals(strFoI, "fixed")) {
            f2 = Math.min(fQAg + fSTP, f2);
        } else if (!TextUtils.equals(strFoI, "flex")) {
            f2 = fQAg;
        }
        lk lkVar = new lk();
        lkVar.Lxb = f;
        lkVar.LD = f2;
        return lkVar;
    }

    public lk ZU(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, float f, float f2) {
        float fMin;
        lk lkVar = new lk();
        float f3 = 0.0f;
        if (f2 <= 0.0f || f <= 0.0f) {
            lkVar.Lxb = 0.0f;
            lkVar.LD = 0.0f;
            return lkVar;
        }
        if (oy.brP()) {
            return Lxb(oy, f, f2);
        }
        float fOY = oy.OY();
        float fQAg = oy.QAg();
        float fIeN = oy.IeN();
        float fVVE = oy.VVE();
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = oy.nBu().JXs();
        String strKPU = lcVarJXs.KPU();
        String strFoI = lcVarJXs.foI();
        float fMin2 = ((TextUtils.equals(strKPU, "flex") || TextUtils.equals(strKPU, "auto")) ? f : Math.min(fOY, f)) - fIeN;
        if (TextUtils.equals(strFoI, "scale")) {
            fMin = Math.round(fMin2 / fQAg) + fVVE;
            if (fMin > f2) {
                fMin2 = Math.round((f2 - fVVE) * fQAg);
            }
        } else {
            fMin = (TextUtils.equals(strFoI, "auto") || TextUtils.equals(strFoI, "flex")) ? f2 : Math.min(fQAg, f2);
        }
        float f4 = fMin - fVVE;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> listKqm = oy.kqm();
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> it = listKqm.iterator();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        while (it.hasNext()) {
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> it2 = it;
            List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> next = it.next();
            lk lkVar2 = lkVar;
            lk lkVarLD = LD(next, fMin2, f4);
            if (LD(next)) {
                f3 += 1.0f;
            } else {
                fMax = Math.max(fMax, lkVarLD.Lxb);
            }
            float f5 = f3;
            fMax2 = oy.nBu().LD().equals("carousel") ? Math.max(oy.QAg(), lkVarLD.LD) : fMax2 + lkVarLD.LD;
            lkVar = lkVar2;
            it = it2;
            f3 = f5;
        }
        lk lkVar3 = lkVar;
        if (TextUtils.equals(strKPU, "auto")) {
            if (f3 == listKqm.size()) {
                fMin2 = f;
            } else {
                for (List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list : listKqm) {
                    lk(list);
                    LD(list, fMax, f4);
                }
                fMin2 = fMax;
            }
        }
        if (TextUtils.equals(strFoI, "auto")) {
            if (fMax2 <= f2) {
                f4 = fMax2;
            } else {
                Lxb(listKqm, fMin2, f4);
            }
        } else if ((TextUtils.equals(strFoI, "fixed") || TextUtils.equals(strFoI, "flex")) && f4 < fMax2) {
            Lxb(listKqm, fMin2, f4);
        }
        lkVar3.Lxb = Math.min(fMin2 + fIeN, f);
        lkVar3.LD = Math.min(f4 + fVVE, f2);
        return lkVar3;
    }

    public lk lk(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, float f, float f2) {
        if (oy == null) {
            return null;
        }
        lk lkVarLxb = Lxb(oy);
        if (lkVarLxb != null && (lkVarLxb.Lxb != 0.0f || lkVarLxb.LD != 0.0f)) {
            return lkVarLxb;
        }
        lk lkVarZU = ZU(oy, f, f2);
        Lxb(oy, lkVarZU);
        return lkVarZU;
    }

    private lk lk(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list, float f, float f2) {
        float fMax;
        ZU(list);
        lk lkVar = new lk();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy : list) {
            com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = oy.nBu().JXs();
            if (lcVarJXs.SS() == 1 || lcVarJXs.SS() == 2) {
                arrayList.add(oy);
            }
            if (lcVarJXs.SS() != 1 && lcVarJXs.SS() != 2) {
                arrayList2.add(oy);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lk((com.bytedance.sdk.component.adexpress.dynamic.ZU.OY) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return lkVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(lk((com.bytedance.sdk.component.adexpress.dynamic.ZU.OY) it2.next(), f, f2).Lxb));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            fMax = 0.0f;
            if (i >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy2 = (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY) arrayList2.get(i);
            String strKPU = oy2.nBu().JXs().KPU();
            float fOY = oy2.OY();
            boolean zEquals = TextUtils.equals(strKPU, "flex");
            if (TextUtils.equals(strKPU, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> listKqm = oy2.kqm();
                if (listKqm == null || listKqm.size() <= 0) {
                    zEquals = false;
                    break;
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> it3 = listKqm.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        zEquals = false;
                        break;
                    }
                    if (LD(it3.next())) {
                        zEquals = true;
                        break;
                    }
                }
            }
            Lxb lxb = new Lxb();
            if (!zEquals) {
                fOY = ((Float) arrayList3.get(i)).floatValue();
            }
            lxb.Lxb = fOY;
            lxb.LD = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i)).floatValue();
            }
            lxb.lk = fMax;
            arrayList4.add(lxb);
            i++;
        }
        Lxb(arrayList4, f, arrayList2);
        List<Lxb> listLxb = nBu.Lxb(f, arrayList4);
        float f3 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f3 += listLxb.get(i2).Lxb;
            if (((Float) arrayList3.get(i2)).floatValue() != listLxb.get(i2).Lxb) {
                ZU((com.bytedance.sdk.component.adexpress.dynamic.ZU.OY) arrayList2.get(i2));
            }
        }
        Iterator it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (it4.hasNext()) {
            i3++;
            if (!LD((com.bytedance.sdk.component.adexpress.dynamic.ZU.OY) it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        fMax = z ? f2 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy3 = (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY) arrayList2.get(i4);
            lk lkVarLk = lk(oy3, listLxb.get(i4).Lxb, f2);
            if (!LD(oy3)) {
                fMax = Math.max(fMax, lkVarLk.LD);
            }
            arrayList5.add(lkVarLk);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((lk) it5.next()).LD));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy4 = (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY) arrayList2.get(i5);
                if (LD(oy4) && ((Float) arrayList6.get(i5)).floatValue() != fMax) {
                    ZU(oy4);
                    lk(oy4, listLxb.get(i5).Lxb, fMax);
                }
            }
        }
        lkVar.Lxb = f3;
        lkVar.LD = fMax;
        return lkVar;
    }

    private boolean LD(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> listKqm;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().nBu().JXs().KPU(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy : list) {
                if (TextUtils.equals(oy.nBu().JXs().KPU(), "auto") && (listKqm = oy.kqm()) != null) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> it2 = listKqm.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> next = it2.next();
                            i++;
                            if (LD(next)) {
                                if (i == next.size()) {
                                    z = true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return z;
        }
    }

    private String JXs(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        return oy.lk();
    }

    private lk LD(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list, float f, float f2) {
        lk lkVarLxb = Lxb(list);
        if (lkVarLxb != null && (lkVarLxb.Lxb != 0.0f || lkVarLxb.LD != 0.0f)) {
            return lkVarLxb;
        }
        lk lkVarLk = lk(list, f, f2);
        Lxb(list, lkVarLk);
        return lkVarLk;
    }

    private boolean LD(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        if (oy == null) {
            return false;
        }
        if (TextUtils.equals(oy.nBu().JXs().foI(), "flex")) {
            return true;
        }
        return lk(oy);
    }

    private lk Lxb(String str, C0055LD c0055ld, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        return JVA.Lxb(str, oy.nBu().LD(), C0055LD.Lxb(c0055ld).toString(), z, z2, i, oy, this.JXs, this.lc, this.ebl, this.OY, this.QAg);
    }

    private void ZU(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        this.Lxb.remove(JXs(oy));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> listKqm = oy.kqm();
        if (listKqm == null || listKqm.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> it = listKqm.iterator();
        while (it.hasNext()) {
            lk(it.next());
        }
    }

    private void Lxb(List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (Lxb(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list2 : list) {
            Lxb lxb = new Lxb();
            boolean zLxb = Lxb(list2, !z);
            lxb.Lxb = zLxb ? 1.0f : LD(list2, f, f2).LD;
            lxb.LD = !zLxb;
            arrayList.add(lxb);
        }
        List<Lxb> listLxb = nBu.Lxb(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((Lxb) arrayList.get(i)).Lxb != listLxb.get(i).Lxb) {
                List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list3 = list.get(i);
                lk(list3);
                LD(list3, f, listLxb.get(i).Lxb);
            }
        }
    }

    private String ZU(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String strLk = list.get(i).lk();
            if (i < list.size() - 1) {
                sb.append(strLk);
                sb.append("-");
            } else {
                sb.append(strLk);
            }
        }
        return sb.toString();
    }

    private boolean Lxb(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list, boolean z) {
        for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy : list) {
            com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = oy.nBu().JXs();
            String strFoI = lcVarJXs.foI();
            if (TextUtils.equals(strFoI, "flex") || (z && ((TextUtils.equals(lcVarJXs.KPU(), "flex") && TextUtils.equals(lcVarJXs.foI(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.ZU.JXs.Lxb.get(oy.nBu().LD()).intValue() == 7) || TextUtils.equals(strFoI, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it = list.iterator();
        while (it.hasNext()) {
            if (lk(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean lk(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> listKqm;
        if (!oy.brP() && TextUtils.equals(oy.nBu().JXs().foI(), "auto") && (listKqm = oy.kqm()) != null && listKqm.size() > 0) {
            if (listKqm.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it = listKqm.get(0).iterator();
                while (it.hasNext()) {
                    if (!LD(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>> it2 = listKqm.iterator();
            while (it2.hasNext()) {
                if (Lxb(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void Lxb(List<Lxb> list, float f, List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list2) {
        float f2 = 0.0f;
        for (Lxb lxb : list) {
            if (lxb.LD) {
                f2 += lxb.Lxb;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).LD && list2.get(i2).HD()) {
                    i++;
                }
            }
            if (i > 0) {
                float fCeil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    Lxb lxb2 = list.get(i3);
                    if (lxb2.LD && list2.get(i3).HD()) {
                        lxb2.Lxb -= fCeil;
                    }
                }
            }
        }
    }

    private void lk(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.LD.remove(ZU(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it = list.iterator();
        while (it.hasNext()) {
            ZU(it.next());
        }
    }

    public void Lxb() {
        this.lk.clear();
        this.Lxb.clear();
        this.LD.clear();
    }

    public lk Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        return this.Lxb.get(JXs(oy));
    }

    public lk Lxb(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list) {
        return this.LD.get(ZU(list));
    }

    private void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, lk lkVar) {
        this.Lxb.put(JXs(oy), lkVar);
    }

    private void Lxb(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> list, lk lkVar) {
        this.LD.put(ZU(list), lkVar);
    }
}
