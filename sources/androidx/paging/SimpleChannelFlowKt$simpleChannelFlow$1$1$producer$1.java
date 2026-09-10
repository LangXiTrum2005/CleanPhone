package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION_VALUE}, m = "invokeSuspend")
final class SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ BufferedChannel f7875Y;
    public final /* synthetic */ SuspendLambda Z;

    /* JADX INFO: renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {60}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f7876Y;
        public final /* synthetic */ BufferedChannel Z;
        public final /* synthetic */ SuspendLambda e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BufferedChannel bufferedChannel, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.Z = bufferedChannel;
            this.e0 = (SuspendLambda) function2;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.Z, this.e0, continuation);
            anonymousClass1.f7876Y = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                SimpleProducerScopeImpl simpleProducerScopeImpl = new SimpleProducerScopeImpl((CoroutineScope) this.f7876Y, this.Z);
                this.X = 1;
                if (this.e0.invoke(simpleProducerScopeImpl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(BufferedChannel bufferedChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f7875Y = bufferedChannel;
        this.Z = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.f7875Y, this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        BufferedChannel bufferedChannel = this.f7875Y;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(bufferedChannel, this.Z, null);
                this.X = 1;
                if (CoroutineScopeKt.d(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            bufferedChannel.x(null);
        } catch (Throwable th) {
            bufferedChannel.n(false, th);
        }
        return Unit.f43263a;
    }
}
