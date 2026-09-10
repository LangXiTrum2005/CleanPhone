package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcez {
    private final Context zza;
    private final zzcfk zzb;
    private final ViewGroup zzc;
    private final zzdxe zzd;
    private zzcey zze;

    public zzcez(Context context, ViewGroup viewGroup, zzcir zzcirVar, zzdxe zzdxeVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcirVar;
        this.zze = null;
        this.zzd = zzdxeVar;
    }

    public final Integer zza() {
        zzcey zzceyVar = this.zze;
        if (zzceyVar != null) {
            return zzceyVar.zzl();
        }
        return null;
    }

    public final void zzb(int i2, int i3, int i4, int i5) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcey zzceyVar = this.zze;
        if (zzceyVar != null) {
            zzceyVar.zzn(i2, i3, i4, i5);
        }
    }

    public final void zzc(int i2, int i3, int i4, int i5, int i6, boolean z2, zzcfj zzcfjVar) {
        if (this.zze != null) {
            return;
        }
        zzcfk zzcfkVar = this.zzb;
        zzbgr.zza(zzcfkVar.zzq().zzc(), zzcfkVar.zzi(), "vpr2");
        zzcey zzceyVar = new zzcey(this.zza, zzcfkVar, i6, z2, zzcfkVar.zzq().zzc(), zzcfjVar, this.zzd);
        this.zze = zzceyVar;
        this.zzc.addView(zzceyVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i2, i3, i4, i5);
        zzcfkVar.zzdn(false);
    }

    public final zzcey zzd() {
        return this.zze;
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcey zzceyVar = this.zze;
        if (zzceyVar != null) {
            zzceyVar.zzr();
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcey zzceyVar = this.zze;
        if (zzceyVar != null) {
            zzceyVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i2) {
        zzcey zzceyVar = this.zze;
        if (zzceyVar != null) {
            zzceyVar.zzm(i2);
        }
    }
}
