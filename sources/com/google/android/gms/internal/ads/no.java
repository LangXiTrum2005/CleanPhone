package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class no extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo f17870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f17871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f17872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f17873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17875f;

    public no(mo moVar) {
        Drawable drawable;
        double dZzd;
        int iZze;
        this.f17870a = moVar;
        Uri uriZzc = null;
        try {
            s9.a aVarZzb = moVar.zzb();
            drawable = aVarZzb != null ? (Drawable) s9.b.y1(aVarZzb) : null;
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
        this.f17871b = drawable;
        try {
            uriZzc = this.f17870a.zzc();
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
        }
        this.f17872c = uriZzc;
        try {
            dZzd = this.f17870a.zzd();
        } catch (RemoteException e12) {
            zzo.zzg("", e12);
            dZzd = 1.0d;
        }
        this.f17873d = dZzd;
        int iZzf = -1;
        try {
            iZze = this.f17870a.zze();
        } catch (RemoteException e13) {
            zzo.zzg("", e13);
            iZze = -1;
        }
        this.f17874e = iZze;
        try {
            iZzf = this.f17870a.zzf();
        } catch (RemoteException e14) {
            zzo.zzg("", e14);
        }
        this.f17875f = iZzf;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f17871b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f17873d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f17872c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f17874e;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f17875f;
    }
}
