package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public JobImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f45010Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ FlowCollector e0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f45011Y;
        public final /* synthetic */ Object Z;
        public final /* synthetic */ ReceiveChannel e0;
        public final /* synthetic */ FlowCollector f0;
        public final /* synthetic */ JobImpl g0;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {126, 129, 129}, m = "invokeSuspend")
            final class C07771 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                public FlowCollector X;

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public int f45012Y;
                public final /* synthetic */ ReceiveChannel Z;
                public final /* synthetic */ FlowCollector e0;
                public final /* synthetic */ Object f0;
                public final /* synthetic */ JobImpl g0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07771(ReceiveChannel receiveChannel, FlowCollector flowCollector, Object obj, JobImpl jobImpl, Continuation continuation) {
                    super(2, continuation);
                    this.Z = receiveChannel;
                    this.e0 = flowCollector;
                    this.f0 = obj;
                    this.g0 = jobImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C07771(this.Z, this.e0, this.f0, this.g0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C07771) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
                
                    if (r1.emit(r6, r5) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
                
                    if (r6 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
                
                    return r0;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                        int r1 = r5.f45012Y
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L37
                        if (r1 == r4) goto L2f
                        r4 = 3
                        if (r1 == r3) goto L1c
                        if (r1 != r4) goto L14
                        kotlin.ResultKt.b(r6)
                        goto L2c
                    L14:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1c:
                        kotlinx.coroutines.flow.FlowCollector r1 = r5.X
                        kotlin.ResultKt.b(r6)
                        r5.X = r2
                        r5.f45012Y = r4
                        java.lang.Object r6 = r1.emit(r6, r5)
                        if (r6 != r0) goto L2c
                        goto L46
                    L2c:
                        kotlin.Unit r6 = kotlin.Unit.f43263a
                        return r6
                    L2f:
                        kotlin.ResultKt.b(r6)
                        kotlinx.coroutines.channels.ChannelResult r6 = (kotlinx.coroutines.channels.ChannelResult) r6
                        java.lang.Object r6 = r6.f44798a
                        goto L47
                    L37:
                        kotlin.ResultKt.b(r6)
                        r5.f45012Y = r4
                        kotlinx.coroutines.channels.ReceiveChannel r6 = r5.Z
                        kotlinx.coroutines.channels.ChannelCoroutine r6 = (kotlinx.coroutines.channels.ChannelCoroutine) r6
                        java.lang.Object r6 = r6.e(r5)
                        if (r6 != r0) goto L47
                    L46:
                        return r0
                    L47:
                        boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r0 == 0) goto L59
                        java.lang.Throwable r6 = kotlinx.coroutines.channels.ChannelResult.a(r6)
                        if (r6 != 0) goto L58
                        kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        kotlinx.coroutines.JobImpl r0 = r5.g0
                        r6.<init>(r0)
                    L58:
                        throw r6
                    L59:
                        kotlinx.coroutines.flow.FlowCollector r6 = r5.e0
                        r5.X = r6
                        r5.f45012Y = r3
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C07771.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                if (continuation instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) continuation;
                    int i2 = combineKt$zipImpl$1$1$2$1$emit$1.Z;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.Z = i2 - Integer.MIN_VALUE;
                    } else {
                        combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                    }
                } else {
                    combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                }
                Object obj2 = combineKt$zipImpl$1$1$2$1$emit$1.X;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i3 = combineKt$zipImpl$1$1$2$1$emit$1.Z;
                Unit unit = Unit.f43263a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj2);
                    return unit;
                }
                ResultKt.b(obj2);
                C07771 c07771 = new C07771(null, null, obj, null, null);
                combineKt$zipImpl$1$1$2$1$emit$1.Z = 1;
                return ChannelFlowKt.a(null, unit, null, c07771, combineKt$zipImpl$1$1$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CoroutineContext coroutineContext, Object obj, ReceiveChannel receiveChannel, FlowCollector flowCollector, JobImpl jobImpl, Continuation continuation) {
            super(2, continuation);
            this.f45011Y = coroutineContext;
            this.Z = obj;
            this.e0 = receiveChannel;
            this.f0 = flowCollector;
            this.g0 = jobImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f45011Y, this.Z, this.e0, this.f0, this.g0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Unit) obj, (Continuation) obj2);
            Unit unit = Unit.f43263a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                this.X = 1;
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.e0 = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.e0, continuation);
        combineKt$zipImpl$1$1.Z = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$zipImpl$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:6:0x0013, B:27:0x0081, B:31:0x0089), top: B:34:0x0008 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        AbortFlowException abortFlowException;
        ReceiveChannel receiveChannel;
        JobImpl jobImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f45010Y;
        Unit unit = Unit.f43263a;
        ?? r4 = 1;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jobImpl = this.X;
                receiveChannel = (ReceiveChannel) this.Z;
                try {
                    ResultKt.b(obj);
                    receiveChannel.a(null);
                    return unit;
                } catch (AbortFlowException e2) {
                    abortFlowException = e2;
                    if (abortFlowException.X == jobImpl) {
                        throw abortFlowException;
                    }
                    receiveChannel.a(null);
                    return unit;
                }
            }
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.Z;
            ReceiveChannel receiveChannelC = ProduceKt.c(coroutineScope, 0, new CombineKt$zipImpl$1$1$second$1(2, null), 3);
            final JobImpl jobImplA = JobKt.a();
            ((SendChannel) receiveChannelC).g(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    JobImpl jobImpl2 = jobImplA;
                    if (jobImpl2.isActive()) {
                        jobImpl2.F(new AbortFlowException(jobImpl2));
                    }
                    return Unit.f43263a;
                }
            });
            try {
                CoroutineContext f5233y = coroutineScope.getF5233Y();
                Object objB = ThreadContextKt.b(f5233y);
                CoroutineContext coroutineContextPlus = coroutineScope.getF5233Y().plus(jobImplA);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(f5233y, objB, receiveChannelC, this.e0, jobImplA, null);
                this.Z = receiveChannelC;
                this.X = jobImplA;
                this.f45010Y = 1;
                if (ChannelFlowKt.a(coroutineContextPlus, unit, ThreadContextKt.b(coroutineContextPlus), anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                receiveChannel = receiveChannelC;
                receiveChannel.a(null);
                return unit;
            } catch (AbortFlowException e3) {
                abortFlowException = e3;
                receiveChannel = receiveChannelC;
                jobImpl = jobImplA;
                if (abortFlowException.X == jobImpl) {
                    throw abortFlowException;
                }
                receiveChannel.a(null);
                return unit;
            } catch (Throwable th2) {
                th = th2;
                r4 = receiveChannelC;
                r4.a(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
