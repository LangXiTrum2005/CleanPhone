package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class aq0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aq0 f12492c = new aq0(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12494b;

    static {
        new aq0(0, 0);
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public aq0(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        ps1.v(z10);
        this.f12493a = i10;
        this.f12494b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof aq0) {
            aq0 aq0Var = (aq0) obj;
            if (this.f12493a == aq0Var.f12493a && this.f12494b == aq0Var.f12494b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12493a;
        return this.f12494b ^ ((i10 >>> 16) | (i10 << 16));
    }

    public final String toString() {
        int i10 = this.f12493a;
        int length = String.valueOf(i10).length();
        int i11 = this.f12494b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i11).length());
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        return sb2.toString();
    }
}
