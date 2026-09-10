package g5;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d5.o;
import e5.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import n5.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e5.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f41543k = o.i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5.a f41545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f41546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e5.b f41547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f41548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f41549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f41550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f41551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Intent f41552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SystemAlarmService f41553j;

    public h(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f41544a = applicationContext;
        this.f41549f = new b(applicationContext);
        this.f41546c = new s();
        l lVarB = l.b(systemAlarmService);
        this.f41548e = lVarB;
        e5.b bVar = lVarB.f39114f;
        this.f41547d = bVar;
        this.f41545b = lVarB.f39112d;
        bVar.a(this);
        this.f41551h = new ArrayList();
        this.f41552i = null;
        this.f41550g = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i10) {
        o oVarG = o.g();
        String str = f41543k;
        oVarG.e(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.g().k(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f41551h) {
                try {
                    Iterator it = this.f41551h.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f41551h) {
            try {
                boolean zIsEmpty = this.f41551h.isEmpty();
                this.f41551h.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b() {
        if (this.f41550g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void c() {
        o.g().e(f41543k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f41547d.d(this);
        ScheduledExecutorService scheduledExecutorService = this.f41546c.f46558a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f41553j = null;
    }

    public final void d(Runnable runnable) {
        this.f41550g.post(runnable);
    }

    @Override // e5.a
    public final void e(String str, boolean z10) {
        String str2 = b.f41519d;
        Intent intent = new Intent(this.f41544a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        d(new g(0, 0, this, intent));
    }

    public final void f() {
        b();
        PowerManager.WakeLock wakeLockA = n5.l.a(this.f41544a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f41548e.f39112d.k(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
