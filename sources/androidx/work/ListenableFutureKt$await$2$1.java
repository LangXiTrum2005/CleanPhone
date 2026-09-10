package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "", "R"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class ListenableFutureKt$await$2$1 implements Runnable {
    public final /* synthetic */ CancellableContinuationImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f8627Y;

    public ListenableFutureKt$await$2$1(CancellableContinuationImpl cancellableContinuationImpl, ListenableFuture listenableFuture) {
        this.X = cancellableContinuationImpl;
        this.f8627Y = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CancellableContinuationImpl cancellableContinuationImpl = this.X;
        try {
            cancellableContinuationImpl.resumeWith(this.f8627Y.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                cancellableContinuationImpl.f(cause);
            } else {
                cancellableContinuationImpl.resumeWith(ResultKt.a(cause));
            }
        }
    }
}
