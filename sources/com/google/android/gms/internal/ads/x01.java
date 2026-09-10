package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x01 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q81 f21663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xf1 f21664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f21665c;

    public final HttpURLConnection a(xf1 xf1Var) throws IOException {
        this.f21663a = new tt0((byte) 0, 3);
        this.f21664b = xf1Var;
        ((Integer) this.f21663a.zza()).getClass();
        xf1 xf1Var2 = this.f21664b;
        xf1Var2.getClass();
        Set set = f20.f14175f;
        zzt.zzq();
        int iIntValue = ((Integer) zzba.zzc().a(am.f12337s0)).intValue();
        URL url = new URL(xf1Var2.f21864b);
        int i10 = 0;
        while (true) {
            i10++;
            if (i10 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            zzl zzlVar = new zzl(null);
            zzlVar.zza(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            zzlVar.zzc(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f21665c = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            String strConcat = "Redirecting to ".concat(headerField);
            int i11 = zze.zza;
            zzo.zzd(strConcat);
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f21665c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
