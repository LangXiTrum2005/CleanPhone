package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1", f = "Transform.kt", l = {159}, m = "emit")
final class FlowKt__TransformKt$chunked$2$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FlowKt__TransformKt$chunked$2$1 f44947Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$chunked$2$1$emit$1(FlowKt__TransformKt$chunked$2$1 flowKt__TransformKt$chunked$2$1, Continuation continuation) {
        super(continuation);
        this.f44947Y = flowKt__TransformKt$chunked$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        this.f44947Y.emit(null, this);
        throw null;
    }
}
