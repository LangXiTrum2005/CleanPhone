package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f44907Y;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(Function2 function2, Flow flow) {
        this.X = flow;
        this.f44907Y = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.X.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref.BooleanRef(), flowCollector, this.f44907Y), continuation);
        return objCollect == CoroutineSingletons.X ? objCollect : Unit.f43263a;
    }
}
