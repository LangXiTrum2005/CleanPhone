package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27309b;

    public U7(int i10, int i11) {
        this.f27308a = i10;
        this.f27309b = i11;
    }

    public final int a() {
        return this.f27308a;
    }

    public final int b() {
        return this.f27309b;
    }

    public final int c() {
        return this.f27309b;
    }

    public final int d() {
        return this.f27308a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U7)) {
            return false;
        }
        U7 u10 = (U7) obj;
        return this.f27308a == u10.f27308a && this.f27309b == u10.f27309b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f27309b) + (Integer.hashCode(this.f27308a) * 31);
    }

    public String toString() {
        return l1.d.f("ISContainerParams(width=", this.f27308a, ", height=", this.f27309b, ")");
    }

    public final U7 a(int i10, int i11) {
        return new U7(i10, i11);
    }

    public static /* synthetic */ U7 a(U7 u10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = u10.f27308a;
        }
        if ((i12 & 2) != 0) {
            i11 = u10.f27309b;
        }
        return u10.a(i10, i11);
    }
}
