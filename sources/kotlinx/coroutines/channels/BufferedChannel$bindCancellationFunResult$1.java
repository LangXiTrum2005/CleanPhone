package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$bindCancellationFunResult$1 extends FunctionReferenceImpl implements Function3<Throwable, ChannelResult<Object>, CoroutineContext, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = ((ChannelResult) obj2).f44798a;
        CoroutineContext coroutineContext = (CoroutineContext) obj3;
        ((BufferedChannel) this.receiver).getClass();
        Intrinsics.c(null);
        if (obj4 instanceof ChannelResult.Failed) {
            obj4 = null;
        }
        Intrinsics.c(obj4);
        OnUndeliveredElementKt.a(null, obj4, coroutineContext);
        return Unit.f43263a;
    }
}
