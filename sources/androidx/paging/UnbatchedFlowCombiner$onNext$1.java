package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {190, 230, 207}, m = "onNext")
final class UnbatchedFlowCombiner$onNext$1 extends ContinuationImpl {
    public UnbatchedFlowCombiner X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f7893Y;
    public MutexImpl Z;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ UnbatchedFlowCombiner g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnbatchedFlowCombiner$onNext$1(UnbatchedFlowCombiner unbatchedFlowCombiner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g0 = unbatchedFlowCombiner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        return this.g0.a(0, null, this);
    }
}
