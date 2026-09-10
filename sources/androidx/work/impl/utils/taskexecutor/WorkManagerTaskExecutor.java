package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerTaskExecutor implements TaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialExecutor f8850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f8851b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f8852c = new Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.f8851b.post(runnable);
        }
    };

    public WorkManagerTaskExecutor(ExecutorService executorService) {
        this.f8850a = new SerialExecutor(executorService);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final Executor a() {
        return this.f8852c;
    }

    public final void b(Runnable runnable) {
        this.f8850a.execute(runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final SerialExecutor getBackgroundExecutor() {
        return this.f8850a;
    }
}
