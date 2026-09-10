package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s01 f18849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18850b = true;

    public q01(s01 s01Var) {
        this.f18849a = s01Var;
    }

    public static q01 a(Context context, String str) {
        s01 r01Var;
        try {
            try {
                try {
                    IBinder iBinderB = t9.d.c(context, t9.d.f50563b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        r01Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        r01Var = iInterfaceQueryLocalInterface instanceof s01 ? (s01) iInterfaceQueryLocalInterface : new r01(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    r01Var.S0(new s9.b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new q01(r01Var);
                } catch (Exception e10) {
                    throw new c01(e10);
                }
            } catch (Exception e11) {
                throw new c01(e11);
            }
        } catch (RemoteException | c01 | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new q01(new t01());
        }
    }
}
