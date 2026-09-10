package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.g0;
import cn.q1;
import jk.c;
import kotlin.Metadata;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwj/h;", "Lwj/r;", "it", "<anonymous>", "(Lwj/h;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$2", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
public final class AndroidAdRefresh$invoke$3$1$1$2 extends i implements c {
    final /* synthetic */ g0 $showing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$2(g0 g0Var, f fVar) {
        super(2, fVar);
        this.$showing = g0Var;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidAdRefresh$invoke$3$1$1$2(this.$showing, fVar);
    }

    public final Object invoke(Object obj, f fVar) {
        return ((AndroidAdRefresh$invoke$3$1$1$2) create(new h(obj), fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        ((q1) this.$showing).a(null);
        return r.f53297a;
    }

    @Override // jk.c
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((h) obj).f53286a, (f) obj2);
    }
}
