package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.bq;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.dq;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.sv;
import com.google.android.gms.internal.ads.tv;
import com.google.android.gms.internal.ads.uv;
import com.google.android.gms.internal.ads.vu0;
import com.google.android.gms.internal.ads.wv;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzq f10624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbn f10626c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f10627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zzbq f10628b;

        public Builder(@NonNull Context context, @NonNull String str) {
            c0.i(context, "context cannot be null");
            zzbq zzbqVarZzc = zzay.zzb().zzc(context, str, new qt());
            this.f10627a = context;
            this.f10628b = zzbqVarZzc;
        }

        @NonNull
        public AdLoader build() {
            Context context = this.f10627a;
            try {
                return new AdLoader(context, this.f10628b.zze(), zzq.zza);
            } catch (RemoteException e10) {
                zzo.zzg("Failed to build AdLoader.", e10);
                return new AdLoader(context, new zzff().zzb(), zzq.zza);
            }
        }

        @NonNull
        public Builder forAdManagerAdView(@NonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @NonNull AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f10628b.zzk(new cq(onAdManagerAdViewLoadedListener), new zzr(this.f10627a, adSizeArr));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add Google Ad Manager banner ad listener", e10);
                return this;
            }
        }

        @NonNull
        public Builder forCustomFormatAd(@NonNull String str, @NonNull NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            uv uvVar = new uv(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.f10628b.zzi(str, new tv(uvVar), onCustomClickListener == null ? null : new sv(uvVar));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add custom format ad listener", e10);
                return this;
            }
        }

        @NonNull
        public Builder forNativeAd(@NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.f10628b.zzm(new wv(onNativeAdLoadedListener));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add google native ad listener", e10);
                return this;
            }
        }

        @NonNull
        public Builder withAdListener(@NonNull AdListener adListener) {
            try {
                this.f10628b.zzf(new com.google.android.gms.ads.internal.client.zzg(adListener));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to set AdListener.", e10);
                return this;
            }
        }

        @NonNull
        public Builder withAdManagerAdViewOptions(@NonNull AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.f10628b.zzp(adManagerAdViewOptions);
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to specify Ad Manager banner ad options", e10);
                return this;
            }
        }

        @NonNull
        public Builder withNativeAdOptions(@NonNull NativeAdOptions nativeAdOptions) {
            try {
                this.f10628b.zzj(new eo(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zzb(), nativeAdOptions.zzc(), nativeAdOptions.zzd() - 1));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to specify native ad options", e10);
                return this;
            }
        }

        @Deprecated
        public final Builder zza(com.google.android.gms.ads.formats.zzg zzgVar) {
            try {
                this.f10628b.zzm(new dq(zzgVar));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add google native ad listener", e10);
                return this;
            }
        }

        @Deprecated
        public final Builder zzb(String str, com.google.android.gms.ads.formats.zze zzeVar, @Nullable com.google.android.gms.ads.formats.zzd zzdVar) {
            vu0 vu0Var = new vu0(6, zzeVar, zzdVar);
            try {
                this.f10628b.zzi(str, new bq(vu0Var), zzdVar == null ? null : new aq(vu0Var));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add custom template ad listener", e10);
                return this;
            }
        }

        @NonNull
        @Deprecated
        public final Builder zzc(@NonNull com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.f10628b.zzj(new eo(nativeAdOptions));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to specify native ad options", e10);
                return this;
            }
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzq zzqVar) {
        this.f10625b = context;
        this.f10626c = zzbnVar;
        this.f10624a = zzqVar;
    }

    public final void a(final zzeh zzehVar) {
        Context context = this.f10625b;
        am.a(context);
        if (((Boolean) dn.f13591c.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzeh zzehVar2 = zzehVar;
                        AdLoader adLoader = this.f11585a;
                        adLoader.getClass();
                        try {
                            adLoader.f10626c.zze(adLoader.f10624a.zza(adLoader.f10625b, zzehVar2));
                        } catch (RemoteException e10) {
                            zzo.zzg("Failed to load ad.", e10);
                        }
                    }
                });
                return;
            }
        }
        try {
            this.f10626c.zze(this.f10624a.zza(context, zzehVar));
        } catch (RemoteException e10) {
            zzo.zzg("Failed to load ad.", e10);
        }
    }

    public boolean isLoading() {
        try {
            return this.f10626c.zzg();
        } catch (RemoteException e10) {
            zzo.zzj("Failed to check if ad is loading.", e10);
            return false;
        }
    }

    public void loadAd(@NonNull AdRequest adRequest) {
        a(adRequest.f10629a);
    }

    public void loadAds(@NonNull AdRequest adRequest, int i10) {
        try {
            this.f10626c.zzi(this.f10624a.zza(this.f10625b, adRequest.f10629a), i10);
        } catch (RemoteException e10) {
            zzo.zzg("Failed to load ads.", e10);
        }
    }

    public void loadAd(@NonNull AdManagerAdRequest adManagerAdRequest) {
        a(adManagerAdRequest.f10629a);
    }
}
