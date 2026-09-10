package claque;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: ExecutorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently {

    /* JADX INFO: compiled from: ExecutorCompat.java */
    public static class attabal implements Executor {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Handler f15625kowloon;

        public attabal(Handler handler) {
            this.f15625kowloon = (Handler) technofreak.cutely.competently(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f15625kowloon.post((Runnable) technofreak.cutely.competently(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f15625kowloon + " is shutting down");
        }
    }

    public static Executor attabal(Handler handler) {
        return new attabal(handler);
    }
}
