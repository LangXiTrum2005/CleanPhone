package com.p004ironsource;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.Logger;
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

/* JADX INFO: loaded from: classes5.dex */
class zc implements Callable<eb> {
    private static final String d = "FileWorkerThread";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f27885e = "X-Android-Protocols";
    private static final String f = "http/1.1,h2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final db f27886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27888c;

    public zc(db dbVar, String str, long j) {
        this.f27886a = dbVar;
        this.f27887b = str;
        this.f27888c = j;
    }

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public eb call() throws Throwable {
        zc zcVar;
        int i2;
        if (this.f27888c == 0) {
            this.f27888c = 1L;
        }
        eb ebVarA = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f27888c) {
                zcVar = this;
                break;
            }
            zcVar = this;
            ebVarA = zcVar.a(this.f27886a.e(), i3, this.f27886a.a(), this.f27886a.c(), this.f27886a.f());
            int iB = ebVarA.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
            i3++;
        }
        eb ebVar = ebVarA;
        if (ebVar != null && ebVar.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(zcVar.f27887b);
            String str = File.separator;
            sb.append(str);
            sb.append(zcVar.f27886a.b().getName());
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            a.A(sb2, zcVar.f27886a.d(), str, f9.f24985E);
            sb2.append(zcVar.f27886a.b().getName());
            String string2 = sb2.toString();
            try {
                if (a(ebVar.a(), string2) == 0) {
                    ebVar.a(1006);
                    return ebVar;
                }
                if (!a(string2, string)) {
                    ebVar.a(f9.j);
                    return ebVar;
                }
            } catch (FileNotFoundException e2) {
                q9.d().a(e2);
                i2 = 1018;
                ebVar.a(i2);
            } catch (Error e3) {
                q9.d().a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.i(d, e3.getMessage());
                }
                i2 = 1019;
                ebVar.a(i2);
            } catch (Exception e4) {
                q9.d().a(e4);
                if (!TextUtils.isEmpty(e4.getMessage())) {
                    Logger.i(d, e4.getMessage());
                }
                ebVar.a(1009);
            }
        }
        return ebVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0184 A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:104:0x017c, B:108:0x0184), top: B:113:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x011b A[Catch: all -> 0x0117, PHI: r5 r9
  0x011b: PHI (r5v13 java.net.HttpURLConnection) = 
  (r5v8 java.net.HttpURLConnection)
  (r5v9 java.net.HttpURLConnection)
  (r5v10 java.net.HttpURLConnection)
  (r5v11 java.net.HttpURLConnection)
  (r5v14 java.net.HttpURLConnection)
 binds: [B:73:0x0119, B:92:0x014f, B:86:0x013e, B:98:0x0160, B:80:0x012d] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r9v24 int) = (r9v14 int), (r9v17 int), (r9v19 int), (r9v21 int), (r9v27 int) binds: [B:73:0x0119, B:92:0x014f, B:86:0x013e, B:98:0x0160, B:80:0x012d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #11 {all -> 0x0117, blocks: (B:70:0x0113, B:74:0x011b, B:79:0x012a, B:85:0x013b, B:91:0x014c, B:97:0x015d), top: B:115:0x001a }] */
    public eb a(String str, int i2, int i3, int i4, boolean z2) throws Throwable {
        HttpURLConnection httpURLConnection;
        eb ebVar = new eb();
        if (TextUtils.isEmpty(str)) {
            ebVar.a(str);
            ebVar.a(1007);
            return ebVar;
        }
        InputStream inputStream = null;
        byte b2 = 0;
        InputStream inputStream2 = null;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        int responseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setRequestMethod(ko.f25534a);
                            if (z2) {
                                try {
                                    httpURLConnection.setRequestProperty(f27885e, f);
                                } catch (IllegalStateException e2) {
                                    q9.d().a(e2);
                                }
                            }
                            httpURLConnection.setConnectTimeout(i3);
                            httpURLConnection.setReadTimeout(i4);
                            httpURLConnection.connect();
                            responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 400) {
                                Logger.i(d, " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i2);
                                responseCode = 1011;
                            } else {
                                inputStream2 = httpURLConnection.getInputStream();
                                ebVar.a(a(inputStream2));
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            q9.d().a(e);
                            i2 = 1018;
                            if (0 != 0) {
                                (b3 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            ebVar.a(str);
                            ebVar.a(i2);
                            return ebVar;
                        } catch (Error e4) {
                            e = e4;
                            q9.d().a(e);
                            responseCode = 1019;
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(d, e.getMessage());
                            }
                            if (0 != 0) {
                                (b4 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                            }
                            ebVar.a(str);
                            ebVar.a(responseCode);
                            return ebVar;
                        } catch (MalformedURLException e5) {
                            e = e5;
                            q9.d().a(e);
                            i2 = 1004;
                            if (0 != 0) {
                                (b5 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            ebVar.a(str);
                            ebVar.a(i2);
                            return ebVar;
                        } catch (SocketTimeoutException e6) {
                            e = e6;
                            q9.d().a(e);
                            i2 = 1008;
                            if (0 != 0) {
                                (b6 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            ebVar.a(str);
                            ebVar.a(i2);
                            return ebVar;
                        } catch (URISyntaxException e7) {
                            e = e7;
                            q9.d().a(e);
                            i2 = 1010;
                            if (0 != 0) {
                                (b7 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            ebVar.a(str);
                            ebVar.a(i2);
                            return ebVar;
                        } catch (Exception e8) {
                            e = e8;
                            q9.d().a(e);
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(d, e.getMessage());
                            }
                            i2 = 1009;
                            if (0 != 0) {
                                (b8 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            ebVar.a(str);
                            ebVar.a(i2);
                            return ebVar;
                        }
                    } catch (FileNotFoundException e9) {
                        e = e9;
                        httpURLConnection = null;
                    } catch (Error e10) {
                        e = e10;
                        httpURLConnection = null;
                    } catch (MalformedURLException e11) {
                        e = e11;
                        httpURLConnection = null;
                    } catch (SocketTimeoutException e12) {
                        e = e12;
                        httpURLConnection = null;
                    } catch (URISyntaxException e13) {
                        e = e13;
                        httpURLConnection = null;
                    } catch (Exception e14) {
                        e = e14;
                        httpURLConnection = null;
                    } catch (Throwable th) {
                        th = th;
                        if (0 != 0) {
                            try {
                                inputStream.close();
                                if (0 != 0) {
                                    (b2 == true ? 1 : 0).disconnect();
                                }
                            } catch (Throwable th2) {
                                q9.d().a(th2);
                                IronLog.INTERNAL.error(th2.toString());
                                ebVar.a(str);
                                ebVar.a(0);
                                throw th;
                            }
                        } else if (0 != 0) {
                            (b2 == true ? 1 : 0).disconnect();
                        }
                        ebVar.a(str);
                        ebVar.a(0);
                        throw th;
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable th3) {
                    q9.d().a(th3);
                    IronLog.INTERNAL.error(th3.toString());
                }
                ebVar.a(str);
                ebVar.a(responseCode);
            } catch (Throwable th4) {
                q9.d().a(th4);
                IronLog.INTERNAL.error(th4.toString());
                ebVar.a(str);
                ebVar.a(i2);
            }
            return ebVar;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i2 = inputStream.read(bArr, 0, Segment.SIZE);
            if (i2 == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }
}
