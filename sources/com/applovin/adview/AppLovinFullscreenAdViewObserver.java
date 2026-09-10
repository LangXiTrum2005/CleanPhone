package com.applovin.adview;

import androidx.lifecycle.h0;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import com.applovin.impl.p2;
import com.applovin.impl.y1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f7322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p2 f7323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7324c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y1 f7325d;

    public AppLovinFullscreenAdViewObserver(o oVar, p2 p2Var) {
        this.f7322a = oVar;
        this.f7323b = p2Var;
        oVar.a(this);
    }

    @h0(m.ON_DESTROY)
    public void onDestroy() {
        this.f7322a.b(this);
        p2 p2Var = this.f7323b;
        if (p2Var != null) {
            p2Var.a();
            this.f7323b = null;
        }
        y1 y1Var = this.f7325d;
        if (y1Var != null) {
            y1Var.a("lifecycle_on_destroy");
            this.f7325d.r();
            this.f7325d = null;
        }
    }

    @h0(m.ON_PAUSE)
    public void onPause() {
        y1 y1Var = this.f7325d;
        if (y1Var != null) {
            y1Var.s();
            this.f7325d.v();
        }
    }

    @h0(m.ON_RESUME)
    public void onResume() {
        y1 y1Var;
        if (this.f7324c.getAndSet(false) || (y1Var = this.f7325d) == null) {
            return;
        }
        y1Var.t();
        this.f7325d.b(0L);
    }

    @h0(m.ON_STOP)
    public void onStop() {
        y1 y1Var = this.f7325d;
        if (y1Var != null) {
            y1Var.u();
        }
    }

    public void setPresenter(y1 y1Var) {
        this.f7325d = y1Var;
    }
}
