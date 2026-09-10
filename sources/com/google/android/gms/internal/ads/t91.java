package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t91 extends v91 {
    public static final v91 f(int i10) {
        if (i10 < 0) {
            return v91.f21142b;
        }
        return i10 > 0 ? v91.f21143c : v91.f21141a;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final v91 a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final v91 b(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final v91 c(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final v91 d(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final int e() {
        return 0;
    }
}
