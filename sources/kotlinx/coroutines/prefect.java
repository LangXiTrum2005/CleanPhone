package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/prefect;", "Lkotlinx/coroutines/merc;", "<init>", "()V", "", "parallelism", "", "name", "sayid", "(ILjava/lang/String;)Lkotlinx/coroutines/merc;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "nosophobia", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class prefect extends merc {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final prefect f32381arytenoidectomy = new prefect();

    @Override // kotlinx.coroutines.merc
    public void itchy(CoroutineContext context, Runnable block) {
        fastrack fastrackVar = (fastrack) context.get(fastrack.INSTANCE);
        if (fastrackVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        fastrackVar.dispatcherWasUnconfined = true;
    }

    @Override // kotlinx.coroutines.merc
    public boolean nosophobia(CoroutineContext context) {
        return false;
    }

    @Override // kotlinx.coroutines.merc
    public merc sayid(int parallelism, String name) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.merc
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.Unconfined";
    }
}
