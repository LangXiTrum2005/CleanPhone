package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.zw;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu implements zze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11004c;

    public zzu(Context context, @Nullable String str) {
        this.f11002a = context;
        this.f11003b = str;
    }

    public final URL a(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException | MalformedURLException e10) {
            b(str, e10);
        } catch (URISyntaxException e11) {
            b(str, e11);
            if (((Boolean) zzba.zzc().a(am.f12141f)).booleanValue()) {
                try {
                    zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String string = uri.toString();
                    StringBuilder sb2 = new StringBuilder(str.length() + 114 + string.length());
                    sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb2.append(str);
                    sb2.append("\" -> encoded URI: ");
                    sb2.append(string);
                    zzo.zzd(sb2.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e12) {
                    b(str, e12);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 47);
        sb3.append("Falling back to direct new URL(\"");
        sb3.append(str);
        sb3.append("\") constructor.");
        zzo.zzd(sb3.toString());
        return new URL(str);
    }

    public final void b(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        zzo.zzi(sb2.toString());
        zw.c(this.f11002a).b(exc, "HttpUrlPinger.pingUrl", ((Integer) zzba.zzc().a(am.f12382ue)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    @Nullable
    public final String zzb() {
        return this.f11004c;
    }

    public final zzt zzc(String str, @Nullable Map map) {
        zzt zztVar = zzt.zzb;
        if (str != null) {
            if (!((Boolean) zzba.zzc().a(am.f12158g)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzba.zzc().a(am.n3)).booleanValue() || !zzay.zze()) {
                    try {
                        StringBuilder sb2 = new StringBuilder(str.length() + 13);
                        sb2.append("Pinging URL: ");
                        sb2.append(str);
                        zzo.zzd(sb2.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) a(str).openConnection();
                        try {
                            zzay.zza();
                            String str2 = this.f11003b;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            zzl zzlVar = new zzl(null);
                            zzlVar.zza(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            zzlVar.zzc(httpURLConnection, responseCode);
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                sb3.append("Received non-success response code ");
                                sb3.append(responseCode);
                                sb3.append(" from pinging URL: ");
                                sb3.append(str);
                                zzo.zzi(sb3.toString());
                                if (responseCode == 502) {
                                    zztVar = zzt.zzc;
                                }
                            } else {
                                if (((Boolean) zzba.zzc().a(am.f12135e9)).booleanValue()) {
                                    this.f11004c = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                zztVar = zzt.zza;
                            }
                            return zztVar;
                        } finally {
                            httpURLConnection.disconnect();
                        }
                    } catch (IOException | RuntimeException e10) {
                        String message = e10.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message);
                        zzo.zzi(sb4.toString());
                        return zzt.zzc;
                    } catch (IndexOutOfBoundsException | MalformedURLException e11) {
                        b(str, e11);
                        return zztVar;
                    }
                }
            }
        }
        return zztVar;
    }
}
