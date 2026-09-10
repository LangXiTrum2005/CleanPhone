package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f6311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f6314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j2 f6315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6317g;

    public v0(i2 i2Var, List list, List list2, Boolean bool, j2 j2Var, List list3, int i10) {
        this.f6311a = i2Var;
        this.f6312b = list;
        this.f6313c = list2;
        this.f6314d = bool;
        this.f6315e = j2Var;
        this.f6316f = list3;
        this.f6317g = i10;
    }

    @Override // cc.k2
    public final u0 a() {
        u0 u0Var = new u0();
        u0Var.f6295a = this.f6311a;
        u0Var.f6296b = this.f6312b;
        u0Var.f6297c = this.f6313c;
        u0Var.f6298d = this.f6314d;
        u0Var.f6299e = this.f6315e;
        u0Var.f6300f = this.f6316f;
        u0Var.f6301g = this.f6317g;
        u0Var.f6302h = (byte) 1;
        return u0Var;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        j2 j2Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            v0 v0Var = (v0) ((k2) obj);
            List list4 = v0Var.f6316f;
            j2 j2Var2 = v0Var.f6315e;
            Boolean bool2 = v0Var.f6314d;
            List list5 = v0Var.f6313c;
            List list6 = v0Var.f6312b;
            if (this.f6311a.equals(v0Var.f6311a) && ((list = this.f6312b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f6313c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.f6314d) != null ? bool.equals(bool2) : bool2 == null) && ((j2Var = this.f6315e) != null ? j2Var.equals(j2Var2) : j2Var2 == null) && ((list3 = this.f6316f) != null ? list3.equals(list4) : list4 == null) && this.f6317g == v0Var.f6317g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f6311a.hashCode() ^ 1000003) * 1000003;
        List list = this.f6312b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f6313c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f6314d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        j2 j2Var = this.f6315e;
        int iHashCode5 = (iHashCode4 ^ (j2Var == null ? 0 : j2Var.hashCode())) * 1000003;
        List list3 = this.f6316f;
        return this.f6317g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f6311a);
        sb2.append(", customAttributes=");
        sb2.append(this.f6312b);
        sb2.append(", internalKeys=");
        sb2.append(this.f6313c);
        sb2.append(", background=");
        sb2.append(this.f6314d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f6315e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f6316f);
        sb2.append(", uiOrientation=");
        return l1.d.i(sb2, this.f6317g, "}");
    }
}
