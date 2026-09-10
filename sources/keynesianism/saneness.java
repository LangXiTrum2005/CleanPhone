package keynesianism;

import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PoolableExecutors.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final keynesianism.attabal f29147attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile keynesianism.attabal f29148saneness;

    /* JADX INFO: renamed from: keynesianism.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PoolableExecutors.java */
    public static class C0659saneness implements keynesianism.attabal {
        public C0659saneness() {
        }

        @Override // keynesianism.attabal
        public ExecutorService attabal(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return saneness(1, threadFactory, threadPriority);
        }

        public ExecutorService saneness(int i, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0659saneness c0659saneness = new C0659saneness();
        f29147attabal = c0659saneness;
        f29148saneness = c0659saneness;
    }

    public static keynesianism.attabal attabal() {
        return f29148saneness;
    }
}
