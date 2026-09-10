package ea;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39776a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f39777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f39778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f39780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f39781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ al.b f39782g;

    public u0(v0 v0Var, String str, URL url, byte[] bArr, Map map, t0 t0Var) {
        Objects.requireNonNull(v0Var);
        this.f39782g = v0Var;
        k9.c0.e(str);
        k9.c0.h(url);
        this.f39777b = url;
        this.f39778c = bArr;
        this.f39781f = t0Var;
        this.f39779d = str;
        this.f39780e = map;
    }

    public void a(int i10, IOException iOException, byte[] bArr, Map map) {
        j1 j1Var = ((m1) ((s2) this.f39782g).f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new androidx.fragment.app.x1(this, i10, iOException, bArr, map));
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Type inference failed for: r14v0, types: [ea.u0] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th2;
        Map map3;
        Map map4;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        OutputStream outputStream5;
        Throwable th3;
        OutputStream outputStream6;
        IOException iOException2;
        ?? r10;
        OutputStream outputStream7;
        ?? r11;
        OutputStream outputStream8;
        InputStream inputStream2;
        boolean zHasNext;
        switch (this.f39776a) {
            case 0:
                String str = this.f39779d;
                v0 v0Var = (v0) this.f39782g;
                m1 m1Var = (m1) v0Var.f3623a;
                m1 m1Var2 = (m1) v0Var.f3623a;
                j1 j1Var = m1Var.f39588g;
                m1.h(j1Var);
                j1Var.K0();
                int i10 = 0;
                OutputStream outputStream9 = null;
                try {
                    URLConnection uRLConnectionOpenConnection = this.f39777b.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    m1Var2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        Map map5 = this.f39780e;
                        if (map5 != null) {
                            for (Map.Entry entry : map5.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        byte[] bArr = this.f39778c;
                        if (bArr != null) {
                            h4 h4Var = v0Var.f39807b.f39377g;
                            e4.T(h4Var);
                            byte[] bArrQ1 = h4Var.q1(bArr);
                            s0 s0Var = m1Var2.f39587f;
                            m1.h(s0Var);
                            bo.b bVar = s0Var.f39760n;
                            int length = bArrQ1.length;
                            bVar.c(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream10 = httpURLConnection.getOutputStream();
                            try {
                                outputStream10.write(bArrQ1);
                                outputStream10.close();
                            } catch (IOException e10) {
                                iOException = e10;
                                responseCode = 0;
                                map2 = null;
                                outputStream9 = outputStream10;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e11) {
                                        s0 s0Var2 = m1Var2.f39587f;
                                        m1.h(s0Var2);
                                        s0Var2.f39753f.d("Error closing HTTP compressed POST connection output stream. appId", s0.O0(str), e11);
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                t0 t0Var = (t0) this.f39781f;
                                j1 j1Var2 = m1Var2.f39588g;
                                m1.h(j1Var2);
                                j1Var2.P0(new q0(this.f39779d, t0Var, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                map = null;
                                outputStream9 = outputStream10;
                                th2 = th;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e12) {
                                        s0 s0Var3 = m1Var2.f39587f;
                                        m1.h(s0Var3);
                                        s0Var3.f39753f.d("Error closing HTTP compressed POST connection output stream. appId", s0.O0(str), e12);
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                t0 t0Var2 = (t0) this.f39781f;
                                j1 j1Var3 = m1Var2.f39588g;
                                m1.h(j1Var3);
                                j1Var3.P0(new q0(this.f39779d, t0Var2, i10, (IOException) null, (byte[]) null, map));
                                throw th2;
                            }
                        }
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        byte[] bArr2 = new byte[1024];
                                        while (true) {
                                            int i11 = inputStream.read(bArr2);
                                            if (i11 <= 0) {
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                inputStream.close();
                                                httpURLConnection.disconnect();
                                                t0 t0Var3 = (t0) this.f39781f;
                                                j1 j1Var4 = m1Var2.f39588g;
                                                m1.h(j1Var4);
                                                j1Var4.P0(new q0(this.f39779d, t0Var3, responseCode, (IOException) null, byteArray, headerFields));
                                                return;
                                            }
                                            byteArrayOutputStream.write(bArr2, 0, i11);
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    inputStream = null;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                map2 = null;
                                iOException = e;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                t0 t0Var4 = (t0) this.f39781f;
                                j1 j1Var5 = m1Var2.f39588g;
                                m1.h(j1Var5);
                                j1Var5.P0(new q0(this.f39779d, t0Var4, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th7) {
                                th2 = th7;
                                map = null;
                                i10 = responseCode;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                t0 t0Var5 = (t0) this.f39781f;
                                j1 j1Var6 = m1Var2.f39588g;
                                m1.h(j1Var6);
                                j1Var6.P0(new q0(this.f39779d, t0Var5, i10, (IOException) null, (byte[]) null, map));
                                throw th2;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            map2 = map4;
                            iOException = e;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            t0 t0Var6 = (t0) this.f39781f;
                            j1 j1Var7 = m1Var2.f39588g;
                            m1.h(j1Var7);
                            j1Var7.P0(new q0(this.f39779d, t0Var6, responseCode, iOException, (byte[]) null, map2));
                            return;
                        } catch (Throwable th8) {
                            th2 = th8;
                            i10 = responseCode;
                            map = map3;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            t0 t0Var7 = (t0) this.f39781f;
                            j1 j1Var8 = m1Var2.f39588g;
                            m1.h(j1Var8);
                            j1Var8.P0(new q0(this.f39779d, t0Var7, i10, (IOException) null, (byte[]) null, map));
                            throw th2;
                        }
                    } catch (IOException e15) {
                        iOException = e15;
                        responseCode = 0;
                        map2 = null;
                    } catch (Throwable th9) {
                        th = th9;
                        map = null;
                    }
                } catch (IOException e16) {
                    iOException = e16;
                    responseCode = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th10) {
                    th = th10;
                    httpURLConnection = null;
                    map = null;
                }
                break;
            default:
                String str2 = this.f39779d;
                s2 s2Var = (s2) this.f39782g;
                m1 m1Var3 = (m1) s2Var.f3623a;
                m1 m1Var4 = (m1) s2Var.f3623a;
                j1 j1Var9 = m1Var3.f39588g;
                m1.h(j1Var9);
                j1Var9.K0();
                int responseCode2 = 0;
                try {
                    URLConnection uRLConnectionOpenConnection2 = this.f39777b.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    m1Var4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map6 = this.f39780e;
                            if (map6 != null) {
                                Iterator it = map6.entrySet().iterator();
                                while (true) {
                                    zHasNext = it.hasNext();
                                    if (zHasNext) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                }
                            }
                            byte[] bArr3 = this.f39778c;
                            ?? r12 = zHasNext;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    s0 s0Var4 = m1Var4.f39587f;
                                    m1.h(s0Var4);
                                    bo.b bVar2 = s0Var4.f39760n;
                                    int length2 = byteArray2.length;
                                    bVar2.c(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    OutputStream outputStream11 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream11.write(byteArray2);
                                        outputStream11.close();
                                        r12 = outputStream11;
                                    } catch (IOException e17) {
                                        e = e17;
                                        responseCode2 = 0;
                                        outputStream4 = null;
                                        outputStream6 = outputStream11;
                                        iOException2 = e;
                                        outputStream8 = outputStream6;
                                        r11 = outputStream4;
                                        if (outputStream8 != null) {
                                            try {
                                                outputStream8.close();
                                            } catch (IOException e18) {
                                                s0 s0Var5 = m1Var4.f39587f;
                                                m1.h(s0Var5);
                                                s0Var5.f39753f.d("Error closing HTTP compressed POST connection output stream. appId", s0.O0(str2), e18);
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, iOException2, null, r11);
                                        return;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        responseCode2 = 0;
                                        outputStream3 = null;
                                        outputStream5 = outputStream11;
                                        th3 = th;
                                        outputStream7 = outputStream5;
                                        r10 = outputStream3;
                                        if (outputStream7 != null) {
                                            try {
                                                outputStream7.close();
                                            } catch (IOException e19) {
                                                s0 s0Var6 = m1Var4.f39587f;
                                                m1.h(s0Var6);
                                                s0Var6.f39753f.d("Error closing HTTP compressed POST connection output stream. appId", s0.O0(str2), e19);
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, null, null, r10);
                                        throw th3;
                                    }
                                } catch (IOException e20) {
                                    s0 s0Var7 = m1Var4.f39587f;
                                    m1.h(s0Var7);
                                    s0Var7.f39753f.c(e20, "Failed to gzip post request content");
                                    throw e20;
                                }
                            }
                            responseCode2 = httpURLConnection2.getResponseCode();
                            try {
                                try {
                                    Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                        inputStream2 = httpURLConnection2.getInputStream();
                                        try {
                                            byte[] bArr4 = new byte[1024];
                                            while (true) {
                                                int i12 = inputStream2.read(bArr4);
                                                if (i12 <= 0) {
                                                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                                    inputStream2.close();
                                                    httpURLConnection2.disconnect();
                                                    a(responseCode2, null, byteArray3, headerFields2);
                                                    return;
                                                }
                                                byteArrayOutputStream3.write(bArr4, 0, i12);
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        inputStream2 = null;
                                    }
                                } catch (IOException e21) {
                                    iOException2 = e21;
                                    outputStream8 = null;
                                    r11 = 0;
                                    if (outputStream8 != null) {
                                        outputStream8.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, iOException2, null, r11);
                                    return;
                                } catch (Throwable th14) {
                                    th3 = th14;
                                    outputStream7 = null;
                                    r10 = 0;
                                    if (outputStream7 != null) {
                                        outputStream7.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, null, null, r10);
                                    throw th3;
                                }
                            } catch (IOException e22) {
                                iOException2 = e22;
                                r11 = r12;
                                outputStream8 = null;
                                if (outputStream8 != null) {
                                    outputStream8.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r11);
                                return;
                            } catch (Throwable th15) {
                                th3 = th15;
                                r10 = r12;
                                outputStream7 = null;
                                if (outputStream7 != null) {
                                    outputStream7.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r10);
                                throw th3;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            outputStream = null;
                            outputStream3 = outputStream;
                            outputStream5 = outputStream;
                            th3 = th;
                            outputStream7 = outputStream5;
                            r10 = outputStream3;
                            if (outputStream7 != null) {
                                outputStream7.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, null, null, r10);
                            throw th3;
                        }
                    } catch (IOException e23) {
                        e = e23;
                        outputStream2 = null;
                        outputStream4 = outputStream2;
                        outputStream6 = outputStream2;
                        iOException2 = e;
                        outputStream8 = outputStream6;
                        r11 = outputStream4;
                        if (outputStream8 != null) {
                            outputStream8.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, iOException2, null, r11);
                        return;
                    }
                } catch (IOException e24) {
                    e = e24;
                    httpURLConnection2 = null;
                    outputStream2 = null;
                } catch (Throwable th17) {
                    th = th17;
                    httpURLConnection2 = null;
                    outputStream = null;
                }
                break;
        }
    }

    public u0(s2 s2Var, String str, URL url, byte[] bArr, HashMap map, r2 r2Var) {
        Objects.requireNonNull(s2Var);
        this.f39782g = s2Var;
        k9.c0.e(str);
        this.f39777b = url;
        this.f39778c = bArr;
        this.f39781f = r2Var;
        this.f39779d = str;
        this.f39780e = map;
    }
}
