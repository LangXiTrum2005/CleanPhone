package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uy0 extends xy0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uy0 f20962d = new uy0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.xy0
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(vy0.f21317c.f21319b).iterator();
        while (it.hasNext()) {
            View view = (View) ((ky0) it.next()).f16559c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xy0
    public final void b(boolean z10) {
        Iterator it = Collections.unmodifiableCollection(vy0.f21317c.f21318a).iterator();
        while (it.hasNext()) {
            dz0 dz0Var = ((ky0) it.next()).f16560d;
            if (dz0Var.f13771b.get() != 0) {
                s6.f19863g.w(dz0Var.c(), "setState", true != z10 ? "backgrounded" : "foregrounded", dz0Var.f13770a);
            }
        }
    }
}
