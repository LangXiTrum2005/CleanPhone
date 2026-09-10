package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mj {
    public static final kj a(Context context, ij ijVar) {
        t6.l lVar = new t6.l(context, 4);
        kj kjVar = new kj(lVar);
        vu0 vu0Var = new vu0(lVar, ijVar, kjVar, false, 5);
        md0 md0Var = new md0((Object) lVar, false, (Object) kjVar, 7);
        synchronized (lVar.f50551d) {
            hj hjVar = new hj(context, zzt.zzs().zza(), vu0Var, md0Var, 0);
            lVar.f50550c = hjVar;
            hjVar.checkAvailabilityAndConnect();
        }
        return kjVar;
    }
}
