package i2;

import i1.v0;
import java.util.Objects;
import p1.c1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1[] f42838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f42839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f42840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f42841e;

    public v(c1[] c1VarArr, r[] rVarArr, v0 v0Var, Object obj) {
        go.k.i(c1VarArr.length == rVarArr.length);
        this.f42838b = c1VarArr;
        this.f42839c = (r[]) rVarArr.clone();
        this.f42840d = v0Var;
        this.f42841e = obj;
        this.f42837a = c1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        return vVar != null && Objects.equals(this.f42838b[i10], vVar.f42838b[i10]) && Objects.equals(this.f42839c[i10], vVar.f42839c[i10]);
    }

    public final boolean b(int i10) {
        return this.f42838b[i10] != null;
    }
}
