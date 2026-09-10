package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/ThreadContextElement;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {
    public final Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ThreadLocal f45051Y;
    public final ThreadLocalKey Z;

    public ThreadLocalElement(Object obj, ThreadLocal threadLocal) {
        this.X = obj;
        this.f45051Y = threadLocal;
        this.Z = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final void J(Object obj) {
        this.f45051Y.set(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.ThreadContextElement
    public final Object T(CoroutineContext coroutineContext) {
        ThreadLocal threadLocal = this.f45051Y;
        Object obj = threadLocal.get();
        threadLocal.set(this.X);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        if (this.Z.equals(key)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* JADX INFO: renamed from: getKey */
    public final CoroutineContext.Key getX() {
        return this.Z;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.Z.equals(key) ? EmptyCoroutineContext.X : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.X + ", threadLocal = " + this.f45051Y + ')';
    }
}
