package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile AsyncTaskLoader<D>.LoadTask mTask;
    long mUpdateThrottle;

    public final class LoadTask extends ModernAsyncTask<Void, Void, D> implements Runnable {
        public final CountDownLatch j0 = new CountDownLatch(1);
        public boolean k0;

        public LoadTask() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final Object b() {
            try {
                return AsyncTaskLoader.this.onLoadInBackground();
            } catch (OperationCanceledException e2) {
                if (this.e0.get()) {
                    return null;
                }
                throw e2;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void c(Object obj) {
            CountDownLatch countDownLatch = this.j0;
            try {
                AsyncTaskLoader.this.dispatchOnCancelled(this, obj);
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void d(Object obj) {
            CountDownLatch countDownLatch = this.j0;
            try {
                AsyncTaskLoader.this.dispatchOnLoadComplete(this, obj);
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.k0 = false;
            AsyncTaskLoader.this.executePendingTask();
        }
    }

    public AsyncTaskLoader(Context context) {
        ThreadPoolExecutor threadPoolExecutor = ModernAsyncTask.g0;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mReset = true;
        this.mContentChanged = false;
        this.mProcessingChange = false;
        this.mContext = context.getApplicationContext();
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = threadPoolExecutor;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        onCanceled(d);
        if (this.mCancellingTask == loadTask) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        if (this.mTask != loadTask) {
            dispatchOnCancelled(loadTask, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.k0);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.k0);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUtils.a(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            long j = this.mLastLoadCompleteTime;
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (j == 0) {
                printWriter.print("--");
            } else {
                TimeUtils.a(j - jUptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.k0) {
            this.mTask.k0 = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.k0 = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        AsyncTaskLoader<D>.LoadTask loadTask = this.mTask;
        Executor executor = this.mExecutor;
        if (loadTask.Z == ModernAsyncTask.Status.X) {
            loadTask.Z = ModernAsyncTask.Status.f5312Y;
            loadTask.X.getClass();
            executor.execute(loadTask.f5308Y);
        } else {
            int iOrdinal = loadTask.Z.ordinal();
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iOrdinal == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract Object loadInBackground();

    @Override // androidx.loader.content.Loader
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.k0) {
                this.mTask.k0 = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.k0) {
            this.mTask.k0 = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        AsyncTaskLoader<D>.LoadTask loadTask = this.mTask;
        loadTask.e0.set(true);
        boolean zCancel = loadTask.f5308Y.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    public void onCanceled(D d) {
    }

    @Override // androidx.loader.content.Loader
    public void onForceLoad() {
        cancelLoad();
        this.mTask = new LoadTask();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return (D) loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        AsyncTaskLoader<D>.LoadTask loadTask = this.mTask;
        if (loadTask != null) {
            try {
                loadTask.j0.await();
            } catch (InterruptedException unused) {
            }
        }
    }
}
