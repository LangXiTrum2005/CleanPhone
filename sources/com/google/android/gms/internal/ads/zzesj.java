package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.Insets;
import com.google.android.gms.common.internal.Preconditions;
import com.smartdigimkt.o1.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesj implements zzezv {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final int zzi;
    public final boolean zzj;
    public final Insets zzk;
    public final zzesg zzl;

    public zzesj(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z2, String str2, float f, int i2, int i3, String str3, int i4, boolean z3, Insets insets, zzesg zzesgVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z2;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = str3;
        this.zzi = i4;
        this.zzj = z3;
        this.zzk = insets;
        this.zzl = zzesgVar;
    }

    private final void zzc(Bundle bundle) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        int i2 = zzrVar.zze;
        zzfiz.zzb(bundle, "smart_w", b.x0, i2 == -1);
        int i3 = zzrVar.zzb;
        zzfiz.zzb(bundle, "smart_h", "auto", i3 == -2);
        zzfiz.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfiz.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzfiz.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzfiz.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzfiz.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfiz.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfiz.zze(bundle, "format", this.zzb);
        zzfiz.zzb(bundle, "fluid", "height", this.zzc);
        String str = this.zzd;
        zzfiz.zzb(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzfiz.zzb(bundle, b.I1, str2, true ^ TextUtils.isEmpty(str2));
        int i4 = this.zzi;
        if (i4 != -1) {
            bundle.putInt("u_mso", i4);
        }
        Insets insets = this.zzk;
        if (insets != null) {
            bundle.putInt("sam_t", insets.f4298b);
            bundle.putInt("sam_b", insets.d);
            bundle.putInt("sam_l", insets.f4297a);
            bundle.putInt("sam_r", insets.f4299c);
        }
        zzesg zzesgVar = this.zzl;
        if (zzesgVar != null) {
            bundle.putInt("rc_tl", zzesgVar.zza);
            bundle.putInt("rc_tr", zzesgVar.zzb);
            bundle.putInt("rc_bl", zzesgVar.zzc);
            bundle.putInt("rc_br", zzesgVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i3);
            bundle2.putInt("width", i2);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzczm) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzczm) obj).zzb);
    }
}
