package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f45004Y;
    public Job Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1 f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.f0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        return this.f0.emit(null, this);
    }
}
