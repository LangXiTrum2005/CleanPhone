package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ThreadState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f45054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f45055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadContextElement[] f45056c;
    public int d;

    public ThreadState(int i2, CoroutineContext coroutineContext) {
        this.f45054a = coroutineContext;
        this.f45055b = new Object[i2];
        this.f45056c = new ThreadContextElement[i2];
    }
}
