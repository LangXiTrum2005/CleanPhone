package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ExecutorCompat {

    public static class HandlerExecutor implements Executor {
        public final Handler X;

        public HandlerExecutor(Handler handler) {
            this.X = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            Handler handler = this.X;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new HandlerExecutor(handler);
    }
}
