package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i81 implements Serializable, h81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15657a;

    public final boolean equals(Object obj) {
        if (obj instanceof i81) {
            return this.f15657a.equals(((i81) obj).f15657a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15657a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f15657a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.h81
    public final boolean zza(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f15657a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((h81) list.get(i10)).zza(obj)) {
                return false;
            }
            i10++;
        }
    }
}
