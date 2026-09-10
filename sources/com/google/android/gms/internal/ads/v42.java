package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v42 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v42 f21027d = new v42(new ni[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ya1 f21029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21030c;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
    }

    public v42(ni... niVarArr) {
        this.f21029b = ca1.z(niVarArr);
        this.f21028a = niVarArr.length;
        int i10 = 0;
        while (i10 < this.f21029b.f22210d) {
            int i11 = i10 + 1;
            int i12 = i11;
            while (true) {
                ya1 ya1Var = this.f21029b;
                if (i12 < ya1Var.f22210d) {
                    if (((ni) ya1Var.get(i10)).equals(this.f21029b.get(i12))) {
                        v71.J("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i12++;
                }
            }
            i10 = i11;
        }
    }

    public final ni a(int i10) {
        return (ni) this.f21029b.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v42.class != obj.getClass()) {
            return false;
        }
        v42 v42Var = (v42) obj;
        return this.f21028a == v42Var.f21028a && this.f21029b.equals(v42Var.f21029b);
    }

    public final int hashCode() {
        int i10 = this.f21030c;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f21029b.hashCode();
        this.f21030c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f21029b.toString();
    }
}
