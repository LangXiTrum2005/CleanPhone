package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51448e;

    @Override // zl.i
    public final zl.a a() {
        t tVar = new t(this);
        int i10 = (this.f51447d & 1) != 1 ? 0 : 1;
        tVar.f51467d = this.f51448e;
        tVar.f51466c = i10;
        if (tVar.isInitialized()) {
            return tVar;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        t tVar = null;
        try {
            try {
                t.f51464h.getClass();
                e(new t(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                t tVar2 = (t) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    tVar = tVar2;
                    if (tVar != null) {
                        e(tVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (tVar != null) {
                e(tVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        e((t) nVar);
        return this;
    }

    public final Object clone() {
        s sVar = new s();
        t tVar = new t(this);
        int i10 = (this.f51447d & 1) != 1 ? 0 : 1;
        tVar.f51467d = this.f51448e;
        tVar.f51466c = i10;
        sVar.e(tVar);
        return sVar;
    }

    public final void e(t tVar) {
        if (tVar == t.f51463g) {
            return;
        }
        if ((tVar.f51466c & 1) == 1) {
            int i10 = tVar.f51467d;
            this.f51447d = 1 | this.f51447d;
            this.f51448e = i10;
        }
        d(tVar);
        this.f55044a = this.f55044a.h(tVar.f51465b);
    }
}
