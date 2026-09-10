package com.google.android.gms.internal.play_billing;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24467c;

    public s(Object obj, Object obj2, Object obj3) {
        this.f24465a = obj;
        this.f24466b = obj2;
        this.f24467c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f24465a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f24466b);
        return new IllegalArgumentException(q4.a.j(defpackage.e.v("Multiple entries with same key: ", strValueOf, X3.j.f27830b, strValueOf2, " and "), String.valueOf(obj), X3.j.f27830b, String.valueOf(this.f24467c)));
    }
}
