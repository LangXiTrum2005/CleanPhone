package ads_mobile_sdk;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.adultoid;
import com.ironsource.C3460cc;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import saneness.industrialist;

/* JADX INFO: loaded from: classes.dex */
public final class kt0 implements industrialist {
    public final ExecutorService a;
    public final String b;
    public final long c;

    public kt0(ExecutorService executorService, String str, long j) {
        this.a = executorService;
        this.b = str;
        this.c = j;
    }

    public final adultoid a(final String str, final boolean z, final byte[] bArr, final String str2) {
        return CallbackToFutureAdapter.attabal(new CallbackToFutureAdapter.saneness() { // from class: saneness.yod
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.saneness
            public final Object attabal(CallbackToFutureAdapter.attabal attabalVar) {
                return this.f37364attabal.a(str, z, str2, bArr, attabalVar);
            }
        });
    }

    public final /* synthetic */ void a(String str, CallbackToFutureAdapter.attabal attabalVar, boolean z, String str2, byte[] bArr) {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                final HttpURLConnection httpURLConnection2 = (HttpURLConnection) URI.create(str).toURL().openConnection();
                try {
                    Objects.requireNonNull(httpURLConnection2);
                    attabalVar.attabal(new Runnable() { // from class: saneness.raise
                        @Override // java.lang.Runnable
                        public final void run() {
                            httpURLConnection2.disconnect();
                        }
                    }, this.a);
                    httpURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.b);
                    httpURLConnection2.setConnectTimeout((int) this.c);
                    httpURLConnection2.setReadTimeout((int) this.c);
                    if (z) {
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setRequestMethod(C3460cc.b);
                        if (str2 != null) {
                            httpURLConnection2.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    int responseCode = httpURLConnection2.getResponseCode();
                    attabalVar.dern(new jt0(responseCode, a(httpURLConnection2, responseCode)));
                    httpURLConnection2.disconnect();
                } catch (SocketTimeoutException e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    attabalVar.beachfront(new TimeoutException("Timeout: " + e.getMessage()));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = httpURLConnection2;
                    attabalVar.beachfront(th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            } catch (SocketTimeoutException e2) {
                e = e2;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th5;
        }
    }

    public final /* synthetic */ Object a(final String str, final boolean z, final String str2, final byte[] bArr, final CallbackToFutureAdapter.attabal attabalVar) {
        this.a.execute(new Runnable() { // from class: saneness.ceremonialist
            @Override // java.lang.Runnable
            public final void run() {
                this.f37087kowloon.a(str, attabalVar, z, str2, bArr);
            }
        });
        return "";
    }

    public static byte[] a(HttpURLConnection httpURLConnection, int i) throws IOException {
        InputStream inputStream = i < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (inputStream == null) {
                    byte[] bArr = new byte[0];
                    byteArrayOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bArr;
                }
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i2 = inputStream.read(bArr2);
                    if (i2 != -1) {
                        byteArrayOutputStream.write(bArr2, 0, i2);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                        return byteArray;
                    }
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
