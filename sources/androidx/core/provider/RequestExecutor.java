package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
class RequestExecutor {

    public static class DefaultThreadFactory implements ThreadFactory {
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f4381Y;

        public static class ProcessPriorityThread extends Thread {
            public final int X;

            public ProcessPriorityThread(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.X = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(this.X);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.X, this.f4381Y);
        }
    }

    public static class HandlerExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            throw null;
        }
    }

    public static class ReplyRunnable<T> implements Runnable {
        public Callable X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Consumer f4382Y;
        public Handler Z;

        @Override // java.lang.Runnable
        public final void run() {
            final Object objCall;
            try {
                objCall = ((FontRequestWorker.AnonymousClass3) this.X).call();
            } catch (Exception unused) {
                objCall = null;
            }
            final Consumer consumer = this.f4382Y;
            this.Z.post(new Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(objCall);
                }
            });
        }
    }
}
