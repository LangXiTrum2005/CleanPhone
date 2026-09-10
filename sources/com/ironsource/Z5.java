package com.ironsource;

import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class Z5 implements Callable<C0278c5> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f28090d = "FileWorkerThread";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28091e = "X-Android-Protocols";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28092f = "http/1.1,h2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0260b5 f28093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28095c;

    public Z5(C0260b5 c0260b5, String str, long j10) {
        this.f28093a = c0260b5;
        this.f28094b = str;
        this.f28095c = j10;
    }

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    public boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i10 = inputStream.read(bArr, 0, Segment.SIZE);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0278c5 call() throws Throwable {
        Z5 z10;
        if (this.f28095c == 0) {
            this.f28095c = 1L;
        }
        C0278c5 c0278c5A = null;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f28095c) {
                z10 = this;
                break;
            }
            z10 = this;
            c0278c5A = z10.a(this.f28093a.e(), i10, this.f28093a.a(), this.f28093a.c(), this.f28093a.f());
            int iB = c0278c5A.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
            i10++;
            this = z10;
        }
        C0278c5 c0278c5 = c0278c5A;
        if (c0278c5 != null && c0278c5.a() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10.f28094b);
            String str = File.separator;
            sb2.append(str);
            sb2.append(z10.f28093a.b().getName());
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            wi.d.m(sb3, z10.f28093a.d(), str, Z3.E);
            sb3.append(z10.f28093a.b().getName());
            String string2 = sb3.toString();
            try {
                if (z10.a(c0278c5.a(), string2) == 0) {
                    c0278c5.a(1006);
                    return c0278c5;
                }
                if (!z10.a(string2, string)) {
                    c0278c5.a(Z3.f28073j);
                    return c0278c5;
                }
            } catch (FileNotFoundException e10) {
                C0474n4.d().a(e10);
                c0278c5.a(1018);
            } catch (Error e11) {
                C0474n4.d().a(e11);
                if (!TextUtils.isEmpty(e11.getMessage())) {
                    Logger.i(f28090d, e11.getMessage());
                }
                c0278c5.a(1019);
            } catch (Exception e12) {
                C0474n4.d().a(e12);
                if (!TextUtils.isEmpty(e12.getMessage())) {
                    Logger.i(f28090d, e12.getMessage());
                }
                c0278c5.a(1009);
            }
        }
        return c0278c5;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0193 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #6 {all -> 0x018f, blocks: (B:109:0x018b, B:113:0x0193), top: B:118:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:118:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    public C0278c5 a(String str, int i10, int i11, int i12, boolean z10) throws Throwable {
        HttpURLConnection httpURLConnection;
        C0278c5 c0278c5 = new C0278c5();
        if (TextUtils.isEmpty(str)) {
            c0278c5.a(str);
            c0278c5.a(1007);
            return c0278c5;
        }
        InputStream inputStream = null;
        byte b10 = 0;
        InputStream inputStream2 = null;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        byte b16 = 0;
        int responseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setRequestMethod(C0375hc.f28788a);
                            if (z10) {
                                try {
                                    httpURLConnection.setRequestProperty(f28091e, f28092f);
                                } catch (IllegalStateException e10) {
                                    C0474n4.d().a(e10);
                                }
                            }
                            httpURLConnection.setConnectTimeout(i11);
                            httpURLConnection.setReadTimeout(i12);
                            httpURLConnection.connect();
                            responseCode = httpURLConnection.getResponseCode();
                            if (responseCode >= 200 && responseCode < 400) {
                                inputStream2 = httpURLConnection.getInputStream();
                                c0278c5.a(a(inputStream2));
                            } else {
                                Logger.i(f28090d, " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i10);
                                responseCode = 1011;
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnection.disconnect();
                        } catch (FileNotFoundException e11) {
                            e = e11;
                            C0474n4.d().a(e);
                            this = 1018;
                            this = 1018;
                            if (0 != 0) {
                                (b11 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0278c5.a(str);
                            c0278c5.a(this);
                            return c0278c5;
                        } catch (Error e12) {
                            e = e12;
                            C0474n4.d().a(e);
                            responseCode = 1019;
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(f28090d, e.getMessage());
                            }
                            if (0 != 0) {
                                (b12 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (MalformedURLException e13) {
                            e = e13;
                            C0474n4.d().a(e);
                            this = 1004;
                            this = 1004;
                            if (0 != 0) {
                                (b13 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0278c5.a(str);
                            c0278c5.a(this);
                            return c0278c5;
                        } catch (SocketTimeoutException e14) {
                            e = e14;
                            C0474n4.d().a(e);
                            this = 1008;
                            this = 1008;
                            if (0 != 0) {
                                (b14 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0278c5.a(str);
                            c0278c5.a(this);
                            return c0278c5;
                        } catch (URISyntaxException e15) {
                            e = e15;
                            C0474n4.d().a(e);
                            this = 1010;
                            this = 1010;
                            if (0 != 0) {
                                (b15 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0278c5.a(str);
                            c0278c5.a(this);
                            return c0278c5;
                        } catch (Exception e16) {
                            e = e16;
                            C0474n4.d().a(e);
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(f28090d, e.getMessage());
                            }
                            this = 1009;
                            this = 1009;
                            if (0 != 0) {
                                (b16 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0278c5.a(str);
                            c0278c5.a(this);
                            return c0278c5;
                        }
                    } catch (FileNotFoundException e17) {
                        e = e17;
                        httpURLConnection = null;
                    } catch (Error e18) {
                        e = e18;
                        httpURLConnection = null;
                    } catch (MalformedURLException e19) {
                        e = e19;
                        httpURLConnection = null;
                    } catch (SocketTimeoutException e20) {
                        e = e20;
                        httpURLConnection = null;
                    } catch (URISyntaxException e21) {
                        e = e21;
                        httpURLConnection = null;
                    } catch (Exception e22) {
                        e = e22;
                        httpURLConnection = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                            try {
                                inputStream.close();
                                if (0 != 0) {
                                    (b10 == true ? 1 : 0).disconnect();
                                }
                            } catch (Throwable th3) {
                                C0474n4.d().a(th3);
                                IronLog.INTERNAL.error(th3.toString());
                                c0278c5.a(str);
                                c0278c5.a(0);
                                throw th;
                            }
                        } else if (0 != 0) {
                            (b10 == true ? 1 : 0).disconnect();
                        }
                        c0278c5.a(str);
                        c0278c5.a(0);
                        throw th;
                    }
                } catch (Throwable th4) {
                    C0474n4.d().a(th4);
                    IronLog.INTERNAL.error(th4.toString());
                }
                c0278c5.a(str);
                c0278c5.a(responseCode);
                return c0278c5;
            } catch (Throwable th5) {
                th = th5;
                if (0 != 0) {
                    inputStream.close();
                    if (0 != 0) {
                        (b10 == true ? 1 : 0).disconnect();
                    }
                } else if (0 != 0) {
                    (b10 == true ? 1 : 0).disconnect();
                }
                c0278c5.a(str);
                c0278c5.a(0);
                throw th;
            }
        } catch (Throwable th6) {
            C0474n4.d().a(th6);
            IronLog.INTERNAL.error(th6.toString());
        }
    }
}
