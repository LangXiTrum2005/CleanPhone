package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebh extends com.google.android.gms.ads.internal.client.zzdv {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzeav zzd;
    private final zzgyw zze;
    private zzeak zzf;

    public zzebh(Context context, WeakReference weakReference, zzeav zzeavVar, zzebj zzebjVar, zzgyw zzgywVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzeavVar;
        this.zze = zzgywVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgym.zzr(this.zzf.zzn(str), new zzebc(this), this.zze);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgym.zzr(this.zzf.zzn(str), new zzebd(this), this.zze);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzeaVarZzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzeaVarZzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzeak zzeakVar) {
        this.zzf = zzeakVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzc(zzebi zzebiVar) {
        byte b2;
        try {
            String strZzb = zzebiVar.zzb();
            switch (strZzb.hashCode()) {
                case -1999289321:
                    if (!strZzb.equals("NATIVE")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case -1372958932:
                    if (!strZzb.equals("INTERSTITIAL")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case -428325382:
                    if (!strZzb.equals("APP_OPEN_AD")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 543046670:
                    if (!strZzb.equals("REWARDED")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 1854800829:
                    if (!strZzb.equals("REWARDED_INTERSTITIAL")) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case 1951953708:
                    if (!strZzb.equals("BANNER")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                String strZza = zzebiVar.zza();
                AppOpenAd.load(zzl(), strZza, zzebiVar.zzc(), new zzeaw(this, strZza));
                return;
            }
            if (b2 == 1) {
                String strZza2 = zzebiVar.zza();
                zzbgb zzbgbVar = zzbgk.zzkL;
                BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() && zzebiVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
                adManagerAdView.setAdSize(zzebiVar.zzd());
                adManagerAdView.setAdUnitId(strZza2);
                adManagerAdView.setAdListener(new zzeax(this, strZza2, adManagerAdView));
                VideoOptions videoOptionsZzf = zzebiVar.zzf();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() && zzebiVar.zzg() && videoOptionsZzf != null) {
                    ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptionsZzf);
                }
                adManagerAdView.loadAd(zzebiVar.zzc());
                return;
            }
            if (b2 == 2) {
                String strZza3 = zzebiVar.zza();
                InterstitialAd.load(zzl(), strZza3, zzebiVar.zzc(), new zzeay(this, strZza3));
                return;
            }
            if (b2 != 3) {
                if (b2 == 4) {
                    String strZza4 = zzebiVar.zza();
                    RewardedAd.load(zzl(), strZza4, zzebiVar.zzc(), new zzeaz(this, strZza4));
                    return;
                } else {
                    if (b2 != 5) {
                        return;
                    }
                    String strZza5 = zzebiVar.zza();
                    RewardedInterstitialAd.load(zzl(), strZza5, zzebiVar.zzc(), new zzeba(this, strZza5));
                    return;
                }
            }
            final String strZza6 = zzebiVar.zza();
            AdLoader.Builder builder = new AdLoader.Builder(zzl(), strZza6);
            builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzebf
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                    this.zza.zzf(strZza6, nativeAd);
                }
            });
            builder.withAdListener(new zzebb(this));
            NativeAdOptions nativeAdOptionsZze = zzebiVar.zze();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkL)).booleanValue() && nativeAdOptionsZze != null) {
                builder.withNativeAdOptions(nativeAdOptionsZze);
            }
            builder.build().loadAd(zzebiVar.zzc());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        try {
            Activity activityZzo = this.zzd.zzo();
            if (activityZzo != null && (obj = (map = this.zza).get(str)) != null) {
                zzbgb zzbgbVar = zzbgk.zzkK;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                    map.remove(str);
                }
                zzk(zzm(obj));
                if (obj instanceof AppOpenAd) {
                    ((AppOpenAd) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof InterstitialAd) {
                    ((InterstitialAd) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof RewardedAd) {
                    ((RewardedAd) obj).show(activityZzo, zzebg.zza);
                    return;
                }
                if (obj instanceof RewardedInterstitialAd) {
                    ((RewardedInterstitialAd) obj).show(activityZzo, zzebe.zza);
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzl = zzl();
                    intent.setClassName(contextZzl, OutOfContextTestingActivity.CLASS_NAME);
                    intent.putExtra("adUnit", str);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzaa(contextZzl, intent);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzebj.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzebj.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    public final /* synthetic */ zzeav zzi() {
        return this.zzd;
    }
}
