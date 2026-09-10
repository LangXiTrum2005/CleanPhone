package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e01 extends zzc {
    public final int F;

    public e01(Context context, Looper looper, k9.b bVar, k9.c cVar, int i10) {
        super(context, looper, 116, bVar, cVar);
        this.F = i10;
    }

    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof h01 ? (h01) iInterfaceQueryLocalInterface : new h01(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.gass.START";
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return this.F;
    }
}
