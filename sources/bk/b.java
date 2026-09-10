package bk;

import ak.f;
import ck.g;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jk.c f5713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f5714h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, f fVar2, jk.c cVar) {
        super(fVar);
        this.f5713g = cVar;
        this.f5714h = fVar2;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f5712f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f5712f = 2;
            t9.e.z(obj);
            return obj;
        }
        this.f5712f = 1;
        t9.e.z(obj);
        jk.c cVar = this.f5713g;
        n.d(cVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        h0.d(2, cVar);
        return cVar.invoke(this.f5714h, this);
    }
}
