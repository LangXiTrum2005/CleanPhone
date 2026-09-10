package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.bo;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.zn;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f11336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo f11337b;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.f11336a = c(context);
        this.f11337b = d();
    }

    public final View a(String str) {
        qo qoVar = this.f11337b;
        if (qoVar != null) {
            try {
                a aVarZzc = qoVar.zzc(str);
                if (aVarZzc != null) {
                    return (View) b.y1(aVarZzc);
                }
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f11336a);
    }

    public final void b(View view, String str) {
        qo qoVar = this.f11337b;
        if (qoVar == null) {
            return;
        }
        try {
            qoVar.zzb(str, new b(view));
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setAssetView on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f11336a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final FrameLayout c(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public final qo d() {
        if (isInEditMode()) {
            return null;
        }
        zzaw zzawVarZzb = zzay.zzb();
        FrameLayout frameLayout = this.f11336a;
        return zzawVarZzb.zze(frameLayout.getContext(), this, frameLayout);
    }

    public void destroy() {
        qo qoVar = this.f11337b;
        if (qoVar == null) {
            return;
        }
        try {
            qoVar.zze();
        } catch (RemoteException e10) {
            zzo.zzg("Unable to destroy native ad view", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        qo qoVar = this.f11337b;
        if (qoVar != null) {
            if (((Boolean) zzba.zzc().a(am.f12216jd)).booleanValue()) {
                try {
                    qoVar.zzdD(new b(motionEvent));
                } catch (RemoteException e10) {
                    zzo.zzg("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View viewA = a("3011");
        if (viewA instanceof AdChoicesView) {
            return (AdChoicesView) viewA;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return a("3005");
    }

    @Nullable
    public final View getBodyView() {
        return a("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return a("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return a("3001");
    }

    @Nullable
    public final View getIconView() {
        return a("3003");
    }

    @Nullable
    public final View getImageView() {
        return a("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof MediaView) {
            return (MediaView) viewA;
        }
        if (viewA == null) {
            return null;
        }
        zzo.zzd("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return a("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return a("3009");
    }

    @Nullable
    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        qo qoVar = this.f11337b;
        if (qoVar == null) {
            return;
        }
        try {
            qoVar.zzf(new b(view), i10);
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call onVisibilityChanged on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f11336a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.f11336a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        b(adChoicesView, "3011");
    }

    public final void setAdvertiserView(@Nullable View view) {
        b(view, "3005");
    }

    public final void setBodyView(@Nullable View view) {
        b(view, "3004");
    }

    public final void setCallToActionView(@Nullable View view) {
        b(view, "3002");
    }

    public final void setClickConfirmingView(@Nullable View view) {
        qo qoVar = this.f11337b;
        if (qoVar == null) {
            return;
        }
        try {
            qoVar.zzdB(new b(view));
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        b(view, "3001");
    }

    public final void setIconView(@Nullable View view) {
        b(view, "3003");
    }

    public final void setImageView(@Nullable View view) {
        b(view, "3008");
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        b(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zn() { // from class: com.google.android.gms.ads.nativead.zzb
            @Override // com.google.android.gms.internal.ads.zn
            public final /* synthetic */ void zza(MediaContent mediaContent) {
                qo qoVar = this.f11339a.f11337b;
                if (qoVar == null) {
                    return;
                }
                try {
                    if (mediaContent instanceof zzfb) {
                        qoVar.zzdE(((zzfb) mediaContent).zzc());
                    } else if (mediaContent == null) {
                        qoVar.zzdE(null);
                    } else {
                        zzo.zzd("Use MediaContent provided by NativeAd.getMediaContent");
                    }
                } catch (RemoteException e10) {
                    zzo.zzg("Unable to call setMediaContent on delegate", e10);
                }
            }
        });
        mediaView.zzb(new bo() { // from class: com.google.android.gms.ads.nativead.zza
            @Override // com.google.android.gms.internal.ads.bo
            public final void zza(ImageView.ScaleType scaleType) {
                qo qoVar = this.f11338a.f11337b;
                if (qoVar == null || scaleType == null) {
                    return;
                }
                try {
                    qoVar.zzdC(new b(scaleType));
                } catch (RemoteException e10) {
                    zzo.zzg("Unable to call setMediaViewImageScaleType on delegate", e10);
                }
            }
        });
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        qo qoVar = this.f11337b;
        if (qoVar == null) {
            return;
        }
        try {
            qoVar.zzd(nativeAd.a());
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setNativeAd on delegate", e10);
        }
    }

    public final void setPriceView(@Nullable View view) {
        b(view, "3007");
    }

    public final void setStarRatingView(@Nullable View view) {
        b(view, "3009");
    }

    public final void setStoreView(@Nullable View view) {
        b(view, "3006");
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11336a = c(context);
        this.f11337b = d();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11336a = c(context);
        this.f11337b = d();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f11336a = c(context);
        this.f11337b = d();
    }
}
