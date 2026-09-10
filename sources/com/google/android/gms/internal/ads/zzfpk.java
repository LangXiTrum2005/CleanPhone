package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpk {

    @VisibleForTesting
    final zzfpn zza;

    @VisibleForTesting
    final boolean zzb;

    private zzfpk(zzfpn zzfpnVar) {
        this.zza = zzfpnVar;
        this.zzb = zzfpnVar != null;
    }

    public static zzfpk zzb(Context context, String str, String str2) {
        zzfpn zzfplVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzfplVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfplVar = iInterfaceQueryLocalInterface instanceof zzfpn ? (zzfpn) iInterfaceQueryLocalInterface : new zzfpl(iBinderInstantiate);
                    }
                    zzfplVar.zze(ObjectWrapper.wrap(context), str, null);
                    return new zzfpk(zzfplVar);
                } catch (Exception e) {
                    throw new zzfom(e);
                }
            } catch (Exception e2) {
                throw new zzfom(e2);
            }
        } catch (RemoteException | zzfom | NullPointerException | SecurityException unused) {
            return new zzfpk(new zzfpo());
        }
    }

    public static zzfpk zzc() {
        return new zzfpk(new zzfpo());
    }

    public final zzfpi zza(byte[] bArr) {
        return new zzfpi(this, bArr, null);
    }
}
