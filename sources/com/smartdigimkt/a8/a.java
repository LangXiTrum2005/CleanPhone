package com.smartdigimkt.a8;

import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.smartdigimkt.z7.c;
import com.smartdigimkt.z7.f;
import com.smartdigimkt.z7.i;
import com.smartdigimkt.z7.j;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.smartdigimkt.z7.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33783c = "POST";
    private static final String d = "GET";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33784b;

    public a(f fVar) {
        super(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0130 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:64:0x012b, B:66:0x0130), top: B:72:0x012b }] */
    private j b(i iVar) {
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        j.b bVarA = new j.b().a(iVar);
        InputStream inputStream = null;
        try {
            if (this.f33784b) {
                bVarA.a(new InterruptedException("canceled"));
                return bVarA.a();
            }
            httpURLConnection = (HttpURLConnection) new URL(iVar.f40401a).openConnection();
            try {
                String str = iVar.f40402b;
                if (TextUtils.isEmpty(str)) {
                    str = "GET";
                }
                httpURLConnection.setRequestMethod(str);
                if ("POST".equals(str)) {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setUseCaches(false);
                } else if ("GET".equals(str)) {
                    httpURLConnection.setInstanceFollowRedirects(false);
                }
                httpURLConnection.setConnectTimeout((int) this.f40386a.f40392e);
                httpURLConnection.setReadTimeout((int) this.f40386a.f40389a);
                Map<String, String> map = iVar.f40404e;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : iVar.f40404e.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                if ("POST".equals(str) && (bArr = iVar.f40403c) != null) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr);
                    outputStream.flush();
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                bVarA.a(responseCode);
                if (responseCode == 200) {
                    if (!this.f33784b) {
                        bVarA.a(new b(httpURLConnection, a(httpURLConnection)));
                        return bVarA.a();
                    }
                    bVarA.a(new InterruptedException("canceled"));
                    httpURLConnection.disconnect();
                    return bVarA.a();
                }
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    bVarA.a(httpURLConnection.getHeaderFields());
                } else if (this.f33784b) {
                    bVarA.a(new InterruptedException("canceled"));
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null && headerField.toLowerCase().startsWith("http")) {
                        iVar.f40401a = headerField;
                        httpURLConnection.disconnect();
                        return b(iVar);
                    }
                }
                httpURLConnection.disconnect();
                return bVarA.a();
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        inputStream.close();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable unused) {
                        bVarA.a(th);
                        return bVarA.a();
                    }
                } else if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                bVarA.a(th);
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    @Override // com.smartdigimkt.z7.b
    public void a(i iVar, c cVar) {
    }

    @Override // com.smartdigimkt.z7.b
    public void cancel() {
        this.f33784b = true;
    }

    @Override // com.smartdigimkt.z7.b
    public j a(i iVar) {
        return b(iVar);
    }

    public InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!com.smartdigimkt.o0.b.d.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int i2 = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (i2 == -1 || (((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }
}
