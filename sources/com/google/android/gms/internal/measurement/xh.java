package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f24156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xh f24157e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24160c;

    static {
        long jCharAt = 0;
        for (int i10 = 0; i10 < 7; i10++) {
            jCharAt |= (((long) i10) + 1) << ((int) (((long) (" #(+,-0".charAt(i10) - ' ')) * 3));
        }
        f24156d = jCharAt;
        f24157e = new xh(0, -1, -1);
    }

    public xh(int i10, int i11, int i12) {
        this.f24158a = i10;
        this.f24159b = i11;
        this.f24160c = i12;
    }

    public static int e(int i10, int i11, String str) {
        if (i10 == i11) {
            throw aa.b.b(i10 - 1, "missing precision", str);
        }
        int i12 = 0;
        for (int i13 = i10; i13 < i11; i13++) {
            char cCharAt = (char) (str.charAt(i13) - '0');
            if (cCharAt >= '\n') {
                throw aa.b.b(i13, "invalid precision character", str);
            }
            i12 = (i12 * 10) + cCharAt;
            if (i12 > 999999) {
                throw aa.b.a(i10, i11, "precision too large", str);
            }
        }
        if (i12 != 0) {
            return i12;
        }
        if (i11 == i10 + 1) {
            return 0;
        }
        throw aa.b.a(i10, i11, "invalid precision", str);
    }

    public final boolean a() {
        return this == f24157e;
    }

    public final boolean b(int i10, boolean z10) {
        int i11;
        if (a()) {
            return true;
        }
        int i12 = ~i10;
        int i13 = this.f24158a;
        if ((i12 & i13) != 0) {
            return false;
        }
        if ((!z10 && this.f24160c != -1) || (i13 & 9) == 9 || (i11 = i13 & 96) == 96) {
            return false;
        }
        return i11 == 0 || this.f24159b != -1;
    }

    public final boolean c() {
        return (this.f24158a & 128) != 0;
    }

    public final void d(StringBuilder sb2) {
        if (a()) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = this.f24158a & (-129);
            int i12 = 1 << i10;
            if (i12 > i11) {
                break;
            }
            if ((i11 & i12) != 0) {
                sb2.append(" #(+,-0".charAt(i10));
            }
            i10++;
        }
        int i13 = this.f24159b;
        if (i13 != -1) {
            sb2.append(i13);
        }
        int i14 = this.f24160c;
        if (i14 != -1) {
            sb2.append('.');
            sb2.append(i14);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xh) {
            xh xhVar = (xh) obj;
            if (xhVar.f24158a == this.f24158a && xhVar.f24159b == this.f24159b && xhVar.f24160c == this.f24160c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f24158a * 31) + this.f24159b) * 31) + this.f24160c;
    }
}
