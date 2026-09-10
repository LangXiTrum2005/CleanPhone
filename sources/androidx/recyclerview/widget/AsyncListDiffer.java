package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class AsyncListDiffer<T> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListDiffer$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListDiffer$1$1, reason: invalid class name and collision with other inner class name */
        class C00071 extends DiffUtil.Callback {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListDiffer$1$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public interface ListListener<T> {
    }

    public static class MainThreadExecutor implements Executor {
        public final Handler X = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.X.post(runnable);
        }
    }

    static {
        new MainThreadExecutor();
    }
}
