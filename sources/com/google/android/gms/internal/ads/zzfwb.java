package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfwb {
    final zzfwe zza;
    final boolean zzb;

    private zzfwb(zzfwe zzfweVar) {
        this.zza = zzfweVar;
        this.zzb = zzfweVar != null;
    }

    public static zzfwb zzb(Context context, String str, String str2) {
        zzfwe zzfwcVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzfwcVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfwcVar = iInterfaceQueryLocalInterface instanceof zzfwe ? (zzfwe) iInterfaceQueryLocalInterface : new zzfwc(iBinderInstantiate);
                    }
                    zzfwcVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfwb(zzfwcVar);
                } catch (Exception e2) {
                    throw new zzfve(e2);
                }
            } catch (RemoteException | zzfve | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfwb(new zzfwf());
            }
        } catch (Exception e3) {
            throw new zzfve(e3);
        }
    }

    public static zzfwb zzc() {
        zzfwf zzfwfVar = new zzfwf();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfwb(zzfwfVar);
    }

    public final zzfwa zza(byte[] bArr) {
        return new zzfwa(this, bArr, null);
    }
}
