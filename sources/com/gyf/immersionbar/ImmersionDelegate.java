package com.gyf.immersionbar;

import android.app.Activity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class ImmersionDelegate implements Runnable {
    public ImmersionBar X;

    public ImmersionDelegate(Activity activity) {
        if (activity == null || this.X != null) {
            return;
        }
        this.X = new ImmersionBar(activity);
    }

    public final void b() {
        ImmersionBar immersionBar = this.X;
        if (immersionBar == null || !immersionBar.o0) {
            return;
        }
        immersionBar.i0.getClass();
    }

    public final void c() {
        ImmersionBar immersionBar = this.X;
        if (immersionBar != null) {
            immersionBar.i();
            if (OSUtils.isEMUI3_x() && immersionBar.o0 && !immersionBar.g0 && immersionBar.i0.g0) {
                immersionBar.e();
            } else {
                immersionBar.d();
            }
            b();
        }
    }

    public final void d() {
        ImmersionBar immersionBar;
        ImmersionBar immersionBar2 = this.X;
        if (immersionBar2 != null) {
            if (immersionBar2.X != null) {
                FitsKeyboard fitsKeyboard = immersionBar2.m0;
                if (fitsKeyboard != null) {
                    if (fitsKeyboard.X) {
                        throw null;
                    }
                    immersionBar2.m0 = null;
                }
                int i2 = EMUI3NavigationBarObserver.d;
                ArrayList arrayList = EMUI3NavigationBarObserver.NavigationBarObserverInstance.f21430a.f21427a;
                if (arrayList != null) {
                    arrayList.remove(immersionBar2);
                }
                int i3 = NavigationBarObserver.f21437a;
                NavigationBarObserver navigationBarObserver = NavigationBarObserver.NavigationBarObserverInstance.f21438a;
                immersionBar2.i0.getClass();
                navigationBarObserver.getClass();
            }
            if (immersionBar2.h0 && (immersionBar = immersionBar2.f0) != null) {
                immersionBar.i0.getClass();
            }
            immersionBar2.o0 = false;
            this.X = null;
        }
    }

    public final void e() {
        ImmersionBar immersionBar = this.X;
        if (immersionBar != null) {
            immersionBar.i();
            if (immersionBar.g0 || !immersionBar.o0 || immersionBar.i0 == null) {
                return;
            }
            if (OSUtils.isEMUI3_x() && immersionBar.i0.h0) {
                immersionBar.e();
            } else {
                immersionBar.i0.getClass();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        ImmersionBar immersionBar = this.X;
        if (immersionBar == null || (activity = immersionBar.X) == null) {
            return;
        }
        new BarConfig(activity);
        throw null;
    }
}
