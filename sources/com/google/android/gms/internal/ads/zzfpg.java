package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzfpg implements zzgyj {
    final /* synthetic */ zzfne zza;
    final /* synthetic */ zzfno zzb;
    final /* synthetic */ zzdcz zzc;
    final /* synthetic */ zzfpi zzd;

    public zzfpg(zzfpi zzfpiVar, zzfne zzfneVar, zzfno zzfnoVar, zzdcz zzdczVar) {
        this.zza = zzfneVar;
        this.zzb = zzfnoVar;
        this.zzc = zzdczVar;
        Objects.requireNonNull(zzfpiVar);
        this.zzd = zzfpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfne zzfneVar = this.zza;
        if (zzfneVar == null) {
            return;
        }
        zzfneVar.zzd(false);
        zzfno zzfnoVar = this.zzb;
        if (zzfnoVar != null) {
            zzfnoVar.zza(zzfneVar);
            zzfnoVar.zzh();
        } else {
            zzfpi zzfpiVar = this.zzd;
            zzfpiVar.zze().zzb(zzfneVar.zzm());
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        byte b2;
        int i2;
        int i3;
        zzfne zzfneVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfneVar != null) {
            zzfneVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfno zzfnoVar = this.zzb;
            if (zzfnoVar == null) {
                this.zzd.zze().zzb(zzfneVar.zzm());
            } else {
                zzfnoVar.zza(zzfneVar);
                zzfnoVar.zzh();
            }
        }
        zzdcz zzdczVar = this.zzc;
        if (zzdczVar != null) {
            String strZzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(strZzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strZzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString("precision");
                String strOptString3 = jSONObject.optString("currency");
                long jOptLong = jSONObject.optLong("value", 0L);
                int iHashCode = strOptString.hashCode();
                byte b3 = -1;
                if (iHashCode != 66934) {
                    if (iHashCode != 66944) {
                        if (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (strOptString.equals("CPM")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (strOptString.equals("CPC")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    i2 = 1;
                } else if (b2 == 1) {
                    i2 = 2;
                } else if (b2 != 2) {
                    i2 = 0;
                } else {
                    jOptLong /= 1000;
                    i2 = 3;
                }
                int iHashCode2 = strOptString2.hashCode();
                if (iHashCode2 != -2131980260) {
                    if (iHashCode2 != 399232571) {
                        if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                            b3 = 1;
                        }
                    } else if (strOptString2.equals("PRECISE")) {
                        b3 = 2;
                    }
                } else if (strOptString2.equals("ESTIMATED")) {
                    b3 = 0;
                }
                if (b3 == 0) {
                    i3 = 1;
                } else if (b3 != 1) {
                    i3 = b3 != 2 ? 0 : 3;
                } else {
                    i3 = 2;
                }
                zzdczVar.zza(new com.google.android.gms.ads.internal.client.zzt(i2, i3, strOptString3, jOptLong));
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "UrlPinger.pingUrl");
            }
        }
    }
}
