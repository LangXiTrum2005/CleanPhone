package com.bytedance.sdk.component.JXs.LD;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements com.bytedance.sdk.component.JXs.ZU<ZU> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    @Override // com.bytedance.sdk.component.JXs.ZU
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public ZU<byte[]> Lxb(com.bytedance.sdk.component.JXs.JXs jXs) throws Throwable {
        InputStream inputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        String message;
        ?? r5;
        InputStream inputStream2 = null;
        Map<String, String> mapLxb = null;
        int i = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(jXs.Lxb()).openConnection();
                httpURLConnection.setRequestMethod("GET");
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
                                int i2 = inputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                            } catch (MalformedURLException e) {
                                e = e;
                                byteArray = null;
                            } catch (IOException e2) {
                                e = e2;
                                byteArray = null;
                            }
                            e.getMessage();
                            message = e.getMessage();
                            r5 = byteArrayOutputStream;
                            com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream);
                            com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(r5);
                            return new ZU<>(i, byteArray, message, mapLxb);
                        }
                        mapLxb = jXs.LD() ? Lxb(httpURLConnection) : null;
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream);
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(byteArrayOutputStream);
                        message = "success";
                    } catch (MalformedURLException e3) {
                        e = e3;
                        e.getMessage();
                        message = e.getMessage();
                        r5 = byteArrayOutputStream;
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream);
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(r5);
                    } catch (IOException e4) {
                        e = e4;
                        e.getMessage();
                        message = e.getMessage();
                        r5 = byteArrayOutputStream;
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream);
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(r5);
                    }
                    i = 200;
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (MalformedURLException e5) {
                    e = e5;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                } catch (IOException e6) {
                    e = e6;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                    e.getMessage();
                    message = e.getMessage();
                    r5 = byteArrayOutputStream;
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream);
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(r5);
                    return new ZU<>(i, byteArray, message, mapLxb);
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream2);
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(0);
                    throw th;
                }
            } catch (MalformedURLException e7) {
                e = e7;
                inputStream = null;
                byteArray = null;
            } catch (IOException e8) {
                e = e8;
                inputStream = null;
                byteArray = null;
            } catch (Throwable th2) {
                th = th2;
                com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream2);
                com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(0);
                throw th;
            }
            return new ZU<>(i, byteArray, message, mapLxb);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Map<String, String> Lxb(HttpURLConnection httpURLConnection) {
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
