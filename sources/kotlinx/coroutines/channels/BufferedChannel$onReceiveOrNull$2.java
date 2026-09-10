package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$onReceiveOrNull$2 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, Object, Object, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        BufferedChannel bufferedChannel = (BufferedChannel) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.f44780Y;
        bufferedChannel.getClass();
        if (obj3 != BufferedChannelKt.f44791l) {
            return obj3;
        }
        if (bufferedChannel.s() == null) {
            return null;
        }
        throw bufferedChannel.t();
    }
}
