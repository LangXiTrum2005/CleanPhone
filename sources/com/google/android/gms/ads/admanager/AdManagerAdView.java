package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.zw;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@NonNull Context context) {
        super(context);
        c0.i(context, "Context cannot be null");
    }

    @Nullable
    public AdSize[] getAdSizes() {
        return this.f10646a.zzd();
    }

    @Nullable
    public AppEventListener getAppEventListener() {
        return this.f10646a.zzf();
    }

    @NonNull
    public VideoController getVideoController() {
        return this.f10646a.zzy();
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.f10646a.zzB();
    }

    public void loadAd(@NonNull final AdManagerAdRequest adManagerAdRequest) {
        c0.d("#008 Must be called on the main UI thread.");
        am.a(getContext());
        if (((Boolean) dn.f13594f.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        AdManagerAdView adManagerAdView = this.f10678a;
                        adManagerAdView.getClass();
                        try {
                            adManagerAdView.f10646a.zzg(adManagerAdRequest2.zza());
                        } catch (IllegalStateException e10) {
                            zw.c(adManagerAdView.getContext()).a("AdManagerAdView.loadAd", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f10646a.zzg(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.f10646a.zzi();
    }

    public void setAdSizes(@NonNull AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f10646a.zzn(adSizeArr);
    }

    public void setAppEventListener(@Nullable AppEventListener appEventListener) {
        this.f10646a.zzp(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.f10646a.zzq(z10);
    }

    public void setVideoOptions(@NonNull VideoOptions videoOptions) {
        this.f10646a.zzA(videoOptions);
    }

    public final boolean zza(zzbu zzbuVar) {
        return this.f10646a.zzC(zzbuVar);
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c0.i(context, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, (Object) null);
        c0.i(context, "Context cannot be null");
    }
}
