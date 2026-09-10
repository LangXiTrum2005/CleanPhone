package kotlinx.coroutines.channels;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "SubscriberBuffered", "SubscriberConflated", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered;", "Lkotlinx/coroutines/channels/BufferedChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SubscriberBuffered extends BufferedChannel<E> {
        @Override // kotlinx.coroutines.channels.BufferedChannel
        public final void m(CancellationException cancellationException) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberConflated;", "Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        @Override // kotlinx.coroutines.channels.BufferedChannel
        public final void m(CancellationException cancellationException) {
            throw null;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void K(SelectInstance selectInstance, Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final Object i(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void m(CancellationException cancellationException) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final String toString() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final boolean x(Throwable th) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final Object y(Object obj, Continuation continuation) throws Throwable {
        BroadcastChannelImpl$send$1 broadcastChannelImpl$send$1;
        if (continuation instanceof BroadcastChannelImpl$send$1) {
            broadcastChannelImpl$send$1 = (BroadcastChannelImpl$send$1) continuation;
            int i2 = broadcastChannelImpl$send$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                broadcastChannelImpl$send$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                broadcastChannelImpl$send$1 = new BroadcastChannelImpl$send$1(this, continuation);
            }
        } else {
            broadcastChannelImpl$send$1 = new BroadcastChannelImpl$send$1(this, continuation);
        }
        Object objM = broadcastChannelImpl$send$1.f44777Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = broadcastChannelImpl$send$1.e0;
        if (i3 == 0) {
            ResultKt.b(objM);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = broadcastChannelImpl$send$1.X;
        ResultKt.b(objM);
        while (((Boolean) objM).booleanValue()) {
            if (!it.hasNext()) {
                return Unit.f43263a;
            }
            BufferedChannel bufferedChannel = (BufferedChannel) it.next();
            broadcastChannelImpl$send$1.X = it;
            broadcastChannelImpl$send$1.e0 = 1;
            objM = bufferedChannel.M(broadcastChannelImpl$send$1);
            if (objM == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final boolean z() {
        throw null;
    }
}
