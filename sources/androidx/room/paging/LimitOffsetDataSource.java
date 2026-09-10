package androidx.room.paging;

import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* JADX INFO: renamed from: androidx.room.paging.LimitOffsetDataSource$1, reason: invalid class name */
    class AnonymousClass1 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        public final void a(Set set) {
            throw null;
        }
    }

    @Override // androidx.paging.DataSource
    public final boolean a() {
        throw null;
    }
}
