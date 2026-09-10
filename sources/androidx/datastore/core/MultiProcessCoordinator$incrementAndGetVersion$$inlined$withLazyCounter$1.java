package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@¨\u0006\u0003"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "androidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend")
public final class MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    public final /* synthetic */ MultiProcessCoordinator X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(MultiProcessCoordinator multiProcessCoordinator, Continuation continuation) {
        super(2, continuation);
        this.X = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this.X, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        return new Integer(SharedCounter.f4681b.nativeIncrementAndGetCounterValue(this.X.g().f4682a));
    }
}
