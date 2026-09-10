package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
final class StartedLazily$command$1 extends SuspendLambda implements Function2<FlowCollector<? super SharingCommand>, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44981Y;
    public final /* synthetic */ StateFlow Z;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ Ref.BooleanRef X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f44982Y;

        public AnonymousClass1(Ref.BooleanRef booleanRef, FlowCollector flowCollector) {
            this.X = booleanRef;
            this.f44982Y = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object b(int i2, Continuation continuation) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (continuation instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
                int i3 = startedLazily$command$1$1$emit$1.Z;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.Z = i3 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
            }
            Object obj = startedLazily$command$1$1$emit$1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i4 = startedLazily$command$1$1$emit$1.Z;
            Unit unit = Unit.f43263a;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            if (i2 > 0) {
                Ref.BooleanRef booleanRef = this.X;
                if (!booleanRef.X) {
                    booleanRef.X = true;
                    SharingCommand sharingCommand = SharingCommand.X;
                    startedLazily$command$1$1$emit$1.Z = 1;
                    if (this.f44982Y.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return unit;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return b(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(StateFlow stateFlow, Continuation continuation) {
        super(2, continuation);
        this.Z = stateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.Z, continuation);
        startedLazily$command$1.f44981Y = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((StartedLazily$command$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        return CoroutineSingletons.X;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(new Ref.BooleanRef(), (FlowCollector) this.f44981Y);
            this.X = 1;
            if (this.Z.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
