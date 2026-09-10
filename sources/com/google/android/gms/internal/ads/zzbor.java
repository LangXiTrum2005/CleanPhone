package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbor extends zzbcb implements zzbot {
    public zzbor(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    public final zzboq zze(IObjectWrapper iObjectWrapper, zzbsz zzbszVar, int i2, zzbon zzbonVar) throws RemoteException {
        zzboq zzbooVar;
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbszVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbcd.zze(parcelZza, zzbonVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbooVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbooVar = iInterfaceQueryLocalInterface instanceof zzboq ? (zzboq) iInterfaceQueryLocalInterface : new zzboo(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbooVar;
    }
}
