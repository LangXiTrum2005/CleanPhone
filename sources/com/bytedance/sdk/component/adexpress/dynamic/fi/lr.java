package com.bytedance.sdk.component.adexpress.dynamic.fi;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.lr.aw;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private int di;
    private double fi;
    private aw jbs;
    private String mj;
    private double xha;
    public Map<String, ik> ri = new HashMap();
    public Map<String, ik> lr = new HashMap();
    public Map<String, ik> ik = new HashMap();
    private double ka = Math.random();

    public static class ik {
        float lr;
        float ri;

        public ik() {
        }

        public String toString() {
            return "UnitSize{width=" + this.ri + ", height=" + this.lr + '}';
        }

        public ik(float f, float f2) {
            this.ri = f;
            this.lr = f2;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.lr$lr, reason: collision with other inner class name */
    public static class C0205lr {
        float fi;
        int ik;
        double ka;
        int lr;
        float ri;

        public static JSONObject ri(C0205lr c0205lr) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0205lr.ri);
                jSONObject.put("letterSpacing", c0205lr.lr);
                jSONObject.put("lineHeight", c0205lr.ka);
                jSONObject.put("maxWidth", c0205lr.fi);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0205lr.ik);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public static class ri implements Cloneable {
        float ik;
        boolean lr;
        float ri;

        public Object clone() {
            try {
                return (ri) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    public lr(double d, int i, double d2, String str, aw awVar) {
        this.fi = d;
        this.di = i;
        this.xha = d2;
        this.mj = str;
        this.jbs = awVar;
    }

    private ik di(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, float f, float f2) {
        new ik();
        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = mjVar.qt().fi();
        mjVar.qt().ik();
        diVarFi.xm();
        float fNr = diVarFi.nr();
        int iWhw = diVarFi.whw();
        double dSiy = diVarFi.siy();
        int iRzk = diVarFi.rzk();
        boolean zFeb = diVarFi.feb();
        boolean zQh = diVarFi.qh();
        int iZyn = diVarFi.zyn();
        C0205lr c0205lr = new C0205lr();
        c0205lr.ri = fNr;
        c0205lr.lr = iWhw;
        c0205lr.ik = iRzk;
        c0205lr.ka = dSiy;
        c0205lr.fi = f;
        return ri(mjVar.qt().ik(), c0205lr, zFeb, zQh, iZyn, mjVar);
    }

    private ik fi(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, float f, float f2) {
        String str = mjVar.ik() + "_" + f + "_" + f2;
        if (this.ik.containsKey(str)) {
            return this.ik.get(str);
        }
        ik ikVarDi = di(mjVar, f, f2);
        this.ik.put(str, ikVarDi);
        return ikVarDi;
    }

    public ik ik(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, float f, float f2) {
        if (mjVar == null) {
            return null;
        }
        ik ikVarRi = ri(mjVar);
        if (ikVarRi != null && (ikVarRi.ri != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ikVarRi.lr != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return ikVarRi;
        }
        ik ikVarKa = ka(mjVar, f, f2);
        ri(mjVar, ikVarKa);
        return ikVarKa;
    }

    public ik ka(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, float f, float f2) {
        float fMin;
        float f3;
        float f4;
        ik ikVar = new ik();
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ikVar.ri = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ikVar.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return ikVar;
        }
        if (mjVar.nr()) {
            return ri(mjVar, f, f2);
        }
        float fMj = mjVar.mj();
        float fJbs = mjVar.jbs();
        float fVr = mjVar.vr();
        float fSlm = mjVar.slm();
        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = mjVar.qt().fi();
        String strZf = diVarFi.zf();
        String strIgq = diVarFi.igq();
        float fMin2 = ((TextUtils.equals(strZf, "flex") || TextUtils.equals(strZf, "auto")) ? f : Math.min(fMj, f)) - fVr;
        if (TextUtils.equals(strIgq, "scale")) {
            fMin = Math.round(fMin2 / fJbs) + fSlm;
            if (fMin > f2) {
                fMin2 = Math.round((f2 - fSlm) * fJbs);
            }
        } else {
            fMin = (TextUtils.equals(strIgq, "auto") || TextUtils.equals(strIgq, "flex")) ? f2 : Math.min(fJbs, f2);
        }
        float f6 = fMin - fSlm;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> listBu = mjVar.bu();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list : listBu) {
            float f7 = f5;
            float f8 = fVr;
            ik ikVarLr = lr(list, fMin2, f6);
            if (lr(list)) {
                f4 = f7 + 1.0f;
            } else {
                fMax = Math.max(fMax, ikVarLr.ri);
                f4 = f7;
            }
            float f9 = f4;
            float f10 = fMin2;
            fMax2 = mjVar.qt().lr().equals("carousel") ? Math.max(mjVar.jbs(), ikVarLr.lr) : fMax2 + ikVarLr.lr;
            fVr = f8;
            f5 = f9;
            fMin2 = f10;
        }
        float f11 = f5;
        float f12 = fMin2;
        float f13 = fVr;
        if (!TextUtils.equals(strZf, "auto")) {
            f3 = f12;
        } else if (f11 == listBu.size()) {
            f3 = f;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list2 : listBu) {
                ik(list2);
                lr(list2, fMax, f6);
            }
            f3 = fMax;
        }
        if (TextUtils.equals(strIgq, "auto")) {
            if (fMax2 <= f2) {
                f6 = fMax2;
            } else {
                ri(listBu, f3, f6);
            }
        } else if ((TextUtils.equals(strIgq, "fixed") || TextUtils.equals(strIgq, "flex")) && f6 < fMax2) {
            ri(listBu, f3, f6);
        }
        ikVar.ri = Math.min(f3 + f13, f);
        ikVar.lr = Math.min(f6 + fSlm, f2);
        return ikVar;
    }

    public ik lr(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, float f, float f2) {
        ik ikVar = new ik();
        if (mjVar.qt().fi() == null) {
            return ikVar;
        }
        ik ikVarFi = fi(mjVar, f, f2);
        float f3 = ikVarFi.ri;
        float f4 = ikVarFi.lr;
        ikVar.ri = Math.min(f3, f);
        ikVar.lr = Math.min(f4, f2);
        return ikVar;
    }

    public ik ri(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, float f, float f2) {
        float f3;
        if (TextUtils.isEmpty(mjVar.qt().ik()) && mjVar.qt().fi().yjm() == null) {
            return new ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (TextUtils.equals(mjVar.qt().lr(), "creative-playable-bait")) {
            return new ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float fMj = mjVar.mj();
        float fJbs = mjVar.jbs();
        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = mjVar.qt().fi();
        String strZf = diVarFi.zf();
        String strIgq = diVarFi.igq();
        float fAw = mjVar.aw();
        float fBgr = mjVar.bgr();
        float fVr = mjVar.vr();
        float fSlm = mjVar.slm();
        if (TextUtils.equals(strZf, "fixed")) {
            f = Math.min(fMj, f);
            if (TextUtils.equals(strIgq, "auto")) {
                f3 = lr(mjVar, f - fVr, f2 - fSlm).lr;
                fJbs = f3 + fSlm;
            }
        } else if (TextUtils.equals(strZf, "auto")) {
            ik ikVarLr = lr(mjVar, f - fVr, f2 - fSlm);
            f = ikVarLr.ri + fVr;
            if (TextUtils.equals(strIgq, "auto")) {
                f3 = ikVarLr.lr;
                fJbs = f3 + fSlm;
            }
        } else if (!TextUtils.equals(strZf, "flex")) {
            f = fMj;
        } else if (TextUtils.equals(strIgq, "auto")) {
            f3 = lr(mjVar, f - fVr, f2 - fSlm).lr;
            fJbs = f3 + fSlm;
        }
        if (TextUtils.equals(strIgq, "scale")) {
            float fRound = Math.round((f - fAw) / fJbs) + fBgr;
            if (fRound > f2) {
                f = Math.round((f2 - fBgr) * fJbs) + fAw;
            } else {
                f2 = fRound;
            }
        } else if (TextUtils.equals(strIgq, "fixed")) {
            f2 = Math.min(fJbs + fBgr, f2);
        } else if (!TextUtils.equals(strIgq, "flex")) {
            f2 = fJbs;
        }
        ik ikVar = new ik();
        ikVar.ri = f;
        ikVar.lr = f2;
        return ikVar;
    }

    private ik ik(List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list, float f, float f2) {
        float fMax;
        ka(list);
        ik ikVar = new ik();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = mjVar.qt().fi();
            if (diVarFi.gcp() == 1 || diVarFi.gcp() == 2) {
                arrayList.add(mjVar);
            }
            if (diVarFi.gcp() != 1 && diVarFi.gcp() != 2) {
                arrayList2.add(mjVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ik((com.bytedance.sdk.component.adexpress.dynamic.ka.mj) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return ikVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(ik(it2.next(), f, f2).ri));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            int size = arrayList2.size();
            fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i >= size) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar2 = arrayList2.get(i);
            String strZf = mjVar2.qt().fi().zf();
            float fMj = mjVar2.mj();
            boolean zEquals = TextUtils.equals(strZf, "flex");
            if (TextUtils.equals(strZf, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> listBu = mjVar2.bu();
                if (listBu == null || listBu.size() <= 0) {
                    zEquals = false;
                    break;
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> it3 = listBu.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        zEquals = false;
                        break;
                    }
                    if (lr(it3.next())) {
                        zEquals = true;
                        break;
                    }
                }
            }
            ri riVar = new ri();
            if (!zEquals) {
                fMj = ((Float) arrayList3.get(i)).floatValue();
            }
            riVar.ri = fMj;
            riVar.lr = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i)).floatValue();
            }
            riVar.ik = fMax;
            arrayList4.add(riVar);
            i++;
        }
        ri(arrayList4, f, arrayList2);
        List<ri> listRi = qt.ri(f, arrayList4);
        float f3 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f3 += listRi.get(i2).ri;
            if (((Float) arrayList3.get(i2)).floatValue() != listRi.get(i2).ri) {
                ka(arrayList2.get(i2));
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (it4.hasNext()) {
            i3++;
            if (!lr(it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        if (z) {
            fMax = f2;
        }
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar3 = arrayList2.get(i4);
            ik ikVarIk = ik(mjVar3, listRi.get(i4).ri, f2);
            if (!lr(mjVar3)) {
                fMax = Math.max(fMax, ikVarIk.lr);
            }
            arrayList5.add(ikVarIk);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((ik) it5.next()).lr));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar4 = arrayList2.get(i5);
                if (lr(mjVar4) && ((Float) arrayList6.get(i5)).floatValue() != fMax) {
                    ka(mjVar4);
                    ik(mjVar4, listRi.get(i5).ri, fMax);
                }
            }
        }
        ikVar.ri = f3;
        ikVar.lr = fMax;
        return ikVar;
    }

    private boolean lr(List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> listBu;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().qt().fi().zf(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar : list) {
                if (TextUtils.equals(mjVar.qt().fi().zf(), "auto") && (listBu = mjVar.bu()) != null) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> it2 = listBu.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> next = it2.next();
                            i++;
                            if (lr(next)) {
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

    private String fi(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        return mjVar.ik();
    }

    private ik lr(List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list, float f, float f2) {
        ik ikVarRi = ri(list);
        if (ikVarRi != null && (ikVarRi.ri != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ikVarRi.lr != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return ikVarRi;
        }
        ik ikVarIk = ik(list, f, f2);
        ri(list, ikVarIk);
        return ikVarIk;
    }

    private boolean lr(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        if (mjVar == null) {
            return false;
        }
        if (TextUtils.equals(mjVar.qt().fi().igq(), "flex")) {
            return true;
        }
        return ik(mjVar);
    }

    private ik ri(String str, C0205lr c0205lr, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        return sf.ri(str, mjVar.qt().lr(), C0205lr.ri(c0205lr).toString(), z, z2, i, mjVar, this.fi, this.di, this.xha, this.mj, this.jbs);
    }

    private void ri(List<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (ri(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list2 : list) {
            ri riVar = new ri();
            boolean zRi = ri(list2, !z);
            riVar.ri = zRi ? 1.0f : lr(list2, f, f2).lr;
            riVar.lr = !zRi;
            arrayList.add(riVar);
        }
        List<ri> listRi = qt.ri(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((ri) arrayList.get(i)).ri != listRi.get(i).ri) {
                List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list3 = list.get(i);
                ik(list3);
                lr(list3, f, listRi.get(i).ri);
            }
        }
    }

    private void ka(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        this.ri.remove(fi(mjVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> listBu = mjVar.bu();
        if (listBu == null || listBu.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> it = listBu.iterator();
        while (it.hasNext()) {
            ik(it.next());
        }
    }

    private String ka(List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String strIk = list.get(i).ik();
            if (i < list.size() - 1) {
                sb.append(strIk);
                sb.append("-");
            } else {
                sb.append(strIk);
            }
        }
        return sb.toString();
    }

    private boolean ri(List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list, boolean z) {
        for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = mjVar.qt().fi();
            String strIgq = diVarFi.igq();
            if (TextUtils.equals(strIgq, "flex") || (z && ((TextUtils.equals(diVarFi.zf(), "flex") && TextUtils.equals(diVarFi.igq(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.ka.fi.ri.get(mjVar.qt().lr()).intValue() == 7) || TextUtils.equals(strIgq, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it = list.iterator();
        while (it.hasNext()) {
            if (ik(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean ik(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> listBu;
        if (!mjVar.nr() && TextUtils.equals(mjVar.qt().fi().igq(), "auto") && (listBu = mjVar.bu()) != null && listBu.size() > 0) {
            if (listBu.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it = listBu.get(0).iterator();
                while (it.hasNext()) {
                    if (!lr(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>> it2 = listBu.iterator();
            while (it2.hasNext()) {
                if (ri(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void ri(List<ri> list, float f, List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list2) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (ri riVar : list) {
            if (riVar.lr) {
                f2 += riVar.ri;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).lr && list2.get(i2).uq()) {
                    i++;
                }
            }
            if (i > 0) {
                float fCeil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    ri riVar2 = list.get(i3);
                    if (riVar2.lr && list2.get(i3).uq()) {
                        riVar2.ri -= fCeil;
                    }
                }
            }
        }
    }

    private void ik(List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.lr.remove(ka(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> it = list.iterator();
        while (it.hasNext()) {
            ka(it.next());
        }
    }

    public void ri() {
        this.ik.clear();
        this.ri.clear();
        this.lr.clear();
    }

    public ik ri(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        return this.ri.get(fi(mjVar));
    }

    public ik ri(List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list) {
        return this.lr.get(ka(list));
    }

    private void ri(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, ik ikVar) {
        this.ri.put(fi(mjVar), ikVar);
    }

    private void ri(List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> list, ik ikVar) {
        this.lr.put(ka(list), ikVar);
    }
}
