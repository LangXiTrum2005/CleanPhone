package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, mo.oom.ooo, 100}, m = "invokeSuspend")
final class DataStoreImpl$data$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Data X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f4619Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ DataStoreImpl e0;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super State<Object>>, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ DataStoreImpl f4620Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DataStoreImpl dataStoreImpl, Continuation continuation) {
            super(2, continuation);
            this.f4620Y = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f4620Y, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                this.X = 1;
                if (DataStoreImpl.d(this.f4620Y, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements Function2<State<Object>, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object X;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.X = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((State) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            return Boolean.valueOf(!(((State) this.X) instanceof Final));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass3 extends SuspendLambda implements Function2<State<Object>, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ State f4621Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(State state, Continuation continuation) {
            super(2, continuation);
            this.f4621Y = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f4621Y, continuation);
            anonymousClass3.X = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((State) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            State state = (State) this.X;
            return Boolean.valueOf((state instanceof Data) && state.f4693a <= this.f4621Y.f4693a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
    final class AnonymousClass5 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ DataStoreImpl f4622Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(DataStoreImpl dataStoreImpl, Continuation continuation) {
            super(3, continuation);
            this.f4622Y = dataStoreImpl;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return new AnonymousClass5(this.f4622Y, (Continuation) obj3).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                this.X = 1;
                if (DataStoreImpl.b(this.f4622Y, this) == coroutineSingletons) {
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
    public DataStoreImpl$data$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.e0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.e0, continuation);
        dataStoreImpl$data$1.Z = obj;
        return dataStoreImpl$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$data$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        State state;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f4619Y;
        Unit unit = Unit.f43263a;
        DataStoreImpl dataStoreImpl = this.e0;
        if (i2 == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.Z;
            this.Z = flowCollector2;
            this.f4619Y = 1;
            Object objF = BuildersKt.f(dataStoreImpl.f4607c.getX(), new DataStoreImpl$readState$2(dataStoreImpl, null), this);
            if (objF != coroutineSingletons) {
                flowCollector = flowCollector2;
                obj = objF;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            FlowCollector flowCollector3 = (FlowCollector) this.Z;
            ResultKt.b(obj);
            flowCollector = flowCollector3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            state = this.X;
            flowCollector = (FlowCollector) this.Z;
            ResultKt.b(obj);
        }
        final FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(new AnonymousClass3(state, null), new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new AnonymousClass2(2, null), new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass1(dataStoreImpl, null), dataStoreImpl.f4609h.f4643a)));
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new Flow<Object>() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

            /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector X;

                /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object X;

                    /* JADX INFO: renamed from: Y, reason: collision with root package name */
                    public int f4623Y;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.X = obj;
                        this.f4623Y |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.X = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.f4623Y;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f4623Y = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.X;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                    int i3 = anonymousClass1.f4623Y;
                    if (i3 == 0) {
                        ResultKt.b(obj2);
                        State state = (State) obj;
                        if (state instanceof ReadException) {
                            throw ((ReadException) state).f4677b;
                        }
                        if (!(state instanceof Data)) {
                            if (state instanceof Final ? true : state instanceof UnInitialized) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object obj3 = ((Data) state).f4599b;
                        anonymousClass1.f4623Y = 1;
                        if (this.X.emit(obj3, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f43263a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector4, Continuation continuation) {
                Object objCollect = flowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector4), continuation);
                return objCollect == CoroutineSingletons.X ? objCollect : Unit.f43263a;
            }
        }, new AnonymousClass5(dataStoreImpl, null));
        this.Z = null;
        this.X = null;
        this.f4619Y = 3;
        if (FlowKt.j(this, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, flowCollector) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        state = (State) obj;
        if (state instanceof Data) {
            Object obj2 = ((Data) state).f4599b;
            this.Z = flowCollector;
            this.X = (Data) state;
            this.f4619Y = 2;
            if (flowCollector.emit(obj2, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (state instanceof UnInitialized) {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        if (state instanceof ReadException) {
            throw ((ReadException) state).f4677b;
        }
        if (!(state instanceof Final)) {
        }
        return unit;
        final FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$dropWhile$$inlined$unsafeFlow$2 = new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(new AnonymousClass3(state, null), new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new AnonymousClass2(2, null), new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass1(dataStoreImpl, null), dataStoreImpl.f4609h.f4643a)));
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new Flow<Object>() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

            /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector X;

                /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object X;

                    /* JADX INFO: renamed from: Y, reason: collision with root package name */
                    public int f4623Y;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.X = obj;
                        this.f4623Y |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.X = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.f4623Y;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f4623Y = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.X;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                    int i3 = anonymousClass1.f4623Y;
                    if (i3 == 0) {
                        ResultKt.b(obj2);
                        State state = (State) obj;
                        if (state instanceof ReadException) {
                            throw ((ReadException) state).f4677b;
                        }
                        if (!(state instanceof Data)) {
                            if (state instanceof Final ? true : state instanceof UnInitialized) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object obj3 = ((Data) state).f4599b;
                        anonymousClass1.f4623Y = 1;
                        if (this.X.emit(obj3, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f43263a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector4, Continuation continuation) {
                Object objCollect = flowKt__LimitKt$dropWhile$$inlined$unsafeFlow$2.collect(new AnonymousClass2(flowCollector4), continuation);
                return objCollect == CoroutineSingletons.X ? objCollect : Unit.f43263a;
            }
        }, new AnonymousClass5(dataStoreImpl, null));
        this.Z = null;
        this.X = null;
        this.f4619Y = 3;
        if (FlowKt.j(this, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, flowCollector) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
    }
}
