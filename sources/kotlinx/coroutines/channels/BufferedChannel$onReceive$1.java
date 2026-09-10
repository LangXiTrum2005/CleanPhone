package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, SelectInstance<?>, Object, Unit> {
    public static final BufferedChannel$onReceive$1 X = new BufferedChannel$onReceive$1(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BufferedChannel.h((BufferedChannel) obj, (SelectInstance) obj2);
        return Unit.f43263a;
    }
}
