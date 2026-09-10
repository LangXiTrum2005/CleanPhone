package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class Loader implements LoaderErrorThrower {
    public static final LoadErrorAction d = new LoadErrorAction(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LoadErrorAction f18795e = new LoadErrorAction(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f18796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoadTask f18797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f18798c;

    public interface Callback<T extends Loadable> {
        void a(Loadable loadable, long j, long j2, boolean z2);

        void b(Loadable loadable, long j, long j2);

        LoadErrorAction f(Loadable loadable, long j, long j2, IOException iOException, int i2);
    }

    public static final class LoadErrorAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18800b;

        public LoadErrorAction(int i2, long j) {
            this.f18799a = i2;
            this.f18800b = j;
        }
    }

    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Loadable f18801Y;
        public final long Z;
        public Object e0;
        public IOException f0;
        public int g0;
        public Thread h0;
        public boolean i0;
        public volatile boolean j0;

        public LoadTask(Looper looper, Loadable loadable, Callback callback, int i2, long j) {
            super(looper);
            this.f18801Y = loadable;
            this.e0 = callback;
            this.X = i2;
            this.Z = j;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.exoplayer2.upstream.Loader$Callback, java.lang.Object] */
        public final void a(boolean z2) {
            this.j0 = z2;
            this.f0 = null;
            if (hasMessages(0)) {
                this.i0 = true;
                removeMessages(0);
                if (!z2) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.i0 = true;
                        this.f18801Y.cancelLoad();
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
                Loader.this.f18797b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ?? r1 = this.e0;
                r1.getClass();
                r1.a(this.f18801Y, jElapsedRealtime, jElapsedRealtime - this.Z, true);
                this.e0 = null;
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.exoplayer2.upstream.Loader$Callback, java.lang.Object] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.j0) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                this.f0 = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f18796a;
                LoadTask loadTask = loader.f18797b;
                loadTask.getClass();
                executorService.execute(loadTask);
                return;
            }
            if (i2 == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f18797b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.Z;
            ?? r3 = this.e0;
            r3.getClass();
            if (this.i0) {
                r3.a(this.f18801Y, jElapsedRealtime, j, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    r3.b(this.f18801Y, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e2) {
                    Log.d("LoadTask", "Unexpected exception handling load completed", e2);
                    Loader.this.f18798c = new UnexpectedLoaderException(e2);
                    return;
                }
            }
            if (i3 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f0 = iOException;
            int i4 = this.g0 + 1;
            this.g0 = i4;
            LoadErrorAction loadErrorActionF = r3.f(this.f18801Y, jElapsedRealtime, j, iOException, i4);
            int i5 = loadErrorActionF.f18799a;
            if (i5 == 3) {
                Loader.this.f18798c = this.f0;
                return;
            }
            if (i5 != 2) {
                if (i5 == 1) {
                    this.g0 = 1;
                }
                long jMin = loadErrorActionF.f18800b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.g0 - 1) * 1000, 5000);
                }
                Loader loader2 = Loader.this;
                Assertions.d(loader2.f18797b == null);
                loader2.f18797b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(0, jMin);
                } else {
                    this.f0 = null;
                    loader2.f18796a.execute(this);
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
                    TraceUtil.a("load:".concat(this.f18801Y.getClass().getSimpleName()));
                    try {
                        this.f18801Y.load();
                        TraceUtil.b();
                    } catch (Throwable th) {
                        TraceUtil.b();
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
                sendEmptyMessage(1);
            } catch (IOException e2) {
                if (this.j0) {
                    return;
                }
                obtainMessage(2, e2).sendToTarget();
            } catch (Exception e3) {
                if (this.j0) {
                    return;
                }
                Log.d("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.j0) {
                    return;
                }
                Log.d("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            } catch (Error e5) {
                if (!this.j0) {
                    Log.d("LoadTask", "Unexpected error loading stream", e5);
                    obtainMessage(3, e5).sendToTarget();
                }
                throw e5;
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
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i2 = Util.f18979a;
        this.f18796a = Executors.newSingleThreadExecutor(new com.google.android.exoplayer2.util.c(strConcat));
    }

    public final void a() {
        LoadTask loadTask = this.f18797b;
        Assertions.e(loadTask);
        loadTask.a(false);
    }

    public final boolean b() {
        return this.f18797b != null;
    }

    public final void c(int i2) throws IOException {
        IOException iOException = this.f18798c;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask loadTask = this.f18797b;
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
        LoadTask loadTask = this.f18797b;
        if (loadTask != null) {
            loadTask.a(true);
        }
        ExecutorService executorService = this.f18796a;
        if (releaseCallback != null) {
            executorService.execute(new ReleaseTask(releaseCallback));
        }
        executorService.shutdown();
    }

    public final long e(Loadable loadable, Callback callback, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        Assertions.e(looperMyLooper);
        this.f18798c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LoadTask loadTask = new LoadTask(looperMyLooper, loadable, callback, i2, jElapsedRealtime);
        Assertions.d(this.f18797b == null);
        this.f18797b = loadTask;
        loadTask.f0 = null;
        this.f18796a.execute(loadTask);
        return jElapsedRealtime;
    }
}
