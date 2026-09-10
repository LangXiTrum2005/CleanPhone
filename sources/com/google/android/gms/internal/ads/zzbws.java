package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbws extends zzbcb implements zzbwu {
    public zzbws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final zzbwr zze(IObjectWrapper iObjectWrapper, zzbsz zzbszVar, int i2) throws RemoteException {
        zzbwr zzbwpVar;
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbszVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbwpVar = iInterfaceQueryLocalInterface instanceof zzbwr ? (zzbwr) iInterfaceQueryLocalInterface : new zzbwp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwpVar;
    }
}
