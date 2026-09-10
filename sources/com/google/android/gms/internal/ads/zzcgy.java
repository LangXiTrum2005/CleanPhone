package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcgy implements zzbnn {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgx zzchaVar;
        int i2;
        zzcfk zzcfkVar = (zzcfk) obj;
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcgq<zzcgp> zzcgqVarZzB = com.google.android.gms.ads.internal.zzt.zzB();
        if (map.containsKey("abort")) {
            if (zzcgqVarZzB.zza(zzcfkVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcfj zzcfjVar = new zzcfj((String) map.get("flags"));
        boolean z2 = zzcfjVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcgp zzcgpVarZzb = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i2 = 0;
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        try {
                            strArr2[i3] = jSONArray.getString(i3);
                        } catch (JSONException unused) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i2] = str;
            }
            if (z2) {
                for (zzcgp zzcgpVar : zzcgqVarZzB) {
                    if (zzcgpVar.zza == zzcfkVar && str.equals(zzcgpVar.zzd())) {
                        zzcgpVarZzb = zzcgpVar;
                        break;
                    }
                }
            } else {
                zzcgpVarZzb = zzcgqVarZzB.zzb(zzcfkVar);
            }
            if (zzcgpVarZzb != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache task is already running.");
                return;
            }
            if (zzcfkVar.zzk() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = Integer.valueOf(i2);
            }
            if (numZzb != null) {
                zzcfkVar.zzo(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcfkVar.zzA(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcfkVar.zzB(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcgh zzcghVar = zzcfkVar.zzk().zzb;
            if (iIntValue > 0) {
                int i4 = zzcfjVar.zzg;
                int iZzQ = zzcfb.zzQ();
                if (iZzQ < i4) {
                    zzchaVar = new zzchg(zzcfkVar, zzcfjVar);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzr)).booleanValue()) {
                        iZzQ = zzchd.zzr();
                    }
                    zzchaVar = iZzQ < zzcfjVar.zzb ? new zzchd(zzcfkVar, zzcfjVar) : new zzchb(zzcfkVar);
                }
            } else {
                zzchaVar = new zzcha(zzcfkVar);
            }
            new zzcgp(zzcfkVar, zzchaVar, str, strArr).zzb();
        } else {
            zzcgp zzcgpVarZzb2 = zzcgqVarZzB.zzb(zzcfkVar);
            if (zzcgpVarZzb2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache must specify a source.");
                return;
            }
            zzchaVar = zzcgpVarZzb2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzchaVar.zzi(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzchaVar.zzh(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzchaVar.zzj(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzchaVar.zzk(numZzb8.intValue());
        }
    }
}
