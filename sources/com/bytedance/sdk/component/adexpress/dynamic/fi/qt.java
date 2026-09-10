package com.bytedance.sdk.component.adexpress.dynamic.fi;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    public static float ri(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<lr.ri> ri(float f, List<lr.ri> list) {
        ArrayList<lr.ri> arrayList = new ArrayList();
        Iterator<lr.ri> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((lr.ri) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (lr.ri riVar : arrayList) {
            if (riVar.lr) {
                i = (int) (i + riVar.ri);
            } else {
                i2 = (int) (i2 + riVar.ri);
                z = false;
            }
        }
        if (!z || f <= i) {
            float f2 = i;
            float f3 = f < f2 ? f / f2 : 1.0f;
            float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
            if (f4 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (lr.ri riVar2 : arrayList) {
                    if (!riVar2.lr) {
                        float f5 = riVar2.ik;
                        if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && riVar2.ri * f4 > f5) {
                            riVar2.ri = f5;
                            riVar2.lr = true;
                            z2 = true;
                        }
                    }
                    arrayList2.add(riVar2);
                }
                if (z2) {
                    return ri(f, arrayList2);
                }
            }
            int i3 = 0;
            for (lr.ri riVar3 : arrayList) {
                if (riVar3.lr) {
                    riVar3.ri = ri(riVar3.ri * f3);
                } else {
                    riVar3.ri = ri(riVar3.ri * f4);
                }
                i3 = (int) (i3 + riVar3.ri);
            }
            float f6 = i3;
            if (f6 < f) {
                float f7 = f - f6;
                for (int size = 0; size < arrayList.size() && f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT; size = (size + 1) % arrayList.size()) {
                    lr.ri riVar4 = (lr.ri) arrayList.get(size);
                    if ((f < f2 && riVar4.lr) || (f > f2 && !riVar4.lr)) {
                        riVar4.ri += 0.0625f;
                        f7 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
