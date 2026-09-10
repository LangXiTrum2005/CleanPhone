package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzbeq;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbu extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    public zzbu(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String strConcat = ((Boolean) zzbeq.zza.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zzk.zza().toString()) : "";
        String str2 = this.zza;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = str2;
        objArr[1] = str;
        zzbdv zzbdvVar = zzbeq.zzc;
        objArr[2] = Long.valueOf(((Boolean) zzbdvVar.zze()).booleanValue() ? ((Long) zzbeq.zzf.zze()).longValue() : 0L);
        objArr[3] = strConcat;
        final String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        if (((Boolean) zzbdvVar.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb.zzb.evaluateJavascript(str3, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzb.evaluateJavascript(str3, null);
        }
        if (((Boolean) zzbeq.zza.zze()).booleanValue() && ((Boolean) zzbeq.zzb.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        final String str;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbeq.zzc.zze()).booleanValue() ? ((Long) zzbeq.zzf.zze()).longValue() : 0L);
            if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zzk.zza());
            }
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String strConcat = ((Boolean) zzbeq.zza.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zzk.zza().toString()) : "";
            String str2 = this.zza;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            objArr[0] = str2;
            objArr[1] = queryInfo.getQuery();
            objArr[2] = Long.valueOf(((Boolean) zzbeq.zzc.zze()).booleanValue() ? ((Long) zzbeq.zzf.zze()).longValue() : 0L);
            objArr[3] = strConcat;
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        }
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb.zzb.evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzb.evaluateJavascript(str, null);
        }
        if (((Boolean) zzbeq.zza.zze()).booleanValue() && ((Boolean) zzbeq.zzb.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }
}
