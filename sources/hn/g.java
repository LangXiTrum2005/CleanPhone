package hn;

import cn.b2;
import cn.d0;
import cn.j0;
import cn.l0;
import cn.x0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends l0 implements ck.d, ak.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42427h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cn.w f42428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ck.c f42429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f42430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f42431g;

    public g(cn.w wVar, ck.c cVar) {
        super(-1);
        this.f42428d = wVar;
        this.f42429e = cVar;
        this.f42430f = b.f42416b;
        this.f42431g = b.m(cVar.getContext());
    }

    @Override // ck.d
    public final ck.d getCallerFrame() {
        return this.f42429e;
    }

    @Override // ak.f
    public final ak.k getContext() {
        return this.f42429e.getContext();
    }

    @Override // cn.l0
    public final Object j() {
        Object obj = this.f42430f;
        this.f42430f = b.f42416b;
        return obj;
    }

    @Override // ak.f
    public final void resumeWith(Object obj) throws j0 {
        Throwable thA = wj.h.a(obj);
        Object uVar = thA == null ? obj : new cn.u(thA, false);
        ck.c cVar = this.f42429e;
        ak.k context = cVar.getContext();
        cn.w wVar = this.f42428d;
        if (b.j(wVar, context)) {
            this.f42430f = uVar;
            this.f6735c = 0;
            b.i(wVar, cVar.getContext(), this);
            return;
        }
        x0 x0VarA = b2.a();
        if (x0VarA.f6785b >= 4294967296L) {
            this.f42430f = uVar;
            this.f6735c = 0;
            x0VarA.u(this);
            return;
        }
        x0VarA.w(true);
        try {
            ak.k context2 = cVar.getContext();
            Object objN = b.n(context2, this.f42431g);
            try {
                cVar.resumeWith(obj);
                b.g(context2, objN);
                while (x0VarA.y()) {
                }
            } catch (Throwable th2) {
                b.g(context2, objN);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                i(th3);
            } finally {
                x0VarA.t(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f42428d + ", " + d0.F(this.f42429e) + ']';
    }

    @Override // cn.l0
    public final ak.f c() {
        return this;
    }
}
