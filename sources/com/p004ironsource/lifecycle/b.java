package com.p004ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.uk;
import com.p004ironsource.vk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static final b m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AtomicBoolean f25608n = new AtomicBoolean(false);
    static final long o = 700;
    private final Runnable g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f25613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f25614i;
    private final Runnable j;
    private final Runnable k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25610b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25611c = true;
    private boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private vk f25612e = vk.NONE;
    private final List<uk> f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.p004ironsource.lifecycle.a.InterfaceC0284a f25615l = new a();

    public class a implements com.p004ironsource.lifecycle.a.InterfaceC0284a {
        public a() {
        }

        @Override // com.p004ironsource.lifecycle.a.InterfaceC0284a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.p004ironsource.lifecycle.a.InterfaceC0284a
        public void b(Activity activity) {
        }

        @Override // com.p004ironsource.lifecycle.a.InterfaceC0284a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }
    }

    public b() {
        final int i2 = 0;
        this.g = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ b f25617Y;

            {
                this.f25617Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f25617Y.f();
                        break;
                    case 1:
                        this.f25617Y.g();
                        break;
                    case 2:
                        this.f25617Y.h();
                        break;
                    case 3:
                        this.f25617Y.i();
                        break;
                    default:
                        this.f25617Y.j();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f25613h = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ b f25617Y;

            {
                this.f25617Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f25617Y.f();
                        break;
                    case 1:
                        this.f25617Y.g();
                        break;
                    case 2:
                        this.f25617Y.h();
                        break;
                    case 3:
                        this.f25617Y.i();
                        break;
                    default:
                        this.f25617Y.j();
                        break;
                }
            }
        };
        final int i4 = 2;
        this.f25614i = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ b f25617Y;

            {
                this.f25617Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f25617Y.f();
                        break;
                    case 1:
                        this.f25617Y.g();
                        break;
                    case 2:
                        this.f25617Y.h();
                        break;
                    case 3:
                        this.f25617Y.i();
                        break;
                    default:
                        this.f25617Y.j();
                        break;
                }
            }
        };
        final int i5 = 3;
        this.j = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ b f25617Y;

            {
                this.f25617Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f25617Y.f();
                        break;
                    case 1:
                        this.f25617Y.g();
                        break;
                    case 2:
                        this.f25617Y.h();
                        break;
                    case 3:
                        this.f25617Y.i();
                        break;
                    default:
                        this.f25617Y.j();
                        break;
                }
            }
        };
        final int i6 = 4;
        this.k = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ b f25617Y;

            {
                this.f25617Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f25617Y.f();
                        break;
                    case 1:
                        this.f25617Y.g();
                        break;
                    case 2:
                        this.f25617Y.h();
                        break;
                    case 3:
                        this.f25617Y.i();
                        break;
                    default:
                        this.f25617Y.j();
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<uk> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<uk> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<uk> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<uk> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.p004ironsource.lifecycle.a.b(activity);
        com.p004ironsource.lifecycle.a aVarA = com.p004ironsource.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.f25615l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    private void a() {
        if (this.f25610b == 0) {
            this.f25611c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f25613h);
            this.f25612e = vk.PAUSED;
        }
    }

    private void b() {
        if (this.f25609a == 0 && this.f25611c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f25614i);
            this.d = true;
            this.f25612e = vk.STOPPED;
        }
    }

    public static b d() {
        return m;
    }

    public vk c() {
        return this.f25612e;
    }

    public boolean e() {
        return this.f25612e == vk.STOPPED;
    }

    public void a(Activity activity) {
        int i2 = this.f25610b - 1;
        this.f25610b = i2;
        if (i2 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.g, o);
        }
    }

    public void b(Activity activity) {
        int i2 = this.f25610b + 1;
        this.f25610b = i2;
        if (i2 == 1) {
            if (!this.f25611c) {
                IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.g);
                return;
            }
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.j);
            this.f25611c = false;
            this.f25612e = vk.RESUMED;
        }
    }

    public void c(Activity activity) {
        int i2 = this.f25609a + 1;
        this.f25609a = i2;
        if (i2 == 1 && this.d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.k);
            this.d = false;
            this.f25612e = vk.STARTED;
        }
    }

    public void d(Activity activity) {
        this.f25609a--;
        b();
    }

    public void a(Context context) {
        Application application;
        if (!f25608n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void b(uk ukVar) {
        if (this.f.contains(ukVar)) {
            this.f.remove(ukVar);
        }
    }

    public void a(uk ukVar) {
        if (!IronsourceLifecycleProvider.a() || ukVar == null || this.f.contains(ukVar)) {
            return;
        }
        this.f.add(ukVar);
    }
}
