package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t*\f\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/sensatory;", "dern", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/sensatory;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/merc;", "saneness", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/merc;", "attabal", "(Lkotlinx/coroutines/merc;)Ljava/util/concurrent/Executor;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class preterite {
    public static final Executor attabal(merc mercVar) {
        Executor executorCzestochowa;
        sensatory sensatoryVar = mercVar instanceof sensatory ? (sensatory) mercVar : null;
        return (sensatoryVar == null || (executorCzestochowa = sensatoryVar.getExecutor()) == null) ? new cultivated(mercVar) : executorCzestochowa;
    }

    public static final sensatory dern(ExecutorService executorService) {
        return new underbelly(executorService);
    }

    public static final merc saneness(Executor executor) {
        merc mercVar;
        cultivated cultivatedVar = executor instanceof cultivated ? (cultivated) executor : null;
        return (cultivatedVar == null || (mercVar = cultivatedVar.dispatcher) == null) ? new underbelly(executor) : mercVar;
    }
}
