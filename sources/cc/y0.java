package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f6341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6342e;

    public y0(String str, String str2, List list, e2 e2Var, int i10) {
        this.f6338a = str;
        this.f6339b = str2;
        this.f6340c = list;
        this.f6341d = e2Var;
        this.f6342e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        e2 e2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            y0 y0Var = (y0) ((e2) obj);
            e2 e2Var2 = y0Var.f6341d;
            String str2 = y0Var.f6339b;
            if (this.f6338a.equals(y0Var.f6338a) && ((str = this.f6339b) != null ? str.equals(str2) : str2 == null) && this.f6340c.equals(y0Var.f6340c) && ((e2Var = this.f6341d) != null ? e2Var.equals(e2Var2) : e2Var2 == null) && this.f6342e == y0Var.f6342e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f6338a.hashCode() ^ 1000003) * 1000003;
        String str = this.f6339b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f6340c.hashCode()) * 1000003;
        e2 e2Var = this.f6341d;
        return this.f6342e ^ ((iHashCode2 ^ (e2Var != null ? e2Var.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f6338a);
        sb2.append(", reason=");
        sb2.append(this.f6339b);
        sb2.append(", frames=");
        sb2.append(this.f6340c);
        sb2.append(", causedBy=");
        sb2.append(this.f6341d);
        sb2.append(", overflowCount=");
        return l1.d.i(sb2, this.f6342e, "}");
    }
}
