package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbtb extends zzbcc implements zzbtc {
    public zzbtb() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbtf zzbtdVar;
        zzbtf zzbtdVar2;
        zzbtf zzbtdVar3;
        zzbtf zzbtdVar4;
        zzbtf zzbtdVar5;
        zzbtf zzbtdVar6;
        zzbtf zzbtdVar7;
        zzbtf zzbtdVar8;
        zzbtf zzbtdVar9 = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbtdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar = iInterfaceQueryLocalInterface instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface : new zzbtd(strongBinder);
                }
                zzbcd.zzh(parcel);
                zze(iObjectWrapperAsInterface, zzrVar, zzmVar, string, zzbtdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperZzf = zzf();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, iObjectWrapperZzf);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbtdVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar2 = iInterfaceQueryLocalInterface2 instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface2 : new zzbtd(strongBinder2);
                }
                zzbcd.zzh(parcel);
                zzg(iObjectWrapperAsInterface2, zzmVar2, string2, zzbtdVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzbtdVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar3 = iInterfaceQueryLocalInterface3 instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface3 : new zzbtd(strongBinder3);
                }
                zzbcd.zzh(parcel);
                zzj(iObjectWrapperAsInterface3, zzrVar2, zzmVar3, string3, string4, zzbtdVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    zzbtdVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar4 = iInterfaceQueryLocalInterface4 instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface4 : new zzbtd(strongBinder4);
                }
                zzbcd.zzh(parcel);
                zzk(iObjectWrapperAsInterface4, zzmVar4, string5, string6, zzbtdVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string7 = parcel.readString();
                zzbzx zzbzxVarZzb = zzbzw.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzbcd.zzh(parcel);
                zzn(iObjectWrapperAsInterface5, zzmVar5, string7, zzbzxVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string9 = parcel.readString();
                zzbcd.zzh(parcel);
                zzo(zzmVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i4 = zzbcd.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    zzbtdVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar5 = iInterfaceQueryLocalInterface5 instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface5 : new zzbtd(strongBinder5);
                }
                zzbjn zzbjnVar = (zzbjn) zzbcd.zzb(parcel, zzbjn.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzbcd.zzh(parcel);
                zzr(iObjectWrapperAsInterface6, zzmVar7, string10, string11, zzbtdVar5, zzbjnVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzbcd.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzbcd.zze(parcel2, null);
                return true;
            case 17:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, bundleZzs);
                return true;
            case 18:
                Bundle bundleZzt = zzt();
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, bundleZzt);
                return true;
            case 19:
                Bundle bundleZzu = zzu();
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, bundleZzu);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzbcd.zzh(parcel);
                zzv(zzmVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzw(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i5 = zzbcd.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb2 = zzbzw.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzbcd.zzh(parcel);
                zzy(iObjectWrapperAsInterface8, zzbzxVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbks zzbksVarZzz = zzz();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, zzbksVarZzz);
                return true;
            case 25:
                boolean zZza = zzbcd.zza(parcel);
                zzbcd.zzh(parcel);
                zzA(zZza);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzed zzedVarZzB = zzB();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, zzedVarZzB);
                return true;
            case 27:
                zzbto zzbtoVarZzC = zzC();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, zzbtoVarZzC);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    zzbtdVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar6 = iInterfaceQueryLocalInterface6 instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface6 : new zzbtd(strongBinder6);
                }
                zzbcd.zzh(parcel);
                zzD(iObjectWrapperAsInterface9, zzmVar9, string14, zzbtdVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzE(iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpq zzbpqVarZzb = zzbpp.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbpw.CREATOR);
                zzbcd.zzh(parcel);
                zzF(iObjectWrapperAsInterface11, zzbpqVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    zzbtdVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar7 = iInterfaceQueryLocalInterface7 instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface7 : new zzbtd(strongBinder7);
                }
                zzbcd.zzh(parcel);
                zzG(iObjectWrapperAsInterface12, zzmVar10, string15, zzbtdVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbvn zzbvnVarZzH = zzH();
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, zzbvnVarZzH);
                return true;
            case 34:
                zzbvn zzbvnVarZzI = zzI();
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, zzbvnVarZzI);
                return true;
            case 35:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    zzbtdVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar8 = iInterfaceQueryLocalInterface8 instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface8 : new zzbtd(strongBinder8);
                }
                zzbcd.zzh(parcel);
                zzJ(iObjectWrapperAsInterface13, zzrVar3, zzmVar11, string16, string17, zzbtdVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbti zzbtiVarZzK = zzK();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, zzbtiVarZzK);
                return true;
            case 37:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzL(iObjectWrapperAsInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtdVar9 = iInterfaceQueryLocalInterface9 instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface9 : new zzbtd(strongBinder9);
                }
                zzbcd.zzh(parcel);
                zzM(iObjectWrapperAsInterface15, zzmVar12, string18, zzbtdVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzN(iObjectWrapperAsInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
