package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19363e;

    public r32(Object obj, int i10, int i11, long j10, int i12) {
        this.f19359a = obj;
        this.f19360b = i10;
        this.f19361c = i11;
        this.f19362d = j10;
        this.f19363e = i12;
    }

    public final r32 a(Object obj) {
        return this.f19359a.equals(obj) ? this : new r32(obj, this.f19360b, this.f19361c, this.f19362d, this.f19363e);
    }

    public final boolean b() {
        return this.f19360b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r32)) {
            return false;
        }
        r32 r32Var = (r32) obj;
        return this.f19359a.equals(r32Var.f19359a) && this.f19360b == r32Var.f19360b && this.f19361c == r32Var.f19361c && this.f19362d == r32Var.f19362d && this.f19363e == r32Var.f19363e;
    }

    public final int hashCode() {
        return ((((((((this.f19359a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19360b) * 31) + this.f19361c) * 31) + ((int) this.f19362d)) * 31) + this.f19363e;
    }

    public r32(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public r32(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
