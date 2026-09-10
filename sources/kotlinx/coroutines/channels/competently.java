package kotlinx.coroutines.channels;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Lkotlinx/coroutines/channels/wireman;", "attabal", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/channels/wireman;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class competently {
    public static final <E> wireman<E> attabal(int i, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        if (i == -2) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(wireman.INSTANCE.attabal(), function1) : new impassible(1, bufferOverflow, function1);
        }
        if (i == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new impassible(1, BufferOverflow.DROP_OLDEST, function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == 0) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, function1) : new impassible(1, bufferOverflow, function1);
        }
        if (i != Integer.MAX_VALUE) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i, function1) : new impassible(i, bufferOverflow, function1);
        }
        return new BufferedChannel(Integer.MAX_VALUE, function1);
    }

    public static /* synthetic */ wireman saneness(int i, BufferOverflow bufferOverflow, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return attabal(i, bufferOverflow, function1);
    }
}
