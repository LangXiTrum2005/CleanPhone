package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci f22776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r32 f22778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ci f22780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r32 f22782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f22784j;

    public zz1(long j10, ci ciVar, int i10, r32 r32Var, long j11, ci ciVar2, int i11, r32 r32Var2, long j12, long j13) {
        this.f22775a = j10;
        this.f22776b = ciVar;
        this.f22777c = i10;
        this.f22778d = r32Var;
        this.f22779e = j11;
        this.f22780f = ciVar2;
        this.f22781g = i11;
        this.f22782h = r32Var2;
        this.f22783i = j12;
        this.f22784j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zz1.class == obj.getClass()) {
            zz1 zz1Var = (zz1) obj;
            if (this.f22775a == zz1Var.f22775a && this.f22777c == zz1Var.f22777c && this.f22779e == zz1Var.f22779e && this.f22781g == zz1Var.f22781g && this.f22783i == zz1Var.f22783i && this.f22784j == zz1Var.f22784j && Objects.equals(this.f22776b, zz1Var.f22776b) && Objects.equals(this.f22778d, zz1Var.f22778d) && Objects.equals(this.f22780f, zz1Var.f22780f) && Objects.equals(this.f22782h, zz1Var.f22782h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f22775a), this.f22776b, Integer.valueOf(this.f22777c), this.f22778d, Long.valueOf(this.f22779e), this.f22780f, Integer.valueOf(this.f22781g), this.f22782h, Long.valueOf(this.f22783i), Long.valueOf(this.f22784j));
    }
}
