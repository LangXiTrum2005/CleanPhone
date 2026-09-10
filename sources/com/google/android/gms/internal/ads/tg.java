package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tg extends yg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vf f20373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20375j;

    public tg(fg fgVar, xd xdVar, int i10, vf vfVar, long j10, long j11) {
        super(fgVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", xdVar, i10, 11);
        this.f20373h = vfVar;
        this.f20374i = j10;
        this.f20375j = j11;
    }

    @Override // com.google.android.gms.internal.ads.yg
    public final void a() {
        vf vfVar = this.f20373h;
        if (vfVar != null) {
            String str = (String) this.f22235e.invoke(null, (NetworkCapabilities) vfVar.f21157b, Long.valueOf(this.f20374i), Long.valueOf(this.f20375j));
            tf tfVar = new tf();
            HashMap mapS = pi1.s(str);
            if (mapS != null) {
                tfVar.T = (Long) mapS.get(0);
                tfVar.U = (Long) mapS.get(1);
                tfVar.V = (Long) mapS.get(2);
            }
            xd xdVar = this.f22234d;
            synchronized (xdVar) {
                try {
                    long jLongValue = tfVar.T.longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).H0(jLongValue);
                    if (((Long) tfVar.U).longValue() >= 0) {
                        long jLongValue2 = ((Long) tfVar.U).longValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).g0(jLongValue2);
                    }
                    if (((Long) tfVar.V).longValue() >= 0) {
                        long jLongValue3 = ((Long) tfVar.V).longValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).h0(jLongValue3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
