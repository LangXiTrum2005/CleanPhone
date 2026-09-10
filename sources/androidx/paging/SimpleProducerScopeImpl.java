package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/SimpleProducerScopeImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/SimpleProducerScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SimpleProducerScopeImpl<T> implements SimpleProducerScope<T>, CoroutineScope, SendChannel<T> {
    public final BufferedChannel X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f7877Y;

    public SimpleProducerScopeImpl(CoroutineScope scope, BufferedChannel bufferedChannel) {
        Intrinsics.f(scope, "scope");
        this.X = bufferedChannel;
        this.f7877Y = scope;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void g(Function1 function1) {
        this.X.g(function1);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getX() {
        return this.f7877Y.getX();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object i(Object obj) {
        return this.X.i(obj);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean x(Throwable th) {
        return this.X.n(false, null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object y(Object obj, Continuation continuation) {
        return this.X.y(obj, continuation);
    }
}
