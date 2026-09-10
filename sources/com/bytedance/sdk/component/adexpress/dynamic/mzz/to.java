package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class to {
    public static float qdl(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<ud.qdl> qdl(float f, List<ud.qdl> list) {
        ArrayList<ud.qdl> arrayList = new ArrayList();
        Iterator<ud.qdl> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((ud.qdl) it.next().clone());
        }
        boolean z2 = true;
        int i2 = 0;
        int i3 = 0;
        for (ud.qdl qdlVar : arrayList) {
            if (qdlVar.ud) {
                i2 = (int) (i2 + qdlVar.qdl);
            } else {
                i3 = (int) (i3 + qdlVar.qdl);
                z2 = false;
            }
        }
        if (!z2 || f <= i2) {
            float f2 = i2;
            float f3 = f < f2 ? f / f2 : 1.0f;
            float f4 = f > f2 ? (f - f2) / i3 : 0.0f;
            if (f4 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (ud.qdl qdlVar2 : arrayList) {
                    if (!qdlVar2.ud) {
                        float f5 = qdlVar2.lnr;
                        if (f5 != 0.0f && qdlVar2.qdl * f4 > f5) {
                            qdlVar2.qdl = f5;
                            qdlVar2.ud = true;
                            z3 = true;
                        }
                    }
                    arrayList2.add(qdlVar2);
                }
                if (z3) {
                    return qdl(f, arrayList2);
                }
            }
            int i4 = 0;
            for (ud.qdl qdlVar3 : arrayList) {
                if (qdlVar3.ud) {
                    qdlVar3.qdl = qdl(qdlVar3.qdl * f3);
                } else {
                    qdlVar3.qdl = qdl(qdlVar3.qdl * f4);
                }
                i4 = (int) (i4 + qdlVar3.qdl);
            }
            float f6 = i4;
            if (f6 < f) {
                float f7 = f - f6;
                for (int size = 0; size < arrayList.size() && f7 > 0.0f; size = (size + 1) % arrayList.size()) {
                    ud.qdl qdlVar4 = (ud.qdl) arrayList.get(size);
                    if ((f < f2 && qdlVar4.ud) || (f > f2 && !qdlVar4.ud)) {
                        qdlVar4.qdl += 0.0625f;
                        f7 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
