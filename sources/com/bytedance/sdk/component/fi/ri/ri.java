package com.bytedance.sdk.component.fi.ri;

import com.bytedance.sdk.component.fi.fi;
import com.bytedance.sdk.component.utils.qt;
import com.ironsource.C3460cc;
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
public class ri implements com.bytedance.sdk.component.fi.ka<ik> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    @Override // com.bytedance.sdk.component.fi.ka
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public ik<byte[]> ri(fi fiVar) throws Throwable {
        InputStream inputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        String message;
        ?? r5;
        InputStream inputStream2 = null;
        Map<String, String> mapRi = null;
        int i = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(fiVar.ri()).openConnection();
                httpURLConnection.setRequestMethod(C3460cc.a);
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
                            qt.ri(inputStream);
                            qt.ri(r5);
                            return new ik<>(i, byteArray, message, mapRi);
                        }
                        mapRi = fiVar.lr() ? ri(httpURLConnection) : null;
                        qt.ri(inputStream);
                        qt.ri(byteArrayOutputStream);
                        message = "success";
                    } catch (MalformedURLException e3) {
                        e = e3;
                        e.getMessage();
                        message = e.getMessage();
                        r5 = byteArrayOutputStream;
                        qt.ri(inputStream);
                        qt.ri(r5);
                    } catch (IOException e4) {
                        e = e4;
                        e.getMessage();
                        message = e.getMessage();
                        r5 = byteArrayOutputStream;
                        qt.ri(inputStream);
                        qt.ri(r5);
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
                    qt.ri(inputStream);
                    qt.ri(r5);
                    return new ik<>(i, byteArray, message, mapRi);
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    qt.ri(inputStream2);
                    qt.ri(0);
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
                qt.ri(inputStream2);
                qt.ri(0);
                throw th;
            }
            return new ik<>(i, byteArray, message, mapRi);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Map<String, String> ri(HttpURLConnection httpURLConnection) {
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
