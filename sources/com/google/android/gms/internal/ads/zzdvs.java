package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdvs extends com.google.android.gms.ads.internal.client.zzdt {

    @VisibleForTesting
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdvg zzd;
    private final zzgcs zze;
    private zzduv zzf;

    public zzdvs(Context context, WeakReference weakReference, zzdvg zzdvgVar, zzdvt zzdvtVar, zzgcs zzgcsVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvgVar;
        this.zze = zzgcsVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static AdRequest zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzc;
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
        if (responseInfo == null || (zzdyVarZzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzdyVarZzc.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgch.zzr(this.zzf.zzb(str), new zzdvq(this, str2), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgch.zzr(this.zzf.zzb(str), new zzdvr(this, str2), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof AdView) {
            zzdvt.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdvt.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzduv zzduvVar) {
        this.zzf = zzduvVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzh(final String str, String str2, final String str3) {
        byte b;
        try {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (!str2.equals("NATIVE")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1372958932:
                    if (!str2.equals("INTERSTITIAL")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -428325382:
                    if (!str2.equals("APP_OPEN_AD")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 543046670:
                    if (!str2.equals("REWARDED")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 1854800829:
                    if (!str2.equals("REWARDED_INTERSTITIAL")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1951953708:
                    if (!str2.equals("BANNER")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                AppOpenAd.load(zzj(), str, zzk(), 1, new zzdvk(this, str, str3));
                return;
            }
            if (b == 1) {
                AdView adView = new AdView(zzj());
                adView.setAdSize(AdSize.BANNER);
                adView.setAdUnitId(str);
                adView.setAdListener(new zzdvl(this, str, adView, str3));
                adView.loadAd(zzk());
                return;
            }
            if (b == 2) {
                InterstitialAd.load(zzj(), str, zzk(), new zzdvm(this, str, str3));
                return;
            }
            if (b == 3) {
                AdLoader.Builder builder = new AdLoader.Builder(zzj(), str);
                builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdvh
                    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                    public final void onNativeAdLoaded(NativeAd nativeAd) {
                        this.zza.zzg(str, nativeAd, str3);
                    }
                });
                builder.withAdListener(new zzdvp(this, str3));
                builder.build().loadAd(zzk());
                return;
            }
            if (b == 4) {
                RewardedAd.load(zzj(), str, zzk(), new zzdvn(this, str, str3));
            } else {
                if (b != 5) {
                    return;
                }
                RewardedInterstitialAd.load(zzj(), str, zzk(), new zzdvo(this, str, str3));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzi(String str, String str2) {
        Object obj;
        try {
            Activity activityZzg = this.zzd.zzg();
            if (activityZzg != null && (obj = this.zza.get(str)) != null) {
                zzbcc zzbccVar = zzbcl.zzjm;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                    this.zza.remove(str);
                }
                zzn(zzl(obj), str2);
                if (obj instanceof AppOpenAd) {
                    ((AppOpenAd) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof InterstitialAd) {
                    ((InterstitialAd) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof RewardedAd) {
                    ((RewardedAd) obj).show(activityZzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvi
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public final void onUserEarnedReward(RewardItem rewardItem) {
                        }
                    });
                    return;
                }
                if (obj instanceof RewardedInterstitialAd) {
                    ((RewardedInterstitialAd) obj).show(activityZzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvj
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public final void onUserEarnedReward(RewardItem rewardItem) {
                        }
                    });
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzj = zzj();
                    intent.setClassName(contextZzj, OutOfContextTestingActivity.CLASS_NAME);
                    intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                    com.google.android.gms.ads.internal.zzv.zzq();
                    com.google.android.gms.ads.internal.util.zzs.zzT(contextZzj, intent);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
