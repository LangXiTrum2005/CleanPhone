package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsm extends NativeAd.Image {
    private final zzbfw zza;

    @Nullable
    private final Drawable zzb;

    @Nullable
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbsm(zzbfw zzbfwVar) {
        Drawable drawable;
        double dZzb;
        int iZzd;
        this.zza = zzbfwVar;
        Uri uriZze = null;
        try {
            IObjectWrapper iObjectWrapperZzf = zzbfwVar.zzf();
            drawable = iObjectWrapperZzf != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzf) : null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        this.zzb = drawable;
        try {
            uriZze = this.zza.zze();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
        this.zzc = uriZze;
        try {
            dZzb = this.zza.zzb();
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e3);
            dZzb = 1.0d;
        }
        this.zzd = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.zza.zzd();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
            iZzd = -1;
        }
        this.zze = iZzd;
        try {
            iZzc = this.zza.zzc();
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e5);
        }
        this.zzf = iZzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zze;
    }
}
