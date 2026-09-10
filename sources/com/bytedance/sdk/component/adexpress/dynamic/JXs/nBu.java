package com.bytedance.sdk.component.adexpress.dynamic.JXs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    public static float Lxb(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<LD.Lxb> Lxb(float f, List<LD.Lxb> list) {
        ArrayList<LD.Lxb> arrayList = new ArrayList();
        Iterator<LD.Lxb> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((LD.Lxb) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (LD.Lxb lxb : arrayList) {
            if (lxb.LD) {
                i = (int) (i + lxb.Lxb);
            } else {
                i2 = (int) (i2 + lxb.Lxb);
                z = false;
            }
        }
        if (z && f > i) {
            return arrayList;
        }
        float f2 = i;
        float f3 = f < f2 ? f / f2 : 1.0f;
        float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
        if (f4 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (LD.Lxb lxb2 : arrayList) {
                if (!lxb2.LD) {
                    float f5 = lxb2.lk;
                    if (f5 != 0.0f && lxb2.Lxb * f4 > f5) {
                        lxb2.Lxb = f5;
                        lxb2.LD = true;
                        z2 = true;
                    }
                }
                arrayList2.add(lxb2);
            }
            if (z2) {
                return Lxb(f, arrayList2);
            }
        }
        int i3 = 0;
        for (LD.Lxb lxb3 : arrayList) {
            if (lxb3.LD) {
                lxb3.Lxb = Lxb(lxb3.Lxb * f3);
            } else {
                lxb3.Lxb = Lxb(lxb3.Lxb * f4);
            }
            i3 = (int) (i3 + lxb3.Lxb);
        }
        float f6 = i3;
        if (f6 < f) {
            float f7 = f - f6;
            for (int size = 0; size < arrayList.size() && f7 > 0.0f; size = (size + 1) % arrayList.size()) {
                LD.Lxb lxb4 = (LD.Lxb) arrayList.get(size);
                if ((f < f2 && lxb4.LD) || (f > f2 && !lxb4.LD)) {
                    lxb4.Lxb += 0.0625f;
                    f7 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
