package i1;

import android.net.Uri;
import cc.a2;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f42704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oa.j0 f42707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42708e;

    static {
        d5.u.m(0, 1, 2, 3, 4);
        l1.y.G(5);
        l1.y.G(6);
        l1.y.G(7);
    }

    public v(Uri uri, String str, a2 a2Var, List list, oa.j0 j0Var, long j10) {
        this.f42704a = uri;
        this.f42705b = d0.n(str);
        this.f42706c = list;
        this.f42707d = j0Var;
        oa.e0 e0VarU = oa.j0.u();
        for (int i10 = 0; i10 < j0Var.size(); i10++) {
            ((x) j0Var.get(i10)).getClass();
            e0VarU.b(new x());
        }
        e0VarU.g();
        this.f42708e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f42704a.equals(vVar.f42704a) && Objects.equals(this.f42705b, vVar.f42705b) && Objects.equals(null, null) && this.f42706c.equals(vVar.f42706c) && this.f42707d.equals(vVar.f42707d) && this.f42708e == vVar.f42708e;
    }

    public final int hashCode() {
        int iHashCode = this.f42704a.hashCode() * 31;
        String str = this.f42705b;
        return (int) ((((long) ((this.f42707d.hashCode() + ((this.f42706c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.f42708e);
    }
}
