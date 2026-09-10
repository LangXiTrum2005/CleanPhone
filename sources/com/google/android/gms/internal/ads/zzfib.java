package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.impl.Z;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfib {
    public final List zza;
    public final zzfhu zzb;
    public final List zzc;
    public final Bundle zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzfib(JsonReader jsonReader, Bundle bundle) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() && bundle != null) {
            Z.t(bundle, zzdwm.SERVER_RESPONSE_PARSE_START.zza());
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zzfhu zzfhuVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new zzfhr(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfhuVar = new zzfhu(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcJ)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdwm.NORMALIZATION_AD_RESPONSE_START.zza(), zzfhuVar.zzs);
                            bundle.putLong(zzdwm.NORMALIZATION_AD_RESPONSE_END.zza(), zzfhuVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzd = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new zzfia(strNextString, jSONObjectZzd));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList2;
        this.zza = arrayList;
        this.zzb = zzfhuVar == null ? new zzfhu(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzfhuVar;
    }

    public static zzfib zza(Reader reader, Bundle bundle) throws zzfhv {
        try {
            try {
                zzfib zzfibVar = new zzfib(new JsonReader(reader), bundle);
                IOUtils.closeQuietly(reader);
                return zzfibVar;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e2) {
                throw new zzfhv("unable to parse ServerResponse", e2);
            }
        } catch (Throwable th) {
            IOUtils.closeQuietly(reader);
            throw th;
        }
    }
}
