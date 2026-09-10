package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/coroutines/ConnectionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ConnectionElement implements CoroutineContext.Element {
    public final CoroutineContext.Key X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final PooledConnectionImpl f8281Y;

    public ConnectionElement(CoroutineContext.Key key, PooledConnectionImpl connectionWrapper) {
        Intrinsics.f(connectionWrapper, "connectionWrapper");
        this.X = key;
        this.f8281Y = connectionWrapper;
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
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final CoroutineContext.Key getX() {
        return this.X;
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
