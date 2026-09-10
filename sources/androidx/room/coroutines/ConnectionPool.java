package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/room/coroutines/ConnectionPool;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "RollbackException", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConnectionPool extends AutoCloseable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/coroutines/ConnectionPool$RollbackException;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RollbackException extends Throwable {
    }

    Object x0(boolean z2, Function2 function2, ContinuationImpl continuationImpl);
}
