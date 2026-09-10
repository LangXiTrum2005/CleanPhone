package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.ko;
import com.unity3d.services.UnityAdsConstants;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfb implements MediaContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko f10866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoController f10867b = new VideoController();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ap f10868c;

    public zzfb(ko koVar, @Nullable ap apVar) {
        this.f10866a = koVar;
        this.f10868c = apVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.f10866a.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.f10866a.zzi();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.f10866a.zzh();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @Nullable
    public final Drawable getMainImage() {
        try {
            a aVarZzg = this.f10866a.zzg();
            if (aVarZzg != null) {
                return (Drawable) b.y1(aVarZzg);
            }
            return null;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        VideoController videoController = this.f10867b;
        try {
            ko koVar = this.f10866a;
            if (koVar.zzj() != null) {
                videoController.zza(koVar.zzj());
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception occurred while getting video controller", e10);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.f10866a.zzk();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(@Nullable Drawable drawable) {
        try {
            this.f10866a.zzf(new b(drawable));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zza() {
        try {
            return this.f10866a.zzl();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @Nullable
    public final ap zzb() {
        return this.f10868c;
    }

    public final ko zzc() {
        return this.f10866a;
    }
}
