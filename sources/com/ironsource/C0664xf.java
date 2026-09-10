package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0664xf extends G4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0664xf(AbstractC0649x0 adUnitData, Pg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
    }

    private final int b(B b10) {
        return b10.h().l();
    }

    @Override // com.ironsource.H
    public boolean a(B instance, Pg waterfallInstances) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }

    private final int a(Pg pg2) {
        Integer num;
        List<B> listB = pg2.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((B) obj).x()) {
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
