package en;

import cn.d0;
import cn.j2;
import com.google.android.gms.internal.play_billing.q1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f40126a = g.f40160p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cn.l f40127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f40128c;

    public b(e eVar) {
        this.f40128c = eVar;
    }

    public final Object a(fn.h hVar) throws Throwable {
        m mVar;
        m mVar2;
        Object obj = this.f40126a;
        boolean z10 = true;
        if (obj == g.f40160p || obj == g.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f40140g;
            e eVar = this.f40128c;
            m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar);
            while (!eVar.v()) {
                long andIncrement = e.f40136c.getAndIncrement(eVar);
                long j10 = g.f40147b;
                long j11 = andIncrement / j10;
                int i10 = (int) (andIncrement % j10);
                if (mVar3.f42455c != j11) {
                    m mVarO = eVar.o(j11, mVar3);
                    if (mVarO == null) {
                        continue;
                    } else {
                        mVar = mVarO;
                    }
                } else {
                    mVar = mVar3;
                }
                Object objG = eVar.G(mVar, i10, andIncrement, null);
                hn.u uVar = g.f40157m;
                if (objG == uVar) {
                    throw new IllegalStateException("unreachable");
                }
                hn.u uVar2 = g.f40159o;
                if (objG == uVar2) {
                    if (andIncrement < eVar.s()) {
                        mVar.b();
                    }
                    mVar3 = mVar;
                } else {
                    if (objG == g.f40158n) {
                        cn.l lVarS = d0.s(q1.t(hVar));
                        try {
                            this.f40127b = lVarS;
                            Object objG2 = eVar.G(mVar, i10, andIncrement, this);
                            if (objG2 != uVar) {
                                if (objG2 == uVar2) {
                                    if (andIncrement < eVar.s()) {
                                        mVar.b();
                                    }
                                    m mVar4 = (m) e.f40140g.get(eVar);
                                    while (true) {
                                        if (eVar.v()) {
                                            cn.l lVar = this.f40127b;
                                            kotlin.jvm.internal.n.c(lVar);
                                            this.f40127b = null;
                                            this.f40126a = g.l;
                                            Throwable thP = eVar.p();
                                            if (thP != null) {
                                                lVar.resumeWith(t9.e.c(thP));
                                                break;
                                            }
                                            lVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = e.f40136c.getAndIncrement(eVar);
                                        long j12 = g.f40147b;
                                        long j13 = andIncrement2 / j12;
                                        int i11 = (int) (andIncrement2 % j12);
                                        if (mVar4.f42455c != j13) {
                                            m mVarO2 = eVar.o(j13, mVar4);
                                            if (mVarO2 != null) {
                                                mVar2 = mVarO2;
                                            }
                                        } else {
                                            mVar2 = mVar4;
                                        }
                                        Object objG3 = eVar.G(mVar2, i11, andIncrement2, this);
                                        m mVar5 = mVar2;
                                        if (objG3 == g.f40157m) {
                                            b(mVar5, i11);
                                            break;
                                        }
                                        if (objG3 == g.f40159o) {
                                            if (andIncrement2 < eVar.s()) {
                                                mVar5.b();
                                            }
                                            mVar4 = mVar5;
                                        } else {
                                            if (objG3 == g.f40158n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            mVar5.b();
                                            this.f40126a = objG3;
                                            this.f40127b = null;
                                        }
                                    }
                                } else {
                                    mVar.b();
                                    this.f40126a = objG2;
                                    this.f40127b = null;
                                }
                                lVarS.g(Boolean.TRUE, null);
                                break;
                            }
                            b(mVar, i10);
                            return lVarS.s();
                        } catch (Throwable th2) {
                            lVarS.A();
                            throw th2;
                        }
                    }
                    mVar.b();
                    this.f40126a = objG;
                }
            }
            this.f40126a = g.l;
            Throwable thP2 = eVar.p();
            if (thP2 != null) {
                int i12 = hn.t.f42456a;
                throw thP2;
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // cn.j2
    public final void b(hn.s sVar, int i10) {
        cn.l lVar = this.f40127b;
        if (lVar != null) {
            lVar.b(sVar, i10);
        }
    }
}
