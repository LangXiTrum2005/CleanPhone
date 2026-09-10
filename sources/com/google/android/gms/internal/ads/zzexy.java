package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.p004ironsource.d9;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexy implements zzezv {
    private final zzfik zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzexy(zzfik zzfikVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfikVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i2;
        zzbjn zzbjnVar = this.zza.zzj;
        if (zzbjnVar == null || (i2 = zzbjnVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbjnVar.zzj);
        bundle.putInt("sccg_dir", i2);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        zzfik zzfikVar = this.zza;
        ArrayList<String> arrayList = zzfikVar.zzh;
        zzczm zzczmVar = (zzczm) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzczmVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzczmVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfikVar.zzi);
        zzbjn zzbjnVar = zzfikVar.zzj;
        if (zzbjnVar != null) {
            String str2 = "any";
            if (zzbjnVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i2 = zzbjnVar.zzh;
                if (i2 == 1) {
                    str = "any";
                } else if (i2 == 2) {
                    str = d9.h.C;
                } else if (i2 != 3) {
                    str = i2 != 4 ? "unknown" : "square";
                } else {
                    str = d9.h.D;
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i3 = zzbjnVar.zzc;
            if (i3 != 0) {
                if (i3 != 1) {
                    str2 = i3 != 2 ? "unknown" : d9.h.C;
                } else {
                    str2 = d9.h.D;
                }
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzbjnVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbjnVar.zzg);
            zzc(bundle);
        }
        PackageInfo packageInfo = this.zzb;
        int i4 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i4 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i4);
        }
        JSONObject jSONObjectZzs = zzgVar.zzs();
        String string = null;
        if (jSONObjectZzs != null && (jSONArrayOptJSONArray = jSONObjectZzs.optJSONArray(zzfikVar.zzg)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i5 = zzfikVar.zzl;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        zzbpy zzbpyVar = zzfikVar.zzb;
        if (zzbpyVar != null) {
            String str3 = zzbpyVar.zzc;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (zzbpyVar.zza >= 2) {
                    int i6 = zzbpyVar.zzd;
                    if (i6 == 2 || i6 != 3) {
                        str4 = "l";
                    }
                } else {
                    int i7 = zzbpyVar.zzb;
                    if (i7 == 1) {
                        str4 = "l";
                    } else if (i7 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 41);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i7);
                        sb.append(" is wrong.");
                        com.google.android.gms.ads.internal.util.client.zzo.zzf(sb.toString());
                        str4 = "l";
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznj)).booleanValue() || zzbjnVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbjnVar.zzf;
        if (zzgaVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzgaVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzgaVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzgaVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbjnVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbjnVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzczm zzczmVar = (zzczm) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzczmVar.zzb);
    }
}
