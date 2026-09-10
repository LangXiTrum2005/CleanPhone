package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", l = {127}, m = "emit")
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {
    public FlowKt__LimitKt$collectWhile$collector$1 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44904Y;
    public final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, Continuation continuation) {
        super(continuation);
        this.Z = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44904Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        this.Z.emit(null, this);
        return Unit.f43263a;
    }
}
