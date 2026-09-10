package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0005¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedSharedFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/SharedFlow;", "", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SubscribedSharedFlow<T> implements SharedFlow<T> {
    public final SharedFlow X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SuspendLambda f44991Y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {408}, m = "collect")
    final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object X;
        public int Z;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.X = obj;
            this.Z |= Integer.MIN_VALUE;
            SubscribedSharedFlow.this.collect(null, this);
            return CoroutineSingletons.X;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedSharedFlow(SharedFlow sharedFlow, Function2 function2) {
        this.X = sharedFlow;
        this.f44991Y = (SuspendLambda) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.Z = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.Z;
        if (i3 == 0) {
            ResultKt.b(obj);
            SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(this.f44991Y, flowCollector);
            anonymousClass1.Z = 1;
            if (this.X.collect(subscribedFlowCollector, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
