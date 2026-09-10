package com.chartboost.sdk.impl;

import com.applovin.shadow.okio.Segment;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class uc implements Runnable, Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f15265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc f15266c;
    public final a3 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ng f15267e;
    public final lh f;
    public final v2 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y6 f15268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x2 f15269i;
    public y2 j;
    public boolean k = true;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15270a;

        static {
            int[] iArr = new int[v2.b.values().length];
            f15270a = iArr;
            try {
                iArr[v2.b.UI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15270a[v2.b.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public uc(Executor executor, vc vcVar, a3 a3Var, ng ngVar, lh lhVar, v2 v2Var, y6 y6Var) {
        this.f15265b = executor;
        this.f15266c = vcVar;
        this.d = a3Var;
        this.f15267e = ngVar;
        this.f = lhVar;
        this.g = v2Var;
        this.f15268h = y6Var;
    }

    public static boolean b(int i2) {
        return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    public final void a(Map map, HttpsURLConnection httpsURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpsURLConnection.addRequestProperty(str, (String) map.get(str));
            }
        }
    }

    public final void c(HttpsURLConnection httpsURLConnection) throws IOException {
        File file = new File(this.g.d.getParentFile(), this.g.d.getName() + ".tmp");
        if (this.g instanceof gj) {
            if (file.exists()) {
                return;
            }
            if (!file.createNewFile()) {
                throw new IOException("Video temp file was not created and doesn't exist");
            }
        }
        v2 v2Var = this.g;
        if (v2Var instanceof gj) {
            a(v2Var.e(), a(httpsURLConnection));
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (this.g instanceof gj) {
                    byte[] bArr = new byte[Segment.SIZE];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        } else {
                            if (!file.exists()) {
                                throw new IOException("Temp file was deleted during download");
                            }
                            fileOutputStream.write(bArr, 0, i2);
                        }
                    }
                } else {
                    m4.f14443a.a(inputStream, fileOutputStream);
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                if (file.renameTo(this.g.d)) {
                    return;
                }
                if (file.delete()) {
                    String str = "Unable to move " + file.getAbsolutePath() + " to " + this.g.d.getAbsolutePath();
                    a(str);
                    throw new IOException(str);
                }
                String str2 = "Unable to delete " + file.getAbsolutePath() + " after failing to rename to " + this.g.d.getAbsolutePath();
                a(str2);
                throw new IOException(str2);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
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

    /* JADX WARN: Code duplicated, block: B:54:0x00f9 A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:40:0x00a5, B:42:0x00ad, B:46:0x00bd, B:45:0x00b7, B:52:0x00f1, B:54:0x00f9, B:56:0x0106, B:55:0x0100, B:17:0x0039, B:19:0x0041, B:21:0x004f, B:32:0x0068, B:33:0x0075), top: B:73:0x0039, inners: #3, #6, #4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0100 A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:40:0x00a5, B:42:0x00ad, B:46:0x00bd, B:45:0x00b7, B:52:0x00f1, B:54:0x00f9, B:56:0x0106, B:55:0x0100, B:17:0x0039, B:19:0x0041, B:21:0x004f, B:32:0x0068, B:33:0x0075), top: B:73:0x0039, inners: #3, #6, #4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0131  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public void run() {
        int i2;
        x2 x2Var = this.f15269i;
        if (x2Var != null) {
            try {
                CBError cBError = x2Var.f15508b;
                if (cBError == null) {
                    this.g.a(x2Var.f15507a, this.j);
                    return;
                } else {
                    this.g.a(cBError, this.j);
                    return;
                }
            } catch (Exception e2) {
                za.b("deliver result: ", e2);
                return;
            }
        }
        AtomicReference atomicReference = this.g.f15347e;
        v2.d dVar = v2.d.QUEUED;
        v2.d dVar2 = v2.d.PROCESSING;
        while (!atomicReference.compareAndSet(dVar, dVar2)) {
            if (atomicReference.get() != dVar) {
                return;
            }
        }
        long jB = this.f15267e.b();
        try {
            try {
                if (this.d.e()) {
                    y2 y2VarA = a(this.g);
                    this.j = y2VarA;
                    if (y2VarA.c()) {
                        this.f15269i = this.g.a(this.j);
                    } else {
                        this.f15269i = a(this.j.b());
                    }
                } else {
                    this.f15269i = a();
                }
                this.g.f = this.f15267e.b() - jB;
                int i3 = a.f15270a[this.g.f15349i.ordinal()];
                if (i3 == 1) {
                    this.f.a(new androidx.room.c(this, 10));
                    return;
                }
                if (i3 != 2) {
                    return;
                }
                this.f15265b.execute(this);
            } catch (InterruptedIOException e3) {
                e = e3;
                if (this.d.e()) {
                    this.f15269i = a(e);
                } else {
                    this.f15269i = a();
                }
                a(fh.h.DISPATCHER_EXCEPTION, e.toString());
                this.g.f = this.f15267e.b() - jB;
                i2 = a.f15270a[this.g.f15349i.ordinal()];
                if (i2 != 1) {
                    this.f.a(new androidx.room.c(this, 10));
                } else if (i2 != 2) {
                }
            } catch (SocketException e4) {
                e = e4;
                if (this.d.e()) {
                    this.f15269i = a(e);
                } else {
                    this.f15269i = a();
                }
                a(fh.h.DISPATCHER_EXCEPTION, e.toString());
                this.g.f = this.f15267e.b() - jB;
                i2 = a.f15270a[this.g.f15349i.ordinal()];
                if (i2 != 1) {
                    this.f.a(new androidx.room.c(this, 10));
                } else if (i2 != 2) {
                }
            } catch (UnknownHostException e5) {
                e = e5;
                if (this.d.e()) {
                    this.f15269i = a(e);
                } else {
                    this.f15269i = a();
                }
                a(fh.h.DISPATCHER_EXCEPTION, e.toString());
                this.g.f = this.f15267e.b() - jB;
                i2 = a.f15270a[this.g.f15349i.ordinal()];
                if (i2 != 1) {
                    this.f.a(new androidx.room.c(this, 10));
                } else if (i2 != 2) {
                }
            } catch (SSLException e6) {
                e = e6;
                if (this.d.e()) {
                    this.f15269i = a(e);
                } else {
                    this.f15269i = a();
                }
                a(fh.h.DISPATCHER_EXCEPTION, e.toString());
                this.g.f = this.f15267e.b() - jB;
                i2 = a.f15270a[this.g.f15349i.ordinal()];
                if (i2 != 1) {
                    this.f.a(new androidx.room.c(this, 10));
                } else if (i2 != 2) {
                }
            } catch (Throwable th) {
                if (this.d.e()) {
                    this.f15269i = a(th);
                } else {
                    this.f15269i = a();
                }
                a(fh.h.REQUEST_JSON_SERIALIZATION_ERROR, th.toString());
                this.g.f = this.f15267e.b() - jB;
                int i4 = a.f15270a[this.g.f15349i.ordinal()];
                if (i4 == 1) {
                    this.f.a(new androidx.room.c(this, 10));
                } else if (i4 != 2) {
                }
            }
        } catch (Throwable th2) {
            this.g.f = this.f15267e.b() - jB;
            int i5 = a.f15270a[this.g.f15349i.ordinal()];
            if (i5 == 1) {
                this.f.a(new androidx.room.c(this, 10));
            } else if (i5 == 2) {
                this.f15265b.execute(this);
            }
            throw th2;
        }
    }

    public final /* synthetic */ Unit b() {
        run();
        return Unit.f43263a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(uc ucVar) {
        return this.g.d().b() - ucVar.g.d().b();
    }

    public final void a(String str, long j) {
        if (this.k) {
            this.k = false;
            this.g.a(str, j);
        }
    }

    public final byte[] b(HttpsURLConnection httpsURLConnection) {
        InputStream errorStream;
        byte[] bArrA;
        InputStream inputStream = null;
        try {
            try {
                errorStream = httpsURLConnection.getInputStream();
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            errorStream = httpsURLConnection.getErrorStream();
        }
        InputStream inputStream2 = errorStream;
        if (inputStream2 != null) {
            bArrA = m4.f14443a.a(new BufferedInputStream(inputStream2));
        } else {
            bArrA = new byte[0];
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused3) {
            }
        }
        return bArrA;
    }

    public final byte[] a(HttpsURLConnection httpsURLConnection, int i2, long j) {
        byte[] bArrB;
        byte[] bArr = new byte[0];
        try {
            if (b(i2)) {
                if (this.g.d != null) {
                    c(httpsURLConnection);
                } else {
                    bArrB = b(httpsURLConnection);
                }
                return bArr;
            }
            bArrB = new byte[0];
            bArr = bArrB;
            return bArr;
        } finally {
            this.g.f15348h = this.f15267e.b() - j;
        }
    }

    public final y2 a(v2 v2Var, int i2) throws IOException {
        this.k = true;
        w2 w2VarA = v2Var.a();
        Map map = w2VarA.f15451a;
        HttpsURLConnection httpsURLConnectionA = this.f15266c.a(v2Var);
        httpsURLConnectionA.setSSLSocketFactory(d3.a());
        httpsURLConnectionA.setConnectTimeout(i2);
        httpsURLConnectionA.setReadTimeout(i2);
        httpsURLConnectionA.setUseCaches(false);
        httpsURLConnectionA.setDoInput(true);
        try {
            a(map, httpsURLConnectionA);
            httpsURLConnectionA.setRequestMethod(v2Var.c().name());
            a(w2VarA, httpsURLConnectionA);
            long jB = this.f15267e.b();
            try {
                int responseCode = httpsURLConnectionA.getResponseCode();
                long jB2 = this.f15267e.b();
                v2Var.g = jB2 - jB;
                if (responseCode != -1) {
                    y2 y2Var = new y2(responseCode, a(httpsURLConnectionA, responseCode, jB2));
                    httpsURLConnectionA.disconnect();
                    return y2Var;
                }
                throw new IOException("Could not retrieve response code from HttpsURLConnection.");
            } catch (Throwable th) {
                v2Var.g = this.f15267e.b() - jB;
                throw th;
            }
        } catch (Throwable th2) {
            httpsURLConnectionA.disconnect();
            throw th2;
        }
    }

    public final void c() {
        v2 v2Var = this.g;
        if (v2Var == null || v2Var.d == null || !(v2Var instanceof gj)) {
            return;
        }
        File file = new File(this.g.d.getParentFile(), this.g.d.getName() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
    }

    public final y2 a(v2 v2Var) throws SocketTimeoutException {
        int i2 = 10000;
        int i3 = 0;
        while (true) {
            try {
                return a(v2Var, i2);
            } catch (SocketTimeoutException e2) {
                if (i3 >= 1) {
                    throw e2;
                }
                i2 *= 2;
                i3++;
            }
        }
    }

    public final void a(fh fhVar, String str) {
        try {
            c();
            this.f15268h.mo189track(h5.a(fhVar, str));
        } catch (Exception unused) {
        }
    }

    public final void a(String str) {
        this.f15268h.mo189track(h5.a(fh.h.RESPONSE_DATA_WRITE_ERROR, str));
    }

    public final x2 a(int i2) {
        return x2.a(new CBError(CBError.Internal.NETWORK_FAILURE, android.support.v4.media.a.h(i2, "Failure due to HTTP status code ")));
    }

    public final x2 a() {
        return x2.a(new CBError(CBError.Internal.INTERNET_UNAVAILABLE, "Internet Unavailable"));
    }

    public final x2 a(IOException iOException) {
        return x2.a(new CBError(CBError.Internal.NETWORK_FAILURE, iOException.toString()));
    }

    public final x2 a(Throwable th) {
        return x2.a(new CBError(CBError.Internal.MISCELLANEOUS, th.toString()));
    }

    public final void a(w2 w2Var, HttpsURLConnection httpsURLConnection) throws IOException {
        if (!v2.c.POST.equals(this.g.c()) || w2Var.f15452b == null) {
            return;
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setFixedLengthStreamingMode(w2Var.f15452b.length);
        if (w2Var.a() != null) {
            httpsURLConnection.addRequestProperty("Content-Type", w2Var.a());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            dataOutputStream.write(w2Var.f15452b);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long a(HttpsURLConnection httpsURLConnection) {
        return httpsURLConnection.getContentLengthLong();
    }
}
