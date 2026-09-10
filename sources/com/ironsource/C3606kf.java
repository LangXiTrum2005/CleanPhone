package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3606kf extends F4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3606kf(AbstractC3816x0 adUnitData, wg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    private final int b(B b) {
        return b.h().l();
    }

    @Override // com.ironsource.H
    public boolean a(B instance, wg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }

    private final int a(wg wgVar) {
        Integer num;
        List<B> listB = wgVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((B) obj).w()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(b((B) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(b((B) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
