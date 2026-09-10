package androidx.room.coroutines;

import androidx.room.c;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool;", "Landroidx/room/coroutines/ConnectionPool;", "ConnectionElement", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PassthroughConnectionPool implements ConnectionPool {
    public final SQLiteDriver X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f8294Y;
    public final Function2 Z;
    public final Lazy e0 = LazyKt.b(new c(this, 1));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConnectionElement implements CoroutineContext.Element {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Key f8295Y = new Key();
        public final PassthroughConnection X;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Key implements CoroutineContext.Key<ConnectionElement> {
        }

        public ConnectionElement(PassthroughConnection passthroughConnection) {
            this.X = passthroughConnection;
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final Object fold(Object obj, Function2 function2) {
            return function2.invoke(obj, this);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext.Element get(CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.b(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        /* JADX INFO: renamed from: getKey */
        public final CoroutineContext.Key getX() {
            return f8295Y;
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext minusKey(CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.c(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext plus(CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
        }
    }

    public PassthroughConnectionPool(SQLiteDriver sQLiteDriver, String str, Function2 function2) {
        this.X = sQLiteDriver;
        this.f8294Y = str;
        this.Z = function2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        Lazy lazy = this.e0;
        if (lazy.isInitialized()) {
            ((SQLiteConnection) lazy.getX()).close();
        }
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public final Object x0(boolean z2, Function2 function2, ContinuationImpl continuationImpl) {
        ConnectionElement connectionElement = (ConnectionElement) continuationImpl.getF45023Y().get(ConnectionElement.f8295Y);
        PassthroughConnection passthroughConnection = connectionElement != null ? connectionElement.X : null;
        if (passthroughConnection != null) {
            return function2.invoke(passthroughConnection, continuationImpl);
        }
        PassthroughConnection passthroughConnection2 = new PassthroughConnection(this.Z, (SQLiteConnection) this.e0.getX());
        return BuildersKt.f(new ConnectionElement(passthroughConnection2), new PassthroughConnectionPool$useConnection$2(function2, passthroughConnection2, null), continuationImpl);
    }
}
