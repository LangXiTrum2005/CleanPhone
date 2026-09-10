package ta;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends u {
    @Override // ta.u
    public final Object q(Object obj, Object obj2) {
        z zVar = (z) obj;
        ListenableFuture listenableFutureApply = zVar.apply(obj2);
        go.k.n(listenableFutureApply, zVar, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return listenableFutureApply;
    }

    @Override // ta.u
    public final void r(Object obj) {
        o((ListenableFuture) obj);
    }
}
