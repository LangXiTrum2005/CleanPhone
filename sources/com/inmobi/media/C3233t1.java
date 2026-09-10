package com.inmobi.media;

import A.RunnableC0883c;
import A.RunnableC0905n;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.p004ironsource.ko;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3233t1 implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3233t1 f23990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f23991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AdConfig.AssetCacheConfig f23992c;
    public static AdConfig.VastVideoConfig d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExecutorService f23993e;
    public static final ThreadPoolExecutor f;
    public static HandlerC3170p1 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static HandlerThread f23994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f23995i;
    public static final AtomicBoolean j;
    public static final ConcurrentHashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayList f23996l;
    public static final AtomicBoolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C3201r1 f23997n;
    public static final C3217s1 o;

    static {
        C3233t1 c3233t1 = new C3233t1();
        f23990a = c3233t1;
        f23991b = new Object();
        f23995i = new AtomicBoolean(false);
        j = new AtomicBoolean(false);
        f23996l = new ArrayList();
        m = new AtomicBoolean(true);
        f23997n = C3201r1.f23945a;
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("ads", Uc.b(), c3233t1);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        AdConfig adConfig = (AdConfig) configA;
        f23992c = adConfig.getAssetCache();
        d = adConfig.getVastVideo();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new K5("t1".concat("-AP")));
        Intrinsics.e(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        f23993e = executorServiceNewCachedThreadPool;
        int i2 = AbstractC3332z4.f24143a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new K5("t1".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f = threadPoolExecutor;
        HandlerThread handlerThread = new HandlerThread("assetFetcher");
        f23994h = handlerThread;
        D4.a(handlerThread, "assetFetcher");
        HandlerThread handlerThread2 = f23994h;
        Intrinsics.c(handlerThread2);
        Looper looper = handlerThread2.getLooper();
        Intrinsics.e(looper, "getLooper(...)");
        g = new HandlerC3170p1(looper, c3233t1);
        k = new ConcurrentHashMap(2, 0.9f, 2);
        o = new C3217s1();
    }

    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (!(config instanceof AdConfig)) {
            f23992c = null;
            d = null;
        } else {
            AdConfig adConfig = (AdConfig) config;
            f23992c = adConfig.getAssetCache();
            d = adConfig.getVastVideo();
        }
    }

    public final void b(C3072j c3072j) {
        String str = c3072j.f23704c;
        AdConfig.AssetCacheConfig assetCacheConfig = f23992c;
        if (str == null || str.length() == 0 || assetCacheConfig == null) {
            return;
        }
        File file = new File(str);
        long jMin = Math.min((c3072j.g - c3072j.f23705e) + System.currentTimeMillis(), (assetCacheConfig.getTimeToLive() * ((long) 1000)) + System.currentTimeMillis());
        int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String url = c3072j.f23703b;
        int maxRetries = assetCacheConfig.getMaxRetries();
        long j2 = c3072j.f23706h;
        Intrinsics.f(url, "url");
        C3072j c3072j2 = new C3072j(iNextInt, url, str, maxRetries, jCurrentTimeMillis, jCurrentTimeMillis2, jMin, j2);
        c3072j2.f23705e = System.currentTimeMillis();
        Nc.a().a(c3072j2);
        long j3 = c3072j.f23705e;
        c3072j2.j = AbstractC3104l.a(c3072j, file, j3, j3);
        c3072j2.f23707i = true;
        a(c3072j2, (byte) -1);
    }

    public final synchronized void c(String str) {
        int size = f23996l.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3088k c3088k = (C3088k) f23996l.get(i2);
            Iterator it = c3088k.f23733h.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(((C3307xb) it.next()).f24104b, str)) {
                    c3088k.f23730b++;
                    break;
                }
            }
        }
    }

    public final synchronized void d(String str) {
        int size = f23996l.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3088k c3088k = (C3088k) f23996l.get(i2);
            Set set = c3088k.f23733h;
            HashSet hashSet = c3088k.f23732e;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(((C3307xb) it.next()).f24104b, str)) {
                    if (!hashSet.contains(str)) {
                        c3088k.f23732e.add(str);
                        c3088k.f23729a++;
                        break;
                    }
                    break;
                }
            }
        }
    }

    public final synchronized void e() {
        try {
            ArrayList arrayList = new ArrayList();
            int size = f23996l.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3088k c3088k = (C3088k) f23996l.get(i2);
                if (c3088k.f23729a == c3088k.f23733h.size()) {
                    try {
                        InterfaceC3249u1 interfaceC3249u1 = (InterfaceC3249u1) c3088k.d.get();
                        if (interfaceC3249u1 != null) {
                            interfaceC3249u1.a(c3088k);
                        }
                        arrayList.add(c3088k);
                    } catch (Exception e2) {
                        S5 s5 = S5.f23167a;
                        S5.d.a(AbstractC3285w5.a(e2, "event"));
                    }
                }
            }
            b(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(C3072j c3072j) {
        int size = f23996l.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3088k c3088k = (C3088k) f23996l.get(i2);
            Iterator it = c3088k.f23733h.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(((C3307xb) it.next()).f24104b, c3072j.f23703b)) {
                    if (!c3088k.g.contains(c3072j)) {
                        c3088k.g.add(c3072j);
                        break;
                    }
                    break;
                }
            }
        }
    }

    public final void c() {
        if (m.get()) {
            j.set(false);
            if (T9.a(false) != null) {
                H7 h7F = Uc.f();
                C3201r1 c3201r1 = f23997n;
                h7F.a(c3201r1);
                Uc.f().a(new int[]{10, 2, 1}, c3201r1);
                return;
            }
            synchronized (f23991b) {
                try {
                    if (f23995i.compareAndSet(false, true)) {
                        if (f23994h == null) {
                            HandlerThread handlerThread = new HandlerThread("assetFetcher");
                            f23994h = handlerThread;
                            D4.a(handlerThread, "assetFetcher");
                        }
                        if (g == null) {
                            HandlerThread handlerThread2 = f23994h;
                            Intrinsics.c(handlerThread2);
                            Looper looper = handlerThread2.getLooper();
                            Intrinsics.e(looper, "getLooper(...)");
                            g = new HandlerC3170p1(looper, this);
                        }
                        if (Nc.a().b().isEmpty()) {
                            d();
                        } else {
                            H7 h7F2 = Uc.f();
                            C3201r1 c3201r2 = f23997n;
                            h7F2.a(c3201r2);
                            Uc.f().a(new int[]{10, 2, 1}, c3201r2);
                            HandlerC3170p1 handlerC3170p1 = g;
                            Intrinsics.c(handlerC3170p1);
                            handlerC3170p1.sendEmptyMessage(1);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void d() {
        if (m.get()) {
            synchronized (f23991b) {
                f23995i.set(false);
                k.clear();
                HandlerThread handlerThread = f23994h;
                if (handlerThread != null) {
                    handlerThread.getLooper().quit();
                    handlerThread.interrupt();
                    f23994h = null;
                    g = null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[Catch: all -> 0x009a, Exception -> 0x01a7, IOException -> 0x01ba, ProtocolException -> 0x01c8, MalformedURLException -> 0x01d6, FileNotFoundException -> 0x01e3, SocketTimeoutException -> 0x01f1, TryCatch #8 {FileNotFoundException -> 0x01e3, MalformedURLException -> 0x01d6, ProtocolException -> 0x01c8, SocketTimeoutException -> 0x01f1, IOException -> 0x01ba, Exception -> 0x01a7, all -> 0x009a, blocks: (B:14:0x0054, B:16:0x0080, B:18:0x008d, B:20:0x0091, B:22:0x0097, B:25:0x009f, B:26:0x00a1, B:28:0x00a5, B:29:0x00b0, B:33:0x00c0, B:35:0x00cd, B:37:0x00de, B:38:0x00e1), top: B:120:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00de A[Catch: all -> 0x009a, Exception -> 0x01a7, IOException -> 0x01ba, ProtocolException -> 0x01c8, MalformedURLException -> 0x01d6, FileNotFoundException -> 0x01e3, SocketTimeoutException -> 0x01f1, TryCatch #8 {FileNotFoundException -> 0x01e3, MalformedURLException -> 0x01d6, ProtocolException -> 0x01c8, SocketTimeoutException -> 0x01f1, IOException -> 0x01ba, Exception -> 0x01a7, all -> 0x009a, blocks: (B:14:0x0054, B:16:0x0080, B:18:0x008d, B:20:0x0091, B:22:0x0097, B:25:0x009f, B:26:0x00a1, B:28:0x00a5, B:29:0x00b0, B:33:0x00c0, B:35:0x00cd, B:37:0x00de, B:38:0x00e1), top: B:120:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    public static boolean a(C3072j c3072j, InterfaceC3138n1 interfaceC3138n1) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        InputStream inputStream4;
        InputStream inputStream5;
        InputStream inputStream6;
        InputStream inputStream7;
        BufferedOutputStream bufferedOutputStream2;
        InputStream inputStream8;
        InputStream inputStream9;
        long contentLength;
        File fileA;
        InputStream inputStream10;
        byte[] bArr;
        long j2;
        int i2;
        C3072j c3072j2 = (C3072j) k.putIfAbsent(c3072j.f23703b, c3072j);
        AdConfig.VastVideoConfig vastVideoConfig = d;
        if (c3072j2 != null || vastVideoConfig == null) {
            return false;
        }
        C3120m c3120m = new C3120m(interfaceC3138n1);
        long vastMaxAssetSize = vastVideoConfig.getVastMaxAssetSize();
        List<String> allowedContentType = vastVideoConfig.getAllowedContentType();
        Intrinsics.f(allowedContentType, "allowedContentType");
        if (T9.a(false) != null) {
            c3072j.f23708l = (byte) 5;
            interfaceC3138n1.a(c3072j);
        } else if (!Intrinsics.a(c3072j.f23703b, "") && URLUtil.isValidUrl(c3072j.f23703b)) {
            String[] strArr = (String[]) allowedContentType.toArray(new String[0]);
            BufferedOutputStream bufferedOutputStream3 = null;
            try {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    URLConnection uRLConnectionOpenConnection = new URL(c3072j.f23703b).openConnection();
                    Intrinsics.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod(ko.f25534a);
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(60000);
                    if (httpURLConnection.getResponseCode() < 400) {
                        String contentType = httpURLConnection.getContentType();
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        for (String str : strArr) {
                            if (contentType != null && StringsKt.r(str, contentType, true)) {
                                booleanRef.X = true;
                                break;
                            }
                        }
                        if (!booleanRef.X) {
                            c3072j.f23708l = (byte) 3;
                            c3072j.d = 0;
                            c3120m.f23799a.a(c3072j);
                        } else {
                            contentLength = httpURLConnection.getContentLength();
                            if (contentLength < 0 && contentLength > vastMaxAssetSize) {
                                c3072j.f23708l = (byte) 4;
                                c3072j.d = 0;
                                c3120m.f23799a.a(c3072j);
                            } else {
                                httpURLConnection.connect();
                                fileA = Uc.f23270a.a(c3072j.f23703b);
                                if (fileA.exists()) {
                                    fileA.delete();
                                }
                                inputStream10 = httpURLConnection.getInputStream();
                                try {
                                    bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(fileA));
                                    try {
                                        bArr = new byte[1024];
                                        j2 = 0;
                                        while (true) {
                                            i2 = inputStream10.read(bArr);
                                            if (i2 > 0) {
                                                inputStream9 = inputStream10;
                                                bufferedOutputStream2.flush();
                                                httpURLConnection.disconnect();
                                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                                P9 p9 = new P9();
                                                p9.f = httpURLConnection.getHeaderFields();
                                                c3072j.j = AbstractC3104l.a(c3072j, fileA, jElapsedRealtime, jElapsedRealtime2);
                                                c3072j.k = jElapsedRealtime2 - jElapsedRealtime;
                                                InterfaceC3138n1 interfaceC3138n2 = c3120m.f23799a;
                                                String absolutePath = fileA.getAbsolutePath();
                                                Intrinsics.e(absolutePath, "getAbsolutePath(...)");
                                                interfaceC3138n2.a(p9, absolutePath, c3072j);
                                                break;
                                            }
                                            inputStream9 = inputStream10;
                                            j2 += (long) i2;
                                            if (j2 > vastMaxAssetSize) {
                                                c3072j.f23708l = (byte) 4;
                                                c3072j.d = 0;
                                                C3120m.a(fileA, httpURLConnection, bufferedOutputStream2);
                                                c3120m.f23799a.a(c3072j);
                                                break;
                                            }
                                            try {
                                                bufferedOutputStream2.write(bArr, 0, i2);
                                                inputStream10 = inputStream9;
                                            } catch (FileNotFoundException unused) {
                                                bufferedOutputStream3 = bufferedOutputStream2;
                                                c3072j.a((byte) 2);
                                                c3120m.f23799a.a(c3072j);
                                                bufferedOutputStream2 = bufferedOutputStream3;
                                                T9.a((Closeable) inputStream9);
                                                T9.a(bufferedOutputStream2);
                                                return true;
                                            } catch (MalformedURLException unused2) {
                                                bufferedOutputStream3 = bufferedOutputStream2;
                                                c3072j.a((byte) 1);
                                                c3120m.f23799a.a(c3072j);
                                                bufferedOutputStream2 = bufferedOutputStream3;
                                                T9.a((Closeable) inputStream9);
                                                T9.a(bufferedOutputStream2);
                                                return true;
                                            } catch (ProtocolException unused3) {
                                                bufferedOutputStream3 = bufferedOutputStream2;
                                                c3072j.a((byte) 5);
                                                c3120m.f23799a.a(c3072j);
                                                bufferedOutputStream2 = bufferedOutputStream3;
                                                T9.a((Closeable) inputStream9);
                                                T9.a(bufferedOutputStream2);
                                                return true;
                                            } catch (SocketTimeoutException unused4) {
                                                bufferedOutputStream3 = bufferedOutputStream2;
                                                c3072j.a((byte) 2);
                                                c3120m.f23799a.a(c3072j);
                                                bufferedOutputStream2 = bufferedOutputStream3;
                                                T9.a((Closeable) inputStream9);
                                                T9.a(bufferedOutputStream2);
                                                return true;
                                            } catch (IOException unused5) {
                                                bufferedOutputStream3 = bufferedOutputStream2;
                                                c3072j.a((byte) 5);
                                                c3120m.f23799a.a(c3072j);
                                                bufferedOutputStream2 = bufferedOutputStream3;
                                                T9.a((Closeable) inputStream9);
                                                T9.a(bufferedOutputStream2);
                                                return true;
                                            } catch (Exception unused6) {
                                                bufferedOutputStream3 = bufferedOutputStream2;
                                                c3072j.a((byte) 0);
                                                c3120m.f23799a.a(c3072j);
                                                bufferedOutputStream2 = bufferedOutputStream3;
                                                T9.a((Closeable) inputStream9);
                                                T9.a(bufferedOutputStream2);
                                                return true;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream8 = inputStream9;
                                                T9.a((Closeable) inputStream8);
                                                T9.a(bufferedOutputStream2);
                                                throw th;
                                            }
                                        }
                                    } catch (FileNotFoundException unused7) {
                                        inputStream9 = inputStream10;
                                    } catch (MalformedURLException unused8) {
                                        inputStream9 = inputStream10;
                                    } catch (ProtocolException unused9) {
                                        inputStream9 = inputStream10;
                                    } catch (SocketTimeoutException unused10) {
                                        inputStream9 = inputStream10;
                                    } catch (IOException unused11) {
                                        inputStream9 = inputStream10;
                                    } catch (Exception unused12) {
                                        inputStream9 = inputStream10;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream9 = inputStream10;
                                    }
                                } catch (FileNotFoundException unused13) {
                                    inputStream7 = inputStream10;
                                    inputStream9 = inputStream7;
                                    bufferedOutputStream3 = null;
                                    c3072j.a((byte) 2);
                                    c3120m.f23799a.a(c3072j);
                                    bufferedOutputStream2 = bufferedOutputStream3;
                                    T9.a((Closeable) inputStream9);
                                    T9.a(bufferedOutputStream2);
                                    return true;
                                } catch (MalformedURLException unused14) {
                                    inputStream6 = inputStream10;
                                    inputStream9 = inputStream6;
                                    bufferedOutputStream3 = null;
                                    c3072j.a((byte) 1);
                                    c3120m.f23799a.a(c3072j);
                                    bufferedOutputStream2 = bufferedOutputStream3;
                                    T9.a((Closeable) inputStream9);
                                    T9.a(bufferedOutputStream2);
                                    return true;
                                } catch (ProtocolException unused15) {
                                    inputStream5 = inputStream10;
                                    inputStream9 = inputStream5;
                                    bufferedOutputStream3 = null;
                                    c3072j.a((byte) 5);
                                    c3120m.f23799a.a(c3072j);
                                    bufferedOutputStream2 = bufferedOutputStream3;
                                    T9.a((Closeable) inputStream9);
                                    T9.a(bufferedOutputStream2);
                                    return true;
                                } catch (SocketTimeoutException unused16) {
                                    inputStream4 = inputStream10;
                                    inputStream9 = inputStream4;
                                    bufferedOutputStream3 = null;
                                    c3072j.a((byte) 2);
                                    c3120m.f23799a.a(c3072j);
                                    bufferedOutputStream2 = bufferedOutputStream3;
                                    T9.a((Closeable) inputStream9);
                                    T9.a(bufferedOutputStream2);
                                    return true;
                                } catch (IOException unused17) {
                                    inputStream3 = inputStream10;
                                    inputStream9 = inputStream3;
                                    bufferedOutputStream3 = null;
                                    c3072j.a((byte) 5);
                                    c3120m.f23799a.a(c3072j);
                                    bufferedOutputStream2 = bufferedOutputStream3;
                                    T9.a((Closeable) inputStream9);
                                    T9.a(bufferedOutputStream2);
                                    return true;
                                } catch (Exception unused18) {
                                    inputStream2 = inputStream10;
                                    inputStream9 = inputStream2;
                                    bufferedOutputStream3 = null;
                                    c3072j.a((byte) 0);
                                    c3120m.f23799a.a(c3072j);
                                    bufferedOutputStream2 = bufferedOutputStream3;
                                    T9.a((Closeable) inputStream9);
                                    T9.a(bufferedOutputStream2);
                                    return true;
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream = inputStream10;
                                    bufferedOutputStream = null;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    inputStream8 = inputStream;
                                    T9.a((Closeable) inputStream8);
                                    T9.a(bufferedOutputStream2);
                                    throw th;
                                }
                                T9.a((Closeable) inputStream9);
                                T9.a(bufferedOutputStream2);
                            }
                        }
                        boolean z2 = T9.f23231a;
                    } else {
                        contentLength = httpURLConnection.getContentLength();
                        if (contentLength < 0) {
                        }
                        httpURLConnection.connect();
                        fileA = Uc.f23270a.a(c3072j.f23703b);
                        if (fileA.exists()) {
                            fileA.delete();
                        }
                        inputStream10 = httpURLConnection.getInputStream();
                        bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(fileA));
                        bArr = new byte[1024];
                        j2 = 0;
                        while (true) {
                            i2 = inputStream10.read(bArr);
                            if (i2 > 0) {
                                inputStream9 = inputStream10;
                                bufferedOutputStream2.flush();
                                httpURLConnection.disconnect();
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                                P9 p10 = new P9();
                                p10.f = httpURLConnection.getHeaderFields();
                                c3072j.j = AbstractC3104l.a(c3072j, fileA, jElapsedRealtime, jElapsedRealtime3);
                                c3072j.k = jElapsedRealtime3 - jElapsedRealtime;
                                InterfaceC3138n1 interfaceC3138n3 = c3120m.f23799a;
                                String absolutePath2 = fileA.getAbsolutePath();
                                Intrinsics.e(absolutePath2, "getAbsolutePath(...)");
                                interfaceC3138n3.a(p10, absolutePath2, c3072j);
                                break;
                            }
                            inputStream9 = inputStream10;
                            j2 += (long) i2;
                            if (j2 > vastMaxAssetSize) {
                                c3072j.f23708l = (byte) 4;
                                c3072j.d = 0;
                                C3120m.a(fileA, httpURLConnection, bufferedOutputStream2);
                                c3120m.f23799a.a(c3072j);
                                break;
                            }
                            bufferedOutputStream2.write(bArr, 0, i2);
                            inputStream10 = inputStream9;
                        }
                        T9.a((Closeable) inputStream9);
                        T9.a(bufferedOutputStream2);
                    }
                } catch (FileNotFoundException unused19) {
                    inputStream7 = null;
                } catch (MalformedURLException unused20) {
                    inputStream6 = null;
                } catch (ProtocolException unused21) {
                    inputStream5 = null;
                } catch (SocketTimeoutException unused22) {
                    inputStream4 = null;
                } catch (IOException unused23) {
                    inputStream3 = null;
                } catch (Exception unused24) {
                    inputStream2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                    inputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = bufferedOutputStream3;
                inputStream = inputStream9;
            }
        } else {
            c3072j.a((byte) 1);
            interfaceC3138n1.a(c3072j);
        }
        return true;
    }

    public final synchronized void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f23996l.remove(arrayList.get(i2));
        }
    }

    public static void b() {
        ArrayList arrayListA = Nc.a().a();
        long length = 0;
        if (!arrayListA.isEmpty()) {
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String str = ((C3072j) it.next()).f23704c;
                if (str != null) {
                    length += new File(str).length();
                }
            }
        }
        AdConfig.AssetCacheConfig assetCacheConfig = f23992c;
        if (assetCacheConfig != null) {
            assetCacheConfig.getMaxCacheSize();
            if (length > assetCacheConfig.getMaxCacheSize()) {
                C3122m1 c3122m1A = Nc.a();
                c3122m1A.getClass();
                ArrayList arrayListA2 = T1.a(c3122m1A, null, null, null, null, "ts ASC ", 1, 15);
                C3072j c3072j = arrayListA2.isEmpty() ? null : (C3072j) arrayListA2.get(0);
                if (c3072j != null) {
                    if (m.get()) {
                        C3122m1 c3122m1A2 = Nc.a();
                        c3122m1A2.getClass();
                        c3122m1A2.a("id = ?", new String[]{String.valueOf(c3072j.f23702a)});
                        String str2 = c3072j.f23704c;
                        if (str2 != null) {
                            File file = new File(str2);
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                    b();
                }
            }
        }
    }

    public static final void b(C3088k assetBatch) {
        Intrinsics.f(assetBatch, "$assetBatch");
        synchronized (f23990a) {
            ArrayList arrayList = f23996l;
            if (!arrayList.contains(assetBatch)) {
                arrayList.add(assetBatch);
            }
        }
        assetBatch.f23733h.size();
        Iterator it = assetBatch.f23733h.iterator();
        while (it.hasNext()) {
            String str = ((C3307xb) it.next()).f24104b;
            C3233t1 c3233t1 = f23990a;
            C3072j c3072jA = Nc.a().a(str);
            if (c3072jA != null && c3072jA.a()) {
                c3233t1.b(c3072jA);
            } else {
                a(str);
            }
        }
    }

    public static final void b(C3088k assetBatch, String adType) {
        String str;
        Intrinsics.f(assetBatch, "$assetBatch");
        Intrinsics.f(adType, "$adType");
        synchronized (f23990a) {
            ArrayList arrayList = f23996l;
            if (!arrayList.contains(assetBatch)) {
                arrayList.add(assetBatch);
            }
        }
        assetBatch.f23733h.size();
        ArrayList<String> arrayList2 = new ArrayList();
        ArrayList<String> arrayList3 = new ArrayList();
        for (C3307xb c3307xb : assetBatch.f23733h) {
            String str2 = c3307xb.f24104b;
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.h(str2.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() > 0 && c3307xb.f24103a == 2) {
                arrayList2.add(c3307xb.f24104b);
            } else {
                arrayList3.add(c3307xb.f24104b);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(arrayList2.size());
        for (String str3 : arrayList2) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Context contextD = Uc.d();
                if (contextD != null) {
                    C3322ya c3322ya = C3322ya.f24129a;
                    RequestCreator requestCreatorLoad = c3322ya.a(contextD).load(str3);
                    str = adType;
                    try {
                        Object objA = c3322ya.a(new C3186q1(countDownLatch, str3, jElapsedRealtime, str));
                        requestCreatorLoad.fetch(objA instanceof Callback ? (Callback) objA : null);
                    } catch (Exception unused) {
                        countDownLatch.countDown();
                    }
                    adType = str;
                }
            } catch (Exception unused2) {
                str = adType;
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
        }
        C3233t1 c3233t1 = f23990a;
        c3233t1.e();
        c3233t1.a((byte) 0);
        for (String str4 : arrayList3) {
            C3233t1 c3233t2 = f23990a;
            C3072j c3072jA = Nc.a().a(str4);
            if (c3072jA != null && c3072jA.a()) {
                c3233t2.b(c3072jA);
            } else {
                a(str4);
            }
        }
    }

    public final synchronized void a(C3072j c3072j, byte b2) {
        a(c3072j);
        k.remove(c3072j.f23703b);
        if (b2 == -1) {
            d(c3072j.f23703b);
            e();
        } else {
            c(c3072j.f23703b);
            a(b2);
        }
    }

    public static final void b(String remoteUrl) {
        Intrinsics.f(remoteUrl, "$remoteUrl");
        C3072j c3072jA = Nc.a().a(remoteUrl);
        if (c3072jA != null) {
            if (c3072jA.a()) {
                f23990a.b(c3072jA);
            } else {
                a(c3072jA, o);
            }
        }
    }

    public final synchronized void a(byte b2) {
        try {
            ArrayList arrayList = new ArrayList();
            int size = f23996l.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3088k c3088k = (C3088k) f23996l.get(i2);
                if (c3088k.f23730b > 0) {
                    try {
                        InterfaceC3249u1 interfaceC3249u1 = (InterfaceC3249u1) c3088k.d.get();
                        if (interfaceC3249u1 != null) {
                            interfaceC3249u1.a(c3088k, b2);
                        }
                        arrayList.add(c3088k);
                    } catch (Exception e2) {
                        S5 s5 = S5.f23167a;
                        S5.d.a(AbstractC3285w5.a(e2, "event"));
                    }
                }
            }
            b(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void a() {
        if (m.get()) {
            synchronized (f23991b) {
                try {
                    ArrayList<C3072j> arrayListA = Nc.a().a();
                    if (arrayListA.isEmpty()) {
                        return;
                    }
                    for (C3072j c3072j : arrayListA) {
                        c3072j.getClass();
                        if (System.currentTimeMillis() > c3072j.g && m.get()) {
                            C3122m1 c3122m1A = Nc.a();
                            c3122m1A.getClass();
                            c3122m1A.a("id = ?", new String[]{String.valueOf(c3072j.f23702a)});
                            String str = c3072j.f23704c;
                            if (str != null) {
                                File file = new File(str);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }
                    }
                    b();
                    a(arrayListA);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(ArrayList arrayList) {
        File[] fileArrListFiles;
        File fileB = Uc.f23270a.b(Uc.d());
        if (!fileB.exists() || (fileArrListFiles = fileB.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    file.getAbsolutePath();
                    file.delete();
                    break;
                }
            } while (!Intrinsics.a(file.getAbsolutePath(), ((C3072j) it.next()).f23704c));
        }
    }

    public static void a(C3088k assetBatch) {
        Intrinsics.f(assetBatch, "assetBatch");
        if (m.get()) {
            f23993e.execute(new RunnableC0883c(assetBatch, 22));
        }
    }

    public static void a(C3088k assetBatch, String adType) {
        Intrinsics.f(assetBatch, "assetBatch");
        Intrinsics.f(adType, "adType");
        if (m.get()) {
            f23993e.execute(new RunnableC0905n(25, assetBatch, adType));
        }
    }

    public static void a(String url) {
        C3072j c3072j;
        AdConfig.AssetCacheConfig assetCacheConfig = f23992c;
        if (assetCacheConfig != null) {
            int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int maxRetries = assetCacheConfig.getMaxRetries();
            long timeToLive = assetCacheConfig.getTimeToLive();
            Intrinsics.f(url, "url");
            c3072j = new C3072j(iNextInt, url, null, maxRetries, jCurrentTimeMillis, jCurrentTimeMillis2, timeToLive + System.currentTimeMillis(), 0L);
        } else {
            c3072j = null;
        }
        if (Nc.a().a(url) == null && c3072j != null) {
            C3122m1 c3122m1A = Nc.a();
            synchronized (c3122m1A) {
                c3122m1A.a(c3072j, "url = ?", new String[]{c3072j.f23703b});
            }
        }
        f.execute(new A.w0(url, 0));
    }
}
