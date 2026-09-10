package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qv extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo f19214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f19215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f19216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f19217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19219f;

    public qv(mo moVar) {
        Drawable drawable;
        double dZzd;
        int iZze;
        this.f19214a = moVar;
        Uri uriZzc = null;
        try {
            s9.a aVarZzb = moVar.zzb();
            drawable = aVarZzb != null ? (Drawable) s9.b.y1(aVarZzb) : null;
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
        this.f19215b = drawable;
        try {
            uriZzc = this.f19214a.zzc();
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
        }
        this.f19216c = uriZzc;
        try {
            dZzd = this.f19214a.zzd();
        } catch (RemoteException e12) {
            zzo.zzg("", e12);
            dZzd = 1.0d;
        }
        this.f19217d = dZzd;
        int iZzf = -1;
        try {
            iZze = this.f19214a.zze();
        } catch (RemoteException e13) {
            zzo.zzg("", e13);
            iZze = -1;
        }
        this.f19218e = iZze;
        try {
            iZzf = this.f19214a.zzf();
        } catch (RemoteException e14) {
            zzo.zzg("", e14);
        }
        this.f19219f = iZzf;
        if (((Boolean) zzba.zzc().a(am.X4)).booleanValue()) {
            try {
                this.f19214a.zzg();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f19215b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.f19217d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.f19216c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.f19218e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.f19219f;
    }
}
