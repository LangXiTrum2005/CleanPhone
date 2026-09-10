package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f23791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff f23792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f23793c;
    public final byte d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3333z5 f23794e;
    public final int f;
    public final ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f23796i;
    public hf j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f23797l;
    public boolean m;

    public lf(ff visibilityChecker, byte b2, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(visibilityChecker, "visibilityChecker");
        WeakHashMap weakHashMap = new WeakHashMap(10);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f23791a = weakHashMap;
        this.f23792b = visibilityChecker;
        this.f23793c = handler;
        this.d = b2;
        this.f23794e = interfaceC3333z5;
        this.f = 50;
        this.g = new ArrayList(50);
        this.f23796i = new AtomicBoolean(true);
        this.k = LazyKt.b(new jf(this));
        this.f23797l = LazyKt.b(new kf(this));
    }

    public final void a(View view, Object obj, int i2) {
        Intrinsics.f(view, "view");
        InterfaceC3333z5 interfaceC3333z5 = this.f23794e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("VisibilityTracker", "add view to tracker - minPercent - " + i2 + "  " + this);
        }
        Cif cif = (Cif) this.f23791a.get(view);
        if (cif == null) {
            cif = new Cif();
            this.f23791a.put(view, cif);
            this.f23795h++;
        }
        cif.f23699a = i2;
        long j = this.f23795h;
        cif.f23700b = j;
        cif.f23701c = view;
        cif.d = obj;
        long j2 = this.f;
        if (j % j2 == 0) {
            long j3 = j - j2;
            for (Map.Entry entry : this.f23791a.entrySet()) {
                View view2 = (View) entry.getKey();
                if (((Cif) entry.getValue()).f23700b < j3) {
                    this.g.add(view2);
                }
            }
            for (View view3 : this.g) {
                Intrinsics.c(view3);
                a(view3);
            }
            this.g.clear();
        }
        if (this.f23791a.size() == 1) {
            f();
        }
    }

    public void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23794e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.j = null;
        this.f23796i.set(true);
    }

    public abstract int c();

    public abstract void d();

    public void e() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23794e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("VisibilityTracker", "pause " + this);
        }
        ((gf) this.k.getX()).run();
        this.f23793c.removeCallbacksAndMessages(null);
        this.m = false;
        this.f23796i.set(true);
    }

    public void f() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23794e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("VisibilityTracker", "resume " + this);
        }
        this.f23796i.set(false);
        g();
    }

    public final void g() {
        if (this.m || this.f23796i.get()) {
            return;
        }
        this.m = true;
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).schedule((Runnable) this.f23797l.getX(), c(), TimeUnit.MILLISECONDS);
    }

    public final void a(View view) {
        Intrinsics.f(view, "view");
        InterfaceC3333z5 interfaceC3333z5 = this.f23794e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((Cif) this.f23791a.remove(view)) != null) {
            this.f23795h--;
            if (this.f23791a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23794e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("VisibilityTracker", "clear " + this);
        }
        this.f23791a.clear();
        this.f23793c.removeMessages(0);
        this.m = false;
    }
}
