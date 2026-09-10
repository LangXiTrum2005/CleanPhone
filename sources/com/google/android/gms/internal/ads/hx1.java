package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 implements gx1, dx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hx1 f15423b = new hx1(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15424a;

    public hx1(Object obj) {
        this.f15424a = obj;
    }

    public static hx1 a(Object obj) {
        if (obj != null) {
            return new hx1(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static hx1 b(Object obj) {
        return obj == null ? f15423b : new hx1(obj);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        return this.f15424a;
    }
}
