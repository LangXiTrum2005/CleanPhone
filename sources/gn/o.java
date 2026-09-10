package gn;

import cn.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends ck.c implements fn.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fn.f f42014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ak.k f42015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ak.k f42017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ak.f f42018j;

    public o(fn.f fVar, ak.k kVar) {
        super(m.f42012a, ak.l.f3620a);
        this.f42014f = fVar;
        this.f42015g = kVar;
        this.f42016h = ((Number) kVar.fold(0, new ak.c(9))).intValue();
    }

    public final Object b(ak.f fVar, Object obj) {
        ak.k context = fVar.getContext();
        d0.m(context);
        ak.k kVar = this.f42017i;
        if (kVar != context) {
            if (kVar instanceof j) {
                throw new IllegalStateException(an.i.a0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((j) kVar).f42011b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new an.q(this, 4))).intValue() != this.f42016h) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f42015g + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f42017i = context;
        }
        this.f42018j = fVar;
        jk.d dVar = q.f42020a;
        fn.f fVar2 = this.f42014f;
        kotlin.jvm.internal.n.d(fVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = dVar.invoke(fVar2, obj, this);
        if (!kotlin.jvm.internal.n.a(objInvoke, bk.a.f5708a)) {
            this.f42018j = null;
        }
        return objInvoke;
    }

    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) {
        try {
            Object objB = b(fVar, obj);
            return objB == bk.a.f5708a ? objB : wj.r.f53297a;
        } catch (Throwable th2) {
            this.f42017i = new j(fVar.getContext(), th2);
            throw th2;
        }
    }

    @Override // ck.a, ck.d
    public final ck.d getCallerFrame() {
        ak.f fVar = this.f42018j;
        if (fVar instanceof ck.d) {
            return (ck.d) fVar;
        }
        return null;
    }

    @Override // ck.c, ak.f
    public final ak.k getContext() {
        ak.k kVar = this.f42017i;
        return kVar == null ? ak.l.f3620a : kVar;
    }

    @Override // ck.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = wj.h.a(obj);
        if (thA != null) {
            this.f42017i = new j(getContext(), thA);
        }
        ak.f fVar = this.f42018j;
        if (fVar != null) {
            fVar.resumeWith(obj);
        }
        return bk.a.f5708a;
    }
}
