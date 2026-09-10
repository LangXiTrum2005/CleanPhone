package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC0426ka;
import com.ironsource.Ff;
import com.ironsource.InterfaceC0408ja;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final b f29193m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AtomicBoolean f29194n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final long f29195o = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29196a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29197b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29198c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29199d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC0426ka f29200e = EnumC0426ka.NONE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<InterfaceC0408ja> f29201f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<Ff.a> f29202g = new AtomicReference<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f29203h = new c(this, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f29204i = new c(this, 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f29205j = new c(this, 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f29206k = new c(this, 4);
    private final com.ironsource.lifecycle.a.InterfaceC0077a l = new a();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC0408ja> it = this.f29201f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC0408ja> it = this.f29201f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC0408ja> it = this.f29201f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC0408ja> it = this.f29201f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a aVarA = com.ironsource.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    public static b d() {
        return f29193m;
    }

    public void a(InterfaceC0408ja interfaceC0408ja) {
        if (!IronsourceLifecycleProvider.a() || interfaceC0408ja == null || this.f29201f.contains(interfaceC0408ja)) {
            return;
        }
        this.f29201f.add(interfaceC0408ja);
    }

    public void b(InterfaceC0408ja interfaceC0408ja) {
        if (this.f29201f.contains(interfaceC0408ja)) {
            this.f29201f.remove(interfaceC0408ja);
        }
    }

    public EnumC0426ka c() {
        return this.f29200e;
    }

    public boolean e() {
        return this.f29200e == EnumC0426ka.STOPPED;
    }

    public void c(Activity activity) {
        int i10 = this.f29196a + 1;
        this.f29196a = i10;
        if (i10 == 1 && this.f29199d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29206k);
            this.f29199d = false;
            this.f29200e = EnumC0426ka.STARTED;
        }
    }

    public void d(Activity activity) {
        this.f29196a--;
        b();
    }

    public void b(Activity activity) {
        int i10 = this.f29197b + 1;
        this.f29197b = i10;
        if (i10 == 1) {
            if (this.f29198c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29205j);
                this.f29198c = false;
                this.f29200e = EnumC0426ka.RESUMED;
            } else {
                Ff.a aVar = this.f29202g.get();
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public void a(Context context) {
        Application application;
        if (!f29194n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(Activity activity) {
        int i10 = this.f29197b - 1;
        this.f29197b = i10;
        if (i10 == 0) {
            this.f29202g.set(IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(this, 0), f29195o));
        }
    }

    private void b() {
        if (this.f29196a == 0 && this.f29198c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29204i);
            this.f29199d = true;
            this.f29200e = EnumC0426ka.STOPPED;
        }
    }

    private void a() {
        if (this.f29197b == 0) {
            this.f29198c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29203h);
            this.f29200e = EnumC0426ka.PAUSED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.ironsource.lifecycle.a.InterfaceC0077a {
        public a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0077a
        public void a(Activity activity) {
            b.this.b(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0077a
        public void b(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0077a
        public void c(Activity activity) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
