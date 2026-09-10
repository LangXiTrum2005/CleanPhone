package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", l = {26}, m = "emit")
final class FlowKt__CountKt$count$4$emit$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44876Y;
    public final /* synthetic */ FlowKt__CountKt$count$4 Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CountKt$count$4$emit$1(FlowKt__CountKt$count$4 flowKt__CountKt$count$4, Continuation continuation) {
        super(continuation);
        this.Z = flowKt__CountKt$count$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44876Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        this.Z.emit(null, this);
        return Unit.f43263a;
    }
}
