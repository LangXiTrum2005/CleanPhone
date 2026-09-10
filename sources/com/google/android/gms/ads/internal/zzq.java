package com.google.android.gms.ads.internal;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.um;
import java.util.Map;
import q4.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzq extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzs f11213a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        zzs zzsVar = this.f11213a;
        zzsVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) um.f20822d.o());
        zzr zzrVar = zzsVar.f11223d;
        if (zzrVar.zzb() != null) {
            builder.appendQueryParameter("query", zzrVar.zzb());
        }
        builder.appendQueryParameter("pubId", zzrVar.zzc());
        builder.appendQueryParameter("mappver", zzrVar.zzd());
        Map mapZze = zzrVar.zze();
        for (String str : mapZze.keySet()) {
            builder.appendQueryParameter(str, (String) mapZze.get(str));
        }
        Uri uriBuild = builder.build();
        String strY1 = zzsVar.y1();
        String encodedQuery = uriBuild.getEncodedQuery();
        return a.j(new StringBuilder(strY1.length() + 1 + String.valueOf(encodedQuery).length()), strY1, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f11213a.f11224e;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
