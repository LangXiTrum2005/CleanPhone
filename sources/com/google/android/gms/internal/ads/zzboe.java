package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzboe implements zzbnn {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : IOUtils.LINE_SEPARATOR_UNIX.concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbod zzbodVar = (zzbod) this.zzb.remove(str);
                if (zzbodVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                    sb.append("Received result for unexpected method invocation: ");
                    sb.append(str);
                    String string = sb.toString();
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                    sb2.append(str3);
                    sb2.append(strConcat);
                    zzbodVar.zzb(sb2.toString());
                    return;
                }
                if (str5 == null) {
                    zzbodVar.zza(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String string2 = jSONObject.toString(2);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 13);
                        sb3.append("Result GMSG: ");
                        sb3.append(string2);
                        com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                    }
                    zzbodVar.zza(jSONObject);
                } catch (JSONException e2) {
                    zzbodVar.zzb(e2.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(String str, zzbod zzbodVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbodVar);
        }
    }

    public final ListenableFuture zzc(zzbqv zzbqvVar, String str, JSONObject jSONObject) {
        zzcdt zzcdtVar = new zzcdt();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzboc(this, zzcdtVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbqvVar.zzb(str, jSONObject2);
            return zzcdtVar;
        } catch (Exception e2) {
            zzcdtVar.zzd(e2);
            return zzcdtVar;
        }
    }
}
