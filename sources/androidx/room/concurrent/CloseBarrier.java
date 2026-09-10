package androidx.room.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/concurrent/CloseBarrier;", "", "Landroidx/room/concurrent/SynchronizedObject;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CloseBarrier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f8278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8279b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f8280c = new AtomicBoolean(false);

    public CloseBarrier(Function0 function0) {
        this.f8278a = function0;
    }

    public final boolean a() {
        synchronized (this) {
            if (this.f8280c.get()) {
                return false;
            }
            this.f8279b.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.f8279b.decrementAndGet();
            if (this.f8279b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }
}
