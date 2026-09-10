package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbux extends zzbcc implements zzbuy {
    public zzbux() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbuy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbuy ? (zzbuy) iInterfaceQueryLocalInterface : new zzbuw(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.zzbux, com.google.android.gms.internal.ads.zzbuy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.zzbuv] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzbus] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.google.android.gms.internal.ads.zzbuv] */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.google.android.gms.internal.ads.zzbum] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzbus] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.google.android.gms.internal.ads.zzbuj] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbum] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.zzbup] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.zzbvb] */
    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        IInterface zzbuhVar = null;
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzbcd.zzb(parcel, creator);
            Bundle bundle2 = (Bundle) zzbcd.zzb(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbuhVar = iInterfaceQueryLocalInterface instanceof zzbvb ? (zzbvb) iInterfaceQueryLocalInterface : new zzbuz(strongBinder);
            }
            zzbcd.zzh(parcel);
            zze(iObjectWrapperAsInterface, string, bundle, bundle2, zzrVar, zzbuhVar);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            zzbvn zzbvnVarZzf = zzf();
            parcel2.writeNoException();
            zzbcd.zzd(parcel2, zzbvnVarZzf);
        } else if (i2 == 3) {
            zzbvn zzbvnVarZzg = zzg();
            parcel2.writeNoException();
            zzbcd.zzd(parcel2, zzbvnVarZzg);
        } else if (i2 == 5) {
            com.google.android.gms.ads.internal.client.zzed zzedVarZzh = zzh();
            parcel2.writeNoException();
            zzbcd.zze(parcel2, zzedVarZzh);
        } else if (i2 == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbcd.zzh(parcel);
            parcel2.writeNoException();
        } else if (i2 != 11) {
            switch (i2) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbuhVar = iInterfaceQueryLocalInterface2 instanceof zzbum ? (zzbum) iInterfaceQueryLocalInterface2 : new zzbuk(strongBinder2);
                    }
                    ?? r5 = zzbuhVar;
                    zzbtf zzbtfVarZzb = zzbte.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzbcd.zzh(parcel);
                    zzi(string2, string3, zzmVar, iObjectWrapperAsInterface2, r5, zzbtfVarZzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbuhVar = iInterfaceQueryLocalInterface3 instanceof zzbup ? (zzbup) iInterfaceQueryLocalInterface3 : new zzbun(strongBinder3);
                    }
                    zzbtf zzbtfVarZzb2 = zzbte.zzb(parcel.readStrongBinder());
                    zzbcd.zzh(parcel);
                    zzj(string4, string5, zzmVar2, iObjectWrapperAsInterface3, zzbuhVar, zzbtfVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbcd.zzh(parcel);
                    boolean zZzk = zzk(iObjectWrapperAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzk ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbuhVar = iInterfaceQueryLocalInterface4 instanceof zzbuv ? (zzbuv) iInterfaceQueryLocalInterface4 : new zzbut(strongBinder4);
                    }
                    zzbtf zzbtfVarZzb3 = zzbte.zzb(parcel.readStrongBinder());
                    zzbcd.zzh(parcel);
                    zzl(string6, string7, zzmVar3, iObjectWrapperAsInterface5, zzbuhVar, zzbtfVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbcd.zzh(parcel);
                    boolean zZzm = zzm(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzm ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbuhVar = iInterfaceQueryLocalInterface5 instanceof zzbus ? (zzbus) iInterfaceQueryLocalInterface5 : new zzbuq(strongBinder5);
                    }
                    zzbtf zzbtfVarZzb4 = zzbte.zzb(parcel.readStrongBinder());
                    zzbcd.zzh(parcel);
                    zzn(string8, string9, zzmVar4, iObjectWrapperAsInterface7, zzbuhVar, zzbtfVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzbcd.zzh(parcel);
                    zzo(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbuhVar = iInterfaceQueryLocalInterface6 instanceof zzbuv ? (zzbuv) iInterfaceQueryLocalInterface6 : new zzbut(strongBinder6);
                    }
                    zzbtf zzbtfVarZzb5 = zzbte.zzb(parcel.readStrongBinder());
                    zzbcd.zzh(parcel);
                    zzp(string11, string12, zzmVar5, iObjectWrapperAsInterface8, zzbuhVar, zzbtfVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbuhVar = iInterfaceQueryLocalInterface7 instanceof zzbum ? (zzbum) iInterfaceQueryLocalInterface7 : new zzbuk(strongBinder7);
                    }
                    ?? r6 = zzbuhVar;
                    zzbtf zzbtfVarZzb6 = zzbte.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzbcd.zzh(parcel);
                    zzq(string13, string14, zzmVar6, iObjectWrapperAsInterface9, r6, zzbtfVarZzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbuhVar = iInterfaceQueryLocalInterface8 instanceof zzbus ? (zzbus) iInterfaceQueryLocalInterface8 : new zzbuq(strongBinder8);
                    }
                    zzbtf zzbtfVarZzb7 = zzbte.zzb(parcel.readStrongBinder());
                    zzbjn zzbjnVar = (zzbjn) zzbcd.zzb(parcel, zzbjn.CREATOR);
                    zzbcd.zzh(parcel);
                    zzr(string15, string16, zzmVar7, iObjectWrapperAsInterface10, zzbuhVar, zzbtfVarZzb7, zzbjnVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbuhVar = iInterfaceQueryLocalInterface9 instanceof zzbuj ? (zzbuj) iInterfaceQueryLocalInterface9 : new zzbuh(strongBinder9);
                    }
                    zzbtf zzbtfVarZzb8 = zzbte.zzb(parcel.readStrongBinder());
                    zzbcd.zzh(parcel);
                    zzs(string17, string18, zzmVar8, iObjectWrapperAsInterface11, zzbuhVar, zzbtfVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbcd.zzh(parcel);
                    boolean zZzt = zzt(iObjectWrapperAsInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzbcd.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
