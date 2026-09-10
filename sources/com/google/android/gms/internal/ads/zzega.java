package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzega implements zzflu {
    protected final Context zza;
    protected final String zzb;
    private final String zzc;

    public zzega(Context context, String str, zzbzi zzbziVar, int i2, String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzefz zza(zzefy zzefyVar) throws zzebr {
        return zzc(zzefyVar.zza, zzefyVar.zzb, zzefyVar.zzc, zzefyVar.zzd, zzefyVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    public final zzefz zzc(String str, int i2, Map map, byte[] bArr, String str2, long j) throws MalformedURLException, zzebr {
        HttpURLConnection httpURLConnection;
        URL url;
        InputStreamReader inputStreamReader;
        try {
            zzefz zzefzVar = new zzefz();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcX)).booleanValue() && com.google.android.gms.ads.internal.client.zzbb.zze()) {
                zzefzVar.zza = 410;
                return zzefzVar;
            }
            String str3 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String string = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 39);
            sb2.append("AdRequestServiceImpl: Sending request: ");
            sb2.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
            URL url2 = new URL(str);
            HashMap map2 = new HashMap();
            int i4 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                String str4 = this.zzc;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zza, str3, false, httpURLConnection, false, i2);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = null;
                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                        try {
                            zzlVar.zza(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Network request logging failed.", th);
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    IOUtils.closeQuietly(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    IOUtils.closeQuietly(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        zzlVar.zzc(httpURLConnection, responseCode);
                        zzefzVar.zza = responseCode;
                        zzefzVar.zzb = map2;
                        zzefzVar.zzc = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    StringBuilder sb3 = new StringBuilder(Segment.SIZE);
                                    char[] cArr = new char[com.p004ironsource.mediationsdk.metadata.a.f25965n];
                                    while (true) {
                                        int i5 = inputStreamReader2.read(cArr);
                                        if (i5 == -1) {
                                            break;
                                        }
                                        sb3.append(cArr, 0, i5);
                                    }
                                    String string2 = sb3.toString();
                                    IOUtils.closeQuietly(inputStreamReader2);
                                    zzlVar.zze(string2);
                                    zzefzVar.zzc = string2;
                                    if (TextUtils.isEmpty(string2)) {
                                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgu)).booleanValue()) {
                                            throw new zzebr(3);
                                        }
                                    }
                                    zzefzVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    IOUtils.closeQuietly(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                sb4.append("Received error HTTP response code: ");
                                sb4.append(responseCode);
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb4.toString());
                                StringBuilder sb5 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                sb5.append("Received error HTTP response code: ");
                                sb5.append(responseCode);
                                throw new zzebr(1, sb5.toString());
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("No location header to follow redirect.");
                                throw new zzebr(1, "No location header to follow redirect");
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziV)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e2) {
                                    throw new zzebr(1, e2.getMessage(), e2);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            int i6 = i4 + 1;
                            if (i6 > ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgd)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Too many redirects.");
                                throw new zzebr(1, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            i4 = i6;
                            url2 = url;
                        }
                    } catch (Throwable th6) {
                        httpURLConnection.disconnect();
                        throw th6;
                    }
                } catch (zzebr e3) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjz)).booleanValue()) {
                        throw e3;
                    }
                    zzefzVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
                }
            }
            httpURLConnection.disconnect();
            return zzefzVar;
        } catch (IOException e4) {
            String strValueOf = String.valueOf(e4.getMessage());
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            String strConcat = "Error while connecting to ad server: ".concat(strValueOf);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            throw new zzebr(1, strConcat, e4);
        }
    }
}
