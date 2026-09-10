package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<sg.bigo.ads.common.n.a> f47330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HandlerThread f47331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f47332c;
    private static HandlerThread d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f47333e;
    private static HandlerThread f;
    private static b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static b f47334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static b f47335i;
    private static final WeakHashMap<Object, a> j = new WeakHashMap<>();
    private static boolean k = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f47347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Integer f47348b;

        public a(Runnable runnable, Integer num) {
            this.f47347a = runnable;
            this.f47348b = num;
        }
    }

    static {
        t.a();
    }

    public static void a(int i2, Runnable runnable) {
        b(i2, runnable, 0L);
    }

    private static synchronized void b(int i2, final Runnable runnable, long j2) {
        final b bVar;
        if (runnable == null) {
            return;
        }
        try {
            if (f47334h == null) {
                j();
            }
            if (i2 == 0) {
                if (f47331b == null) {
                    g();
                }
                bVar = f47332c;
            } else if (i2 == 1) {
                if (d == null) {
                    h();
                }
                bVar = f47333e;
            } else if (i2 != 3) {
                bVar = f47334h;
            } else {
                if (f == null) {
                    i();
                }
                bVar = g;
            }
            if (bVar == null) {
                return;
            }
            final Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = f47334h.getLooper();
            }
            final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.common.n.d.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Runnable f47337b = null;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f47338c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable3 = d.f47335i != null ? new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.f47334h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    sg.bigo.ads.common.t.a.a(0, "ThreadManager", "这里使用了ThreadManager.post函数运行了一个超过30s的任务");
                                }
                            });
                        }
                    } : null;
                    if (d.f47335i != null) {
                        d.f47335i.postDelayed(runnable3, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                    }
                    synchronized (d.j) {
                        d.j.remove(runnable);
                    }
                    if (d.k) {
                        runnable.run();
                    } else {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            sg.bigo.ads.common.t.a.a(2, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th));
                            List<sg.bigo.ads.common.n.a> list = d.f47330a;
                            if (list != null) {
                                Iterator<sg.bigo.ads.common.n.a> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next().a(th);
                                }
                            }
                        }
                    }
                    if (d.f47335i != null) {
                        d.f47335i.removeCallbacks(runnable3);
                    }
                    if (this.f47337b != null) {
                        if (this.f47338c || looperMyLooper == d.f47334h.getLooper()) {
                            d.f47334h.post(this.f47337b);
                        } else {
                            new Handler(looperMyLooper).post(this.f47337b);
                        }
                    }
                }
            };
            Runnable runnable3 = new Runnable() { // from class: sg.bigo.ads.common.n.d.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Runnable f47341a = null;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f47342b = false;

                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f47341a == null) {
                        runnable2.run();
                    } else if (this.f47342b || looperMyLooper == d.f47334h.getLooper()) {
                        d.f47334h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2.this.f47341a.run();
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                bVar.post(runnable2);
                            }
                        });
                    } else {
                        new Handler(looperMyLooper).post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2.this.f47341a.run();
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                bVar.post(runnable2);
                            }
                        });
                    }
                }
            };
            WeakHashMap<Object, a> weakHashMap = j;
            synchronized (weakHashMap) {
                weakHashMap.put(runnable, new a(runnable3, Integer.valueOf(i2)));
            }
            bVar.postDelayed(runnable3, j2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static synchronized void g() {
        if (f47331b == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
            f47331b = handlerThread;
            handlerThread.start();
            f47332c = new b("BGAd-Background", f47331b.getLooper());
        }
    }

    private static synchronized void h() {
        if (d == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
            d = handlerThread;
            handlerThread.start();
            f47333e = new b("BGAd-Work", d.getLooper());
        }
    }

    private static synchronized void i() {
        if (f == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
            f = handlerThread;
            handlerThread.start();
            g = new b("BGAd-Normal", f.getLooper());
        }
    }

    private static synchronized void j() {
        if (f47334h == null) {
            f47334h = new b("BGAd-Background.Main + 38", Looper.getMainLooper());
        }
    }

    public static void a(int i2, Runnable runnable, long j2) {
        b(i2, runnable, j2);
    }

    public static void b(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            b(2, runnable, 0L);
        }
    }

    public static synchronized void a(Runnable runnable) {
        b bVar;
        if (runnable == null) {
            return;
        }
        try {
            WeakHashMap<Object, a> weakHashMap = j;
            a aVar = weakHashMap.get(runnable);
            if (aVar == null) {
                return;
            }
            Runnable runnable2 = aVar.f47347a;
            if (runnable2 != null) {
                int iIntValue = aVar.f47348b.intValue();
                if (iIntValue == 0) {
                    bVar = f47332c;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    throw th;
                }
                if (iIntValue == 1) {
                    bVar = f47333e;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    throw th;
                }
                if (iIntValue == 2) {
                    bVar = f47334h;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    throw th;
                }
                if (iIntValue == 3) {
                    bVar = g;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                } else if (iIntValue == 1024) {
                    runnable2.run();
                }
                synchronized (weakHashMap) {
                    weakHashMap.remove(runnable);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static synchronized void a(sg.bigo.ads.common.n.a aVar) {
        try {
            if (f47330a == null) {
                f47330a = new ArrayList();
            }
            f47330a.add(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean a() {
        return d == Thread.currentThread();
    }
}
