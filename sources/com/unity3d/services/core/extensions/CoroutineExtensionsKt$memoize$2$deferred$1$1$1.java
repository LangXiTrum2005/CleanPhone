package com.unity3d.services.core.extensions;

import ak.f;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import com.google.android.gms.ads.RequestConfiguration;
import jk.b;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", l = {41}, m = "invokeSuspend")
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1 extends i implements c {
    final /* synthetic */ b $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(b bVar, f fVar) {
        super(2, fVar);
        this.$action = bVar;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return obj;
        }
        t9.e.z(obj);
        b bVar = this.$action;
        this.label = 1;
        Object objInvoke = bVar.invoke(this);
        a aVar = a.f5708a;
        return objInvoke == aVar ? aVar : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }
}
