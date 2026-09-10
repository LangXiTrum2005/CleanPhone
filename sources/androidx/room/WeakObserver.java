package androidx.room;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WeakObserver extends InvalidationTracker.Observer {
    @Override // androidx.room.InvalidationTracker.Observer
    public final void a(Set tables) {
        Intrinsics.f(tables, "tables");
        throw null;
    }
}
