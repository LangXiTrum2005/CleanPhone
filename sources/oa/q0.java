package oa;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 extends o implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient s1 f47296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f47297e;

    public q0(s1 s1Var, int i10) {
        this.f47296d = s1Var;
        this.f47297e = i10;
    }

    @Override // oa.n
    public final boolean e(Object obj) {
        return obj != null && super.e(obj);
    }

    @Override // oa.n
    public final Map g() {
        throw new AssertionError("should never be called");
    }

    @Override // oa.n
    public final Set h() {
        throw new AssertionError("unreachable");
    }

    @Override // oa.n
    public final Set i() {
        return this.f47296d.keySet();
    }

    @Override // oa.n
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o0 d() {
        return this.f47296d;
    }
}
