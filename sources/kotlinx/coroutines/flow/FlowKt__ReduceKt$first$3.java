package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {
    public Function2 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Ref.ObjectRef f44931Y;
    public FlowKt__ReduceKt$first$$inlined$collectWhile$2 Z;
    public /* synthetic */ Object e0;
    public int f0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        return FlowKt.m(null, null, this);
    }
}
