package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdyi {
    public final long zza;
    public final int[] zzb;

    private zzdyi(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static zzgtd zza(JsonReader jsonReader) throws IOException {
        int i2 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgtd zzgtdVarZzi = zzgtd.zzi();
            jsonReader.beginObject();
            zzdyi zzdyiVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgta zzgtaVar2 = new zzgta();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgtaVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgtdVarZzi = zzgtaVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgtdVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgtdVarZzi.size()];
                for (int i3 = 0; i3 < zzgtdVarZzi.size(); i3++) {
                    iArr[i3] = ((Integer) zzgtdVarZzi.get(i3)).intValue();
                }
                zzdyiVar = new zzdyi(jLongValue, iArr);
            }
            if (zzdyiVar != null) {
                zzgtaVar.zzf(zzdyiVar);
            }
        }
        jsonReader.endArray();
        return zzgtaVar.zzi();
    }
}
