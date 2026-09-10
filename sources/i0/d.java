package i0;

import android.os.OutcomeReceiver;
import cn.l;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f42486a;

    public d(l lVar) {
        super(false);
        this.f42486a = lVar;
    }

    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            this.f42486a.resumeWith(t9.e.c(th2));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f42486a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
