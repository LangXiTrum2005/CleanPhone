package com.smartdigimkt.d5;

import android.net.Uri;
import com.p004ironsource.ko;
import com.smartdigimkt.i7.d;
import com.smartdigimkt.v3.g;
import com.smartdigimkt.w6.f;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static g a(com.smartdigimkt.v6.a aVar, f fVar, String str) throws Throwable {
        Throwable th;
        com.smartdigimkt.v6.a aVar2;
        f fVar2;
        String str2;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                try {
                    httpURLConnection.setRequestMethod(ko.f25534a);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        aVar2 = aVar;
                        fVar2 = fVar;
                        str2 = str;
                        try {
                            d.a(aVar2, fVar2, fVar.k(), str2, responseCode + "", "");
                            httpURLConnection.disconnect();
                        } catch (Exception e2) {
                            e = e2;
                            d.a(aVar2, fVar2, fVar2.k(), str2, "", e.getMessage());
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        }
                        return null;
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    JSONObject jSONObjectOptJSONObject = new JSONObject(sb.toString()).optJSONObject("data");
                    g gVar = new g(jSONObjectOptJSONObject.optString("dstlink"), "", jSONObjectOptJSONObject.optString("clickid"));
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return gVar;
                } catch (Exception e3) {
                    e = e3;
                    aVar2 = aVar;
                    fVar2 = fVar;
                    str2 = str;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 == null) {
                    throw th;
                }
                httpURLConnection2.disconnect();
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            aVar2 = aVar;
            fVar2 = fVar;
            str2 = str;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(String str) {
        try {
            return Uri.parse(str).getQueryParameter("qz_gdt");
        } catch (Throwable unused) {
            return null;
        }
    }
}
