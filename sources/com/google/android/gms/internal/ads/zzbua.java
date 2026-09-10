package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbua extends zzbtb {
    private final Object zza;
    private zzbuc zzb;
    private zzbzx zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbua(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Server parameters: ".concat(String.valueOf(str)));
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
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            throw new RemoteException();
        }
    }

    private final Bundle zzW(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzw();
    }

    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzmVar.zzu;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzA(boolean z2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final com.google.android.gms.ads.internal.client.zzed zzB() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbto zzC() {
        UnifiedNativeAdMapper unifiedNativeAdMapperZzb;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbuc zzbucVar = this.zzb;
            if (zzbucVar == null || (unifiedNativeAdMapperZzb = zzbucVar.zzb()) == null) {
                return null;
            }
            return new zzbug(unifiedNativeAdMapperZzb);
        }
        if (!(obj instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.zzh;
        if (nativeAdMapper != null) {
            return new zzbue(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
        if (unifiedNativeAdMapper != null) {
            return new zzbug(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbty(this, zzbtfVar));
                return;
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                zzbsw.zza(iObjectWrapper, e2, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e2) {
            zzbsw.zza(iObjectWrapper, e2, "adapter.rewarded.showAd");
            throw e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzF(IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, List list) throws RemoteException {
        byte b2;
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            throw new RemoteException();
        }
        zzbtt zzbttVar = new zzbtt(this, zzbpqVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbpw zzbpwVar = (zzbpw) it.next();
            switch (zzbpwVar.zza) {
                case "banner":
                    b2 = 0;
                    break;
                case "native":
                    b2 = 4;
                    break;
                case "rewarded":
                    b2 = 2;
                    break;
                case "interstitial":
                    b2 = 1;
                    break;
                case "app_open":
                    b2 = 5;
                    break;
                case "app_open_ad":
                    b2 = 6;
                    break;
                case "rewarded_interstitial":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            AdFormat adFormat = null;
            switch (b2) {
                case 0:
                    adFormat = AdFormat.BANNER;
                    break;
                case 1:
                    adFormat = AdFormat.INTERSTITIAL;
                    break;
                case 2:
                    adFormat = AdFormat.REWARDED;
                    break;
                case 3:
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    adFormat = AdFormat.NATIVE;
                    break;
                case 5:
                    adFormat = AdFormat.APP_OPEN_AD;
                    break;
                case 6:
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzni)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbpwVar.zzb));
            }
        }
        ((Adapter) obj).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbttVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbty(this, zzbtfVar));
                return;
            } catch (Exception e2) {
                zzbsw.zza(iObjectWrapper, e2, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbvn zzH() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbvn.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbvn zzI() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbvn.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtf zzbtfVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) obj;
            zzbts zzbtsVar = new zzbts(this, zzbtfVar, adapter);
            zzV(str, zzmVar, str2);
            zzW(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.zzk;
            zzY(str, zzmVar);
            com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb);
            zzbtsVar.onFailure(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            zzbsw.zza(iObjectWrapper, e2, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbti zzK() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbub(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            androidx.media3.extractor.text.ttml.a.C(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            zzh();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.zzf;
        if (mediationInterstitialAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e2) {
            zzbsw.zza(iObjectWrapper, e2, "adapter.interstitial.showAd");
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting app open ad from adapter.");
            try {
                ((Adapter) obj).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbtz(this, zzbtfVar));
                return;
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                zzbsw.zza(iObjectWrapper, e2, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.zzk;
        if (mediationAppOpenAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e2) {
            zzbsw.zza(iObjectWrapper, e2, "adapter.appOpen.showAd");
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbtk zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbtl zzP() {
        return null;
    }

    public final /* synthetic */ void zzQ(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzg = unifiedNativeAdMapper;
    }

    public final /* synthetic */ void zzR(NativeAdMapper nativeAdMapper) {
        this.zzh = nativeAdMapper;
    }

    public final /* synthetic */ void zzS(MediationRewardedAd mediationRewardedAd) {
        this.zzi = mediationRewardedAd;
    }

    public final /* synthetic */ void zzT(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zzj = mediationInterscrollerAd;
    }

    public final /* synthetic */ void zzU(MediationAppOpenAd mediationAppOpenAd) {
        this.zzk = mediationAppOpenAd;
    }

    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze = view;
    }

    public final /* synthetic */ void zzd(MediationInterstitialAd mediationInterstitialAd) {
        this.zzf = mediationInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        zzj(iObjectWrapper, zzrVar, zzmVar, str, null, zzbtfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final IObjectWrapper zzf() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        androidx.media3.extractor.text.ttml.a.C(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        zzk(iObjectWrapper, zzmVar, str, null, zzbtfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzh() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzi() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtf zzbtfVar) throws RemoteException {
        String str3;
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationBannerAdapter;
        if (!z2 && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            androidx.media3.extractor.text.ttml.a.C(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting banner ad from adapter.");
        AdSize adSizeZzb = zzrVar.zzn ? com.google.android.gms.ads.zzc.zzb(zzrVar.zze, zzrVar.zzb) : com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
        if (!z2) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), adSizeZzb, this.zzl), new zzbtu(this, zzbtfVar));
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                    zzbsw.zza(iObjectWrapper, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            zzbtr zzbtrVar = new zzbtr(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            Bundle bundle = zzmVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            str3 = "";
            try {
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbuc(zzbtfVar), zzV(str, zzmVar, str2), adSizeZzb, zzbtrVar, bundle2);
            } catch (Throwable th2) {
                th = th2;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(str3, th);
                zzbsw.zza(iObjectWrapper, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtf zzbtfVar) throws RemoteException {
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationInterstitialAdapter;
        if (!z2 && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            androidx.media3.extractor.text.ttml.a.C(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interstitial ad from adapter.");
        if (!z2) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl), new zzbtv(this, zzbtfVar));
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                    zzbsw.zza(iObjectWrapper, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            zzbtr zzbtrVar = new zzbtr(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbuc(zzbtfVar), zzV(str, zzmVar, str2), zzbtrVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
            zzbsw.zza(iObjectWrapper, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzl() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzm() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbzx zzbzxVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbzxVar;
            zzbzxVar.zze(ObjectWrapper.wrap(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        zzv(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzp() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } catch (RuntimeException e2) {
                zzbsw.zza(this.zzd, e2, "adapter.showVideo");
                throw e2;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final boolean zzq() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtf zzbtfVar, zzbjn zzbjnVar, List list) throws RemoteException {
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationNativeAdapter;
        if (!z2 && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            androidx.media3.extractor.text.ttml.a.C(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting native ad from adapter.");
        if (z2) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = zzmVar.zze;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j = zzmVar.zzb;
                zzbuf zzbufVar = new zzbuf(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzbjnVar, list, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbuc(zzbtfVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str, zzmVar, str2), zzbufVar, bundle2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                zzbsw.zza(iObjectWrapper, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbjnVar), new zzbtx(this, zzbtfVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                zzbsw.zza(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbjnVar), new zzbtw(this, zzbtfVar));
                } catch (Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th3);
                    zzbsw.zza(iObjectWrapper, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzD(this.zzd, zzmVar, str, new zzbud((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzy(IObjectWrapper iObjectWrapper, zzbzx zzbzxVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbks zzz() {
        zzbkt zzbktVarZze;
        zzbuc zzbucVar = this.zzb;
        if (zzbucVar == null || (zzbktVarZze = zzbucVar.zze()) == null) {
            return null;
        }
        return zzbktVarZze.zza();
    }

    public zzbua(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
