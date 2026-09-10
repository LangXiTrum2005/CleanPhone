package com.google.android.gms.internal.ads;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class da1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13478c;

    public da1(Object obj, Object obj2, Object obj3) {
        this.f13476a = obj;
        this.f13477b = obj2;
        this.f13478c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f13476a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f13477b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f13478c);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 33, length2, 5, length3) + 1 + strValueOf4.length());
        d5.u.r(sb2, "Multiple entries with same key: ", strValueOf, X3.j.f27830b, strValueOf2);
        return new IllegalArgumentException(d5.u.h(sb2, " and ", strValueOf3, X3.j.f27830b, strValueOf4));
    }
}
