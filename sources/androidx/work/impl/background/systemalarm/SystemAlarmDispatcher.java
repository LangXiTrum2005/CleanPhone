package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmDispatcher implements ExecutionListener {
    public static final String l0 = Logger.e("SystemAlarmDispatcher");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final WorkManagerTaskExecutor f8713Y;
    public final WorkTimer Z;
    public final Processor e0;
    public final WorkManagerImpl f0;
    public final CommandHandler g0;
    public final Handler h0;
    public final ArrayList i0;
    public Intent j0;
    public SystemAlarmService k0;

    public static class AddRunnable implements Runnable {
        public final SystemAlarmDispatcher X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Intent f8714Y;
        public final int Z;

        public AddRunnable(int i2, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
            this.X = systemAlarmDispatcher;
            this.f8714Y = intent;
            this.Z = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.f8714Y;
            this.X.a(this.Z, intent);
        }
    }

    public interface CommandsCompletedListener {
    }

    public static class DequeueAndCheckForCompletion implements Runnable {
        public final SystemAlarmDispatcher X;

        public DequeueAndCheckForCompletion(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.X = systemAlarmDispatcher;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:4:0x0019, B:6:0x001d, B:8:0x0042, B:11:0x0048, B:12:0x004f, B:13:0x0050, B:14:0x0058, B:18:0x0062, B:20:0x006a, B:21:0x006c, B:25:0x0076, B:27:0x0085, B:35:0x0097, B:31:0x008b, B:32:0x008c, B:34:0x0094, B:39:0x009b, B:22:0x006d, B:23:0x0073, B:15:0x0059, B:16:0x005f), top: B:42:0x0019, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0094 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:4:0x0019, B:6:0x001d, B:8:0x0042, B:11:0x0048, B:12:0x004f, B:13:0x0050, B:14:0x0058, B:18:0x0062, B:20:0x006a, B:21:0x006c, B:25:0x0076, B:27:0x0085, B:35:0x0097, B:31:0x008b, B:32:0x008c, B:34:0x0094, B:39:0x009b, B:22:0x006d, B:23:0x0073, B:15:0x0059, B:16:0x005f), top: B:42:0x0019, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean zIsEmpty;
            boolean zIsEmpty2;
            SystemAlarmDispatcher systemAlarmDispatcher = this.X;
            systemAlarmDispatcher.getClass();
            Logger loggerC = Logger.c();
            String str = SystemAlarmDispatcher.l0;
            loggerC.a(str, "Checking if commands are complete.", new Throwable[0]);
            systemAlarmDispatcher.b();
            synchronized (systemAlarmDispatcher.i0) {
                try {
                    if (systemAlarmDispatcher.j0 != null) {
                        Logger.c().a(str, String.format("Removing command %s", systemAlarmDispatcher.j0), new Throwable[0]);
                        if (!((Intent) systemAlarmDispatcher.i0.remove(0)).equals(systemAlarmDispatcher.j0)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        systemAlarmDispatcher.j0 = null;
                    }
                    SerialExecutor serialExecutor = systemAlarmDispatcher.f8713Y.f8850a;
                    CommandHandler commandHandler = systemAlarmDispatcher.g0;
                    synchronized (commandHandler.Z) {
                        zIsEmpty = commandHandler.f8704Y.isEmpty();
                    }
                    if (zIsEmpty && systemAlarmDispatcher.i0.isEmpty()) {
                        synchronized (serialExecutor.Z) {
                            zIsEmpty2 = serialExecutor.X.isEmpty();
                        }
                        if (zIsEmpty2) {
                            Logger.c().a(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = systemAlarmDispatcher.k0;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!systemAlarmDispatcher.i0.isEmpty()) {
                            systemAlarmDispatcher.f();
                        }
                    } else if (!systemAlarmDispatcher.i0.isEmpty()) {
                        systemAlarmDispatcher.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public SystemAlarmDispatcher(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.X = applicationContext;
        this.g0 = new CommandHandler(applicationContext);
        this.Z = new WorkTimer();
        WorkManagerImpl workManagerImplB = WorkManagerImpl.b(systemAlarmService);
        this.f0 = workManagerImplB;
        Processor processor = workManagerImplB.f;
        this.e0 = processor;
        this.f8713Y = workManagerImplB.d;
        processor.a(this);
        this.i0 = new ArrayList();
        this.j0 = null;
        this.h0 = new Handler(Looper.getMainLooper());
    }

    public final void a(int i2, Intent intent) {
        Logger loggerC = Logger.c();
        String str = l0;
        loggerC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i2)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.i0) {
                try {
                    Iterator it = this.i0.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.i0) {
            try {
                boolean zIsEmpty = this.i0.isEmpty();
                this.i0.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.h0.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void c() {
        Logger.c().a(l0, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.e0.d(this);
        ScheduledExecutorService scheduledExecutorService = this.Z.f8828a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.k0 = null;
    }

    public final void d(Runnable runnable) {
        this.h0.post(runnable);
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        String str2 = CommandHandler.e0;
        Intent intent = new Intent(this.X, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        d(new AddRunnable(0, intent, this));
    }

    public final void f() {
        b();
        PowerManager.WakeLock wakeLockA = WakeLocks.a(this.X, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f0.d.b(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public final void run() {
                    SystemAlarmDispatcher systemAlarmDispatcher;
                    synchronized (SystemAlarmDispatcher.this.i0) {
                        SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher2.j0 = (Intent) systemAlarmDispatcher2.i0.get(0);
                    }
                    Intent intent = SystemAlarmDispatcher.this.j0;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.j0.getIntExtra("KEY_START_ID", 0);
                        Logger loggerC = Logger.c();
                        String str = SystemAlarmDispatcher.l0;
                        loggerC.a(str, String.format("Processing command %s, %s", SystemAlarmDispatcher.this.j0, Integer.valueOf(intExtra)), new Throwable[0]);
                        PowerManager.WakeLock wakeLockA2 = WakeLocks.a(SystemAlarmDispatcher.this.X, action + " (" + intExtra + ")");
                        try {
                            Logger.c().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA2, new Throwable[0]);
                            wakeLockA2.acquire();
                            SystemAlarmDispatcher systemAlarmDispatcher3 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher3.g0.c(intExtra, systemAlarmDispatcher3.j0, systemAlarmDispatcher3);
                            Logger.c().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA2, new Throwable[0]);
                            wakeLockA2.release();
                            SystemAlarmDispatcher systemAlarmDispatcher4 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher4.d(new DequeueAndCheckForCompletion(systemAlarmDispatcher4));
                        } catch (Throwable th) {
                            try {
                                Logger loggerC2 = Logger.c();
                                String str2 = SystemAlarmDispatcher.l0;
                                loggerC2.b(str2, "Unexpected error in onHandleIntent", th);
                                Logger.c().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA2, new Throwable[0]);
                            } finally {
                                Logger.c().a(SystemAlarmDispatcher.l0, "Releasing operation wake lock (" + action + ") " + wakeLockA2, new Throwable[0]);
                                wakeLockA2.release();
                                systemAlarmDispatcher = SystemAlarmDispatcher.this;
                                systemAlarmDispatcher.d(new DequeueAndCheckForCompletion(systemAlarmDispatcher));
                            }
                        }
                    }
                }
            });
        } finally {
            wakeLockA.release();
        }
    }
}
