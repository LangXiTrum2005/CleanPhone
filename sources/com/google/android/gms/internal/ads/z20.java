package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z20 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z20 f22471e = new z20(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22475d;

    public z20(int i10, int i11, int i12) {
        this.f22472a = i10;
        this.f22473b = i11;
        this.f22474c = i12;
        this.f22475d = uu0.d(i12) ? uu0.f(i12) * i11 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z20)) {
            return false;
        }
        z20 z20Var = (z20) obj;
        return this.f22472a == z20Var.f22472a && this.f22473b == z20Var.f22473b && this.f22474c == z20Var.f22474c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22472a), Integer.valueOf(this.f22473b), Integer.valueOf(this.f22474c));
    }

    public final String toString() {
        int i10 = this.f22472a;
        int length = String.valueOf(i10).length();
        int i11 = this.f22473b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f22474c;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 38, length2, 11, String.valueOf(i12).length()) + 1);
        l1.d.p(sb2, "AudioFormat[sampleRate=", i10, ", channelCount=", i11);
        return com.applovin.impl.ca.m(sb2, ", encoding=", i12, X3.j.f27836e);
    }
}
