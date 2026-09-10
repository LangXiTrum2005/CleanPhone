package i1;

import com.google.android.gms.internal.ads.q2;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f42714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f42715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f42716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f42717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f42718f;

    static {
        q2 q2Var = new q2();
        oa.f0 f0Var = oa.j0.f47265b;
        n1 n1Var = n1.f47281e;
        List list = Collections.EMPTY_LIST;
        n1 n1Var2 = n1.f47281e;
        t tVar = new t();
        w wVar = w.f42711a;
        q2Var.a();
        tVar.a();
        a0 a0Var = a0.B;
        d5.u.m(0, 1, 2, 3, 4);
        l1.y.G(5);
    }

    public y(String str, s sVar, v vVar, u uVar, a0 a0Var, w wVar) {
        this.f42713a = str;
        this.f42714b = vVar;
        this.f42715c = uVar;
        this.f42716d = a0Var;
        this.f42717e = sVar;
        this.f42718f = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Objects.equals(this.f42713a, yVar.f42713a) && this.f42717e.equals(yVar.f42717e) && Objects.equals(this.f42714b, yVar.f42714b) && this.f42715c.equals(yVar.f42715c) && Objects.equals(this.f42716d, yVar.f42716d) && Objects.equals(this.f42718f, yVar.f42718f);
    }

    public final int hashCode() {
        int iHashCode = this.f42713a.hashCode() * 31;
        v vVar = this.f42714b;
        int iHashCode2 = (this.f42716d.hashCode() + ((this.f42717e.hashCode() + ((this.f42715c.hashCode() + ((iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f42718f.getClass();
        return iHashCode2;
    }
}
