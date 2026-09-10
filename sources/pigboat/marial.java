package pigboat;

import java.util.Collection;
import java.util.ServiceLoader;
import p002kotlin.Metadata;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"", "exception", "", "saneness", "(Ljava/lang/Throwable;)V", "", "Lkotlinx/coroutines/polder;", "attabal", "Ljava/util/Collection;", "()Ljava/util/Collection;", "platformExceptionHandlers", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Collection<kotlinx.coroutines.polder> f35363attabal = SequencesKt___SequencesKt.hydrovane(p002kotlin.sequences.arytenoidectomy.competently(ServiceLoader.load(kotlinx.coroutines.polder.class, kotlinx.coroutines.polder.class.getClassLoader()).iterator()));

    public static final Collection<kotlinx.coroutines.polder> attabal() {
        return f35363attabal;
    }

    public static final void saneness(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
