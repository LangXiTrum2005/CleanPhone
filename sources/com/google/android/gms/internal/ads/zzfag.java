package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.o1.b;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzfag implements zzezv {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final String zzh;

    @Nullable
    public final String zzi;
    public final ArrayList zzj;

    @Nullable
    public final String zzk;

    @Nullable
    public final String zzl;
    public final String zzm;
    public final boolean zzn;
    public final String zzo;
    public final long zzp;
    public final boolean zzq;

    @Nullable
    public final String zzr;
    public final int zzs;

    @Nullable
    public final String zzt;

    public zzfag(boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z7, String str6, long j, boolean z8, @Nullable String str7, int i2, String str8, @Nullable String str9, @Nullable String str10) {
        this.zza = z2;
        this.zzb = z3;
        this.zzc = str;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
        this.zzg = str2;
        this.zzh = str8;
        this.zzj = arrayList;
        this.zzk = str3;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = z7;
        this.zzo = str6;
        this.zzp = j;
        this.zzq = z8;
        this.zzr = str7;
        this.zzs = i2;
        this.zzt = str10;
        this.zzi = str9;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0072  */
    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str;
        Bundle bundle = ((zzczm) obj).zza;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzs);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmt)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString(b.O, this.zzg);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoO)).booleanValue()) {
            bundle.putString("dlc", this.zzh);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoP)).booleanValue()) {
            bundle.putString("dlc", this.zzh);
        }
        ArrayList<String> arrayList = this.zzj;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.zzi;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.zzk);
        bundle.putString("submodel", this.zzo);
        Bundle bundleZza = zzfiz.zza(bundle, d9.h.G);
        bundle.putBundle(d9.h.G, bundleZza);
        bundleZza.putString("build", this.zzm);
        bundleZza.putLong("remaining_data_partition_space", this.zzp);
        Bundle bundleZza2 = zzfiz.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzn);
        String str3 = this.zzl;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleZza3 = zzfiz.zza(bundleZza, "play_store");
            bundleZza.putBundle("play_store", bundleZza3);
            bundleZza3.putString("package_version", str3);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmJ)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzq);
        }
        String str4 = this.zzr;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmD)).booleanValue()) {
            zzfiz.zzd(bundle, "gotmt_l", true, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmA)).booleanValue());
            zzfiz.zzd(bundle, "gotmt_i", true, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmz)).booleanValue());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpE)).booleanValue() || (str = this.zzt) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzczm) obj).zzb;
        bundle.putBoolean("simulator", this.zzd);
        bundle.putInt("build_api_level", this.zzs);
        ArrayList<String> arrayList = this.zzj;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", this.zzo);
    }
}
