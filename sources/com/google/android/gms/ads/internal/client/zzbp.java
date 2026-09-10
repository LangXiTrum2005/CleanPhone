package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.bs;
import com.google.android.gms.internal.ads.cp;
import com.google.android.gms.internal.ads.dp;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.ep;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.fs;
import com.google.android.gms.internal.ads.gp;
import com.google.android.gms.internal.ads.gs;
import com.google.android.gms.internal.ads.ip;
import com.google.android.gms.internal.ads.jp;
import com.google.android.gms.internal.ads.lp;
import com.google.android.gms.internal.ads.np;
import com.google.android.gms.internal.ads.op;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.rp;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbp extends qh implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        lp jpVar;
        zzbh zzbfVar = null;
        gs fsVar = null;
        rp ppVar = null;
        op npVar = null;
        zzcp zzcpVar = null;
        ip gpVar = null;
        fp epVar = null;
        dp cpVar = null;
        switch (i10) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                rh.e(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                rh.f(parcel);
                zzf(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    cpVar = iInterfaceQueryLocalInterface2 instanceof dp ? (dp) iInterfaceQueryLocalInterface2 : new cp(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                }
                rh.f(parcel);
                zzg(cpVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    epVar = iInterfaceQueryLocalInterface3 instanceof fp ? (fp) iInterfaceQueryLocalInterface3 : new ep(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                }
                rh.f(parcel);
                zzh(epVar);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    jpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    jpVar = iInterfaceQueryLocalInterface4 instanceof lp ? (lp) iInterfaceQueryLocalInterface4 : new jp(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    gpVar = iInterfaceQueryLocalInterface5 instanceof ip ? (ip) iInterfaceQueryLocalInterface5 : new gp(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                }
                rh.f(parcel);
                zzi(string, jpVar, gpVar);
                parcel2.writeNoException();
                return true;
            case 6:
                eo eoVar = (eo) rh.b(parcel, eo.CREATOR);
                rh.f(parcel);
                zzj(eoVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = iInterfaceQueryLocalInterface6 instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface6 : new zzcp(strongBinder6);
                }
                rh.f(parcel);
                zzq(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    npVar = iInterfaceQueryLocalInterface7 instanceof op ? (op) iInterfaceQueryLocalInterface7 : new np(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                }
                zzr zzrVar = (zzr) rh.b(parcel, zzr.CREATOR);
                rh.f(parcel);
                zzk(npVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) rh.b(parcel, PublisherAdViewOptions.CREATOR);
                rh.f(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    ppVar = iInterfaceQueryLocalInterface8 instanceof rp ? (rp) iInterfaceQueryLocalInterface8 : new pp(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                }
                rh.f(parcel);
                zzm(ppVar);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                bs bsVar = (bs) rh.b(parcel, bs.CREATOR);
                rh.f(parcel);
                zzn(bsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    fsVar = iInterfaceQueryLocalInterface9 instanceof gs ? (gs) iInterfaceQueryLocalInterface9 : new fs(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                }
                rh.f(parcel);
                zzo(fsVar);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) rh.b(parcel, AdManagerAdViewOptions.CREATOR);
                rh.f(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
