package com.unity3d.ads.core.domain;

import ak.f;
import android.app.Activity;
import ck.e;
import ck.i;
import cn.a0;
import en.q;
import en.r;
import java.lang.ref.WeakReference;
import jk.c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1", f = "AndroidGetLifecycleFlow.kt", l = {42}, m = "invokeSuspend")
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1 extends i implements c {
    final /* synthetic */ r $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(r rVar, Activity activity, f fVar) {
        super(2, fVar);
        this.$$this$channelFlow = rVar;
        this.$activity = activity;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(this.$$this$channelFlow, this.$activity, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 == 0) {
            t9.e.z(obj);
            r rVar = this.$$this$channelFlow;
            LifecycleEvent.Resumed resumed = new LifecycleEvent.Resumed(new WeakReference(this.$activity));
            this.label = 1;
            Object objB = ((q) rVar).f40176d.b(this, resumed);
            bk.a aVar = bk.a.f5708a;
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        return wj.r.f53297a;
    }
}
