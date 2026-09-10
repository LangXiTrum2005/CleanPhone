package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p4 f14816a = new p4();

    public final double a(Object obj) {
        String strA;
        if (obj instanceof dg) {
            String strA2 = ((dg) obj).a();
            if (strA2 != null) {
                if (StringsKt.M(strA2, com.smartdigimkt.x.d.c.k, true)) {
                    return 0.8d;
                }
                if (StringsKt.l(strA2, "javascript", true)) {
                    return 1.0d;
                }
                StringsKt.l(strA2, "flash", true);
                return 0.0d;
            }
        } else if (obj instanceof r8) {
            String strA3 = ((r8) obj).a();
            if (strA3 != null && !StringsKt.w(strA3)) {
                return 1.0d;
            }
        } else if ((obj instanceof k8) && (strA = ((k8) obj).a()) != null && !StringsKt.w(strA)) {
            return 1.2d;
        }
        return 0.0d;
    }

    public final double a(af afVar, n4 n4Var) {
        double d = afVar.d();
        double dB = afVar.b();
        Integer numI = n4Var.i();
        if (numI != null) {
            double dIntValue = numI.intValue();
            Integer numD = n4Var.d();
            if (numD != null) {
                double dIntValue2 = numD.intValue();
                float fA = afVar.a();
                if (d > 0.0d && dB > 0.0d && dIntValue > 0.0d && dIntValue2 > 0.0d) {
                    double dAbs = Math.abs((d / dB) - (dIntValue / dIntValue2));
                    double d2 = d * ((double) fA);
                    return dAbs + (d2 != 0.0d ? Math.abs(d2 - dIntValue) / d2 : Double.MAX_VALUE);
                }
            }
        }
        return Double.MAX_VALUE;
    }

    public final n4 a(List companionAds, af renderingContainer) {
        Object next;
        Intrinsics.f(companionAds, "companionAds");
        Intrinsics.f(renderingContainer, "renderingContainer");
        ArrayList arrayList = new ArrayList();
        Iterator it = companionAds.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            n4 n4Var = (n4) it.next();
            double dA = f14816a.a(renderingContainer, n4Var);
            ji jiVar = null;
            double d = Double.NEGATIVE_INFINITY;
            for (ji jiVar2 : CollectionsKt.O(n4Var.e(), CollectionsKt.O(n4Var.f(), n4Var.g()))) {
                double dA2 = f14816a.a(jiVar2);
                if (dA2 > 0.0d) {
                    double d2 = dA2 / (1.0d + dA);
                    if (d2 > d) {
                        jiVar = jiVar2;
                        d = d2;
                    }
                }
            }
            if (d != Double.NEGATIVE_INFINITY && jiVar != null) {
                if (CollectionsKt.o(CollectionsKt.O(n4Var.e(), CollectionsKt.O(n4Var.f(), n4Var.g())), jiVar)) {
                    pair = new Pair(n4.a(n4Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jiVar, 262143, null), Double.valueOf(d));
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                double dDoubleValue = ((Number) ((Pair) next).f43249Y).doubleValue();
                do {
                    Object next2 = it2.next();
                    double dDoubleValue2 = ((Number) ((Pair) next2).f43249Y).doubleValue();
                    if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                        next = next2;
                        dDoubleValue = dDoubleValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair2 = (Pair) next;
        if (pair2 != null) {
            return (n4) pair2.X;
        }
        return null;
    }
}
