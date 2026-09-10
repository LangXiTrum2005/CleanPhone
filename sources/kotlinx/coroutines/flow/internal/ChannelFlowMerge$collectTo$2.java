package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ChannelFlowMerge$collectTo$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", l = {65}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Flow f44998Y;
        public final /* synthetic */ SendingCollector Z;
        public final /* synthetic */ Semaphore e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow flow, SendingCollector sendingCollector, Semaphore semaphore, Continuation continuation) {
            super(2, continuation);
            this.f44998Y = flow;
            this.Z = sendingCollector;
            this.e0 = semaphore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f44998Y, this.Z, this.e0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlinx.coroutines.sync.Semaphore] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.SemaphoreAndMutexImpl] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            ?? r2 = this.e0;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    Flow flow = this.f44998Y;
                    SendingCollector sendingCollector = this.Z;
                    this.X = 1;
                    if (flow.collect(sendingCollector, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                r2 = (SemaphoreAndMutexImpl) r2;
                r2.e();
                return Unit.f43263a;
            } catch (Throwable th) {
                ((SemaphoreAndMutexImpl) r2).e();
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object emit(Flow flow, Continuation continuation) {
        ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        if (continuation instanceof ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) continuation;
            int i2 = channelFlowMerge$collectTo$2$emit$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                channelFlowMerge$collectTo$2$emit$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
            }
        } else {
            channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
        }
        Object obj = channelFlowMerge$collectTo$2$emit$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = channelFlowMerge$collectTo$2$emit$1.f0;
        if (i3 == 0) {
            ResultKt.b(obj);
            channelFlowMerge$collectTo$2$emit$1.X = this;
            channelFlowMerge$collectTo$2$emit$1.f44999Y = flow;
            channelFlowMerge$collectTo$2$emit$1.f0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Flow flow2 = channelFlowMerge$collectTo$2$emit$1.f44999Y;
        ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = (ChannelFlowMerge$collectTo$2) channelFlowMerge$collectTo$2$emit$1.X;
        ResultKt.b(obj);
        channelFlowMerge$collectTo$2.getClass();
        BuildersKt.c(null, null, null, new AnonymousClass1(flow2, null, null, null), 3);
        return Unit.f43263a;
    }
}
