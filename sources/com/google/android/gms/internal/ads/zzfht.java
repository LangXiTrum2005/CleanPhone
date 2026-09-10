package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfht {
    private String zza;

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public zzfht(JsonReader jsonReader) throws IOException {
        byte b2;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (strNextName.equals("description")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                jsonReader.nextInt();
            } else if (b2 != 1) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = strNextString;
    }

    public final String zza() {
        return this.zza;
    }
}
