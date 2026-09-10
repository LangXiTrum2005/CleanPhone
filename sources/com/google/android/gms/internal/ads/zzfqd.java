package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.smartdigimkt.o1.b;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqd {
    private final zzdxe zza;

    public zzfqd(zzdxe zzdxeVar, Context context) {
        this.zza = zzdxeVar;
    }

    private final void zzt(String str, long j, String str2, String str3, AdFormat adFormat, int i2, int i3, int i4, String str4) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("action", str);
        zzdxdVarZza.zzc("pat", Long.toString(j));
        zzdxdVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdxdVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxdVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxdVarZza.zzc("pas", Integer.toString(i4));
        zzdxdVarZza.zzc("pv", "2");
        zzdxdVarZza.zzc("ad_unit_id", str3);
        zzdxdVarZza.zzc(b.B0, str2);
        zzdxdVarZza.zzd();
    }

    private final void zzu(String str, String str2, long j, int i2, int i3, String str3, zzfqk zzfqkVar, String str4) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc(str2, Long.toString(j));
        if (zzfqkVar != null) {
            zzdxdVarZza.zzc("ad_unit_id", zzfqkVar.zza());
            zzdxdVarZza.zzc("ad_format", zzfqkVar.zzb());
            zzdxdVarZza.zzc(b.B0, zzfqkVar.zzc());
        }
        zzdxdVarZza.zzc("action", str);
        if (str3 != null) {
            zzdxdVarZza.zzc("gqi", str3);
        }
        if (i2 >= 0) {
            zzdxdVarZza.zzc("max_ads", Integer.toString(i2));
        }
        if (i3 >= 0) {
            zzdxdVarZza.zzc("cache_size", Integer.toString(i3));
        }
        zzdxdVarZza.zzc("pv", str4);
        zzdxdVarZza.zzd();
    }

    private final void zzv(String str, long j, String str2, String str3, AdFormat adFormat, int i2, int i3, int i4, int i5, int i6) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("action", str);
        zzdxdVarZza.zzc("pat", Long.toString(j));
        zzdxdVarZza.zzc(b.B0, str2);
        zzdxdVarZza.zzc("ad_unit_id", str3);
        zzdxdVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxdVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxdVarZza.zzc("tpcnt", Integer.toString(i5));
        zzdxdVarZza.zzc("mpl", Integer.toString(i6));
        if (adFormat != null) {
            zzdxdVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i4 > 0) {
            zzdxdVarZza.zzc("nptr", Integer.toString(i4));
        }
        zzdxdVarZza.zzd();
    }

    public final void zza(int i2, long j, zzfqk zzfqkVar, String str) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("action", "start_preload");
        zzdxdVarZza.zzc("sp_ts", Long.toString(j));
        zzdxdVarZza.zzc("ad_format", zzfqkVar.zzb());
        zzdxdVarZza.zzc("ad_unit_id", zzfqkVar.zza());
        zzdxdVarZza.zzc(b.B0, zzfqkVar.zzc());
        zzdxdVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxdVarZza.zzc("pv", str);
        zzdxdVarZza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("action", "start_preload");
        zzdxdVarZza.zzc("sp_ts", Long.toString(j));
        zzdxdVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdxdVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdxdVarZza.zzd();
    }

    public final void zzc(int i2, int i3, long j, zzfqk zzfqkVar) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("action", "cache_resize");
        zzdxdVarZza.zzc("cs_ts", Long.toString(j));
        zzdxdVarZza.zzc("orig_ma", Integer.toString(i2));
        zzdxdVarZza.zzc("max_ads", Integer.toString(i3));
        zzdxdVarZza.zzc("ad_format", zzfqkVar.zzb());
        zzdxdVarZza.zzc("ad_unit_id", zzfqkVar.zza());
        zzdxdVarZza.zzc(b.B0, zzfqkVar.zzc());
        zzdxdVarZza.zzc("pv", "1");
        zzdxdVarZza.zzd();
    }

    public final void zzd(int i2, int i3, long j, Long l2, String str, zzfqk zzfqkVar, String str2) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("plaac_ts", Long.toString(j));
        zzdxdVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxdVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxdVarZza.zzc("action", "is_ad_available");
        if (zzfqkVar != null) {
            zzdxdVarZza.zzc("ad_unit_id", zzfqkVar.zza());
            zzdxdVarZza.zzc(b.B0, zzfqkVar.zzc());
            zzdxdVarZza.zzc("ad_format", zzfqkVar.zzb());
        }
        if (l2 != null) {
            zzdxdVarZza.zzc("plaay_ts", Long.toString(l2.longValue()));
        }
        if (str != null) {
            zzdxdVarZza.zzc("gqi", str);
        }
        zzdxdVarZza.zzc("pv", str2);
        zzdxdVarZza.zzd();
    }

    public final void zze(long j, String str) {
        zzu("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, zzfqk zzfqkVar, int i2, int i3, String str) {
        zzu("poll_ad", "ppac_ts", j, i2, i3, null, zzfqkVar, str);
    }

    public final void zzg(long j, int i2, int i3, String str, zzfqk zzfqkVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j, i2, i3, str, zzfqkVar, str2);
    }

    public final void zzh(long j, int i2, int i3, String str, zzfqk zzfqkVar, String str2) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("ppla_ts", Long.toString(j));
        zzdxdVarZza.zzc("ad_format", zzfqkVar.zzb());
        zzdxdVarZza.zzc("ad_unit_id", zzfqkVar.zza());
        zzdxdVarZza.zzc(b.B0, zzfqkVar.zzc());
        zzdxdVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxdVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxdVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdxdVarZza.zzc("gqi", str);
        }
        zzdxdVarZza.zzc("pv", str2);
        zzdxdVarZza.zzd();
    }

    public final void zzi(long j, String str, zzfqk zzfqkVar, int i2, int i3, String str2) {
        zzu("paa", "pano_ts", j, i2, i3, str, zzfqkVar, str2);
    }

    public final void zzj(long j, zzfqk zzfqkVar, int i2, String str) {
        zzu("pae", "paeo_ts", j, i2, 0, null, zzfqkVar, str);
    }

    public final void zzk(long j, zzfqk zzfqkVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i2, int i3, String str) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("action", "pftla");
        zzdxdVarZza.zzc("pftlat_ts", Long.toString(j));
        zzdxdVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdxdVarZza.zzc("ad_format", zzfqkVar.zzb());
        zzdxdVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxdVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxdVarZza.zzc("ad_unit_id", zzfqkVar.zza());
        zzdxdVarZza.zzc(b.B0, zzfqkVar.zzc());
        zzdxdVarZza.zzc("pv", str);
        zzdxdVarZza.zzd();
    }

    public final void zzl(long j, AdFormat adFormat, int i2) {
        zzt("pda", j, null, null, adFormat, -1, -1, i2, "2");
    }

    public final void zzm(long j, String str, String str2, AdFormat adFormat, int i2, int i3) {
        zzt("pd", j, str, str2, adFormat, i2, i3, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j, int i2) {
        zzt("pgcs", j, null, null, adFormat, -1, -1, i2, "2");
    }

    public final void zzo(long j, String str, String str2, AdFormat adFormat, int i2, int i3) {
        zzt("pgc", j, str, str2, adFormat, i2, i3, 1, "2");
    }

    public final void zzp(int i2, long j, String str, String str2, AdFormat adFormat, int i3) {
        zzt("pnav", j, str, str2, adFormat, i3, i2, 1, "2");
    }

    public final void zzq(long j, String str, String str2, AdFormat adFormat, int i2, int i3, int i4, int i5) {
        zzv("acmpa", j, str, str2, adFormat, i2, i3, 0, i4, i5);
    }

    public final void zzr(long j, String str, String str2, AdFormat adFormat, int i2, int i3, int i4, int i5, int i6) {
        zzv("acmpr", j, str, str2, adFormat, i2, i3, i4, i5, i6);
    }

    public final void zzs(long j, int i2, int i3) {
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("action", "acmlr");
        zzdxdVarZza.zzc("pat", Long.toString(j));
        zzdxdVarZza.zzc("mpl", Integer.toString(i2));
        zzdxdVarZza.zzc("pas", Integer.toString(i3));
        zzdxdVarZza.zzd();
    }
}
