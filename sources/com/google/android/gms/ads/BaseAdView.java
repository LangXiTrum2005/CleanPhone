package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.zw;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzek f10646a;

    public BaseAdView(Context context) {
        super(context);
        this.f10646a = new zzek(this, 0);
    }

    public void destroy() {
        am.a(getContext());
        if (((Boolean) dn.f13593e.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Lc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = this.f11592a;
                        try {
                            baseAdView.f10646a.zza();
                        } catch (IllegalStateException e10) {
                            zw.c(baseAdView.getContext()).a("BaseAdView.destroy", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f10646a.zza();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.f10646a.zzb();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.f10646a.zzc();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f10646a.zze();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.f10646a.zzx();
    }

    public long getPlacementId() {
        return this.f10646a.zzv();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.f10646a.zzt();
    }

    public boolean isCollapsible() {
        return this.f10646a.zzr();
    }

    public boolean isLoading() {
        return this.f10646a.zzs();
    }

    public void loadAd(@NonNull final AdRequest adRequest) {
        c0.d("#008 Must be called on the main UI thread.");
        am.a(getContext());
        if (((Boolean) dn.f13594f.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        BaseAdView baseAdView = this.f11588a;
                        try {
                            baseAdView.f10646a.zzg(adRequest2.f10629a);
                        } catch (IllegalStateException e10) {
                            zw.c(baseAdView.getContext()).a("BaseAdView.loadAd", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f10646a.zzg(adRequest.f10629a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e10) {
                zzo.zzg("Unable to retrieve ad size.", e10);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i11));
    }

    public void pause() {
        am.a(getContext());
        if (((Boolean) dn.f13595g.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Mc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = this.f11590a;
                        try {
                            baseAdView.f10646a.zzh();
                        } catch (IllegalStateException e10) {
                            zw.c(baseAdView.getContext()).a("BaseAdView.pause", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f10646a.zzh();
    }

    public void resume() {
        am.a(getContext());
        if (((Boolean) dn.f13596h.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Kc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = this.f11591a;
                        try {
                            baseAdView.f10646a.zzj();
                        } catch (IllegalStateException e10) {
                            zw.c(baseAdView.getContext()).a("BaseAdView.resume", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f10646a.zzj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@NonNull AdListener adListener) {
        zzek zzekVar = this.f10646a;
        zzekVar.zzk(adListener);
        if (adListener == 0) {
            zzekVar.zzl(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzekVar.zzl((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzekVar.zzp((AppEventListener) adListener);
        }
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.f10646a.zzm(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.f10646a.zzo(str);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.f10646a.zzu(onPaidEventListener);
    }

    public void setPlacementId(long j10) {
        this.f10646a.zzw(j10);
    }

    public BaseAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10646a = new zzek(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f10646a = new zzek(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10, Object obj) {
        super(context, attributeSet, i10);
        this.f10646a = new zzek(this, attributeSet, true, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f10646a = new zzek(this, attributeSet, true);
    }
}
