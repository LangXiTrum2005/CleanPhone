package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclf implements zzayl {
    private final Context zza;
    private final zzfzz zzb;

    public zzclf(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdv)).intValue();
        int i2 = 2;
        if (iIntValue != 1) {
            i2 = (iIntValue == 2 || iIntValue != 3) ? 3 : 4;
        }
        zzgau zzgauVarZze = zzgav.zze();
        zzgauVarZze.zza(((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdC)).floatValue());
        zzgav zzgavVar = (zzgav) zzgauVarZze.zzbu();
        zzgaw zzgawVarZzi = zzgax.zzi();
        zzgawVarZzi.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdD)).booleanValue());
        zzgawVarZzi.zzb(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdF)).longValue());
        zzgax zzgaxVar = (zzgax) zzgawVarZzi.zzbu();
        zzgac zzgacVarZzu = zzgad.zzu();
        zzgacVarZzu.zzi(i2);
        zzgacVarZzu.zzb(versionInfoParcel.afmaVersion);
        zzgacVarZzu.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcZ)).booleanValue());
        zzgacVarZzu.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzds)).intValue() == -1);
        zzgacVarZzu.zzg(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdu)).intValue());
        zzgacVarZzu.zze(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdE)).longValue());
        zzgacVarZzu.zzd(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdt)).intValue());
        zzgacVarZzu.zzc(zzgavVar);
        zzgacVarZzu.zzf(zzgaxVar);
        zzfzz zzfzzVarZza = zzfzz.zza(context, zzcdo.zza, (zzgad) zzgacVarZzu.zzbu());
        this.zzb = zzfzzVarZza;
        zzfzzVarZza.zzb();
    }

    public final String zza() {
        int iZzh = this.zzb.zzh() - 1;
        if (iZzh == 1) {
            return "1.0";
        }
        if (iZzh != 2) {
            return iZzh != 3 ? "uns" : "3.0";
        }
        return "2.0";
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    @Deprecated
    public final void zze(int i2, int i3, int i4) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        Context context = this.zza;
        float fZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i3);
        zzfzz zzfzzVar = this.zzb;
        long j = i4;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j, 0, fZzC, fZzC2, 0);
        zzfzzVar.zzg(motionEventObtain);
        motionEventObtain.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j, 2, fZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i3), 0);
        zzfzzVar.zzg(motionEventObtain2);
        motionEventObtain2.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j, 1, fZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i3), 0);
        zzfzzVar.zzg(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
