package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzdrx implements zzbjl {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdry zzb;

    public zzdrx(zzdry zzdryVar, String str) {
        Objects.requireNonNull(zzdryVar);
        this.zzb = zzdryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza() {
        zzdry zzdryVar = this.zzb;
        if (zzdryVar.zzc() != null) {
            zzdryVar.zzc().zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final JSONObject zzd() {
        return null;
    }
}
