package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m5 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17248c;

    public /* synthetic */ m5(long j10, long j11, long j12) {
        this.f17246a = j10;
        this.f17247b = j11;
        this.f17248c = j12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f17246a, ((m5) obj).f17246a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return this.f17246a == m5Var.f17246a && this.f17247b == m5Var.f17247b && this.f17248c == m5Var.f17248c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f17246a), Long.valueOf(this.f17247b), Long.valueOf(this.f17248c));
    }
}
