package hydrosulfurous;

import java.util.concurrent.Executor;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import kotlinx.coroutines.sensatory;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0010\f\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lhydrosulfurous/marial;", "Lkotlinx/coroutines/sensatory;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "lerp", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "preterite", "(Ljava/lang/Runnable;ZZ)V", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "underbelly", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "monoploid", "I", "polloi", "molybdenite", "J", "graveside", "Ljava/lang/String;", "adultoid", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "czestochowa", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class marial extends sensatory {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public CoroutineScheduler coroutineScheduler = underbelly();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final String schedulerName;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final int corePoolSize;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final int maxPoolSize;

    public marial(int i, int i2, long j, String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
    }

    @Override // kotlinx.coroutines.sensatory
    /* JADX INFO: renamed from: czestochowa */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    @Override // kotlinx.coroutines.merc
    public void itchy(CoroutineContext context, Runnable block) {
        CoroutineScheduler.monoploid(this.coroutineScheduler, block, false, false, 6, null);
    }

    @Override // kotlinx.coroutines.merc
    public void lerp(CoroutineContext context, Runnable block) {
        CoroutineScheduler.monoploid(this.coroutineScheduler, block, false, true, 2, null);
    }

    public final void preterite(Runnable block, boolean context, boolean fair) {
        this.coroutineScheduler.arytenoidectomy(block, context, fair);
    }

    public final CoroutineScheduler underbelly() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }
}
