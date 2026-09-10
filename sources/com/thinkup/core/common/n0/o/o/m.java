package com.thinkup.core.common.n0.o.o;

import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.smartdigimkt.o0.b;
import com.thinkup.core.common.n0.o.mm;
import com.thinkup.core.common.n0.o.mo;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends com.thinkup.core.common.n0.o.o {
    private static final String m = "POST";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f41959n = "GET";
    private boolean o0;

    public m(com.thinkup.core.common.n0.o.om omVar) {
        super(omVar);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0130 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:64:0x012b, B:66:0x0130), top: B:72:0x012b }] */
    private mm m(mo moVar) {
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        mm.o oVarO = new mm.o().o(moVar);
        InputStream inputStream = null;
        try {
            if (this.o0) {
                oVarO.o(new InterruptedException("canceled"));
                return oVarO.o();
            }
            httpURLConnection = (HttpURLConnection) new URL(moVar.o).openConnection();
            try {
                String str = moVar.m;
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
                httpURLConnection.setConnectTimeout((int) this.o.oo);
                httpURLConnection.setReadTimeout((int) this.o.o);
                Map<String, String> map = moVar.oo;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : moVar.oo.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                if ("POST".equals(str) && (bArr = moVar.f41957n) != null) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr);
                    outputStream.flush();
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                oVarO.o(responseCode);
                if (responseCode == 200) {
                    if (!this.o0) {
                        oVarO.o(new n(httpURLConnection, o(httpURLConnection)));
                        return oVarO.o();
                    }
                    oVarO.o(new InterruptedException("canceled"));
                    httpURLConnection.disconnect();
                    return oVarO.o();
                }
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    oVarO.o(httpURLConnection.getHeaderFields());
                } else if (this.o0) {
                    oVarO.o(new InterruptedException("canceled"));
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null && headerField.toLowerCase().startsWith("http")) {
                        moVar.o = headerField;
                        httpURLConnection.disconnect();
                        return m(moVar);
                    }
                }
                httpURLConnection.disconnect();
                return oVarO.o();
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        inputStream.close();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable unused) {
                        oVarO.o(th);
                        return oVarO.o();
                    }
                } else if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                oVarO.o(th);
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    @Override // com.thinkup.core.common.n0.o.m
    public final void o(mo moVar, com.thinkup.core.common.n0.o.n nVar) {
    }

    @Override // com.thinkup.core.common.n0.o.m
    public final mm o(mo moVar) {
        return m(moVar);
    }

    @Override // com.thinkup.core.common.n0.o.m
    public final void o() {
        this.o0 = true;
    }

    private static InputStream o(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!b.d.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
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
