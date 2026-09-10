package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m91 f11940a = new m91();

    static {
        aa1 aa1Var = ca1.f13122b;
        new a90(ya1.f22208e);
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public a90(ya1 ya1Var) {
        aa1 aa1Var = ca1.f13122b;
        Object[] array = (ya1Var == null ? v71.e(ya1Var.listIterator(0)) : ya1Var).toArray();
        int length = array.length;
        ps1.s(length, array);
        Arrays.sort(array, f11940a);
        ca1.A(length, array);
    }
}
