package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    public final BufferOverflow l0;

    public ConflatedBufferedChannel(int i2, BufferOverflow bufferOverflow) {
        super(i2);
        this.l0 = bufferOverflow;
        if (bufferOverflow != BufferOverflow.X) {
            if (i2 < 1) {
                throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("Buffered channel capacity must be at least 1, but ", i2, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.f43333a.b(BufferedChannel.class).l() + " instead").toString());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean E() {
        return this.l0 == BufferOverflow.f44779Y;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void K(SelectInstance selectInstance, Object obj) {
        Object objS = S(obj, false);
        if (!(objS instanceof ChannelResult.Failed)) {
            selectInstance.c(Unit.f43263a);
        } else {
            if (!(objS instanceof ChannelResult.Closed)) {
                throw new IllegalStateException("unreachable");
            }
            ChannelResult.a(objS);
            selectInstance.c(BufferedChannelKt.f44791l);
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final Object M(Continuation continuation) {
        Object objS = S(null, true);
        if (objS instanceof ChannelResult.Failed) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public final Object S(Object obj, boolean z2) {
        ChannelSegment channelSegment;
        BufferOverflow bufferOverflow = BufferOverflow.Z;
        Unit unit = Unit.f43263a;
        if (this.l0 == bufferOverflow) {
            Object objI = super.i(obj);
            return (!(objI instanceof ChannelResult.Failed) || (objI instanceof ChannelResult.Closed)) ? objI : unit;
        }
        Object obj2 = BufferedChannelKt.d;
        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.g0.get(this);
        while (true) {
            long andIncrement = BufferedChannel.f44780Y.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zC = C(andIncrement, false);
            long j2 = BufferedChannelKt.f44786b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (channelSegment2.Z != j3) {
                ChannelSegment channelSegmentB = BufferedChannel.b(this, j3, channelSegment2);
                if (channelSegmentB != null) {
                    channelSegment = channelSegmentB;
                } else if (zC) {
                    return new ChannelResult.Closed(w());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int iJ = BufferedChannel.j(this, channelSegment, i2, obj, j, obj2, zC);
            channelSegment2 = channelSegment;
            if (iJ == 0) {
                channelSegment2.a();
                return unit;
            }
            if (iJ != 1) {
                if (iJ != 2) {
                    if (iJ == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iJ == 4) {
                        if (j < BufferedChannel.Z.get(this)) {
                            channelSegment2.a();
                        }
                        return new ChannelResult.Closed(w());
                    }
                    if (iJ == 5) {
                        channelSegment2.a();
                    }
                    obj = obj;
                } else {
                    if (zC) {
                        channelSegment2.i();
                        return new ChannelResult.Closed(w());
                    }
                    Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                    if (waiter != null) {
                        BufferedChannel.f(this, waiter, channelSegment2, i2);
                    }
                    p((channelSegment2.Z * j2) + ((long) i2));
                }
            }
            return unit;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final Object i(Object obj) {
        return S(obj, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final Object y(Object obj, Continuation continuation) throws Throwable {
        Object objS = S(obj, true);
        if (!(objS instanceof ChannelResult.Closed)) {
            return Unit.f43263a;
        }
        ChannelResult.a(objS);
        throw w();
    }
}
