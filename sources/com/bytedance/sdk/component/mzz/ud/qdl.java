package com.bytedance.sdk.component.mzz.ud;

import android.util.Log;
import com.bytedance.sdk.component.mzz.mzz;
import com.bytedance.sdk.component.utils.to;
import com.p004ironsource.ko;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements com.bytedance.sdk.component.mzz.mml<lnr> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    @Override // com.bytedance.sdk.component.mzz.mml
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public lnr<byte[]> qdl(mzz mzzVar) throws Throwable {
        InputStream inputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        String message;
        ?? r6;
        InputStream inputStream2 = null;
        Map<String, String> mapQdl = null;
        int i2 = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(mzzVar.qdl()).openConnection();
                httpURLConnection.setRequestMethod(ko.f25534a);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        while (true) {
                            try {
                                int i3 = inputStream.read(bArr);
                                if (i3 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i3);
                            } catch (MalformedURLException e2) {
                                e = e2;
                                byteArray = null;
                            } catch (IOException e3) {
                                e = e3;
                                byteArray = null;
                            }
                            Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                            message = e.getMessage();
                            r6 = byteArrayOutputStream;
                            to.qdl(inputStream);
                            to.qdl(r6);
                            return new lnr<>(i2, byteArray, message, mapQdl);
                        }
                        mapQdl = mzzVar.ud() ? qdl(httpURLConnection) : null;
                        to.qdl(inputStream);
                        to.qdl(byteArrayOutputStream);
                        message = "success";
                    } catch (MalformedURLException e4) {
                        e = e4;
                        Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                        message = e.getMessage();
                        r6 = byteArrayOutputStream;
                        to.qdl(inputStream);
                        to.qdl(r6);
                    } catch (IOException e5) {
                        e = e5;
                        Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                        message = e.getMessage();
                        r6 = byteArrayOutputStream;
                        to.qdl(inputStream);
                        to.qdl(r6);
                    }
                    i2 = 200;
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (MalformedURLException e6) {
                    e = e6;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                } catch (IOException e7) {
                    e = e7;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    r6 = byteArrayOutputStream;
                    to.qdl(inputStream);
                    to.qdl(r6);
                    return new lnr<>(i2, byteArray, message, mapQdl);
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    to.qdl(inputStream2);
                    to.qdl(0);
                    throw th;
                }
            } catch (MalformedURLException e8) {
                e = e8;
                inputStream = null;
                byteArray = null;
            } catch (IOException e9) {
                e = e9;
                inputStream = null;
                byteArray = null;
            } catch (Throwable th2) {
                th = th2;
                to.qdl(inputStream2);
                to.qdl(0);
                throw th;
            }
            return new lnr<>(i2, byteArray, message, mapQdl);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Map<String, String> qdl(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }
}
