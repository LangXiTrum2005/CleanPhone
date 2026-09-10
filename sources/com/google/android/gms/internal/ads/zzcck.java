package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcck extends zzbcb implements zzccm {
    public zzcck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final zzccj zze(IObjectWrapper iObjectWrapper, zzbsz zzbszVar, int i2) throws RemoteException {
        zzccj zzcchVar;
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbszVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcchVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcchVar = iInterfaceQueryLocalInterface instanceof zzccj ? (zzccj) iInterfaceQueryLocalInterface : new zzcch(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcchVar;
    }
}
