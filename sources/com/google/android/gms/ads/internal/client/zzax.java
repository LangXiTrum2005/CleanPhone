package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.pn;
import t9.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzco f10774a;

    static {
        zzco zzcmVar = null;
        try {
            Object objNewInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to instantiate ClientApi class.");
        }
        f10774a = zzcmVar;
    }

    public abstract Object zza();

    public abstract Object zzb();

    public abstract Object zzc(zzco zzcoVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object zzd(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        Object objZzb;
        if (z10) {
            z11 = z10;
        } else {
            zzay.zza();
            if (com.google.android.gms.ads.internal.util.client.zzf.zzz(context, 12451000)) {
                z11 = z10;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Google Play Services is not available.");
                z11 = true;
            }
        }
        boolean z13 = false;
        boolean z14 = !(d.a(context, ModuleDescriptor.MODULE_ID) <= d.d(context, ModuleDescriptor.MODULE_ID, false));
        am.a(context);
        if (((Boolean) bn.f12821a.o()).booleanValue()) {
            z12 = false;
        } else {
            boolean z15 = z11 | z14;
            if (((Boolean) bn.f12822b.o()).booleanValue()) {
                z12 = true;
                z13 = true;
            } else {
                z12 = false;
                z13 = z15;
            }
        }
        zzco zzcoVar = f10774a;
        Object objZzc = null;
        if (z13) {
            if (zzcoVar != null) {
                try {
                    objZzb = zzc(zzcoVar);
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke local loader using ClientApi class.", e10);
                    objZzb = null;
                }
                if (objZzb == null && !z12) {
                    try {
                        objZzc = zzb();
                    } catch (RemoteException e11) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke remote loader.", e11);
                    }
                    objZzb = objZzc;
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class cannot be loaded.");
            }
            objZzb = null;
            if (objZzb == null) {
                objZzc = zzb();
                objZzb = objZzc;
            }
        } else {
            try {
                objZzb = zzb();
            } catch (RemoteException e12) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke remote loader.", e12);
                objZzb = null;
            }
            if (objZzb == null) {
                if (zzay.zzh().nextInt(((Long) pn.f18737a.o()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzay.zza().zzi(context, zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            if (objZzb == null) {
                if (zzcoVar != null) {
                    try {
                        objZzc = zzc(zzcoVar);
                    } catch (RemoteException e13) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke local loader using ClientApi class.", e13);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class cannot be loaded.");
                }
                objZzb = objZzc;
            }
        }
        return objZzb == null ? zza() : objZzb;
    }
}
