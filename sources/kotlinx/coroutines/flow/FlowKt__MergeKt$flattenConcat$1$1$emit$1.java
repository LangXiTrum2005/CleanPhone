package kotlinx.coroutines.flow;

import com.thinkup.core.common.n.mo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", l = {mo.oom.on0}, m = "emit")
final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1 f44925Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$flattenConcat$1$1$emit$1(FlowKt__MergeKt$flattenConcat$1$1 flowKt__MergeKt$flattenConcat$1$1, Continuation continuation) {
        super(continuation);
        this.f44925Y = flowKt__MergeKt$flattenConcat$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        this.f44925Y.b(null, this);
        return Unit.f43263a;
    }
}
