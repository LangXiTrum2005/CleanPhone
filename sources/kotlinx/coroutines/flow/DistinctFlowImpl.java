package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DistinctFlowImpl<T> implements Flow<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f44859Y;
        public final /* synthetic */ FlowCollector Z;

        public AnonymousClass2(Ref.ObjectRef objectRef, FlowCollector flowCollector) {
            this.f44859Y = objectRef;
            this.Z = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
                int i2 = distinctFlowImpl$collect$2$emit$1.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.Z = i2 - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
            }
            Object obj2 = distinctFlowImpl$collect$2$emit$1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = distinctFlowImpl$collect$2$emit$1.Z;
            Unit unit = Unit.f43263a;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj2);
                return unit;
            }
            ResultKt.b(obj2);
            DistinctFlowImpl.this.getClass();
            Ref.ObjectRef objectRef = this.f44859Y;
            Object obj3 = objectRef.X;
            if (obj3 == NullSurrogateKt.f45018a || !Intrinsics.a(obj3, obj)) {
                objectRef.X = obj;
                distinctFlowImpl$collect$2$emit$1.Z = 1;
                if (this.Z.emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.X = NullSurrogateKt.f45018a;
        new AnonymousClass2(objectRef, flowCollector);
        throw null;
    }
}
