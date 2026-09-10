package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096A¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\u0007R\u000b\u0010\n\u001a\u00020\t8\u0016X\u0097\u0005R\u000b\u0010\u000b\u001a\u00020\t8\u0016X\u0097\u0005R\u000b\u0010\f\u001a\u00020\t8\u0016X\u0097\u0005R\u0011\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0016X\u0096\u0005R\u0017\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\r8\u0016X\u0096\u0005R\u0013\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r8\u0016X\u0097\u0005R\u001d\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00118\u0016X\u0096\u0005¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/ChannelCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatching", "()Lkotlinx/coroutines/channels/ChannelResult;", "tryReceive", "", "isClosedForReceive", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "onReceiveCatching", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ChannelCoroutine<E> extends AbstractCoroutine<Unit> implements Channel<E> {
    public final BufferedChannel e0;

    public ChannelCoroutine(CoroutineContext coroutineContext, BufferedChannel bufferedChannel) {
        super(coroutineContext, true);
        this.e0 = bufferedChannel;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void F(CancellationException cancellationException) {
        CancellationException cancellationExceptionN0 = JobSupport.n0(this, cancellationException);
        this.e0.m(cancellationExceptionN0);
        E(cancellationExceptionN0);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(L(), null, this);
        }
        F(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object e(ContinuationImpl continuationImpl) throws Throwable {
        BufferedChannel bufferedChannel = this.e0;
        bufferedChannel.getClass();
        Object objI = BufferedChannel.I(bufferedChannel, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objI;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void g(Function1 function1) {
        this.e0.g(function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object i(Object obj) {
        return this.e0.i(obj);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator iterator() {
        BufferedChannel bufferedChannel = this.e0;
        bufferedChannel.getClass();
        return new BufferedChannel.BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 l() {
        return this.e0.l();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 u() {
        return this.e0.u();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object v() {
        return this.e0.v();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean x(Throwable th) {
        return this.e0.n(false, th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object y(Object obj, Continuation continuation) {
        return this.e0.y(obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean z() {
        return this.e0.z();
    }
}
