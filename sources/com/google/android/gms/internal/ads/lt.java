package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lt f17121d = new lt(1.0f, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17124c;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public lt(float f10, int i10, int i11) {
        this.f17122a = i10;
        this.f17123b = i11;
        this.f17124c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lt) {
            lt ltVar = (lt) obj;
            if (this.f17122a == ltVar.f17122a && this.f17123b == ltVar.f17123b && this.f17124c == ltVar.f17124c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f17124c) + ((((this.f17122a + 217) * 31) + this.f17123b) * 31);
    }
}
