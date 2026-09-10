package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    public Throwable X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44888Y;
    public int Z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44888Y = obj;
        this.Z |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.a(null, null, null, this);
    }
}
