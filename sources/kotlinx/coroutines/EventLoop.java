package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EventLoop extends CoroutineDispatcher {
    public static final /* synthetic */ int f0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f44753Y;
    public boolean Z;
    public ArrayDeque e0;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher e0(int i2) {
        LimitedDispatcherKt.a(1);
        return this;
    }

    public final void j0(boolean z2) {
        long j = this.f44753Y - (z2 ? 4294967296L : 1L);
        this.f44753Y = j;
        if (j <= 0 && this.Z) {
            shutdown();
        }
    }

    public final void n0(DispatchedTask dispatchedTask) {
        ArrayDeque arrayDeque = this.e0;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.e0 = arrayDeque;
        }
        arrayDeque.addLast(dispatchedTask);
    }

    public final void q0(boolean z2) {
        this.f44753Y = (z2 ? 4294967296L : 1L) + this.f44753Y;
        if (z2) {
            return;
        }
        this.Z = true;
    }

    public long s0() {
        return !t0() ? Long.MAX_VALUE : 0L;
    }

    public void shutdown() {
    }

    public final boolean t0() {
        ArrayDeque arrayDeque = this.e0;
        if (arrayDeque == null) {
            return false;
        }
        DispatchedTask dispatchedTask = (DispatchedTask) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
        if (dispatchedTask == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }
}
