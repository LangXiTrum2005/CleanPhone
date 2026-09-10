package f2;

import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k1 f40385d = new k1(new i1.q0[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f40387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40388c;

    static {
        l1.y.G(0);
    }

    public k1(i1.q0... q0VarArr) {
        n1 n1VarY = oa.j0.y(q0VarArr);
        this.f40387b = n1VarY;
        this.f40386a = q0VarArr.length;
        int i10 = 0;
        while (i10 < n1VarY.f47283d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < n1VarY.f47283d; i12++) {
                if (((i1.q0) n1VarY.get(i10)).equals(n1VarY.get(i12))) {
                    l1.a.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final i1.q0 a(int i10) {
        return (i1.q0) this.f40387b.get(i10);
    }

    public final int b(i1.q0 q0Var) {
        int iIndexOf = this.f40387b.indexOf(q0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f40386a == k1Var.f40386a && this.f40387b.equals(k1Var.f40387b);
    }

    public final int hashCode() {
        if (this.f40388c == 0) {
            this.f40388c = this.f40387b.hashCode();
        }
        return this.f40388c;
    }

    public final String toString() {
        return this.f40387b.toString();
    }
}
