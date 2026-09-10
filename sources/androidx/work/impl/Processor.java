package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v4.media.a;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class Processor implements ExecutionListener, ForegroundProcessor {
    public static final String m0 = Logger.e("Processor");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Context f8662Y;
    public final Configuration Z;
    public final WorkManagerTaskExecutor e0;
    public final WorkDatabase f0;
    public final List i0;
    public final HashMap h0 = new HashMap();
    public final HashMap g0 = new HashMap();
    public final HashSet j0 = new HashSet();
    public final ArrayList k0 = new ArrayList();
    public PowerManager.WakeLock X = null;
    public final Object l0 = new Object();

    public static class FutureListener implements Runnable {
        public Processor X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public String f8663Y;
        public SettableFuture Z;

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.Z.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.X.e(this.f8663Y, zBooleanValue);
        }
    }

    public Processor(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, WorkDatabase workDatabase, List list) {
        this.f8662Y = context;
        this.Z = configuration;
        this.e0 = workManagerTaskExecutor;
        this.f0 = workDatabase;
        this.i0 = list;
    }

    public static boolean b(String str, WorkerWrapper workerWrapper) {
        boolean zIsDone;
        if (workerWrapper == null) {
            Logger.c().a(m0, a.C("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        workerWrapper.t0 = true;
        workerWrapper.i();
        ListenableFuture listenableFuture = workerWrapper.s0;
        if (listenableFuture != null) {
            zIsDone = listenableFuture.isDone();
            workerWrapper.s0.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = workerWrapper.g0;
        if (listenableWorker == null || zIsDone) {
            Logger.c().a(WorkerWrapper.u0, "WorkSpec " + workerWrapper.f0 + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        Logger.c().a(m0, a.C("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(ExecutionListener executionListener) {
        synchronized (this.l0) {
            this.k0.add(executionListener);
        }
    }

    public final boolean c(String str) {
        boolean z2;
        synchronized (this.l0) {
            try {
                z2 = this.h0.containsKey(str) || this.g0.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public final void d(ExecutionListener executionListener) {
        synchronized (this.l0) {
            this.k0.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        synchronized (this.l0) {
            try {
                this.h0.remove(str);
                Logger.c().a(m0, getClass().getSimpleName() + " " + str + " executed; reschedule = " + z2, new Throwable[0]);
                Iterator it = this.k0.iterator();
                while (it.hasNext()) {
                    ((ExecutionListener) it.next()).e(str, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.l0) {
            try {
                Logger.c().d(m0, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                WorkerWrapper workerWrapper = (WorkerWrapper) this.h0.remove(str);
                if (workerWrapper != null) {
                    if (this.X == null) {
                        PowerManager.WakeLock wakeLockA = WakeLocks.a(this.f8662Y, "ProcessorForegroundLck");
                        this.X = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.g0.put(str, workerWrapper);
                    ContextCompat.startForegroundService(this.f8662Y, SystemForegroundDispatcher.c(this.f8662Y, str, foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        synchronized (this.l0) {
            try {
                if (c(str)) {
                    Logger.c().a(m0, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f8662Y;
                Configuration configuration = this.Z;
                WorkManagerTaskExecutor workManagerTaskExecutor = this.e0;
                WorkDatabase workDatabase = this.f0;
                WorkerWrapper.Builder builder = new WorkerWrapper.Builder();
                builder.f8697h = new WorkerParameters.RuntimeExtras();
                builder.f8693a = context.getApplicationContext();
                builder.f8695c = workManagerTaskExecutor;
                builder.f8694b = this;
                builder.d = configuration;
                builder.f8696e = workDatabase;
                builder.f = str;
                builder.g = this.i0;
                if (runtimeExtras != null) {
                    builder.f8697h = runtimeExtras;
                }
                WorkerWrapper workerWrapperA = builder.a();
                SettableFuture settableFuture = workerWrapperA.r0;
                FutureListener futureListener = new FutureListener();
                futureListener.X = this;
                futureListener.f8663Y = str;
                futureListener.Z = settableFuture;
                settableFuture.addListener(futureListener, this.e0.f8852c);
                this.h0.put(str, workerWrapperA);
                this.e0.f8850a.execute(workerWrapperA);
                Logger.c().a(m0, a.D(getClass().getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.l0) {
            try {
                if (this.g0.isEmpty()) {
                    Context context = this.f8662Y;
                    String str = SystemForegroundDispatcher.l0;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f8662Y.startService(intent);
                    } catch (Throwable th) {
                        Logger.c().b(m0, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.X;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.X = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean zB;
        synchronized (this.l0) {
            Logger.c().a(m0, "Processor stopping foreground work " + str, new Throwable[0]);
            zB = b(str, (WorkerWrapper) this.g0.remove(str));
        }
        return zB;
    }

    public final boolean j(String str) {
        boolean zB;
        synchronized (this.l0) {
            Logger.c().a(m0, "Processor stopping background work " + str, new Throwable[0]);
            zB = b(str, (WorkerWrapper) this.h0.remove(str));
        }
        return zB;
    }
}
