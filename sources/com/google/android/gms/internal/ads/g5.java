package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14760a;

    public g5(ArrayList arrayList) {
        this.f14760a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((e5) arrayList.get(0)).f13837b;
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (((e5) arrayList.get(i10)).f13836a < j10) {
                    z10 = true;
                    break;
                }
                j10 = ((e5) arrayList.get(i10)).f13837b;
            }
        }
        ps1.v(!z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g5.class != obj.getClass()) {
            return false;
        }
        return this.f14760a.equals(((g5) obj).f14760a);
    }

    public final int hashCode() {
        return this.f14760a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f14760a.toString());
    }
}
