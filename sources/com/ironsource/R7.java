package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class R7 implements InterfaceC0379hg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27127c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f27128d = "deviceStatus";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f27129e = "iabTokenAPI";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f27130f = "dsSharedSignalsAPI";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f27131g = "deleteFolder";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f27132h = "deleteFile";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f27133i = "getCachedFilesMap";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f27134j = "permissionsAPI";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f27135k = "deviceDataAPI";
    public static final String l = "adViewAPI";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final S9 f27138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final S9 f27139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final S9 f27140q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R7 f27125a = new R7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f27126b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final wj.d f27136m = r9.b.u(a.f27141a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final wj.d f27137n = r9.b.u(b.f27142a);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27141a = new a();

        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0448le invoke() {
            return new C0448le(0, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27142a = new b();

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class a extends kotlin.jvm.internal.k implements jk.a {
            public a(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeviceStatus", "shouldRunOnBackgroundThreadDeviceStatus()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).o());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.R7$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class C0048b extends kotlin.jvm.internal.k implements jk.a {
            public C0048b(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadIabToken", "shouldRunOnBackgroundThreadIabToken()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).r());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class c extends kotlin.jvm.internal.k implements jk.a {
            public c(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadSharedSignals", "shouldRunOnBackgroundThreadSharedSignals()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).q());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class d extends kotlin.jvm.internal.k implements jk.a {
            public d(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeleteFolder", "shouldRunOnBackgroundThreadDeleteFolder()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).k());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class e extends kotlin.jvm.internal.k implements jk.a {
            public e(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeleteFile", "shouldRunOnBackgroundThreadDeleteFile()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).p());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class f extends kotlin.jvm.internal.k implements jk.a {
            public f(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadCachedFiles", "shouldRunOnBackgroundThreadCachedFiles()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).b());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class g extends kotlin.jvm.internal.k implements jk.a {
            public g(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadPermissions", "shouldRunOnBackgroundThreadPermissions()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).H());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class h extends kotlin.jvm.internal.k implements jk.a {
            public h(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeviceData", "shouldRunOnBackgroundThreadDeviceData()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).G());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class i extends kotlin.jvm.internal.k implements jk.a {
            public i(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadAdView", "shouldRunOnBackgroundThreadAdView()Z", 0);
            }

            @Override // jk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).J());
            }
        }

        public b() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, qk.g> invoke() {
            A7 a7H = Kb.f26413u.d().h();
            return xj.b0.Q(new wj.f(R7.f27128d, new a(a7H)), new wj.f(R7.f27129e, new C0048b(a7H)), new wj.f(R7.f27130f, new c(a7H)), new wj.f("deleteFolder", new d(a7H)), new wj.f("deleteFile", new e(a7H)), new wj.f(R7.f27133i, new f(a7H)), new wj.f(R7.f27134j, new g(a7H)), new wj.f(R7.f27135k, new h(a7H)), new wj.f(R7.l, new i(a7H)));
        }
    }

    static {
        S9 s10 = new S9("isadplayer-background");
        s10.start();
        s10.a();
        f27138o = s10;
        S9 s11 = new S9("isadplayer-publisher-callbacks");
        s11.start();
        s11.a();
        f27139p = s11;
        S9 s12 = new S9("isadplayer-release");
        s12.start();
        s12.a();
        f27140q = s12;
    }

    private R7() {
    }

    private final boolean f(Runnable runnable) {
        return f27127c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z10) {
        f27127c = z10;
    }

    public final void b(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        a(this, action, 0L, 2, (Object) null);
    }

    public final void c(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void d(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final boolean e() {
        return f27127c;
    }

    private final C0448le b() {
        return (C0448le) f27136m.getValue();
    }

    private final Map<String, jk.a> c() {
        return (Map) f27137n.getValue();
    }

    @Override // com.ironsource.InterfaceC0379hg
    public void a(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void d(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        f27126b.postDelayed(action, j10);
    }

    public final void e(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            f27140q.b(action);
        }
    }

    public static /* synthetic */ void a(R7 r10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        r10.b(runnable, j10);
    }

    public static /* synthetic */ void c(R7 r10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        r10.d(runnable, j10);
    }

    public final void b(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        f27138o.a(action, j10);
    }

    public final ThreadPoolExecutor d() {
        return b();
    }

    public static /* synthetic */ void b(R7 r10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        r10.c(runnable, j10);
    }

    @Override // com.ironsource.InterfaceC0379hg
    public void a(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        if (f27127c) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f27140q.a(action, j10);
        }
    }

    public final void c(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        f27139p.a(action, j10);
    }

    public final Looper a() {
        return f27138o.getLooper();
    }

    public final void a(Runnable action, String name) {
        kotlin.jvm.internal.n.f(action, "action");
        kotlin.jvm.internal.n.f(name, "name");
        jk.a aVar = c().get(name);
        if (aVar != null ? ((Boolean) aVar.invoke()).booleanValue() : false) {
            a(this, action, 0L, 2, (Object) null);
        } else {
            action.run();
        }
    }
}
