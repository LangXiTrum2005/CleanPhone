package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f14886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f14887b;

    public /* synthetic */ gj1(Class cls, Class cls2) {
        this.f14886a = cls;
        this.f14887b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gj1)) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        return gj1Var.f14886a.equals(this.f14886a) && gj1Var.f14887b.equals(this.f14887b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14886a, this.f14887b);
    }

    public final String toString() {
        String simpleName = this.f14886a.getSimpleName();
        String simpleName2 = this.f14887b.getSimpleName();
        return q4.a.j(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
