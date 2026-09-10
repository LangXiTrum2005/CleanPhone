package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qy0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f19240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ry0 f19241b;

    public qy0(ry0 ry0Var, float f10) {
        this.f19240a = f10;
        this.f19241b = ry0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bz0 bz0Var = ((sy0) this.f19241b.f19706b).f20085g;
        float f10 = this.f19240a;
        bz0Var.f12941a = f10;
        if (bz0Var.f12943c == null) {
            bz0Var.f12943c = vy0.f21317c;
        }
        Iterator it = Collections.unmodifiableCollection(bz0Var.f12943c.f21319b).iterator();
        while (it.hasNext()) {
            dz0 dz0Var = ((ky0) it.next()).f16560d;
            s6.f19863g.w(dz0Var.c(), "setDeviceVolume", Float.valueOf(f10), dz0Var.f13770a);
        }
    }
}
