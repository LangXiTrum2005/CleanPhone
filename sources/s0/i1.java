package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements ak.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f49826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f49827b;

    public i1(i1 i1Var, e0 e0Var) {
        this.f49826a = i1Var;
        this.f49827b = e0Var;
    }

    public final void b(e0 e0Var) {
        if (this.f49827b == e0Var) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        i1 i1Var = this.f49826a;
        if (i1Var != null) {
            i1Var.b(e0Var);
        }
    }

    @Override // ak.k
    public final Object fold(Object obj, jk.c cVar) {
        return cVar.invoke(obj, this);
    }

    @Override // ak.k
    public final ak.i get(ak.j jVar) {
        return com.google.android.gms.internal.auth.i.r(this, jVar);
    }

    @Override // ak.i
    public final ak.j getKey() {
        return j.f49828a;
    }

    @Override // ak.k
    public final ak.k minusKey(ak.j jVar) {
        return com.google.android.gms.internal.auth.i.z(this, jVar);
    }

    @Override // ak.k
    public final ak.k plus(ak.k kVar) {
        return com.google.android.gms.internal.auth.i.D(this, kVar);
    }
}
