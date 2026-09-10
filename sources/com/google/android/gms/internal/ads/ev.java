package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ev extends qh implements av {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f14085f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RtbAdapter f14086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationInterstitialAd f14087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediationRewardedAd f14088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationAppOpenAd f14089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14090e;

    public ev(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f14090e = "";
        this.f14086a = rtbAdapter;
    }

    public static final String A1(zzm zzmVar, String str) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public static final Bundle y1(String str) throws RemoteException {
        zzo.zzi("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            zzo.zzg("", e10);
            throw new RemoteException();
        }
    }

    public static final boolean z1(zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        zzay.zza();
        return zzf.zzy();
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void C(String str, String str2, zzm zzmVar, s9.b bVar, sn0 sn0Var, xt xtVar) throws RemoteException {
        s1(str, str2, zzmVar, bVar, sn0Var, xtVar, null);
    }

    @Override // com.google.android.gms.internal.ads.av
    public final boolean K(s9.a aVar) {
        MediationInterstitialAd mediationInterstitialAd = this.f14087b;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) s9.b.y1(aVar));
            return true;
        } catch (Throwable th2) {
            zzo.zzg("", th2);
            dv.j(aVar, th2, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void N(String str, String str2, zzm zzmVar, s9.a aVar, qu quVar, xt xtVar) throws RemoteException {
        try {
            this.f14086a.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) s9.b.y1(aVar), str, y1(str2), x1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str2), this.f14090e), new vu0(this, quVar, xtVar, false, 11));
        } catch (Throwable th2) {
            zzo.zzg("Adapter failed to render app open ad.", th2);
            dv.j(aVar, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void P(String str, String str2, zzm zzmVar, s9.a aVar, su suVar, xt xtVar, zzr zzrVar) throws RemoteException {
        try {
            RtbAdapter rtbAdapter = this.f14086a;
            y1(str2);
            x1(zzmVar);
            z1(zzmVar);
            A1(zzmVar, str2);
            zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
            try {
                suVar.a(new AdError(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN).zza());
            } catch (RemoteException e10) {
                zzo.zzg("", e10);
            }
        } catch (Throwable th2) {
            zzo.zzg("Adapter failed to render interscroller ad.", th2);
            dv.j(aVar, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void Q0(String str, String str2, zzm zzmVar, s9.a aVar, su suVar, xt xtVar, zzr zzrVar) throws RemoteException {
        try {
            this.f14086a.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) s9.b.y1(aVar), str, y1(str2), x1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str2), zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza), this.f14090e), new lj1(this, suVar, xtVar, 9));
        } catch (Throwable th2) {
            zzo.zzg("Adapter failed to render banner ad.", th2);
            dv.j(aVar, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void R0(String str, String str2, zzm zzmVar, s9.a aVar, yu yuVar, xt xtVar) throws RemoteException {
        try {
            this.f14086a.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) s9.b.y1(aVar), str, y1(str2), x1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str2), this.f14090e), new vu0(this, yuVar, xtVar, false, 12));
        } catch (Throwable th2) {
            zzo.zzg("Adapter failed to render rewarded ad.", th2);
            dv.j(aVar, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.av
    public final void W(s9.a aVar, String str, Bundle bundle, Bundle bundle2, zzr zzrVar, cv cvVar) throws RemoteException {
        AdFormat adFormat;
        try {
            vf vfVar = new vf(10, this, cvVar);
            RtbAdapter rtbAdapter = this.f14086a;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(mediationConfiguration);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) s9.b.y1(aVar), arrayList, bundle, zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), vfVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -1052618729:
                    if (str.equals(IronSourceConstants.EVENTS_NATIVE)) {
                        adFormat = AdFormat.NATIVE;
                        MediationConfiguration mediationConfiguration2 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(mediationConfiguration2);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) s9.b.y1(aVar), arrayList2, bundle, zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), vfVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        MediationConfiguration mediationConfiguration3 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(mediationConfiguration3);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) s9.b.y1(aVar), arrayList3, bundle, zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), vfVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        MediationConfiguration mediationConfiguration4 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(mediationConfiguration4);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) s9.b.y1(aVar), arrayList4, bundle, zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), vfVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1167692200:
                    if (str.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        MediationConfiguration mediationConfiguration5 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(mediationConfiguration5);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) s9.b.y1(aVar), arrayList5, bundle, zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), vfVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) zzba.zzc().a(am.f12459zd)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            MediationConfiguration mediationConfiguration6 = new MediationConfiguration(adFormat, bundle2);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(mediationConfiguration6);
                            rtbAdapter.collectSignals(new RtbSignalData((Context) s9.b.y1(aVar), arrayList6, bundle, zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), vfVar);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        MediationConfiguration mediationConfiguration7 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(mediationConfiguration7);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) s9.b.y1(aVar), arrayList7, bundle, zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), vfVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th2) {
            zzo.zzg("Error generating signals for RTB", th2);
            dv.j(aVar, th2, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void g1(String str, String str2, zzm zzmVar, s9.a aVar, uu uuVar, xt xtVar) throws RemoteException {
        try {
            this.f14086a.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) s9.b.y1(aVar), str, y1(str2), x1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str2), this.f14090e), new vu0(this, uuVar, xtVar, false, 10));
        } catch (Throwable th2) {
            zzo.zzg("Adapter failed to render interstitial ad.", th2);
            dv.j(aVar, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final boolean o(s9.a aVar) {
        MediationAppOpenAd mediationAppOpenAd = this.f14089d;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) s9.b.y1(aVar));
            return true;
        } catch (Throwable th2) {
            zzo.zzg("", th2);
            dv.j(aVar, th2, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void s1(String str, String str2, zzm zzmVar, s9.a aVar, wu wuVar, xt xtVar, eo eoVar) throws RemoteException {
        RtbAdapter rtbAdapter = this.f14086a;
        try {
            rtbAdapter.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) s9.b.y1(aVar), str, y1(str2), x1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str2), this.f14090e, eoVar), new md0(this, wuVar, xtVar, 9));
        } catch (Throwable th2) {
            zzo.zzg("Adapter failed to render native ad.", th2);
            dv.j(aVar, th2, "adapter.loadRtbNativeAdMapper");
            String message = th2.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                rtbAdapter.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) s9.b.y1(aVar), str, y1(str2), x1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str2), this.f14090e, eoVar), new lj1(this, wuVar, xtVar, 10));
            } catch (Throwable th3) {
                zzo.zzg("Adapter failed to render native ad.", th3);
                dv.j(aVar, th3, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void t0(String str, String str2, zzm zzmVar, s9.a aVar, yu yuVar, xt xtVar) throws RemoteException {
        try {
            this.f14086a.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) s9.b.y1(aVar), str, y1(str2), x1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str2), this.f14090e), new vu0(this, yuVar, xtVar, false, 12));
        } catch (Throwable th2) {
            zzo.zzg("Adapter failed to render rewarded interstitial ad.", th2);
            dv.j(aVar, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.internal.ads.ev] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.yu] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.wu] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.google.android.gms.internal.ads.yu] */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.google.android.gms.internal.ads.su] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.wu] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.google.android.gms.internal.ads.qu] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.su] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.uu] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.cv] */
    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        IInterface puVar = null;
        if (i10 == 1) {
            s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) rh.b(parcel, creator);
            Bundle bundle2 = (Bundle) rh.b(parcel, creator);
            zzr zzrVar = (zzr) rh.b(parcel, zzr.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                puVar = iInterfaceQueryLocalInterface instanceof cv ? (cv) iInterfaceQueryLocalInterface : new bv(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            }
            rh.f(parcel);
            W(aVarX1, string, bundle, bundle2, zzrVar, puVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            fv fvVarZzf = zzf();
            parcel2.writeNoException();
            rh.d(parcel2, fvVarZzf);
            return true;
        }
        if (i10 == 3) {
            fv fvVarZzg = zzg();
            parcel2.writeNoException();
            rh.d(parcel2, fvVarZzg);
            return true;
        }
        if (i10 == 5) {
            zzea zzeaVarZzh = zzh();
            parcel2.writeNoException();
            rh.e(parcel2, zzeaVarZzh);
            return true;
        }
        if (i10 == 10) {
            s9.b.x1(parcel.readStrongBinder());
            rh.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 11) {
            parcel.createStringArray();
            rh.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i10) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                zzm zzmVar = (zzm) rh.b(parcel, zzm.CREATOR);
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    puVar = iInterfaceQueryLocalInterface2 instanceof su ? (su) iInterfaceQueryLocalInterface2 : new ru(strongBinder2);
                }
                ?? r10 = puVar;
                xt xtVarX1 = wt.x1(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) rh.b(parcel, zzr.CREATOR);
                rh.f(parcel);
                Q0(string2, string3, zzmVar, aVarX2, r10, xtVarX1, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzm zzmVar2 = (zzm) rh.b(parcel, zzm.CREATOR);
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    puVar = iInterfaceQueryLocalInterface3 instanceof uu ? (uu) iInterfaceQueryLocalInterface3 : new tu(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                }
                xt xtVarX2 = wt.x1(parcel.readStrongBinder());
                rh.f(parcel);
                g1(string4, string5, zzmVar2, aVarX3, puVar, xtVarX2);
                parcel2.writeNoException();
                return true;
            case 15:
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                boolean zK = K(aVarX4);
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                zzm zzmVar3 = (zzm) rh.b(parcel, zzm.CREATOR);
                s9.a aVarX5 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    puVar = iInterfaceQueryLocalInterface4 instanceof yu ? (yu) iInterfaceQueryLocalInterface4 : new xu(strongBinder4);
                }
                xt xtVarX3 = wt.x1(parcel.readStrongBinder());
                rh.f(parcel);
                R0(string6, string7, zzmVar3, aVarX5, puVar, xtVarX3);
                parcel2.writeNoException();
                return true;
            case 17:
                s9.a aVarX6 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                boolean zX = x(aVarX6);
                parcel2.writeNoException();
                parcel2.writeInt(zX ? 1 : 0);
                return true;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                zzm zzmVar4 = (zzm) rh.b(parcel, zzm.CREATOR);
                s9.a aVarX7 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    puVar = iInterfaceQueryLocalInterface5 instanceof wu ? (wu) iInterfaceQueryLocalInterface5 : new vu(strongBinder5);
                }
                xt xtVarX4 = wt.x1(parcel.readStrongBinder());
                rh.f(parcel);
                s1(string8, string9, zzmVar4, aVarX7, puVar, xtVarX4, null);
                parcel2.writeNoException();
                return true;
            case 19:
                String string10 = parcel.readString();
                rh.f(parcel);
                this.f14090e = string10;
                parcel2.writeNoException();
                return true;
            case 20:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzm zzmVar5 = (zzm) rh.b(parcel, zzm.CREATOR);
                s9.a aVarX8 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    puVar = iInterfaceQueryLocalInterface6 instanceof yu ? (yu) iInterfaceQueryLocalInterface6 : new xu(strongBinder6);
                }
                xt xtVarX5 = wt.x1(parcel.readStrongBinder());
                rh.f(parcel);
                t0(string11, string12, zzmVar5, aVarX8, puVar, xtVarX5);
                parcel2.writeNoException();
                return true;
            case 21:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                zzm zzmVar6 = (zzm) rh.b(parcel, zzm.CREATOR);
                s9.a aVarX9 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    puVar = iInterfaceQueryLocalInterface7 instanceof su ? (su) iInterfaceQueryLocalInterface7 : new ru(strongBinder7);
                }
                ?? r11 = puVar;
                xt xtVarX6 = wt.x1(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) rh.b(parcel, zzr.CREATOR);
                rh.f(parcel);
                P(string13, string14, zzmVar6, aVarX9, r11, xtVarX6, zzrVar3);
                parcel2.writeNoException();
                return true;
            case 22:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                zzm zzmVar7 = (zzm) rh.b(parcel, zzm.CREATOR);
                s9.a aVarX10 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    puVar = iInterfaceQueryLocalInterface8 instanceof wu ? (wu) iInterfaceQueryLocalInterface8 : new vu(strongBinder8);
                }
                xt xtVarX7 = wt.x1(parcel.readStrongBinder());
                eo eoVar = (eo) rh.b(parcel, eo.CREATOR);
                rh.f(parcel);
                s1(string15, string16, zzmVar7, aVarX10, puVar, xtVarX7, eoVar);
                parcel2.writeNoException();
                return true;
            case 23:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                zzm zzmVar8 = (zzm) rh.b(parcel, zzm.CREATOR);
                s9.a aVarX11 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    puVar = iInterfaceQueryLocalInterface9 instanceof qu ? (qu) iInterfaceQueryLocalInterface9 : new pu(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                }
                xt xtVarX8 = wt.x1(parcel.readStrongBinder());
                rh.f(parcel);
                N(string17, string18, zzmVar8, aVarX11, puVar, xtVarX8);
                parcel2.writeNoException();
                return true;
            case 24:
                s9.a aVarX12 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                boolean zO = o(aVarX12);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final boolean x(s9.a aVar) {
        MediationRewardedAd mediationRewardedAd = this.f14088c;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) s9.b.y1(aVar));
            return true;
        } catch (Throwable th2) {
            zzo.zzg("", th2);
            dv.j(aVar, th2, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    public final Bundle x1(zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f14086a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.av
    public final fv zzf() {
        return fv.b(this.f14086a.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.av
    public final fv zzg() {
        return fv.b(this.f14086a.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.av
    public final zzea zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f14086a;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th2) {
                zzo.zzg("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void zzo(String str) {
        this.f14090e = str;
    }
}
