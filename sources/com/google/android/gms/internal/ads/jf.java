package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5 f16077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f16080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f16081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16083i;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public jf(Object obj, int i10, f5 f5Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        ps1.v(i10 >= 0);
        ps1.v(i11 >= 0);
        this.f16075a = obj;
        this.f16076b = i10;
        this.f16077c = f5Var;
        this.f16078d = obj2;
        this.f16079e = i11;
        this.f16080f = j10;
        this.f16081g = j11;
        this.f16082h = i12;
        this.f16083i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jf.class == obj.getClass()) {
            jf jfVar = (jf) obj;
            if (this.f16076b == jfVar.f16076b && this.f16079e == jfVar.f16079e && this.f16080f == jfVar.f16080f && this.f16081g == jfVar.f16081g && this.f16082h == jfVar.f16082h && this.f16083i == jfVar.f16083i && Objects.equals(this.f16077c, jfVar.f16077c) && Objects.equals(this.f16075a, jfVar.f16075a) && Objects.equals(this.f16078d, jfVar.f16078d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16075a, Integer.valueOf(this.f16076b), this.f16077c, this.f16078d, Integer.valueOf(this.f16079e), Long.valueOf(this.f16080f), Long.valueOf(this.f16081g), Integer.valueOf(this.f16082h), Integer.valueOf(this.f16083i));
    }

    public final String toString() {
        int i10 = this.f16076b;
        int length = String.valueOf(i10).length();
        int i11 = this.f16079e;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f16080f;
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j10).length());
        l1.d.p(sb2, "mediaItem=", i10, ", period=", i11);
        String strS = defpackage.e.s(sb2, ", pos=", j10);
        int i12 = this.f16082h;
        if (i12 == -1) {
            return strS;
        }
        int length3 = strS.length();
        long j11 = this.f16081g;
        int length4 = String.valueOf(i12).length() + length3 + 13 + String.valueOf(j11).length() + 10;
        int i13 = this.f16083i;
        StringBuilder sb3 = new StringBuilder(length4 + 5 + String.valueOf(i13).length());
        sb3.append(strS);
        sb3.append(", contentPos=");
        sb3.append(j11);
        return l1.d.j(sb3, i12, ", adGroup=", i13, ", ad=");
    }
}
