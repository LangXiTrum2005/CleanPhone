package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ju extends qh implements ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationExtrasReceiver f16184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vu0 f16185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cy f16186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s9.a f16187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f16188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationInterstitialAd f16189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public UnifiedNativeAdMapper f16190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public NativeAdMapper f16191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediationRewardedAd f16192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediationInterscrollerAd f16193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediationAppOpenAd f16194k;
    public final String l;

    public ju() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final String A1(zzm zzmVar, String str) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public static final boolean z1(zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        zzay.zza();
        return zzf.zzy();
    }

    public final void B1(zzm zzmVar, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof Adapter) {
            I0(this.f16187d, zzmVar, str, new lu((Adapter) mediationExtrasReceiver, this.f16186c));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void G(s9.a aVar, zzm zzmVar, String str, xt xtVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zzd("Requesting app open ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) s9.b.y1(aVar), "", x1(str, zzmVar, null), y1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str), ""), new iu(this, xtVar, 2));
                return;
            } catch (Exception e10) {
                zzo.zzg("", e10);
                dv.j(aVar, e10, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void I0(s9.a aVar, zzm zzmVar, String str, xt xtVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zzd("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedAd(new MediationRewardedAdConfiguration((Context) s9.b.y1(aVar), "", x1(str, zzmVar, null), y1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str), ""), new hu(this, xtVar, 2));
                return;
            } catch (Exception e10) {
                zzo.zzg("", e10);
                dv.j(aVar, e10, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void J(s9.a aVar, zzr zzrVar, zzm zzmVar, String str, String str2, xt xtVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        boolean z10 = mediationExtrasReceiver instanceof MediationBannerAdapter;
        if (!z10 && !(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            d5.u.r(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        zzo.zzd("Requesting banner ad from adapter.");
        AdSize adSizeZzb = zzrVar.zzn ? zzc.zzb(zzrVar.zze, zzrVar.zzb) : zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
        if (!z10) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadBannerAd(new MediationBannerAdConfiguration((Context) s9.b.y1(aVar), "", x1(str, zzmVar, str2), y1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str), adSizeZzb, this.l), new hu(this, xtVar, 0));
                    return;
                } catch (Throwable th2) {
                    zzo.zzg("", th2);
                    dv.j(aVar, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) mediationExtrasReceiver;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = zzmVar.zzb;
            Date date = j10 == -1 ? null : new Date(j10);
            int i10 = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean zZ1 = z1(zzmVar);
            int i11 = zzmVar.zzg;
            boolean z11 = zzmVar.zzr;
            A1(zzmVar, str);
            gu guVar = new gu(date, i10, hashSet, location, zZ1, i11, z11);
            Bundle bundle = zzmVar.zzm;
            mediationBannerAdapter.requestBannerAd((Context) s9.b.y1(aVar), new vu0(xtVar), x1(str, zzmVar, str2), adSizeZzb, guVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            zzo.zzg("", th3);
            dv.j(aVar, th3, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void M0(s9.a aVar, zzm zzmVar, cy cyVar, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f16187d = aVar;
            this.f16186c = cyVar;
            cyVar.l(new s9.b(mediationExtrasReceiver));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void O(boolean z10) {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) mediationExtrasReceiver).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th2) {
                zzo.zzg("", th2);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzd(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void T(s9.a aVar, zzr zzrVar, zzm zzmVar, String str, String str2, xt xtVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        zzo.zzd("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) mediationExtrasReceiver;
            vu0 vu0Var = new vu0(this, xtVar, adapter, false, 8);
            x1(str, zzmVar, str2);
            y1(zzmVar);
            z1(zzmVar);
            A1(zzmVar, str);
            zzc.zzc(zzrVar.zze, zzrVar.zzb);
            vu0Var.onFailure(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Exception e10) {
            zzo.zzg("", e10);
            dv.j(aVar, e10, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void V(s9.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        zzo.zzd("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.f16192i;
        if (mediationRewardedAd == null) {
            zzo.zzf("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) s9.b.y1(aVar));
        } catch (RuntimeException e10) {
            dv.j(aVar, e10, "adapter.rewarded.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void Y0(s9.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        zzo.zzd("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.f16194k;
        if (mediationAppOpenAd == null) {
            zzo.zzf("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) s9.b.y1(aVar));
        } catch (RuntimeException e10) {
            dv.j(aVar, e10, "adapter.appOpen.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void a0(s9.a aVar, cy cyVar, List list) throws RemoteException {
        zzo.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void c1(s9.a aVar, zzm zzmVar, String str, xt xtVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) s9.b.y1(aVar), "", x1(str, zzmVar, null), y1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str), ""), new hu(this, xtVar, 2));
                return;
            } catch (Exception e10) {
                dv.j(aVar, e10, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final zt d() {
        MediationInterscrollerAd mediationInterscrollerAd = this.f16193j;
        if (mediationInterscrollerAd != null) {
            return new ku(mediationInterscrollerAd);
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.ut
    public final void j0(s9.a aVar, vr vrVar, ArrayList arrayList) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            throw new RemoteException();
        }
        try {
            b21 b21Var = new b21(this, vrVar);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                as asVar = (as) it.next();
                String str = asVar.f12502a;
                AdFormat adFormat = null;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            adFormat = AdFormat.BANNER;
                        }
                        break;
                    case -1052618729:
                        if (str.equals(IronSourceConstants.EVENTS_NATIVE)) {
                            adFormat = AdFormat.NATIVE;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            adFormat = AdFormat.REWARDED;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            adFormat = AdFormat.INTERSTITIAL;
                        }
                        break;
                    case 1167692200:
                        if (str.equals("app_open")) {
                            adFormat = AdFormat.APP_OPEN_AD;
                        }
                        break;
                    case 1778294298:
                        if (str.equals("app_open_ad")) {
                            if (((Boolean) zzba.zzc().a(am.f12459zd)).booleanValue()) {
                                adFormat = AdFormat.APP_OPEN_AD;
                            }
                        }
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList2.add(new MediationConfiguration(adFormat, asVar.f12503b));
                }
            }
            ((Adapter) mediationExtrasReceiver).initialize((Context) s9.b.y1(aVar), b21Var, arrayList2);
        } catch (Throwable th2) {
            dv.j(aVar, th2, "adapter.initialize");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void k(s9.a aVar) {
        Context context = (Context) s9.b.y1(aVar);
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof OnContextChangedListener) {
            ((OnContextChangedListener) mediationExtrasReceiver).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void l1(s9.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (!(mediationExtrasReceiver instanceof Adapter) && !(mediationExtrasReceiver instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            d5.u.r(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            zzh();
            return;
        }
        zzo.zzd("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.f16189f;
        if (mediationInterstitialAd == null) {
            zzo.zzf("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((Context) s9.b.y1(aVar));
        } catch (RuntimeException e10) {
            dv.j(aVar, e10, "adapter.interstitial.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final fv m() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof Adapter) {
            return fv.b(((Adapter) mediationExtrasReceiver).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final au n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void p0(s9.a aVar, zzm zzmVar, String str, String str2, xt xtVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        boolean z10 = mediationExtrasReceiver instanceof MediationInterstitialAdapter;
        if (!z10 && !(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            d5.u.r(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        zzo.zzd("Requesting interstitial ad from adapter.");
        if (!z10) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) s9.b.y1(aVar), "", x1(str, zzmVar, str2), y1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str), this.l), new iu(this, xtVar, 0));
                    return;
                } catch (Throwable th2) {
                    zzo.zzg("", th2);
                    dv.j(aVar, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) mediationExtrasReceiver;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = zzmVar.zzb;
            Date date = j10 == -1 ? null : new Date(j10);
            int i10 = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean zZ1 = z1(zzmVar);
            int i11 = zzmVar.zzg;
            boolean z11 = zzmVar.zzr;
            A1(zzmVar, str);
            gu guVar = new gu(date, i10, hashSet, location, zZ1, i11, z11);
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) s9.b.y1(aVar), new vu0(xtVar), x1(str, zzmVar, str2), guVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            zzo.zzg("", th3);
            dv.j(aVar, th3, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        xt vtVar;
        xt vtVar2;
        xt vtVar3;
        xt vtVar4;
        cy zxVar;
        xt vtVar5;
        cy zxVar2;
        bp bpVar;
        xt vtVar6;
        vr urVar;
        xt vtVar7;
        xt vtVar8;
        xt vtVar9 = null;
        switch (i10) {
            case 1:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                zzr zzrVar = (zzr) rh.b(parcel, zzr.CREATOR);
                zzm zzmVar = (zzm) rh.b(parcel, zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    vtVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar = iInterfaceQueryLocalInterface instanceof xt ? (xt) iInterfaceQueryLocalInterface : new vt(strongBinder);
                }
                rh.f(parcel);
                J(aVarX1, zzrVar, zzmVar, string, null, vtVar);
                parcel2.writeNoException();
                return true;
            case 2:
                s9.a aVarZzf = zzf();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzf);
                return true;
            case 3:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                zzm zzmVar2 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    vtVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar2 = iInterfaceQueryLocalInterface2 instanceof xt ? (xt) iInterfaceQueryLocalInterface2 : new vt(strongBinder2);
                }
                rh.f(parcel);
                p0(aVarX2, zzmVar2, string2, null, vtVar2);
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
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) rh.b(parcel, zzr.CREATOR);
                zzm zzmVar3 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    vtVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar3 = iInterfaceQueryLocalInterface3 instanceof xt ? (xt) iInterfaceQueryLocalInterface3 : new vt(strongBinder3);
                }
                rh.f(parcel);
                J(aVarX3, zzrVar2, zzmVar3, string3, string4, vtVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                zzm zzmVar4 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    vtVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar4 = iInterfaceQueryLocalInterface4 instanceof xt ? (xt) iInterfaceQueryLocalInterface4 : new vt(strongBinder4);
                }
                rh.f(parcel);
                p0(aVarX4, zzmVar4, string5, string6, vtVar4);
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
                s9.a aVarX5 = s9.b.x1(parcel.readStrongBinder());
                zzm zzmVar5 = (zzm) rh.b(parcel, zzm.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    zxVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    zxVar = iInterfaceQueryLocalInterface5 instanceof cy ? (cy) iInterfaceQueryLocalInterface5 : new zx(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                }
                String string7 = parcel.readString();
                rh.f(parcel);
                M0(aVarX5, zzmVar5, zxVar, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                zzm zzmVar6 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string8 = parcel.readString();
                rh.f(parcel);
                B1(zzmVar6, string8);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                s9.a aVarX6 = s9.b.x1(parcel.readStrongBinder());
                zzm zzmVar7 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    vtVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar5 = iInterfaceQueryLocalInterface6 instanceof xt ? (xt) iInterfaceQueryLocalInterface6 : new vt(strongBinder6);
                }
                eo eoVar = (eo) rh.b(parcel, eo.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                rh.f(parcel);
                y(aVarX6, zzmVar7, string9, string10, vtVar5, eoVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = rh.f19590a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = rh.f19590a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                rh.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                rh.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                rh.d(parcel2, bundle3);
                return true;
            case 20:
                zzm zzmVar8 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                rh.f(parcel);
                B1(zzmVar8, string11);
                parcel2.writeNoException();
                return true;
            case 21:
                s9.a aVarX7 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                k(aVarX7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = rh.f19590a;
                parcel2.writeInt(0);
                return true;
            case 23:
                s9.a aVarX8 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    zxVar2 = iInterfaceQueryLocalInterface7 instanceof cy ? (cy) iInterfaceQueryLocalInterface7 : new zx(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                } else {
                    zxVar2 = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                rh.f(parcel);
                a0(aVarX8, zxVar2, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                vu0 vu0Var = this.f16185b;
                ap apVar = (vu0Var == null || (bpVar = (bp) vu0Var.f21276d) == null) ? null : bpVar.f12836a;
                parcel2.writeNoException();
                rh.e(parcel2, apVar);
                return true;
            case 25:
                boolean zA = rh.a(parcel);
                rh.f(parcel);
                O(zA);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                zzea zzeaVarZzB = zzB();
                parcel2.writeNoException();
                rh.e(parcel2, zzeaVarZzB);
                return true;
            case 27:
                eu euVarZzC = zzC();
                parcel2.writeNoException();
                rh.e(parcel2, euVarZzC);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                s9.a aVarX9 = s9.b.x1(parcel.readStrongBinder());
                zzm zzmVar9 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    vtVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar6 = iInterfaceQueryLocalInterface8 instanceof xt ? (xt) iInterfaceQueryLocalInterface8 : new vt(strongBinder8);
                }
                rh.f(parcel);
                I0(aVarX9, zzmVar9, string12, vtVar6);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            default:
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                s9.a aVarX10 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                V(aVarX10);
                parcel2.writeNoException();
                return true;
            case 31:
                s9.a aVarX11 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    urVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    urVar = iInterfaceQueryLocalInterface9 instanceof vr ? (vr) iInterfaceQueryLocalInterface9 : new ur(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(as.CREATOR);
                rh.f(parcel);
                j0(aVarX11, urVar, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                s9.a aVarX12 = s9.b.x1(parcel.readStrongBinder());
                zzm zzmVar10 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 == null) {
                    vtVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar7 = iInterfaceQueryLocalInterface10 instanceof xt ? (xt) iInterfaceQueryLocalInterface10 : new vt(strongBinder10);
                }
                rh.f(parcel);
                c1(aVarX12, zzmVar10, string13, vtVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                fv fvVarZzH = zzH();
                parcel2.writeNoException();
                rh.d(parcel2, fvVarZzH);
                return true;
            case 34:
                fv fvVarM = m();
                parcel2.writeNoException();
                rh.d(parcel2, fvVarM);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                s9.a aVarX13 = s9.b.x1(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) rh.b(parcel, zzr.CREATOR);
                zzm zzmVar11 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 == null) {
                    vtVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar8 = iInterfaceQueryLocalInterface11 instanceof xt ? (xt) iInterfaceQueryLocalInterface11 : new vt(strongBinder11);
                }
                rh.f(parcel);
                T(aVarX13, zzrVar3, zzmVar11, string14, string15, vtVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zt ztVarD = d();
                parcel2.writeNoException();
                rh.e(parcel2, ztVarD);
                return true;
            case 37:
                s9.a aVarX14 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                l1(aVarX14);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                s9.a aVarX15 = s9.b.x1(parcel.readStrongBinder());
                zzm zzmVar12 = (zzm) rh.b(parcel, zzm.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    vtVar9 = iInterfaceQueryLocalInterface12 instanceof xt ? (xt) iInterfaceQueryLocalInterface12 : new vt(strongBinder12);
                }
                rh.f(parcel);
                G(aVarX15, zzmVar12, string16, vtVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                s9.a aVarX16 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                Y0(aVarX16);
                parcel2.writeNoException();
                return true;
        }
    }

    public final Bundle x1(String str, zzm zzmVar, String str2) throws RemoteException {
        zzo.zzd("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f16184a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            zzo.zzg("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void y(s9.a aVar, zzm zzmVar, String str, String str2, xt xtVar, eo eoVar, ArrayList arrayList) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        boolean z10 = mediationExtrasReceiver instanceof MediationNativeAdapter;
        if (!z10 && !(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            d5.u.r(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        zzo.zzd("Requesting native ad from adapter.");
        if (z10) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationExtrasReceiver;
                List list = zzmVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j10 = zzmVar.zzb;
                Date date = j10 == -1 ? null : new Date(j10);
                int i10 = zzmVar.zzd;
                Location location = zzmVar.zzk;
                boolean zZ1 = z1(zzmVar);
                int i11 = zzmVar.zzg;
                boolean z11 = zzmVar.zzr;
                A1(zzmVar, str);
                nu nuVar = new nu(date, i10, hashSet, location, zZ1, i11, eoVar, arrayList, z11);
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f16185b = new vu0(xtVar);
                mediationNativeAdapter.requestNativeAd((Context) s9.b.y1(aVar), this.f16185b, x1(str, zzmVar, str2), nuVar, bundle2);
                return;
            } catch (Throwable th2) {
                zzo.zzg("", th2);
                dv.j(aVar, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return;
        }
        try {
            try {
                ((Adapter) mediationExtrasReceiver).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) s9.b.y1(aVar), "", x1(str, zzmVar, str2), y1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str), this.l, eoVar), new iu(this, xtVar, 1));
            } catch (Throwable th3) {
                th = th3;
                zzo.zzg("", th);
                dv.j(aVar, th, "adapter.loadNativeAdMapper");
                String message = th.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Adapter) mediationExtrasReceiver).loadNativeAd(new MediationNativeAdConfiguration((Context) s9.b.y1(aVar), "", x1(str, zzmVar, str2), y1(zzmVar), z1(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, A1(zzmVar, str), this.l, eoVar), new hu(this, xtVar, 1));
                } catch (Throwable th4) {
                    zzo.zzg("", th4);
                    dv.j(aVar, th4, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final Bundle y1(zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f16184a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void z0(zzm zzmVar, String str) throws RemoteException {
        B1(zzmVar, str);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final zzea zzB() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th2) {
                zzo.zzg("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final eu zzC() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof MediationNativeAdapter) {
            vu0 vu0Var = this.f16185b;
            if (vu0Var == null || (unifiedNativeAdMapper = (UnifiedNativeAdMapper) vu0Var.f21275c) == null) {
                return null;
            }
            return new ou(unifiedNativeAdMapper);
        }
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.f16191h;
        if (nativeAdMapper != null) {
            return new mu(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper2 = this.f16190g;
        if (unifiedNativeAdMapper2 != null) {
            return new ou(unifiedNativeAdMapper2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final fv zzH() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof Adapter) {
            return fv.b(((Adapter) mediationExtrasReceiver).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final bu zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final s9.a zzf() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof MediationBannerAdapter) {
            try {
                return new s9.b(((MediationBannerAdapter) mediationExtrasReceiver).getBannerView());
            } catch (Throwable th2) {
                zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
        if (mediationExtrasReceiver instanceof Adapter) {
            return new s9.b(this.f16188e);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        d5.u.r(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzh() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            zzo.zzd("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) mediationExtrasReceiver).showInterstitial();
                return;
            } catch (Throwable th2) {
                zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzi() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onDestroy();
            } catch (Throwable th2) {
                zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzl() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onPause();
            } catch (Throwable th2) {
                zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzm() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onResume();
            } catch (Throwable th2) {
                zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzp() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if (mediationExtrasReceiver instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f16192i;
            if (mediationRewardedAd == null) {
                zzo.zzf("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                mediationRewardedAd.showAd((Context) s9.b.y1(this.f16187d));
                return;
            } catch (RuntimeException e10) {
                dv.j(this.f16187d, e10, "adapter.showVideo");
                throw e10;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final boolean zzq() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16184a;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f16186c != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final boolean zzx() {
        return false;
    }

    public ju(Adapter adapter) {
        this();
        this.l = "";
        this.f16184a = adapter;
    }

    public ju(MediationAdapter mediationAdapter) {
        this();
        this.l = "";
        this.f16184a = mediationAdapter;
    }
}
