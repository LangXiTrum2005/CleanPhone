package com.applovin.impl;

import android.os.Process;
import android.os.SystemClock;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f7704a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7705b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue f7706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f7707b;

        private void a() {
            b((c) this.f7706a.take());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.l lVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (lVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f7706a = blockingQueue;
            this.f7707b = lVar;
            setPriority(((Integer) lVar.a(z4.S)).intValue());
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:107:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x00f3 A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #14 {all -> 0x00ff, blocks: (B:56:0x00db, B:58:0x00f3, B:83:0x013a), top: B:114:0x00db }] */
        /* JADX WARN: Code duplicated, block: B:85:0x016d  */
        private void b(c cVar) {
            int i10;
            HttpURLConnection httpURLConnectionA;
            byte[] bArrA;
            long j10;
            Throwable th2;
            long jElapsedRealtime;
            byte[] bArr;
            Throwable th3;
            byte[] bArr2;
            long jElapsedRealtime2;
            byte[] bArr3;
            InputStream errorStream;
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            int responseCode = 0;
            try {
                httpURLConnectionA = a(cVar);
                try {
                    if (cVar.f7712d != null && cVar.f7712d.length > 0) {
                        httpURLConnectionA.setDoOutput(true);
                        httpURLConnectionA.setFixedLengthStreamingMode(cVar.f7712d.length);
                        try {
                            OutputStream outputStream = httpURLConnectionA.getOutputStream();
                            try {
                                outputStream.write(cVar.f7712d);
                                outputStream.close();
                            } catch (Throwable th4) {
                                if (outputStream == null) {
                                    throw th4;
                                }
                                try {
                                    outputStream.close();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th6) {
                            HashMap map = new HashMap();
                            CollectionUtils.putStringIfValid("details", "outputStream", map);
                            CollectionUtils.putStringIfValid("url", cVar.f7709a, map);
                            CollectionUtils.putStringIfValid("code", Integer.toString(0), map);
                            this.f7707b.E().a("NetworkCommunicationThread", "processRequest", th6, map);
                            throw th6;
                        }
                    }
                    jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    responseCode = httpURLConnectionA.getResponseCode();
                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (responseCode > 0) {
                        try {
                            InputStream inputStream = httpURLConnectionA.getInputStream();
                            try {
                                bArrA = s0.a(inputStream, this.f7707b);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th7) {
                                        th = th7;
                                        try {
                                            HashMap map2 = new HashMap();
                                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", map2);
                                            CollectionUtils.putStringIfValid("url", cVar.f7709a, map2);
                                            CollectionUtils.putStringIfValid("code", Integer.toString(responseCode), map2);
                                            this.f7707b.E().a("NetworkCommunicationThread", "processRequest", th, map2);
                                            throw th;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            i10 = responseCode;
                                            j10 = jElapsedRealtime3;
                                            th2 = th;
                                            try {
                                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                                this.f7707b.Q().a("NetworkCommunicationThread", th2);
                                                this.f7707b.Q();
                                                if (com.applovin.impl.sdk.p.a()) {
                                                    this.f7707b.Q().d("NetworkCommunicationThread", "Failed to make HTTP request", th2);
                                                }
                                                if (httpURLConnectionA != null) {
                                                    try {
                                                        errorStream = httpURLConnectionA.getErrorStream();
                                                        try {
                                                            byte[] bArrA2 = s0.a(errorStream, this.f7707b);
                                                            if (errorStream != null) {
                                                                try {
                                                                    errorStream.close();
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    j10 = j10;
                                                                    bArr = bArrA2;
                                                                    this.f7707b.Q().a("NetworkCommunicationThread", th2);
                                                                    HashMap map3 = new HashMap();
                                                                    CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map3);
                                                                    CollectionUtils.putStringIfValid("url", cVar.f7709a, map3);
                                                                    CollectionUtils.putStringIfValid("code", Integer.toString(i10), map3);
                                                                    this.f7707b.E().a("NetworkCommunicationThread", "processRequest", th, map3);
                                                                    th3 = th2;
                                                                    bArr2 = bArr;
                                                                    responseCode = i10;
                                                                    httpURLConnectionA = httpURLConnectionA;
                                                                    jElapsedRealtime2 = jElapsedRealtime;
                                                                    bArr3 = bArrA;
                                                                    jElapsedRealtime3 = j10;
                                                                }
                                                            }
                                                            th3 = th2;
                                                            jElapsedRealtime3 = j10;
                                                            responseCode = i10;
                                                            httpURLConnectionA = httpURLConnectionA;
                                                            jElapsedRealtime2 = jElapsedRealtime;
                                                            bArr3 = bArrA;
                                                            bArr2 = bArrA2;
                                                        } catch (Throwable th10) {
                                                            if (errorStream == null) {
                                                                throw th10;
                                                            }
                                                            try {
                                                                try {
                                                                    errorStream.close();
                                                                    throw th10;
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    bArr = null;
                                                                    this.f7707b.Q().a("NetworkCommunicationThread", th2);
                                                                    HashMap map4 = new HashMap();
                                                                    CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map4);
                                                                    CollectionUtils.putStringIfValid("url", cVar.f7709a, map4);
                                                                    CollectionUtils.putStringIfValid("code", Integer.toString(i10), map4);
                                                                    this.f7707b.E().a("NetworkCommunicationThread", "processRequest", th, map4);
                                                                    th3 = th2;
                                                                    bArr2 = bArr;
                                                                    responseCode = i10;
                                                                    httpURLConnectionA = httpURLConnectionA;
                                                                    jElapsedRealtime2 = jElapsedRealtime;
                                                                    bArr3 = bArrA;
                                                                    jElapsedRealtime3 = j10;
                                                                    q7.a(httpURLConnectionA, this.f7707b);
                                                                    cVar.f7715g.execute(new x8(0, cVar, d.a().a(responseCode).a(bArr3).b(bArr2).a(jElapsedRealtime2 - jElapsedRealtime3).a(th3).a()));
                                                                }
                                                            } catch (Throwable th12) {
                                                                th10.addSuppressed(th12);
                                                                throw th10;
                                                            }
                                                            th = th11;
                                                            bArr = null;
                                                            this.f7707b.Q().a("NetworkCommunicationThread", th2);
                                                            HashMap map5 = new HashMap();
                                                            CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map5);
                                                            CollectionUtils.putStringIfValid("url", cVar.f7709a, map5);
                                                            CollectionUtils.putStringIfValid("code", Integer.toString(i10), map5);
                                                            this.f7707b.E().a("NetworkCommunicationThread", "processRequest", th, map5);
                                                            th3 = th2;
                                                            bArr2 = bArr;
                                                            responseCode = i10;
                                                            httpURLConnectionA = httpURLConnectionA;
                                                            jElapsedRealtime2 = jElapsedRealtime;
                                                            bArr3 = bArrA;
                                                            jElapsedRealtime3 = j10;
                                                            q7.a(httpURLConnectionA, this.f7707b);
                                                            cVar.f7715g.execute(new x8(0, cVar, d.a().a(responseCode).a(bArr3).b(bArr2).a(jElapsedRealtime2 - jElapsedRealtime3).a(th3).a()));
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } else {
                                                    th3 = th2;
                                                    responseCode = i10;
                                                    httpURLConnectionA = httpURLConnectionA;
                                                    jElapsedRealtime2 = jElapsedRealtime;
                                                    bArr3 = bArrA;
                                                    jElapsedRealtime3 = j10;
                                                    bArr2 = null;
                                                }
                                                q7.a(httpURLConnectionA, this.f7707b);
                                                cVar.f7715g.execute(new x8(0, cVar, d.a().a(responseCode).a(bArr3).b(bArr2).a(jElapsedRealtime2 - jElapsedRealtime3).a(th3).a()));
                                            } catch (Throwable th14) {
                                                q7.a(httpURLConnectionA, this.f7707b);
                                                throw th14;
                                            }
                                        }
                                    }
                                }
                                bArr3 = bArrA;
                                bArr2 = null;
                                th3 = null;
                            } catch (Throwable th15) {
                                if (inputStream == null) {
                                    throw th15;
                                }
                                try {
                                    inputStream.close();
                                    throw th15;
                                } catch (Throwable th16) {
                                    th15.addSuppressed(th16);
                                    throw th15;
                                }
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            bArrA = null;
                            HashMap map6 = new HashMap();
                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", map6);
                            CollectionUtils.putStringIfValid("url", cVar.f7709a, map6);
                            CollectionUtils.putStringIfValid("code", Integer.toString(responseCode), map6);
                            this.f7707b.E().a("NetworkCommunicationThread", "processRequest", th, map6);
                            throw th;
                        }
                    } else {
                        bArr2 = null;
                        th3 = null;
                        bArr3 = null;
                    }
                } catch (Throwable th18) {
                    th = th18;
                    bArrA = null;
                    i10 = responseCode;
                    j10 = jElapsedRealtime3;
                    th2 = th;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    this.f7707b.Q().a("NetworkCommunicationThread", th2);
                    this.f7707b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7707b.Q().d("NetworkCommunicationThread", "Failed to make HTTP request", th2);
                    }
                    if (httpURLConnectionA != null) {
                        errorStream = httpURLConnectionA.getErrorStream();
                        byte[] bArrA3 = s0.a(errorStream, this.f7707b);
                        if (errorStream != null) {
                            errorStream.close();
                        }
                        th3 = th2;
                        jElapsedRealtime3 = j10;
                        responseCode = i10;
                        httpURLConnectionA = httpURLConnectionA;
                        jElapsedRealtime2 = jElapsedRealtime;
                        bArr3 = bArrA;
                        bArr2 = bArrA3;
                    } else {
                        th3 = th2;
                        responseCode = i10;
                        httpURLConnectionA = httpURLConnectionA;
                        jElapsedRealtime2 = jElapsedRealtime;
                        bArr3 = bArrA;
                        jElapsedRealtime3 = j10;
                        bArr2 = null;
                    }
                    q7.a(httpURLConnectionA, this.f7707b);
                    cVar.f7715g.execute(new x8(0, cVar, d.a().a(responseCode).a(bArr3).b(bArr2).a(jElapsedRealtime2 - jElapsedRealtime3).a(th3).a()));
                }
            } catch (Throwable th19) {
                th = th19;
                i10 = 0;
                httpURLConnectionA = null;
                bArrA = null;
            }
            q7.a(httpURLConnectionA, this.f7707b);
            cVar.f7715g.execute(new x8(0, cVar, d.a().a(responseCode).a(bArr3).b(bArr2).a(jElapsedRealtime2 - jElapsedRealtime3).a(th3).a()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f7714f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f7709a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f7710b);
            httpURLConnection.setConnectTimeout(cVar.f7713e);
            httpURLConnection.setReadTimeout(cVar.f7713e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f7711c.isEmpty()) {
                for (Map.Entry entry : cVar.f7711c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c implements Comparable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f7708i = new AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f7711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f7712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final l0.a f7714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f7715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f7716h;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f7717a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f7718b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Map f7719c = new HashMap();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private byte[] f7720d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f7721e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private l0.a f7722f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f7723g;

            public a a(String str) {
                this.f7717a = str;
                return this;
            }

            public a b(String str) {
                this.f7718b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f7719c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f7719c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f7720d = bArr;
                return this;
            }

            public a a(int i10) {
                this.f7721e = i10;
                return this;
            }

            public a a(l0.a aVar) {
                this.f7722f = aVar;
                return this;
            }

            public a a(Executor executor) {
                this.f7723g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f7716h - cVar.f7716h;
        }

        private c(a aVar) {
            this.f7709a = aVar.f7717a;
            this.f7710b = aVar.f7718b;
            this.f7711c = aVar.f7719c != null ? aVar.f7719c : Collections.EMPTY_MAP;
            this.f7712d = aVar.f7720d;
            this.f7713e = aVar.f7721e;
            this.f7714f = aVar.f7722f;
            this.f7715g = aVar.f7723g;
            this.f7716h = f7708i.incrementAndGet();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f7725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f7726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f7727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f7728e;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f7729a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f7730b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte[] f7731c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f7732d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Throwable f7733e;

            public a a(int i10) {
                this.f7729a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f7731c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f7730b = bArr;
                return this;
            }

            public a a(Throwable th2) {
                this.f7733e = th2;
                return this;
            }

            public a a(long j10) {
                this.f7732d = j10;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f7724a;
        }

        public int c() throws Throwable {
            Throwable th2 = this.f7728e;
            if (th2 == null) {
                return this.f7724a;
            }
            throw th2;
        }

        public byte[] d() throws Throwable {
            Throwable th2 = this.f7728e;
            if (th2 == null) {
                return this.f7725b;
            }
            throw th2;
        }

        public long e() {
            return this.f7727d;
        }

        public byte[] f() {
            return this.f7726c;
        }

        private d(a aVar) {
            this.f7724a = aVar.f7729a;
            this.f7725b = aVar.f7730b;
            this.f7726c = aVar.f7731c;
            this.f7727d = aVar.f7732d;
            this.f7728e = aVar.f7733e;
        }
    }

    public d4(com.applovin.impl.sdk.l lVar) {
        this.f7705b = lVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f7705b.a(z4.R)).intValue(); i10++) {
            new b(this.f7704a, i10, this.f7705b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f7704a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
