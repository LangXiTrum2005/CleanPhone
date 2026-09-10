package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wg extends yg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kg f21509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21510i;

    public wg(fg fgVar, xd xdVar, int i10, kg kgVar) {
        super(fgVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", xdVar, i10, 53);
        this.f21509h = kgVar;
        if (kgVar != null) {
            if (kgVar.l <= -2) {
                WeakReference weakReference = kgVar.f16435h;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    kgVar.l = -3L;
                }
            }
            this.f21510i = kgVar.l;
        }
    }

    @Override // com.google.android.gms.internal.ads.yg
    public final void a() {
        if (this.f21509h != null) {
            long jLongValue = ((Long) this.f22235e.invoke(null, Long.valueOf(this.f21510i))).longValue();
            xd xdVar = this.f22234d;
            xdVar.b();
            ((je) xdVar.f19193b).R(jLongValue);
        }
    }
}
