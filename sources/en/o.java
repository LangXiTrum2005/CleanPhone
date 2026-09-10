package en;

import cn.j2;
import kotlin.jvm.internal.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f40172k;

    public o(int i10, a aVar) {
        super(i10);
        this.f40172k = aVar;
        if (aVar != a.f40122a) {
            if (i10 < 1) {
                throw new IllegalArgumentException(defpackage.e.h(i10, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + d0.f44761a.b(e.class).g() + " instead").toString());
        }
    }

    public final Object J(Object obj, boolean z10) {
        a aVar = this.f40172k;
        a aVar2 = a.f40124c;
        wj.r rVar = wj.r.f53297a;
        if (aVar == aVar2) {
            Object objI = super.i(obj);
            return (!(objI instanceof k) || (objI instanceof j)) ? objI : rVar;
        }
        Object obj2 = g.f40149d;
        m mVar = (m) e.f40139f.get(this);
        while (true) {
            long andIncrement = e.f40135b.getAndIncrement(this);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zU = u(andIncrement, false);
            int i10 = g.f40147b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            if (mVar.f42455c != j12) {
                m mVarD = e.d(this, j12, mVar);
                if (mVarD != null) {
                    mVar = mVarD;
                } else if (zU) {
                    return new j(r());
                }
            }
            int iF = e.f(this, mVar, i11, obj, j10, obj2, zU);
            if (iF == 0) {
                mVar.b();
                return rVar;
            }
            if (iF != 1) {
                if (iF != 2) {
                    if (iF == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iF == 4) {
                        if (j10 < e.f40136c.get(this)) {
                            mVar.b();
                        }
                        return new j(r());
                    }
                    if (iF == 5) {
                        mVar.b();
                    }
                } else {
                    if (zU) {
                        mVar.i();
                        return new j(r());
                    }
                    j2 j2Var = obj2 instanceof j2 ? (j2) obj2 : null;
                    if (j2Var != null) {
                        j2Var.b(mVar, i11 + i10);
                    }
                    m((mVar.f42455c * j11) + ((long) i11));
                }
            }
            return rVar;
        }
    }

    @Override // en.e, en.u
    public final Object b(ak.f fVar, Object obj) throws Throwable {
        if (J(obj, true) instanceof j) {
            throw r();
        }
        return wj.r.f53297a;
    }

    @Override // en.e, en.u
    public final Object i(Object obj) {
        return J(obj, false);
    }

    @Override // en.e
    public final boolean x() {
        return this.f40172k == a.f40123b;
    }
}
