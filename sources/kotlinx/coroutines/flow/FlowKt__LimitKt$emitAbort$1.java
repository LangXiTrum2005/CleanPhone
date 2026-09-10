package kotlinx.coroutines.flow;

import com.smartdigimkt.f3.b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {b.B0}, m = "emitAbort$FlowKt__LimitKt")
final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44910Y;
    public int Z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44910Y = obj;
        this.Z |= Integer.MIN_VALUE;
        FlowKt__LimitKt.a(null, null, null, this);
        return CoroutineSingletons.X;
    }
}
