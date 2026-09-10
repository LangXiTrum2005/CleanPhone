package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.ironsource.A5;
import com.ironsource.X3;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1gSDK {
    private final int getRevenue;

    public AFd1gSDK(int i) {
        this.getRevenue = i;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Exception e) {
            errorStream = httpURLConnection.getErrorStream();
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e.getMessage() != null ? e.getMessage() : "", e, false, false, false, false);
        }
        if (errorStream == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
        try {
            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
            boolean z = true;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        String string = sb.toString();
                        inputStreamReader2.close();
                        bufferedReader2.close();
                        return string;
                    }
                    if (!z) {
                        sb.append('\n');
                    }
                    sb.append(line);
                    z = false;
                } catch (Throwable th3) {
                    bufferedReader = bufferedReader2;
                    th = th3;
                    inputStreamReader = inputStreamReader2;
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (bufferedReader != null) {
                        throw th;
                    }
                    bufferedReader.close();
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            throw th;
        }
        bufferedReader.close();
        throw th;
    }

    public final AFe1wSDK<String> getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) throws IOException {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] revenue = aFd1bSDK.getRevenue();
            StringBuilder sb = new StringBuilder();
            sb.append(aFd1bSDK.getMonetizationNetwork);
            sb.append(":");
            sb.append(aFd1bSDK.getMediationNetwork);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] revenue2 = aFd1bSDK.getRevenue();
            if (aFd1bSDK.getMonetizationNetwork() && revenue2 != null) {
                try {
                    String str = aFd1bSDK.getMediationNetwork() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                } catch (Throwable th2) {
                    httpURLConnection = null;
                    th = th2;
                    try {
                        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb3 = new StringBuilder("error: ");
                        sb3.append(th);
                        sb3.append("\n took ");
                        sb3.append(aFd1aSDK.getMediationNetwork);
                        sb3.append("ms");
                        String string = sb3.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                        StringBuilder sb4 = new StringBuilder(X3.j.d);
                        sb4.append(aFd1bSDK.hashCode());
                        sb4.append("] ");
                        sb4.append(string);
                        aFLogger.e(aFg1cSDK, sb4.toString(), th, false, false, false);
                        throw new HttpException(th, aFd1aSDK);
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1bSDK.AFAdRevenueData.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb5 = new StringBuilder(X3.j.d);
            sb5.append(aFd1bSDK.hashCode());
            sb5.append("] ");
            sb5.append((Object) sb2);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb5.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1bSDK.getMediationNetwork).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1bSDK.getMonetizationNetwork);
                if (aFd1bSDK.getCurrencyIso4217Code()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1bSDK.component1()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i = this.getRevenue;
                    int i2 = aFd1bSDK.component4;
                    if (i2 != -1) {
                        i = i2;
                    }
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i);
                    httpURLConnection2.addRequestProperty("Content-Type", aFd1bSDK.getMediationNetwork() ? "application/octet-stream" : A5.M);
                    for (Map.Entry<String, String> entry2 : aFd1bSDK.AFAdRevenueData.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (revenue != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(revenue.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb6.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(revenue);
                                bufferedOutputStream2.close();
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                    String mediationNetwork = aFd1bSDK.AFAdRevenueData() ? getMediationNetwork(httpURLConnection2) : "";
                    AFd1aSDK aFd1aSDK2 = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb7 = new StringBuilder("response code:");
                    sb7.append(httpURLConnection2.getResponseCode());
                    sb7.append(" ");
                    sb7.append(httpURLConnection2.getResponseMessage());
                    sb7.append("\n body:");
                    sb7.append(mediationNetwork);
                    sb7.append("\n took ");
                    sb7.append(aFd1aSDK2.getMediationNetwork);
                    sb7.append("ms");
                    String string2 = sb7.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb8 = new StringBuilder(X3.j.d);
                    sb8.append(aFd1bSDK.hashCode());
                    sb8.append("] ");
                    sb8.append(string2);
                    aFLogger2.d(aFg1cSDK2, sb8.toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFe1wSDK<String> aFe1wSDK = new AFe1wSDK<>(mediationNetwork, httpURLConnection2.getResponseCode(), z, map, aFd1aSDK2);
                    httpURLConnection2.disconnect();
                    return aFe1wSDK;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    AFd1aSDK aFd1aSDK3 = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb9 = new StringBuilder("error: ");
                    sb9.append(th);
                    sb9.append("\n took ");
                    sb9.append(aFd1aSDK3.getMediationNetwork);
                    sb9.append("ms");
                    String string3 = sb9.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb10 = new StringBuilder(X3.j.d);
                    sb10.append(aFd1bSDK.hashCode());
                    sb10.append("] ");
                    sb10.append(string3);
                    aFLogger3.e(aFg1cSDK3, sb10.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1aSDK3);
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }
}
