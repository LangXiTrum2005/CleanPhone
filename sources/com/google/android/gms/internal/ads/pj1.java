package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f18698b;

    public /* synthetic */ pj1(Class cls, Class cls2) {
        this.f18697a = cls;
        this.f18698b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pj1)) {
            return false;
        }
        pj1 pj1Var = (pj1) obj;
        return pj1Var.f18697a.equals(this.f18697a) && pj1Var.f18698b.equals(this.f18698b);
    }

    public final int hashCode() {
        return Objects.hash(this.f18697a, this.f18698b);
    }

    public final String toString() {
        String simpleName = this.f18697a.getSimpleName();
        String simpleName2 = this.f18698b.getSimpleName();
        return q4.a.j(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
