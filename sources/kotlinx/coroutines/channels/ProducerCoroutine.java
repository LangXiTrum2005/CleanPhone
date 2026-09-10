package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    @Override // kotlinx.coroutines.channels.ProducerScope
    public final SendChannel d() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void q0(boolean z2, Throwable th) {
        if (this.e0.n(false, th) || z2) {
            return;
        }
        CoroutineExceptionHandlerKt.a(this.Z, th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void r0(Object obj) {
        this.e0.x(null);
    }
}
