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
final /* synthetic */ class BufferedChannel$bindCancellationFun$2 extends FunctionReferenceImpl implements Function3<Throwable, Object, CoroutineContext, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((BufferedChannel) this.receiver).getClass();
        Intrinsics.c(null);
        OnUndeliveredElementKt.a(null, obj2, (CoroutineContext) obj3);
        return Unit.f43263a;
    }
}
