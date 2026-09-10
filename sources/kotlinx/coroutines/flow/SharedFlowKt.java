package kotlinx.coroutines.flow;

import android.support.v4.media.a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SharedFlowKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Symbol f44972a = new Symbol("NO_VALUE");

    public static final SharedFlowImpl a(int i2, int i3, BufferOverflow bufferOverflow) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a.h(i2, "replay cannot be negative, but was ").toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(a.h(i3, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i2 <= 0 && i3 <= 0 && bufferOverflow != BufferOverflow.X) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new SharedFlowImpl(i2, i4, bufferOverflow);
    }

    public static /* synthetic */ SharedFlowImpl b(int i2, int i3) {
        BufferOverflow bufferOverflow = BufferOverflow.f44779Y;
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = (i3 & 2) == 0 ? 64 : 0;
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.X;
        }
        return a(i2, i4, bufferOverflow);
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final Flow d(SharedFlow sharedFlow, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return ((i2 == 0 || i2 == -3) && bufferOverflow == BufferOverflow.X) ? sharedFlow : new ChannelFlowOperatorImpl(i2, coroutineContext, bufferOverflow, sharedFlow);
    }
}
