package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Serializable, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22795a;

    public b0(Object obj) {
        this.f22795a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        Object obj2 = ((b0) obj).f22795a;
        Object obj3 = this.f22795a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22795a});
    }

    public final String toString() {
        return defpackage.e.o("Suppliers.ofInstance(", this.f22795a.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.x
    public final Object zza() {
        return this.f22795a;
    }
}
