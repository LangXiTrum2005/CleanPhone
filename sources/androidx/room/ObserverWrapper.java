package androidx.room;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/ObserverWrapper;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObserverWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvalidationTracker.Observer f8210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f8212c;
    public final Set d;

    public ObserverWrapper(InvalidationTracker.Observer observer, int[] tableIds, String[] tableNames) {
        Intrinsics.f(observer, "observer");
        Intrinsics.f(tableIds, "tableIds");
        Intrinsics.f(tableNames, "tableNames");
        this.f8210a = observer;
        this.f8211b = tableIds;
        this.f8212c = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.d = !(tableNames.length == 0) ? SetsKt.h(tableNames[0]) : EmptySet.X;
    }
}
