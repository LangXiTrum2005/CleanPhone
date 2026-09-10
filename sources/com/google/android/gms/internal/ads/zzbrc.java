package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbrc extends zzayb implements zzbrd {
    public zzbrc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbrd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbrd ? (zzbrd) iInterfaceQueryLocalInterface : new zzbrb(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.zzbrg] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.gms.internal.ads.zzbqr] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.gms.internal.ads.zzbra] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.zzbra] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.android.gms.internal.ads.zzbqr] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzbrc, com.google.android.gms.internal.ads.zzbrd] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.zzbqx] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.zzbqx] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.google.android.gms.internal.ads.zzbqo] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.zzbqu] */
    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzbqmVar = null;
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzayc.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzayc.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbqmVar = iInterfaceQueryLocalInterface instanceof zzbrg ? (zzbrg) iInterfaceQueryLocalInterface : new zzbre(strongBinder);
            }
            ?? r11 = zzbqmVar;
            zzayc.zzc(parcel);
            zzh(iObjectWrapperAsInterface, string, bundle, bundle2, zzsVar, r11);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbrs zzbrsVarZzf = zzf();
            parcel2.writeNoException();
            zzayc.zze(parcel2, zzbrsVarZzf);
        } else if (i == 3) {
            zzbrs zzbrsVarZzg = zzg();
            parcel2.writeNoException();
            zzayc.zze(parcel2, zzbrsVarZzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzeb zzebVarZze = zze();
            parcel2.writeNoException();
            zzayc.zzf(parcel2, zzebVarZze);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface2 instanceof zzbqr ? (zzbqr) iInterfaceQueryLocalInterface2 : new zzbqp(strongBinder2);
                    }
                    ?? r12 = zzbqmVar;
                    zzbpk zzbpkVarZzb = zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzs zzsVar2 = (com.google.android.gms.ads.internal.client.zzs) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                    zzayc.zzc(parcel);
                    zzj(string2, string3, zzmVar, iObjectWrapperAsInterface2, r12, zzbpkVarZzb, zzsVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface3 instanceof zzbqu ? (zzbqu) iInterfaceQueryLocalInterface3 : new zzbqs(strongBinder3);
                    }
                    ?? r7 = zzbqmVar;
                    zzbpk zzbpkVarZzb2 = zzbpj.zzb(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    zzl(string4, string5, zzmVar2, iObjectWrapperAsInterface3, r7, zzbpkVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    boolean zZzs = zzs(iObjectWrapperAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzs ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface4 instanceof zzbra ? (zzbra) iInterfaceQueryLocalInterface4 : new zzbqy(strongBinder4);
                    }
                    ?? r13 = zzbqmVar;
                    zzbpk zzbpkVarZzb3 = zzbpj.zzb(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    zzp(string6, string7, zzmVar3, iObjectWrapperAsInterface5, r13, zzbpkVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    boolean zZzt = zzt(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface5 instanceof zzbqx ? (zzbqx) iInterfaceQueryLocalInterface5 : new zzbqv(strongBinder5);
                    }
                    ?? r5 = zzbqmVar;
                    zzbpk zzbpkVarZzb4 = zzbpj.zzb(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    zzm(string8, string9, zzmVar4, iObjectWrapperAsInterface7, r5, zzbpkVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzayc.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface6 instanceof zzbra ? (zzbra) iInterfaceQueryLocalInterface6 : new zzbqy(strongBinder6);
                    }
                    ?? r14 = zzbqmVar;
                    zzbpk zzbpkVarZzb5 = zzbpj.zzb(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    zzo(string11, string12, zzmVar5, iObjectWrapperAsInterface8, r14, zzbpkVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface7 instanceof zzbqr ? (zzbqr) iInterfaceQueryLocalInterface7 : new zzbqp(strongBinder7);
                    }
                    ?? r15 = zzbqmVar;
                    zzbpk zzbpkVarZzb6 = zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzs zzsVar3 = (com.google.android.gms.ads.internal.client.zzs) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                    zzayc.zzc(parcel);
                    zzk(string13, string14, zzmVar6, iObjectWrapperAsInterface9, r15, zzbpkVarZzb6, zzsVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface8 instanceof zzbqx ? (zzbqx) iInterfaceQueryLocalInterface8 : new zzbqv(strongBinder8);
                    }
                    ?? r6 = zzbqmVar;
                    zzbpk zzbpkVarZzb7 = zzbpj.zzb(parcel.readStrongBinder());
                    zzbfl zzbflVar = (zzbfl) zzayc.zza(parcel, zzbfl.CREATOR);
                    zzayc.zzc(parcel);
                    zzn(string15, string16, zzmVar7, iObjectWrapperAsInterface10, r6, zzbpkVarZzb7, zzbflVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface9 instanceof zzbqo ? (zzbqo) iInterfaceQueryLocalInterface9 : new zzbqm(strongBinder9);
                    }
                    ?? r8 = zzbqmVar;
                    zzbpk zzbpkVarZzb8 = zzbpj.zzb(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    zzi(string17, string18, zzmVar8, iObjectWrapperAsInterface11, r8, zzbpkVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayc.zzc(parcel);
                    boolean zZzr = zzr(iObjectWrapperAsInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzayc.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
