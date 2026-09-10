package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.im;
import com.google.android.gms.internal.ads.jm;
import com.google.android.gms.internal.ads.mw;
import com.google.android.gms.internal.ads.nw;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xi;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.zi;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbt extends qh implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzZ(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzbh zzbfVar = null;
        zzcs zzcqVar = null;
        zzbk zzbiVar = null;
        zzdq zzdoVar = null;
        zi xiVar = null;
        zzby zzbwVar = null;
        xx wxVar = null;
        zzcp zzcpVar = null;
        zzbe zzbcVar = null;
        jm imVar = null;
        pw owVar = null;
        nw mwVar = null;
        zzcl zzcjVar = null;
        switch (i10) {
            case 1:
                a aVarZzb = zzb();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzd = zzd();
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeInt(zZzd ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) rh.b(parcel, zzm.CREATOR);
                rh.f(parcel);
                boolean zZze = zze(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZze ? 1 : 0);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                rh.f(parcel);
                zzdS(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcjVar = iInterfaceQueryLocalInterface2 instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface2 : new zzcj(strongBinder2);
                }
                rh.f(parcel);
                zzi(zzcjVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzrVarZzn = zzn();
                parcel2.writeNoException();
                rh.d(parcel2, zzrVarZzn);
                return true;
            case 13:
                zzr zzrVar = (zzr) rh.b(parcel, zzr.CREATOR);
                rh.f(parcel);
                zzo(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    mwVar = iInterfaceQueryLocalInterface3 instanceof nw ? (nw) iInterfaceQueryLocalInterface3 : new mw(strongBinder3, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                }
                rh.f(parcel);
                zzp(mwVar);
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    owVar = iInterfaceQueryLocalInterface4 instanceof pw ? (pw) iInterfaceQueryLocalInterface4 : new ow(strongBinder4, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                }
                String string = parcel.readString();
                rh.f(parcel);
                zzq(owVar, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            default:
                return false;
            case 18:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    imVar = iInterfaceQueryLocalInterface5 instanceof jm ? (jm) iInterfaceQueryLocalInterface5 : new im(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                }
                rh.f(parcel);
                zzx(imVar);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = iInterfaceQueryLocalInterface6 instanceof zzbe ? (zzbe) iInterfaceQueryLocalInterface6 : new zzbc(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                rh.f(parcel);
                zzy(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = iInterfaceQueryLocalInterface7 instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface7 : new zzcp(strongBinder7);
                }
                rh.f(parcel);
                zzY(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zA = rh.a(parcel);
                rh.f(parcel);
                zzz(zA);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                ClassLoader classLoader2 = rh.f19590a;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    wxVar = iInterfaceQueryLocalInterface8 instanceof xx ? (xx) iInterfaceQueryLocalInterface8 : new wx(strongBinder8);
                }
                rh.f(parcel);
                zzC(wxVar);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                rh.f(parcel);
                zzD(string2);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                zzea zzeaVarZzF = zzF();
                parcel2.writeNoException();
                rh.e(parcel2, zzeaVarZzF);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                zzfw zzfwVar = (zzfw) rh.b(parcel, zzfw.CREATOR);
                rh.f(parcel);
                zzG(zzfwVar);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                zzee zzeeVar = (zzee) rh.b(parcel, zzee.CREATOR);
                rh.f(parcel);
                zzH(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 32:
                zzcl zzclVarZzv = zzv();
                parcel2.writeNoException();
                rh.e(parcel2, zzclVarZzv);
                return true;
            case 33:
                zzbh zzbhVarZzw = zzw();
                parcel2.writeNoException();
                rh.e(parcel2, zzbhVarZzw);
                return true;
            case 34:
                boolean zA2 = rh.a(parcel);
                rh.f(parcel);
                zzK(zA2);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = iInterfaceQueryLocalInterface9 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface9 : new zzbw(strongBinder9);
                }
                rh.f(parcel);
                zzj(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                rh.d(parcel2, bundleZzk);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                String string3 = parcel.readString();
                rh.f(parcel);
                zzE(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) rh.b(parcel, zzx.CREATOR);
                rh.f(parcel);
                zzI(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    xiVar = iInterfaceQueryLocalInterface10 instanceof zi ? (zi) iInterfaceQueryLocalInterface10 : new xi(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                }
                rh.f(parcel);
                zzJ(xiVar);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx zzdxVarZzt = zzt();
                parcel2.writeNoException();
                rh.e(parcel2, zzdxVarZzt);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdoVar = iInterfaceQueryLocalInterface11 instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface11 : new zzdo(strongBinder11);
                }
                rh.f(parcel);
                zzP(zzdoVar);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                zzm zzmVar2 = (zzm) rh.b(parcel, zzm.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = iInterfaceQueryLocalInterface12 instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface12 : new zzbi(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                rh.f(parcel);
                zzQ(zzmVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                a aVarX1 = b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzR(aVarX1);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcqVar = iInterfaceQueryLocalInterface13 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface13 : new zzcq(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                rh.f(parcel);
                zzS(zzcqVar);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                ClassLoader classLoader3 = rh.f19590a;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                long jZzU = zzU();
                parcel2.writeNoException();
                parcel2.writeLong(jZzU);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                long j10 = parcel.readLong();
                rh.f(parcel);
                zzT(j10);
                parcel2.writeNoException();
                return true;
        }
    }
}
