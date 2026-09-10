package com.chartboost.sdk.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve f15422a = new ve();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15423a;

        static {
            int[] iArr = new int[ue.b.values().length];
            try {
                iArr[ue.b.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ue.b.ASPECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ue.b.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15423a = iArr;
        }
    }

    public final c6 a(ue ueVar, t5 t5Var, int i2, int i3) {
        Pair pair;
        Integer numP = ueVar.p();
        int iA = numP != null ? t5Var.a(numP.intValue()) : i2;
        Integer numI = ueVar.i();
        int iA2 = numI != null ? t5Var.a(numI.intValue()) : i3;
        if (iA2 == 0 || iA == 0) {
            return a(ueVar, i2, i3);
        }
        float f = iA / iA2;
        float f2 = i2;
        float f3 = i3;
        if (f > f2 / f3) {
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf((int) (f2 / f)));
        } else {
            pair = new Pair(Integer.valueOf((int) (f3 * f)), Integer.valueOf(i3));
        }
        return new c6(((Number) pair.X).intValue(), ((Number) pair.f43249Y).intValue());
    }

    public final c6 b(ue ueVar, t5 densityProvider, int i2, int i3) {
        Intrinsics.f(ueVar, "<this>");
        Intrinsics.f(densityProvider, "densityProvider");
        int i4 = a.f15423a[ueVar.h().ordinal()];
        if (i4 == 1) {
            return a(ueVar, i2, i3);
        }
        if (i4 == 2) {
            return a(ueVar, densityProvider, i2, i3);
        }
        if (i4 == 3) {
            return c(ueVar, densityProvider, i2, i3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final c6 c(ue ueVar, t5 t5Var, int i2, int i3) {
        Integer numP = ueVar.p();
        if (numP != null) {
            i2 = t5Var.a(numP.intValue());
        }
        Integer numI = ueVar.i();
        if (numI != null) {
            i3 = t5Var.a(numI.intValue());
        }
        return new c6(i2, i3);
    }

    public final c6 a(ue ueVar, int i2, int i3) {
        return new c6(i2, i3);
    }
}
