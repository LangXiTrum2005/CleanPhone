package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005R\u000b\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0005R\u001d\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0016X\u0096\u0005¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "", "isClosedForSend", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
class BroadcastCoroutine<E> extends AbstractCoroutine<Unit> implements ProducerScope<E>, BroadcastChannel<E> {
    @Override // kotlinx.coroutines.JobSupport
    public final void F(CancellationException cancellationException) {
        JobSupport.n0(this, cancellationException);
        throw null;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(L(), null, this);
        }
        JobSupport.n0(this, cancellationException);
        throw null;
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public final SendChannel d() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void g(Function1 function1) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object i(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void q0(boolean z2, Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void r0(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean x(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object y(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean z() {
        throw null;
    }
}
