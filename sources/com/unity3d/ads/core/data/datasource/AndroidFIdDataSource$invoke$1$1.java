package com.unity3d.ads.core.data.datasource;

import ak.f;
import ak.m;
import ck.e;
import ck.i;
import cn.a0;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import jk.b;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "", "<anonymous>", "(Lcn/a0;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", l = {19}, m = "invokeSuspend")
public final class AndroidFIdDataSource$invoke$1$1 extends i implements c {
    final /* synthetic */ Task<String> $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task<String> task, f fVar) {
        super(2, fVar);
        this.$task = task;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidFIdDataSource$invoke$1$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return obj;
        }
        t9.e.z(obj);
        Task<String> task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final m mVar = new m(q1.t(this));
        final AndroidFIdDataSource$invoke$1$1$1$1 androidFIdDataSource$invoke$1$1$1$1 = new AndroidFIdDataSource$invoke$1$1$1$1(mVar);
        task.addOnSuccessListener(new OnSuccessListener(androidFIdDataSource$invoke$1$1$1$1) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ b function;

            {
                n.f(androidFIdDataSource$invoke$1$1$1$1, "function");
                this.function = androidFIdDataSource$invoke$1$1$1$1;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj2) {
                this.function.invoke(obj2);
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                n.f(it, "it");
                mVar.resumeWith(t9.e.c(it));
            }
        });
        Object objA = mVar.a();
        bk.a aVar = bk.a.f5708a;
        return objA == aVar ? aVar : objA;
    }
}
