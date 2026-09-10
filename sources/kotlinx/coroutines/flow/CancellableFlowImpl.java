package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/CancellableFlowImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/CancellableFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CancellableFlowImpl<T> implements CancellableFlow<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
            if (continuation instanceof CancellableFlowImpl$collect$2$emit$1) {
                cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) continuation;
                int i2 = cancellableFlowImpl$collect$2$emit$1.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cancellableFlowImpl$collect$2$emit$1.Z = i2 - Integer.MIN_VALUE;
                } else {
                    cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, continuation);
                }
            } else {
                cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, continuation);
            }
            Object obj2 = cancellableFlowImpl$collect$2$emit$1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = cancellableFlowImpl$collect$2$emit$1.Z;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj2);
                return Unit.f43263a;
            }
            ResultKt.b(obj2);
            JobKt.b(cancellableFlowImpl$collect$2$emit$1.getF45023Y());
            cancellableFlowImpl$collect$2$emit$1.Z = 1;
            throw null;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        throw null;
    }
}
