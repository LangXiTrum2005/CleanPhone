package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.pb;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzbf extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaggingLibraryJsInterface f11456b;

    public zzbf(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.f11455a = str;
        this.f11456b = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean zBooleanValue = ((Boolean) ln.f17064c.o()).booleanValue();
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.f11456b;
        String strConcat = zBooleanValue ? ",\"as\":".concat(taggingLibraryJsInterface.f11362k.zzb().toString()) : "";
        Locale locale = Locale.getDefault();
        pb pbVar = ln.f17066e;
        final String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f11455a, str, Long.valueOf(((Boolean) pbVar.o()).booleanValue() ? ((Long) ln.f17069h.o()).longValue() : 0L), strConcat);
        if (((Boolean) pbVar.o()).booleanValue()) {
            try {
                taggingLibraryJsInterface.f11359h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f11451a.f11456b.f11353b.evaluateJavascript(str2, null);
                    }
                });
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e10);
            }
        } else {
            taggingLibraryJsInterface.f11353b.evaluateJavascript(str2, null);
        }
        if (((Boolean) ln.f17064c.o()).booleanValue() && ((Boolean) ln.f17065d.o()).booleanValue()) {
            taggingLibraryJsInterface.l.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        final String str;
        String str2 = this.f11455a;
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.f11456b;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            if (((Boolean) ln.f17064c.o()).booleanValue()) {
                jSONObject.put("as", taggingLibraryJsInterface.f11362k.zzb());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) ln.f17066e.o()).booleanValue() ? ((Long) ln.f17069h.o()).longValue() : 0L);
            jSONObject.put("signal", query);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, queryInfo.getQuery(), Long.valueOf(((Boolean) ln.f17066e.o()).booleanValue() ? ((Long) ln.f17069h.o()).longValue() : 0L), ((Boolean) ln.f17064c.o()).booleanValue() ? ",\"as\":".concat(taggingLibraryJsInterface.f11362k.zzb().toString()) : "");
        }
        if (((Boolean) ln.f17066e.o()).booleanValue()) {
            try {
                taggingLibraryJsInterface.f11359h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f11453a.f11456b.f11353b.evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e10);
            }
        } else {
            taggingLibraryJsInterface.f11353b.evaluateJavascript(str, null);
        }
        if (((Boolean) ln.f17064c.o()).booleanValue() && ((Boolean) ln.f17065d.o()).booleanValue()) {
            taggingLibraryJsInterface.l.zzb();
        }
    }
}
