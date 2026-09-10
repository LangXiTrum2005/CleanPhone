package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v21 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f21011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21012b;

    public v21(Runnable runnable, long j10) {
        this.f21011a = runnable;
        this.f21012b = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f21012b, ((v21) obj).f21012b);
    }
}
