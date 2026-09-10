package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yo f22329b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ca1 f22330a;

    static {
        aa1 aa1Var = ca1.f13122b;
        f22329b = new yo(ya1.f22208e);
        String str = uu0.f20901a;
        Integer.toString(0, 36);
    }

    public yo(ya1 ya1Var) {
        this.f22330a = ca1.y(ya1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            ca1 ca1Var = this.f22330a;
            if (i11 >= ca1Var.size()) {
                return false;
            }
            co coVar = (co) ca1Var.get(i11);
            for (boolean z10 : coVar.f13219e) {
                if (z10) {
                    if (coVar.f13216b.f17831c != i10) {
                        break;
                    }
                    return true;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yo.class != obj.getClass()) {
            return false;
        }
        return this.f22330a.equals(((yo) obj).f22330a);
    }

    public final int hashCode() {
        return this.f22330a.hashCode();
    }
}
