package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdwm;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbj {
    public final String zza;
    public String zzb;
    public zzbza zzd;
    public Bundle zze;
    private long zzg;
    private long zzh;
    public String zzc = null;
    public Bundle zzf = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public zzbj(JsonReader jsonReader, zzbza zzbzaVar) throws IOException {
        Bundle bundle;
        byte b2;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzd = zzbzaVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b2 = 2;
                    break;
                case "params":
                    b2 = 0;
                    break;
                case "signal_dictionary":
                    b2 = 1;
                    break;
                case "end_time":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                strNextString = jsonReader.nextString();
            } else if (b2 == 1) {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (b2 == 2) {
                this.zzg = jsonReader.nextLong();
            } else if (b2 != 3) {
                jsonReader.skipValue();
            } else {
                this.zzh = jsonReader.nextLong();
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzf.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() || zzbzaVar == null || (bundle = zzbzaVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdwm.GET_SIGNALS_SDKCORE_START.zza(), this.zzg);
        zzbzaVar.zzm.putLong(zzdwm.GET_SIGNALS_SDKCORE_END.zza(), this.zzh);
    }
}
