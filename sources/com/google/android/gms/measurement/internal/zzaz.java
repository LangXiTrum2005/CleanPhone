package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.p004ironsource.d9;
import com.vungle.ads.internal.protos.Sdk;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaz {
    public static final zzaz zza = new zzaz((Boolean) null, 100, (Boolean) null, (String) null);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap zzf;

    public zzaz(Boolean bool, int i2, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.zzf = enumMap;
        enumMap.put(zzjk.AD_USER_DATA, zzjl.zzh(bool));
        this.zzb = i2;
        this.zzc = zzl();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzaz zza(zzji zzjiVar, int i2) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        enumMap.put(zzjk.AD_USER_DATA, zzjiVar);
        return new zzaz(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzaz zzg(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] strArrSplit = str.split(":");
        int i2 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrZza = zzjj.DMA.zza();
        int length = zzjkVarArrZza.length;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length) {
            enumMap.put(zzjkVarArrZza[i4], zzjl.zzj(strArrSplit[i3].charAt(0)));
            i4++;
            i3++;
        }
        return new zzaz(enumMap, i2, (Boolean) null, (String) null);
    }

    public static zzaz zzh(Bundle bundle, int i2) {
        if (bundle == null) {
            return new zzaz((Boolean) null, i2, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            enumMap.put(zzjkVar, zzjl.zzg(bundle.getString(zzjkVar.zze)));
        }
        return new zzaz(enumMap, i2, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean zzi(Bundle bundle) {
        zzji zzjiVarZzg;
        if (bundle == null || (zzjiVarZzg = zzjl.zzg(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjiVarZzg.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String zzl() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb.append(":");
            sb.append(zzjl.zzm((zzji) this.zzf.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaz)) {
            return false;
        }
        zzaz zzazVar = (zzaz) obj;
        if (this.zzc.equalsIgnoreCase(zzazVar.zzc) && Objects.equals(this.zzd, zzazVar.zzd)) {
            return Objects.equals(this.zze, zzazVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        Boolean bool = this.zzd;
        if (bool == null) {
            i2 = 3;
        } else {
            i2 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.zze;
        return ((str == null ? 17 : str.hashCode()) * Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE) + this.zzc.hashCode() + (i2 * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzjl.zzd(this.zzb));
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb.append(",");
            sb.append(zzjkVar.zze);
            sb.append(d9.i.f24747b);
            zzji zzjiVar = (zzji) this.zzf.get(zzjkVar);
            if (zzjiVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = zzjiVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.zze;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzji zzc() {
        zzji zzjiVar = (zzji) this.zzf.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final boolean zzd() {
        Iterator it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String zze() {
        return this.zzc;
    }

    public final Bundle zzf() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzf.entrySet()) {
            String strZzi = zzjl.zzi((zzji) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjk) entry.getKey()).zze, strZzi);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final Boolean zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }

    private zzaz(EnumMap enumMap, int i2, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i2;
        this.zzc = zzl();
        this.zzd = bool;
        this.zze = str;
    }
}
