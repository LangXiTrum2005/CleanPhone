package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f5234Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Continuation continuation) {
        super(2, continuation);
        this.f5234Y = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.f5234Y, continuation);
        lifecycleCoroutineScopeImpl$register$1.X = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = (LifecycleCoroutineScopeImpl$register$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        lifecycleCoroutineScopeImpl$register$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.X;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f5234Y;
        Lifecycle lifecycle = lifecycleCoroutineScopeImpl.X;
        if (lifecycle.getD().compareTo(Lifecycle.State.f5232Y) >= 0) {
            lifecycle.a(lifecycleCoroutineScopeImpl);
        } else {
            Job job = (Job) coroutineScope.getF5233Y().get(Job.Key.X);
            if (job != null) {
                job.a(null);
            }
        }
        return Unit.f43263a;
    }
}
