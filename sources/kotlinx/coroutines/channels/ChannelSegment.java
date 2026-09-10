package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/ChannelSegment;", "E", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicArray;", "", "data", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChannelSegment<E> extends Segment<ChannelSegment<E>> {
    public final BufferedChannel f0;
    public final /* synthetic */ AtomicReferenceArray g0;

    public ChannelSegment(long j, ChannelSegment channelSegment, BufferedChannel bufferedChannel, int i2) {
        super(j, channelSegment, i2);
        this.f0 = bufferedChannel;
        this.g0 = new AtomicReferenceArray(BufferedChannelKt.f44786b * 2);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int g() {
        return BufferedChannelKt.f44786b;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final void h(int i2, CoroutineContext coroutineContext) {
        BufferedChannel bufferedChannel;
        int i3 = BufferedChannelKt.f44786b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        this.g0.get(i2 * 2);
        while (true) {
            Object objL = l(i2);
            boolean z3 = objL instanceof Waiter;
            bufferedChannel = this.f0;
            if (z3 || (objL instanceof WaiterEB)) {
                if (k(i2, objL, z2 ? BufferedChannelKt.j : BufferedChannelKt.k)) {
                    n(i2, null);
                    m(i2, !z2);
                    if (z2) {
                        Intrinsics.c(bufferedChannel);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == BufferedChannelKt.j || objL == BufferedChannelKt.k) {
                    break;
                }
                if (objL != BufferedChannelKt.g && objL != BufferedChannelKt.f) {
                    if (objL == BufferedChannelKt.f44790i || objL == BufferedChannelKt.d || objL == BufferedChannelKt.f44791l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
        n(i2, null);
        if (z2) {
            Intrinsics.c(bufferedChannel);
        }
    }

    public final boolean k(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.g0;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i2) {
        return this.g0.get((i2 * 2) + 1);
    }

    public final void m(int i2, boolean z2) {
        if (z2) {
            BufferedChannel bufferedChannel = this.f0;
            Intrinsics.c(bufferedChannel);
            bufferedChannel.R((this.Z * ((long) BufferedChannelKt.f44786b)) + ((long) i2));
        }
        i();
    }

    public final void n(int i2, Object obj) {
        this.g0.set(i2 * 2, obj);
    }

    public final void o(int i2, Symbol symbol) {
        this.g0.set((i2 * 2) + 1, symbol);
    }
}
