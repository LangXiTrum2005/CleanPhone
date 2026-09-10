package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y8 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8 f22191b;

    public y8(int i10, u8 u8Var) {
        this.f22190a = i10;
        this.f22191b = u8Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f22190a, ((y8) obj).f22190a);
    }
}
