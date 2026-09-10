package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class Loader implements LoaderErrorThrower {
    public static final LoadErrorAction d = new LoadErrorAction(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LoadErrorAction f6576e = new LoadErrorAction(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f6577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoadTask f6578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f6579c;

    public interface Callback<T extends Loadable> {
        LoadErrorAction b(Loadable loadable, long j, long j2, IOException iOException, int i2);

        void g(Loadable loadable, long j, long j2);

        void h(Loadable loadable, long j, long j2, boolean z2);
    }

    public static final class LoadErrorAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6581b;

        public LoadErrorAction(int i2, long j) {
            this.f6580a = i2;
            this.f6581b = j;
        }
    }

    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Loadable f6582Y;
        public final long Z;
        public Object e0;
        public IOException f0;
        public int g0;
        public Thread h0;
        public boolean i0;
        public volatile boolean j0;

        public LoadTask(Looper looper, Loadable loadable, Callback callback, int i2, long j) {
            super(looper);
            this.f6582Y = loadable;
            this.e0 = callback;
            this.X = i2;
            this.Z = j;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.media3.exoplayer.upstream.Loader$Callback, java.lang.Object] */
        public final void a(boolean z2) {
            this.j0 = z2;
            this.f0 = null;
            if (hasMessages(1)) {
                this.i0 = true;
                removeMessages(1);
                if (!z2) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.i0 = true;
                        this.f6582Y.cancelLoad();
                        Thread thread = this.h0;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z2) {
                Loader.this.f6578b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ?? r1 = this.e0;
                r1.getClass();
                r1.h(this.f6582Y, jElapsedRealtime, jElapsedRealtime - this.Z, true);
                this.e0 = null;
            }
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.media3.exoplayer.upstream.Loader$Callback, java.lang.Object] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.j0) {
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.f0 = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f6577a;
                LoadTask loadTask = loader.f6578b;
                loadTask.getClass();
                executorService.execute(loadTask);
                return;
            }
            if (i2 == 4) {
                throw ((Error) message.obj);
            }
            Loader.this.f6578b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.Z;
            ?? r3 = this.e0;
            r3.getClass();
            if (this.i0) {
                r3.h(this.f6582Y, jElapsedRealtime, j, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 2) {
                try {
                    r3.g(this.f6582Y, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e2) {
                    Log.d("LoadTask", "Unexpected exception handling load completed", e2);
                    Loader.this.f6579c = new UnexpectedLoaderException(e2);
                    return;
                }
            }
            if (i3 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f0 = iOException;
            int i4 = this.g0 + 1;
            this.g0 = i4;
            LoadErrorAction loadErrorActionB = r3.b(this.f6582Y, jElapsedRealtime, j, iOException, i4);
            int i5 = loadErrorActionB.f6580a;
            if (i5 == 3) {
                Loader.this.f6579c = this.f0;
                return;
            }
            if (i5 != 2) {
                if (i5 == 1) {
                    this.g0 = 1;
                }
                long jMin = loadErrorActionB.f6581b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.g0 - 1) * 1000, 5000);
                }
                Loader loader2 = Loader.this;
                Assertions.e(loader2.f6578b == null);
                loader2.f6578b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    this.f0 = null;
                    loader2.f6577a.execute(this);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2;
            try {
                synchronized (this) {
                    z2 = this.i0;
                    this.h0 = Thread.currentThread();
                }
                if (!z2) {
                    Trace.beginSection("load:".concat(this.f6582Y.getClass().getSimpleName()));
                    try {
                        this.f6582Y.load();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.h0 = null;
                    Thread.interrupted();
                }
                if (this.j0) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e2) {
                if (this.j0) {
                    return;
                }
                obtainMessage(3, e2).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.j0) {
                    return;
                }
                Log.d("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.j0) {
                    Log.d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Exception e5) {
                if (this.j0) {
                    return;
                }
                Log.d("LoadTask", "Unexpected exception loading stream", e5);
                obtainMessage(3, new UnexpectedLoaderException(e5)).sendToTarget();
            }
        }
    }

    public interface Loadable {
        void cancelLoad();

        void load();
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    public static final class ReleaseTask implements Runnable {
        public final ReleaseCallback X;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.X = releaseCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.onLoaderReleased();
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            sb.append(th.getMessage() != null ? androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder(": ")) : "");
            super(sb.toString(), th);
        }
    }

    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i2 = Util.f5683a;
        this.f6577a = Executors.newSingleThreadExecutor(new androidx.media3.common.util.c(strConcat));
    }

    public final void a() {
        LoadTask loadTask = this.f6578b;
        Assertions.f(loadTask);
        loadTask.a(false);
    }

    public final boolean b() {
        return this.f6578b != null;
    }

    public final void c(int i2) throws IOException {
        IOException iOException = this.f6579c;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask loadTask = this.f6578b;
        if (loadTask != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = loadTask.X;
            }
            IOException iOException2 = loadTask.f0;
            if (iOException2 != null && loadTask.g0 > i2) {
                throw iOException2;
            }
        }
    }

    public final void d(ReleaseCallback releaseCallback) {
        LoadTask loadTask = this.f6578b;
        if (loadTask != null) {
            loadTask.a(true);
        }
        ExecutorService executorService = this.f6577a;
        if (releaseCallback != null) {
            executorService.execute(new ReleaseTask(releaseCallback));
        }
        executorService.shutdown();
    }

    public final long e(Loadable loadable, Callback callback, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        Assertions.f(looperMyLooper);
        this.f6579c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LoadTask loadTask = new LoadTask(looperMyLooper, loadable, callback, i2, jElapsedRealtime);
        Assertions.e(this.f6578b == null);
        this.f6578b = loadTask;
        loadTask.f0 = null;
        this.f6577a.execute(loadTask);
        return jElapsedRealtime;
    }
}
