package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$onSend$1 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, SelectInstance<?>, Object, Unit> {
    public static final BufferedChannel$onSend$1 X = new BufferedChannel$onSend$1(3, BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((BufferedChannel) obj).K((SelectInstance) obj2, obj3);
        return Unit.f43263a;
    }
}
