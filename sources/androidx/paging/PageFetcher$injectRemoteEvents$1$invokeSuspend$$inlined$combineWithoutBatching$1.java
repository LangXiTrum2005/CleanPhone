package androidx.paging;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Landroidx/paging/SimpleProducerScope;", "androidx/paging/FlowExtKt$combineWithoutBatching$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {161}, m = "invokeSuspend")
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u00020\bH\u008a@¨\u0006\t"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "t1", "t2", "updateFrom", "Landroidx/paging/CombineSource;", "androidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {141}, m = "invokeSuspend")
    public final class AnonymousClass1 extends SuspendLambda implements Function4<LoadStates, PageEvent<Object>, CombineSource, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f7833Y;
        public /* synthetic */ Object Z;
        public /* synthetic */ CombineSource e0;
        public final /* synthetic */ SimpleProducerScope f0;
        public final /* synthetic */ MutableLoadStateCollection g0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SimpleProducerScope simpleProducerScope, Continuation continuation, MutableLoadStateCollection mutableLoadStateCollection) {
            super(4, continuation);
            this.g0 = mutableLoadStateCollection;
            this.f0 = simpleProducerScope;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            MutableLoadStateCollection mutableLoadStateCollection = this.g0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f0, (Continuation) obj4, mutableLoadStateCollection);
            anonymousClass1.f7833Y = obj;
            anonymousClass1.Z = obj2;
            anonymousClass1.e0 = (CombineSource) obj3;
            return anonymousClass1.invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                Object obj2 = this.f7833Y;
                Object obj3 = this.Z;
                CombineSource combineSource = this.e0;
                Object loadStateUpdate = (PageEvent) obj3;
                LoadStates loadStates = (LoadStates) obj2;
                CombineSource combineSource2 = CombineSource.f7780Y;
                MutableLoadStateCollection mutableLoadStateCollection = this.g0;
                if (combineSource == combineSource2) {
                    mutableLoadStateCollection.getClass();
                    loadStateUpdate = new PageEvent.LoadStateUpdate(new LoadStates(mutableLoadStateCollection.f7816a, mutableLoadStateCollection.f7817b, mutableLoadStateCollection.f7818c), loadStates);
                } else if (loadStateUpdate instanceof PageEvent.Insert) {
                    PageEvent.Insert insert = (PageEvent.Insert) loadStateUpdate;
                    mutableLoadStateCollection.a(insert.f7822e);
                    LoadType loadType = insert.f7819a;
                    Intrinsics.f(loadType, "loadType");
                    List pages = insert.f7820b;
                    Intrinsics.f(pages, "pages");
                    LoadStates sourceLoadStates = insert.f7822e;
                    Intrinsics.f(sourceLoadStates, "sourceLoadStates");
                    loadStateUpdate = new PageEvent.Insert(loadType, pages, insert.f7821c, insert.d, sourceLoadStates, loadStates);
                } else if (loadStateUpdate instanceof PageEvent.Drop) {
                    Enum r3 = null;
                    ((PageEvent.Drop) loadStateUpdate).getClass();
                    LoadState.NotLoading notLoading = LoadState.NotLoading.f7811c;
                    mutableLoadStateCollection.getClass();
                    Intrinsics.f(null, "type");
                    int iOrdinal = r3.ordinal();
                    if (iOrdinal == 0) {
                        mutableLoadStateCollection.f7816a = notLoading;
                    } else if (iOrdinal == 1) {
                        mutableLoadStateCollection.f7817b = notLoading;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mutableLoadStateCollection.f7818c = notLoading;
                    }
                } else {
                    if (!(loadStateUpdate instanceof PageEvent.LoadStateUpdate)) {
                        if (loadStateUpdate instanceof PageEvent.StaticList) {
                            throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    PageEvent.LoadStateUpdate loadStateUpdate2 = (PageEvent.LoadStateUpdate) loadStateUpdate;
                    mutableLoadStateCollection.a(loadStateUpdate2.f7826a);
                    loadStateUpdate = new PageEvent.LoadStateUpdate(loadStateUpdate2.f7826a, loadStates);
                }
                this.X = 1;
                if (this.f0.y(loadStateUpdate, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "androidx/paging/FlowExtKt$combineWithoutBatching$2$1$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {147}, m = "invokeSuspend")
    public final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ SimpleProducerScope f7834Y;
        public final /* synthetic */ Flow Z;
        public final /* synthetic */ AtomicInteger e0;
        public final /* synthetic */ UnbatchedFlowCombiner f0;
        public final /* synthetic */ int g0;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "androidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ UnbatchedFlowCombiner X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ int f7835Y;

            /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            final class C00041 extends ContinuationImpl {
                public /* synthetic */ Object X;

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public int f7836Y;

                public C00041(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.X = obj;
                    this.f7836Y |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.emit(null, this);
                }
            }

            public AnonymousClass1(UnbatchedFlowCombiner unbatchedFlowCombiner, int i2) {
                this.X = unbatchedFlowCombiner;
                this.f7835Y = i2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
            
                if (kotlinx.coroutines.YieldKt.a(r0) == r1) goto L21;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C00041
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = (androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C00041) r0
                    int r1 = r0.f7836Y
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7836Y = r1
                    goto L18
                L13:
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.X
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                    int r2 = r0.f7836Y
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L36
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.ResultKt.b(r7)
                    goto L4f
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    kotlin.ResultKt.b(r7)
                    goto L46
                L36:
                    kotlin.ResultKt.b(r7)
                    r0.f7836Y = r4
                    androidx.paging.UnbatchedFlowCombiner r7 = r5.X
                    int r2 = r5.f7835Y
                    java.lang.Object r6 = r7.a(r2, r6, r0)
                    if (r6 != r1) goto L46
                    goto L4e
                L46:
                    r0.f7836Y = r3
                    java.lang.Object r6 = kotlinx.coroutines.YieldKt.a(r0)
                    if (r6 != r1) goto L4f
                L4e:
                    return r1
                L4f:
                    kotlin.Unit r6 = kotlin.Unit.f43263a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow flow, AtomicInteger atomicInteger, SimpleProducerScope simpleProducerScope, UnbatchedFlowCombiner unbatchedFlowCombiner, int i2, Continuation continuation) {
            super(2, continuation);
            this.Z = flow;
            this.e0 = atomicInteger;
            this.f0 = unbatchedFlowCombiner;
            this.g0 = i2;
            this.f7834Y = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            UnbatchedFlowCombiner unbatchedFlowCombiner = this.f0;
            return new AnonymousClass2(this.Z, this.e0, this.f7834Y, unbatchedFlowCombiner, this.g0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            AtomicInteger atomicInteger = this.e0;
            SimpleProducerScope simpleProducerScope = this.f7834Y;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    Flow flow = this.Z;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f0, this.g0);
                    this.X = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    simpleProducerScope.x(null);
                }
                return Unit.f43263a;
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    simpleProducerScope.x(null);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "invoke", "androidx/paging/FlowExtKt$combineWithoutBatching$2$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        new AtomicInteger(2);
        new UnbatchedFlowCombiner(new AnonymousClass1(null, null, null));
        JobKt.a();
        throw null;
    }
}
