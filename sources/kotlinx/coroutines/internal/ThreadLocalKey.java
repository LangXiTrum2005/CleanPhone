package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/internal/ThreadLocalElement;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThreadLocalKey implements CoroutineContext.Key<ThreadLocalElement<?>> {
    public final ThreadLocal X;

    public ThreadLocalKey(ThreadLocal threadLocal) {
        this.X = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreadLocalKey) && Intrinsics.a(this.X, ((ThreadLocalKey) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.X + ')';
    }
}
