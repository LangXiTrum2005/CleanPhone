package sg.bigo.ads.common.f;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f47140a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f47141b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f47142c = -1;
    private static Application d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f47143e;
    private final Map<a, Object> f;

    public interface a {
        void a(Activity activity);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.b$b, reason: collision with other inner class name */
    public static class C0838b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f47162a = new b(0);
    }

    private b() {
        this.f = new WeakHashMap();
    }

    public static Application a() {
        return d;
    }

    public static Activity b() {
        WeakReference<Activity> weakReference = C0838b.f47162a.f47143e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static int c() {
        int i2;
        if (!f47140a || (i2 = f47142c) < 0) {
            return 0;
        }
        return i2 > 0 ? 1 : 2;
    }

    public static boolean d() {
        return f47142c > 0;
    }

    public static boolean e() {
        return f47141b > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        f47141b++;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        f47141b--;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                aVar.a(activity);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        this.f47143e = null;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        this.f47143e = new WeakReference<>(activity);
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (f47142c == 0) {
            sg.bigo.ads.common.f.a aVarA = sg.bigo.ads.common.f.a.a();
            aVarA.b();
            if (aVarA.d != null && aVarA.c()) {
                aVarA.d.a(aVarA.f47138b, aVarA.f47139c);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter foreground.");
        }
        f47142c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i2 = f47142c - 1;
        f47142c = i2;
        if (i2 == 0) {
            sg.bigo.ads.common.f.a aVarA = sg.bigo.ads.common.f.a.a();
            if (aVarA.d != null && aVarA.c()) {
                sg.bigo.ads.common.f.a.InterfaceC0837a interfaceC0837a = aVarA.d;
                boolean z2 = aVarA.f47137a;
                long j = aVarA.f47138b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = aVarA.f47139c;
                System.currentTimeMillis();
                interfaceC0837a.a(z2, j, jElapsedRealtime, j2);
            }
            aVarA.f47137a = false;
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter background.");
        }
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static void b(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.2
            @Override // java.lang.Runnable
            public final void run() {
                C0838b.f47162a.f.remove(aVar);
            }
        });
    }

    public static synchronized void a(Application application) {
        if (f47140a) {
            return;
        }
        f47140a = true;
        f47141b = 0;
        f47142c = 0;
        d = application;
        application.registerActivityLifecycleCallbacks(C0838b.f47162a);
    }

    public static void a(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.1
            @Override // java.lang.Runnable
            public final void run() {
                C0838b.f47162a.f.put(aVar, C0838b.f47162a);
            }
        });
    }
}
