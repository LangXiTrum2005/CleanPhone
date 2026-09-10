package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {
    public ProducerScope X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44857Y;
    public final /* synthetic */ CallbackFlowBuilder Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder callbackFlowBuilder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = callbackFlowBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44857Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return this.Z.e(null, this);
    }
}
