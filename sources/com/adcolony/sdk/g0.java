package com.adcolony.sdk;

import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class g0 {
    static boolean f = false;
    static int g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static int f9148h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f1 f9149a = c0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e1 f9150b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExecutorService f9151c = null;
    private final Queue<Runnable> d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    s0 f9152e;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 0, c0.h(h0Var.a(), PglCryptUtils.KEY_MESSAGE), true);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9156c;
        final /* synthetic */ boolean d;

        public b(int i2, String str, int i3, boolean z2) {
            this.f9154a = i2;
            this.f9155b = str;
            this.f9156c = i3;
            this.d = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.a(this.f9154a, this.f9155b, this.f9156c);
            int i2 = 0;
            while (i2 <= this.f9155b.length() / 4000) {
                int i3 = i2 * 4000;
                i2++;
                int iMin = Math.min(i2 * 4000, this.f9155b.length());
                if (this.f9156c == 3) {
                    g0 g0Var = g0.this;
                    if (g0Var.a(c0.f(g0Var.f9149a, Integer.toString(this.f9154a)), 3, this.d)) {
                        Log.d("AdColony [TRACE]", this.f9155b.substring(i3, iMin));
                    }
                }
                if (this.f9156c == 2) {
                    g0 g0Var2 = g0.this;
                    if (g0Var2.a(c0.f(g0Var2.f9149a, Integer.toString(this.f9154a)), 2, this.d)) {
                        Log.i("AdColony [INFO]", this.f9155b.substring(i3, iMin));
                    }
                }
                if (this.f9156c == 1) {
                    g0 g0Var3 = g0.this;
                    if (g0Var3.a(c0.f(g0Var3.f9149a, Integer.toString(this.f9154a)), 1, this.d)) {
                        Log.w("AdColony [WARNING]", this.f9155b.substring(i3, iMin));
                    }
                }
                if (this.f9156c == 0) {
                    g0 g0Var4 = g0.this;
                    if (g0Var4.a(c0.f(g0Var4.f9149a, Integer.toString(this.f9154a)), 0, this.d)) {
                        Log.e("AdColony [ERROR]", this.f9155b.substring(i3, iMin));
                    }
                }
                if (this.f9156c == -1 && g0.g >= -1) {
                    Log.e("AdColony [FATAL]", this.f9155b.substring(i3, iMin));
                }
            }
        }
    }

    public class c implements j0 {
        public c(g0 g0Var) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.g = c0.d(h0Var.a(), AppLovinEventTypes.USER_COMPLETED_LEVEL);
        }
    }

    public class d implements j0 {
        public d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 3, c0.h(h0Var.a(), PglCryptUtils.KEY_MESSAGE), false);
        }
    }

    public class e implements j0 {
        public e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 3, c0.h(h0Var.a(), PglCryptUtils.KEY_MESSAGE), true);
        }
    }

    public class f implements j0 {
        public f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 2, c0.h(h0Var.a(), PglCryptUtils.KEY_MESSAGE), false);
        }
    }

    public class g implements j0 {
        public g() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 2, c0.h(h0Var.a(), PglCryptUtils.KEY_MESSAGE), true);
        }
    }

    public class h implements j0 {
        public h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 1, c0.h(h0Var.a(), PglCryptUtils.KEY_MESSAGE), false);
        }
    }

    public class i implements j0 {
        public i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 1, c0.h(h0Var.a(), PglCryptUtils.KEY_MESSAGE), true);
        }
    }

    public class j implements j0 {
        public j() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 0, c0.h(h0Var.a(), PglCryptUtils.KEY_MESSAGE), false);
        }
    }

    public void b(int i2, int i3, String str, boolean z2) {
        if (a(a(i2, i3, str, z2))) {
            return;
        }
        synchronized (this.d) {
            this.d.add(a(i2, i3, str, z2));
        }
    }

    public void c() {
        com.adcolony.sdk.a.a("Log.set_log_level", new c(this));
        com.adcolony.sdk.a.a("Log.public.trace", new d());
        com.adcolony.sdk.a.a("Log.private.trace", new e());
        com.adcolony.sdk.a.a("Log.public.info", new f());
        com.adcolony.sdk.a.a("Log.private.info", new g());
        com.adcolony.sdk.a.a("Log.public.warning", new h());
        com.adcolony.sdk.a.a("Log.private.warning", new i());
        com.adcolony.sdk.a.a("Log.public.error", new j());
        com.adcolony.sdk.a.a("Log.private.error", new a());
    }

    public void d() {
        ExecutorService executorService = this.f9151c;
        if (executorService == null || executorService.isShutdown() || this.f9151c.isTerminated()) {
            this.f9151c = Executors.newSingleThreadExecutor();
        }
        synchronized (this.d) {
            while (!this.d.isEmpty()) {
                try {
                    a(this.d.poll());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(int i2, String str, boolean z2) {
        b(0, i2, str, z2);
    }

    private Runnable a(int i2, int i3, String str, boolean z2) {
        return new b(i2, str, i3, z2);
    }

    public boolean a(f1 f1Var, int i2, boolean z2) {
        int iD = c0.d(f1Var, "print_level");
        boolean zB = c0.b(f1Var, "log_private");
        if (f1Var.b()) {
            iD = g;
            zB = f;
        }
        return (!z2 || zB) && iD != 4 && iD >= i2;
    }

    public void b(e1 e1Var) {
        this.f9149a = a(e1Var);
    }

    public e1 b() {
        return this.f9150b;
    }

    public boolean a(f1 f1Var, int i2) {
        int iD = c0.d(f1Var, "send_level");
        if (f1Var.b()) {
            iD = f9148h;
        }
        return iD >= i2 && iD != 4;
    }

    public void c(e1 e1Var) {
        if (e1Var != null) {
            e1Var.b(AppLovinEventTypes.USER_COMPLETED_LEVEL);
            e1Var.b(PglCryptUtils.KEY_MESSAGE);
        }
        this.f9150b = e1Var;
    }

    public void a(HashMap<String, Object> map) {
        try {
            s0 s0Var = new s0(new d0(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), map);
            this.f9152e = s0Var;
            s0Var.a(5L, TimeUnit.SECONDS);
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, int i3) {
        if (this.f9152e == null) {
            return;
        }
        if (i3 == 3 && a(c0.f(this.f9149a, Integer.toString(i2)), 3)) {
            this.f9152e.a(str);
            return;
        }
        if (i3 == 2 && a(c0.f(this.f9149a, Integer.toString(i2)), 2)) {
            this.f9152e.c(str);
            return;
        }
        if (i3 == 1 && a(c0.f(this.f9149a, Integer.toString(i2)), 1)) {
            this.f9152e.d(str);
        } else if (i3 == 0 && a(c0.f(this.f9149a, Integer.toString(i2)), 0)) {
            this.f9152e.b(str);
        }
    }

    public f1 a(e1 e1Var) {
        f1 f1VarB = c0.b();
        for (int i2 = 0; i2 < e1Var.b(); i2++) {
            f1 f1VarA = c0.a(e1Var, i2);
            c0.a(f1VarB, Integer.toString(c0.d(f1VarA, "id")), f1VarA);
        }
        return f1VarB;
    }

    private boolean a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f9151c;
            if (executorService == null || executorService.isShutdown() || this.f9151c.isTerminated()) {
                return false;
            }
            this.f9151c.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    public s0 a() {
        return this.f9152e;
    }
}
