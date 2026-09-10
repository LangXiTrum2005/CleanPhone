package androidx.room;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TransactorKt {
    public static final Object a(PooledConnection pooledConnection, String str, ContinuationImpl continuationImpl) {
        Object objB = pooledConnection.b(str, new d(0), continuationImpl);
        return objB == CoroutineSingletons.X ? objB : Unit.f43263a;
    }
}
