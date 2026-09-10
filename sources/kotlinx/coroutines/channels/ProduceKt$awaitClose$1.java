package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public ProducerScope X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function0 f44834Y;
    public /* synthetic */ Object Z;
    public int e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        return ProduceKt.a(null, null, this);
    }
}
