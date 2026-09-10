package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.measurement.h6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6 f11717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11718b;

    public i(h6 h6Var, String str) {
        this.f11717a = h6Var;
        this.f11718b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f11717a == iVar.f11717a && this.f11718b.equals(iVar.f11718b);
    }

    public final int hashCode() {
        return this.f11718b.hashCode() + (System.identityHashCode(this.f11717a) * 31);
    }
}
