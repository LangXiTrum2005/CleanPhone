package lehua;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SafeLoggingExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public class triweekly implements Executor {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Executor f32729kowloon;

    /* JADX INFO: compiled from: SafeLoggingExecutor.java */
    public static class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Runnable f32730kowloon;

        public attabal(Runnable runnable) {
            this.f32730kowloon = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f32730kowloon.run();
            } catch (Exception e) {
                unliveable.attabal.wireman("Executor", "Background execution failure.", e);
            }
        }
    }

    public triweekly(Executor executor) {
        this.f32729kowloon = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f32729kowloon.execute(new attabal(runnable));
    }
}
