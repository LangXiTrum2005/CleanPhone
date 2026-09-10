package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ld1 extends jd1 {
    @Override // com.google.android.gms.internal.ads.jd1
    public final void c(id1 id1Var, Set set) {
        synchronized (id1Var) {
            try {
                if (id1Var.f17403h == null) {
                    id1Var.f17403h = set;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final int f(id1 id1Var) {
        int i10;
        synchronized (id1Var) {
            i10 = id1Var.f17404i - 1;
            id1Var.f17404i = i10;
        }
        return i10;
    }
}
