package sulfarsenide;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TransactionExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu implements Executor {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final ArrayDeque<Runnable> f38248arytenoidectomy = new ArrayDeque<>();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Executor f38249kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Runnable f38250monoploid;

    /* JADX INFO: compiled from: TransactionExecutor.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Runnable f38252kowloon;

        public attabal(Runnable runnable) {
            this.f38252kowloon = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38252kowloon.run();
            } finally {
                impromptu.this.attabal();
            }
        }
    }

    public impromptu(Executor executor) {
        this.f38249kowloon = executor;
    }

    public synchronized void attabal() {
        Runnable runnablePoll = this.f38248arytenoidectomy.poll();
        this.f38250monoploid = runnablePoll;
        if (runnablePoll != null) {
            this.f38249kowloon.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f38248arytenoidectomy.offer(new attabal(runnable));
        if (this.f38250monoploid == null) {
            attabal();
        }
    }
}
