package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cz0 f13317d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f13318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13320c;

    static {
        cz0 cz0Var = new cz0();
        cz0Var.f13319b = false;
        cz0Var.f13320c = false;
        f13317d = cz0Var;
    }

    public final void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f13320c || this.f13319b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(vy0.f21317c.f21318a).iterator();
        while (it.hasNext()) {
            dz0 dz0Var = ((ky0) it.next()).f16560d;
            boolean z12 = z11 || z10;
            if (dz0Var.f13771b.get() != 0) {
                s6.f19863g.w(dz0Var.c(), "setDeviceLockState", true != z12 ? "unlocked" : "locked");
            }
        }
    }
}
