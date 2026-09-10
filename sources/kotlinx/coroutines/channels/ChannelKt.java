package kotlinx.coroutines.channels;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChannelKt {
    public static BufferedChannel a(int i2, int i3, BufferOverflow bufferOverflow) {
        if ((i3 & 2) != 0) {
            bufferOverflow = BufferOverflow.X;
        }
        if (i2 == -2) {
            if (bufferOverflow != BufferOverflow.X) {
                return new ConflatedBufferedChannel(1, bufferOverflow);
            }
            Channel.T8.getClass();
            return new BufferedChannel(Channel.Factory.f44795b);
        }
        if (i2 == -1) {
            if (bufferOverflow == BufferOverflow.X) {
                return new ConflatedBufferedChannel(1, BufferOverflow.f44779Y);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i2 == 0) {
            return bufferOverflow == BufferOverflow.X ? new BufferedChannel(0) : new ConflatedBufferedChannel(1, bufferOverflow);
        }
        if (i2 != Integer.MAX_VALUE) {
            return bufferOverflow == BufferOverflow.X ? new BufferedChannel(i2) : new ConflatedBufferedChannel(i2, bufferOverflow);
        }
        return new BufferedChannel(Integer.MAX_VALUE);
    }
}
