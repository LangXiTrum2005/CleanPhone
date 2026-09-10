package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class po extends qh implements qo {
    public po() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static qo zzdG(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof qo ? (qo) iInterfaceQueryLocalInterface : new oo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        ko joVar;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzb(string, aVarX1);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                rh.f(parcel);
                s9.a aVarZzc = zzc(string2);
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzc);
                return true;
            case 3:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzd(aVarX2);
                parcel2.writeNoException();
                return true;
            case 4:
                zze();
                parcel2.writeNoException();
                return true;
            case 5:
                s9.b.x1(parcel.readStrongBinder());
                parcel.readInt();
                rh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzdB(aVarX3);
                parcel2.writeNoException();
                return true;
            case 7:
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzdD(aVarX4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    joVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    joVar = iInterfaceQueryLocalInterface instanceof ko ? (ko) iInterfaceQueryLocalInterface : new jo(strongBinder);
                }
                rh.f(parcel);
                zzdE(joVar);
                parcel2.writeNoException();
                return true;
            case 9:
                s9.a aVarX5 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzdC(aVarX5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
