package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f22445a;

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f22445a;
        ps1.f0(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z02) {
            return this.f22445a.equals(((z02) obj).f22445a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22445a.hashCode();
    }
}
