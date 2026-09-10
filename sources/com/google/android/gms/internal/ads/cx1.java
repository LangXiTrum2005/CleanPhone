package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final cx1 f13293j = new cx1(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final cx1 f13294k = new cx1(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final cx1 l = new cx1(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final cx1 f13295m = new cx1(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f13296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f13297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f13298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f13299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f13300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f13301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f13302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f13303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f13304i;

    public cx1(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f13296a = d14;
        this.f13297b = d15;
        this.f13298c = d16;
        this.f13299d = d10;
        this.f13300e = d11;
        this.f13301f = d12;
        this.f13302g = d13;
        this.f13303h = d17;
        this.f13304i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cx1.class != obj.getClass()) {
            return false;
        }
        cx1 cx1Var = (cx1) obj;
        return Double.compare(cx1Var.f13299d, this.f13299d) == 0 && Double.compare(cx1Var.f13300e, this.f13300e) == 0 && Double.compare(cx1Var.f13301f, this.f13301f) == 0 && Double.compare(cx1Var.f13302g, this.f13302g) == 0 && Double.compare(cx1Var.f13303h, this.f13303h) == 0 && Double.compare(cx1Var.f13304i, this.f13304i) == 0 && Double.compare(cx1Var.f13296a, this.f13296a) == 0 && Double.compare(cx1Var.f13297b, this.f13297b) == 0 && Double.compare(cx1Var.f13298c, this.f13298c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f13296a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f13297b);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f13298c);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f13299d);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f13300e);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f13301f);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f13302g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f13303h);
        long j16 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f13304i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f13293j)) {
            return "Rotate 0°";
        }
        if (equals(f13294k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(f13295m)) {
            return "Rotate 270°";
        }
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(this.f13296a);
        sb2.append(", v=");
        sb2.append(this.f13297b);
        sb2.append(", w=");
        sb2.append(this.f13298c);
        sb2.append(", a=");
        sb2.append(this.f13299d);
        sb2.append(", b=");
        sb2.append(this.f13300e);
        sb2.append(", c=");
        sb2.append(this.f13301f);
        sb2.append(", d=");
        sb2.append(this.f13302g);
        sb2.append(", tx=");
        sb2.append(this.f13303h);
        sb2.append(", ty=");
        sb2.append(this.f13304i);
        sb2.append("}");
        return sb2.toString();
    }
}
