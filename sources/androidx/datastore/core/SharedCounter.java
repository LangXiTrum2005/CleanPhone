package androidx.datastore.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/SharedCounter;", "", "Factory", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedCounter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NativeSharedCounter f4681b = new NativeSharedCounter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4682a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/SharedCounter$Factory;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory {
    }

    public SharedCounter(long j) {
        this.f4682a = j;
    }
}
