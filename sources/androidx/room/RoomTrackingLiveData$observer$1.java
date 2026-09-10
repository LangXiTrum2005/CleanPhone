package androidx.room;

import A.RunnableC0895i;
import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/RoomTrackingLiveData$observer$1", "Landroidx/room/InvalidationTracker$Observer;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoomTrackingLiveData$observer$1 extends InvalidationTracker.Observer {
    @Override // androidx.room.InvalidationTracker.Observer
    public final void a(Set tables) {
        Intrinsics.f(tables, "tables");
        ArchTaskExecutor archTaskExecutorA = ArchTaskExecutor.a();
        RunnableC0895i runnableC0895i = new RunnableC0895i(15);
        archTaskExecutorA.f3676a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw null;
        }
        archTaskExecutorA.b(runnableC0895i);
    }
}
