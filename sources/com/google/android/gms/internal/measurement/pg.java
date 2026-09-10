package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pg f23865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f23866d = new HashMap(0);

    public pg(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        this.f23863a = i10;
        this.f23864b = i11;
        this.f23865c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return l1.d.k(new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4), "Node", iIdentityHashCode);
    }
}
