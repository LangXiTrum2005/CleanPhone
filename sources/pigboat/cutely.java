package pigboat;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.hydrovane;
import kotlinx.coroutines.mathsort;
import kotlinx.coroutines.milliradian;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001e\u0010,\u001a\f\u0012\b\u0012\u00060\u000ej\u0002`\u000f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u000b\u00103\u001a\u0002028\u0002X\u0082\u0004¨\u00065"}, d2 = {"Lpigboat/cutely;", "Lkotlinx/coroutines/merc;", "Lkotlinx/coroutines/mathsort;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lkotlinx/coroutines/merc;ILjava/lang/String;)V", "sayid", "(ILjava/lang/String;)Lkotlinx/coroutines/merc;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "lerp", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lkotlinx/coroutines/impassible;", "continuation", "monoploid", "(JLkotlinx/coroutines/impassible;)V", "Lkotlinx/coroutines/milliradian;", "merc", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/milliradian;", "", "igbo", "()Z", "wostteth", "()Ljava/lang/Runnable;", "Lkotlinx/coroutines/merc;", "polloi", "I", "Ljava/lang/String;", "Lpigboat/triweekly;", "molybdenite", "Lpigboat/triweekly;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "graveside", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "attabal", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cutely extends kotlinx.coroutines.merc implements mathsort {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35337adultoid = AtomicIntegerFieldUpdater.newUpdater(cutely.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ mathsort f35338arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final Object workerAllocationLock;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final triweekly<Runnable> queue;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.merc dispatcher;
    private final String name;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final int parallelism;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpigboat/cutely$attabal;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lpigboat/cutely;Ljava/lang/Runnable;)V", "", "run", "()V", "kowloon", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public Runnable currentTask;

        public attabal(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    kotlinx.coroutines.seminary.attabal(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable runnableWostteth = cutely.this.wostteth();
                if (runnableWostteth == null) {
                    return;
                }
                this.currentTask = runnableWostteth;
                i++;
                if (i >= 16 && impromptu.wireman(cutely.this.dispatcher, cutely.this)) {
                    impromptu.dern(cutely.this.dispatcher, cutely.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cutely(kotlinx.coroutines.merc mercVar, int i, String str) {
        mathsort mathsortVar = mercVar instanceof mathsort ? (mathsort) mercVar : null;
        this.f35338arytenoidectomy = mathsortVar == null ? hydrovane.attabal() : mathsortVar;
        this.dispatcher = mercVar;
        this.parallelism = i;
        this.name = str;
        this.queue = new triweekly<>(false);
        this.workerAllocationLock = new Object();
    }

    public final boolean igbo() {
        synchronized (this.workerAllocationLock) {
            if (f35337adultoid.get(this) >= this.parallelism) {
                return false;
            }
            f35337adultoid.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.merc
    public void itchy(CoroutineContext context, Runnable block) {
        Runnable runnableWostteth;
        this.queue.attabal(block);
        if (f35337adultoid.get(this) >= this.parallelism || !igbo() || (runnableWostteth = wostteth()) == null) {
            return;
        }
        impromptu.dern(this.dispatcher, this, new attabal(runnableWostteth));
    }

    @Override // kotlinx.coroutines.merc
    public void lerp(CoroutineContext context, Runnable block) {
        Runnable runnableWostteth;
        this.queue.attabal(block);
        if (f35337adultoid.get(this) >= this.parallelism || !igbo() || (runnableWostteth = wostteth()) == null) {
            return;
        }
        this.dispatcher.lerp(this, new attabal(runnableWostteth));
    }

    @Override // kotlinx.coroutines.mathsort
    public milliradian merc(long timeMillis, Runnable block, CoroutineContext context) {
        return this.f35338arytenoidectomy.merc(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.mathsort
    public void monoploid(long timeMillis, kotlinx.coroutines.impassible<? super Unit> continuation) {
        this.f35338arytenoidectomy.monoploid(timeMillis, continuation);
    }

    @Override // kotlinx.coroutines.merc
    public kotlinx.coroutines.merc sayid(int parallelism, String name) {
        apical.attabal(parallelism);
        return parallelism >= this.parallelism ? apical.saneness(this, name) : super.sayid(parallelism, name);
    }

    @Override // kotlinx.coroutines.merc
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return this.dispatcher + ".limitedParallelism(" + this.parallelism + ')';
    }

    public final Runnable wostteth() {
        while (true) {
            Runnable runnableMarial = this.queue.marial();
            if (runnableMarial != null) {
                return runnableMarial;
            }
            synchronized (this.workerAllocationLock) {
                f35337adultoid.decrementAndGet(this);
                if (this.queue.dern() == 0) {
                    return null;
                }
                f35337adultoid.incrementAndGet(this);
            }
        }
    }
}
