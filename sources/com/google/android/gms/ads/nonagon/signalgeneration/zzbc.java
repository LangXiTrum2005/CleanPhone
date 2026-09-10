package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.mx;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11450b;
    public final String zza;
    public String zzb;

    @Nullable
    public mx zzc;
    public Bundle zzd = new Bundle();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzbc(JsonReader jsonReader, @Nullable mx mxVar) throws IOException {
        Bundle bundle;
        this.f11449a = -1L;
        this.f11450b = -1L;
        this.zzc = mxVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.f11449a = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.f11450b = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.S2)).booleanValue() || mxVar == null || (bundle = mxVar.f17577m) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.f11449a);
        bundle.putLong("get-signals-sdkcore-end", this.f11450b);
    }
}
