package kotlinx.coroutines.flow;

import android.support.v4.media.a;
import androidx.room.d;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NopCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class FlowKt {
    public static final SharedFlow a(MutableSharedFlow mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final StateFlow b(MutableStateFlow mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, null);
    }

    public static Flow c(Flow flow, int i2) {
        BufferOverflow bufferOverflow = BufferOverflow.X;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(a.h(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i2 == -1) {
            bufferOverflow = BufferOverflow.f44779Y;
            i2 = 0;
        }
        boolean z2 = flow instanceof FusibleFlow;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.X;
        return z2 ? ((FusibleFlow) flow).b(emptyCoroutineContext, i2, bufferOverflow) : new ChannelFlowOperatorImpl(i2, emptyCoroutineContext, bufferOverflow, flow);
    }

    public static final Flow d(Function2 function2) {
        return new CallbackFlowBuilder(function2, EmptyCoroutineContext.X, -2, BufferOverflow.X);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable e(ContinuationImpl continuationImpl, Flow flow, FlowCollector flowCollector) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref.ObjectRef objectRef;
        Throwable th;
        Job job;
        CancellationException cancellationExceptionP;
        if (continuationImpl instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuationImpl;
            int i2 = flowKt__ErrorsKt$catchImpl$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.f44899Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__ErrorsKt$catchImpl$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                FlowCollector flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2(flowCollector, objectRef2);
                flowKt__ErrorsKt$catchImpl$1.X = objectRef2;
                flowKt__ErrorsKt$catchImpl$1.Z = 1;
                if (flow.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return null;
            } catch (Throwable th2) {
                objectRef = objectRef2;
                th = th2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = flowKt__ErrorsKt$catchImpl$1.X;
            try {
                ResultKt.b(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) objectRef.X;
        if ((th4 != null && th4.equals(th)) || ((job = (Job) flowKt__ErrorsKt$catchImpl$1.getF45023Y().get(Job.Key.X)) != null && job.isCancelled() && (cancellationExceptionP = job.p()) != null && cancellationExceptionP.equals(th))) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            ExceptionsKt.a(th4, th);
            throw th4;
        }
        ExceptionsKt.a(th, th4);
        throw th;
    }

    public static final Flow f(Function2 function2) {
        return new ChannelFlowBuilder(function2, EmptyCoroutineContext.X, -2, BufferOverflow.X);
    }

    public static final Object g(Flow flow, Function2 function2, SuspendLambda suspendLambda) {
        int i2 = FlowKt__MergeKt.f44921a;
        Object objCollect = c(new ChannelFlowTransformLatest(new FlowKt__MergeKt$mapLatest$1(function2, null), flow, EmptyCoroutineContext.X, -2, BufferOverflow.X), 0).collect(NopCollector.X, suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        Unit unit = Unit.f43263a;
        if (objCollect != coroutineSingletons) {
            objCollect = unit;
        }
        return objCollect == coroutineSingletons ? objCollect : unit;
    }

    public static final Flow h(BufferedChannel bufferedChannel) {
        return new ChannelAsFlow(bufferedChannel, true);
    }

    public static final Flow i(Flow flow) {
        final FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(new d(20), flow, null);
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(flowKt__DelayKt$debounceInternal$1, flowCollector, null);
                FlowCoroutine flowCoroutine = new FlowCoroutine(continuation, continuation.getF45023Y());
                Object objA = UndispatchedKt.a(flowCoroutine, flowCoroutine, flowCoroutineKt$scopedFlow$1$1);
                return objA == CoroutineSingletons.X ? objA : Unit.f43263a;
            }
        };
    }

    public static final Object j(ContinuationImpl continuationImpl, Flow flow, FlowCollector flowCollector) throws Throwable {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).X;
        }
        Object objCollect = flow.collect(flowCollector, continuationImpl);
        return objCollect == CoroutineSingletons.X ? objCollect : Unit.f43263a;
    }

    public static final Object k(FlowCollector flowCollector, ReceiveChannel receiveChannel, Continuation continuation) {
        Object objA = FlowKt__ChannelsKt.a(flowCollector, receiveChannel, true, continuation);
        return objA == CoroutineSingletons.X ? objA : Unit.f43263a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1] */
    public static final Object l(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        ?? r5;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i2 = flowKt__ReduceKt$first$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        }
        Object obj = flowKt__ReduceKt$first$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__ReduceKt$first$1.e0;
        Symbol symbol = NullSurrogateKt.f45018a;
        if (i3 == 0) {
            ResultKt.b(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.X = symbol;
            ?? r2 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation2) {
                    objectRef2.X = obj2;
                    throw new AbortFlowException(this);
                }
            };
            try {
                flowKt__ReduceKt$first$1.X = objectRef2;
                flowKt__ReduceKt$first$1.f44930Y = r2;
                flowKt__ReduceKt$first$1.e0 = 1;
                if (flow.collect(r2, flowKt__ReduceKt$first$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                r5 = r2;
                if (e2.X != r5) {
                    throw e2;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r5 = flowKt__ReduceKt$first$1.f44930Y;
            objectRef = flowKt__ReduceKt$first$1.X;
            try {
                ResultKt.b(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.X != r5) {
                    throw e2;
                }
            }
        }
        Object obj2 = objectRef.X;
        if (obj2 != symbol) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(Flow flow, Function2 function2, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Function2 function3;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        if (continuationImpl instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuationImpl;
            int i2 = flowKt__ReduceKt$first$3.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.f0 = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$first$3.e0;
        Object obj2 = CoroutineSingletons.X;
        int i3 = flowKt__ReduceKt$first$3.f0;
        Symbol symbol = NullSurrogateKt.f45018a;
        if (i3 == 0) {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.X = symbol;
            FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$3 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(function2, objectRef2);
            try {
                flowKt__ReduceKt$first$3.X = function2;
                flowKt__ReduceKt$first$3.f44931Y = objectRef2;
                flowKt__ReduceKt$first$3.Z = flowKt__ReduceKt$first$$inlined$collectWhile$3;
                flowKt__ReduceKt$first$3.f0 = 1;
                if (flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$3, flowKt__ReduceKt$first$3) == obj2) {
                    return obj2;
                }
                function3 = function2;
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                function3 = function2;
                objectRef = objectRef2;
                e2 = e3;
                flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$$inlined$collectWhile$3;
                if (e2.X != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                    throw e2;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$3.Z;
            objectRef = flowKt__ReduceKt$first$3.f44931Y;
            function3 = flowKt__ReduceKt$first$3.X;
            try {
                ResultKt.b(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.X != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                    throw e2;
                }
            }
        }
        Object obj3 = objectRef.X;
        if (obj3 != symbol) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + function3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1] */
    public static final Object n(Flow flow, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        ?? r4;
        if (continuationImpl instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuationImpl;
            int i2 = flowKt__ReduceKt$firstOrNull$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__ReduceKt$firstOrNull$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? r2 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    objectRef2.X = obj2;
                    throw new AbortFlowException(this);
                }
            };
            try {
                flowKt__ReduceKt$firstOrNull$1.X = objectRef2;
                flowKt__ReduceKt$firstOrNull$1.f44934Y = r2;
                flowKt__ReduceKt$firstOrNull$1.e0 = 1;
                if (flow.collect(r2, flowKt__ReduceKt$firstOrNull$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                r4 = r2;
                if (e2.X != r4) {
                    throw e2;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r4 = flowKt__ReduceKt$firstOrNull$1.f44934Y;
            objectRef = flowKt__ReduceKt$firstOrNull$1.X;
            try {
                ResultKt.b(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.X != r4) {
                    throw e2;
                }
            }
        }
        return objectRef.X;
    }

    public static final Flow o(Function2 function2) {
        return new SafeFlow(function2);
    }

    public static final Job p(Flow flow, CoroutineScope coroutineScope) {
        return BuildersKt.c(coroutineScope, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3);
    }

    public static final SharedFlow q(SharedFlow sharedFlow, Function2 function2) {
        return new SubscribedSharedFlow(sharedFlow, function2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    public static final SharedFlow r(Flow flow, CoroutineScope coroutineScope, int i2) {
        SharingConfig sharingConfig;
        ChannelFlow channelFlow;
        Flow flowG;
        Object obj = SharingStarted.Companion.f44979a;
        Channel.T8.getClass();
        int i3 = Channel.Factory.f44795b;
        if (i2 >= i3) {
            i3 = i2;
        }
        int i4 = i3 - i2;
        if (!(flow instanceof ChannelFlow) || (flowG = (channelFlow = (ChannelFlow) flow).g()) == null) {
            sharingConfig = new SharingConfig(i4, EmptyCoroutineContext.X, BufferOverflow.X, flow);
        } else {
            BufferOverflow bufferOverflow = channelFlow.Z;
            int i5 = channelFlow.f44995Y;
            if (i5 != -3 && i5 != -2 && i5 != 0) {
                i4 = i5;
            } else if (bufferOverflow == BufferOverflow.X) {
                if (i5 == 0) {
                    i4 = 0;
                }
            } else if (i2 == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            sharingConfig = new SharingConfig(i4, channelFlow.X, bufferOverflow, flowG);
        }
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(i2, sharingConfig.f44977b, sharingConfig.f44978c);
        return new ReadonlySharedFlow(sharedFlowImplA, BuildersKt.b(coroutineScope, sharingConfig.d, obj.equals(obj) ? CoroutineStart.X : CoroutineStart.e0, new FlowKt__ShareKt$launchSharing$1(sharingConfig.f44976a, sharedFlowImplA, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s(Flow flow, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        Ref.ObjectRef objectRef;
        if (continuationImpl instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) continuationImpl;
            int i2 = flowKt__ReduceKt$single$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$single$1.f44942Y;
        Object obj2 = CoroutineSingletons.X;
        int i3 = flowKt__ReduceKt$single$1.Z;
        Symbol symbol = NullSurrogateKt.f45018a;
        if (i3 == 0) {
            ResultKt.b(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.X = symbol;
            FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj3, Continuation continuation) {
                    Ref.ObjectRef objectRef3 = objectRef2;
                    if (objectRef3.X != NullSurrogateKt.f45018a) {
                        throw new IllegalArgumentException("Flow has more than one element");
                    }
                    objectRef3.X = obj3;
                    return Unit.f43263a;
                }
            };
            flowKt__ReduceKt$single$1.X = objectRef2;
            flowKt__ReduceKt$single$1.Z = 1;
            if (flow.collect(flowCollector, flowKt__ReduceKt$single$1) == obj2) {
                return obj2;
            }
            objectRef = objectRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = flowKt__ReduceKt$single$1.X;
            ResultKt.b(obj);
        }
        Object obj3 = objectRef.X;
        if (obj3 != symbol) {
            return obj3;
        }
        throw new NoSuchElementException("Flow is empty");
    }

    public static final Flow t(Flow flow, Function3 function3) {
        return new SafeFlow(new FlowKt__LimitKt$transformWhile$1(flow, function3, null));
    }
}
