package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/ImageDownloader;", "", "CacheReadWorkItem", "DownloadImageWorkItem", "DownloaderContext", "RequestKey", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ImageDownloader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f16325a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImageDownloader f16328e = new ImageDownloader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WorkQueue f16326b = new WorkQueue(8, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WorkQueue f16327c = new WorkQueue(2, 0);
    public static final HashMap d = new HashMap();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;", "Ljava/lang/Runnable;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class CacheReadWorkItem implements Runnable {
        public final RequestKey X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f16329Y;

        public CacheReadWorkItem(RequestKey requestKey, boolean z2) {
            this.X = requestKey;
            this.f16329Y = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                Handler handler = ImageDownloader.f16325a;
                ImageDownloader.b(this.X, this.f16329Y);
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;", "Ljava/lang/Runnable;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class DownloadImageWorkItem implements Runnable {
        public final RequestKey X;

        public DownloadImageWorkItem(RequestKey requestKey) {
            this.X = requestKey;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                Handler handler = ImageDownloader.f16325a;
                ImageDownloader.a(this.X);
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/ImageDownloader$DownloaderContext;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class DownloaderContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WorkQueue.WorkItem f16330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageRequest f16332c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/ImageDownloader$RequestKey;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class RequestKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f16333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f16334b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/ImageDownloader$RequestKey$Companion;", "", "", "HASH_MULTIPLIER", "I", "HASH_SEED", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof RequestKey)) {
                RequestKey requestKey = (RequestKey) obj;
                if (requestKey.f16333a == this.f16333a && requestKey.f16334b == this.f16334b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f16334b.hashCode() + ((this.f16333a.hashCode() + 1073) * 37);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(RequestKey requestKey) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r5;
        Exception facebookException;
        InputStream inputStreamC;
        Bitmap bitmapDecodeStream;
        ImageDownloader imageDownloader = f16328e;
        ?? r2 = 0;
        InputStream inputStream = null;
        r2 = 0;
        Bitmap bitmap = null;
        boolean z2 = true;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(requestKey.f16333a.toString()).openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    ?? responseCode = httpURLConnection.getResponseCode();
                    try {
                        if (responseCode != 200) {
                            if (responseCode == 301 || responseCode == 302) {
                                try {
                                    String headerField = httpURLConnection.getHeaderField("location");
                                    if (!Utility.C(headerField)) {
                                        Uri redirectUri = Uri.parse(headerField);
                                        UrlRedirectCache.a(requestKey.f16333a, redirectUri);
                                        DownloaderContext downloaderContextG = g(requestKey);
                                        if (downloaderContextG != null && !downloaderContextG.f16331b) {
                                            ImageRequest imageRequest = downloaderContextG.f16332c;
                                            Intrinsics.e(redirectUri, "redirectUri");
                                            Object obj = requestKey.f16334b;
                                            try {
                                                RequestKey requestKey2 = new RequestKey();
                                                requestKey2.f16333a = redirectUri;
                                                requestKey2.f16334b = obj;
                                                try {
                                                    e(imageRequest, requestKey2, f16327c, new CacheReadWorkItem(requestKey2, false));
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    e = e;
                                                    z2 = false;
                                                    r5 = 0;
                                                    Utility.e(r5);
                                                    Utility.l(httpURLConnection);
                                                    facebookException = e;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    bitmapDecodeStream = null;
                                    facebookException = null;
                                } catch (IOException e4) {
                                    e = e4;
                                }
                            } else {
                                inputStreamC = httpURLConnection.getErrorStream();
                                StringBuilder sb = new StringBuilder();
                                if (inputStreamC != null) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamC);
                                    char[] cArr = new char[128];
                                    while (true) {
                                        int i2 = inputStreamReader.read(cArr, 0, 128);
                                        if (i2 <= 0) {
                                            break;
                                        } else {
                                            sb.append(cArr, 0, i2);
                                        }
                                    }
                                    Utility.e(inputStreamReader);
                                } else {
                                    sb.append("Unexpected error while downloading an image.");
                                }
                                facebookException = new FacebookException(sb.toString());
                                bitmapDecodeStream = null;
                            }
                            Utility.e(inputStream);
                            Utility.l(httpURLConnection);
                            bitmap = bitmapDecodeStream;
                            if (z2) {
                                imageDownloader.f(requestKey, facebookException, bitmap, false);
                            }
                        }
                        inputStreamC = ImageResponseCache.c(httpURLConnection);
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamC);
                        facebookException = null;
                        inputStream = inputStreamC;
                        Utility.e(inputStream);
                        Utility.l(httpURLConnection);
                        bitmap = bitmapDecodeStream;
                    } catch (IOException e5) {
                        e = e5;
                        r5 = responseCode;
                        Utility.e(r5);
                        Utility.l(httpURLConnection);
                        facebookException = e;
                    } catch (Throwable th) {
                        th = th;
                        r2 = responseCode;
                        Utility.e(r2);
                        Utility.l(httpURLConnection);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e6) {
                e = e6;
            }
            if (z2) {
                imageDownloader.f(requestKey, facebookException, bitmap, false);
            }
        } catch (IOException e7) {
            e = e7;
            httpURLConnection = null;
            r5 = 0;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0084: MOVE (r1 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:133), block:B:28:0x0084 */
    public static final void b(RequestKey requestKey, boolean z2) throws Throwable {
        BufferedInputStream bufferedInputStreamB;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        Uri uri;
        ImageDownloader imageDownloader = f16328e;
        InputStreamReader inputStreamReader3 = null;
        boolean z3 = false;
        if (z2) {
            Uri uri2 = requestKey.f16333a;
            String str = UrlRedirectCache.f16374a;
            LoggingBehavior loggingBehavior = LoggingBehavior.e0;
            String str2 = UrlRedirectCache.f16375b;
            String string = uri2.toString();
            Intrinsics.e(string, "uri.toString()");
            HashSet hashSet = new HashSet();
            hashSet.add(string);
            try {
                try {
                    FileLruCache fileLruCacheB = UrlRedirectCache.b();
                    BufferedInputStream bufferedInputStreamC = fileLruCacheB.c(string, str2);
                    inputStreamReader = null;
                    boolean z4 = false;
                    String str3 = string;
                    while (true) {
                        if (bufferedInputStreamC != null) {
                            try {
                                InputStreamReader inputStreamReader4 = new InputStreamReader(bufferedInputStreamC);
                                try {
                                    char[] cArr = new char[128];
                                    StringBuilder sb = new StringBuilder();
                                    for (int i2 = inputStreamReader4.read(cArr, 0, 128); i2 > 0; i2 = inputStreamReader4.read(cArr, 0, 128)) {
                                        sb.append(cArr, 0, i2);
                                    }
                                    Utility.e(inputStreamReader4);
                                    String string2 = sb.toString();
                                    Intrinsics.e(string2, "urlBuilder.toString()");
                                    if (hashSet.contains(string2)) {
                                        if (string2.equals(str3)) {
                                            inputStreamReader = inputStreamReader4;
                                            z4 = true;
                                        } else {
                                            HashMap map = Logger.d;
                                            Logger.Companion.b(loggingBehavior, str, "A loop detected in UrlRedirectCache");
                                            Utility.e(inputStreamReader4);
                                        }
                                        uri = null;
                                        if (uri != null) {
                                            bufferedInputStreamB = ImageResponseCache.b(uri);
                                            if (bufferedInputStreamB != null) {
                                                z3 = true;
                                            }
                                        } else {
                                            bufferedInputStreamB = null;
                                        }
                                    } else {
                                        hashSet.add(string2);
                                        bufferedInputStreamC = fileLruCacheB.c(string2, str2);
                                        str3 = string2;
                                        inputStreamReader = inputStreamReader4;
                                        z4 = true;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    inputStreamReader = inputStreamReader4;
                                    HashMap map2 = Logger.d;
                                    Logger.Companion.b(loggingBehavior, str, "IOException when accessing cache: " + e.getMessage());
                                } catch (Throwable th) {
                                    th = th;
                                    inputStreamReader3 = inputStreamReader4;
                                    Utility.e(inputStreamReader3);
                                    throw th;
                                }
                            } catch (IOException e3) {
                                e = e3;
                            }
                        }
                        if (z4) {
                            uri = Uri.parse(str3);
                            Utility.e(inputStreamReader);
                        } else {
                            Utility.e(inputStreamReader);
                            uri = null;
                        }
                        if (uri != null) {
                            bufferedInputStreamB = ImageResponseCache.b(uri);
                            if (bufferedInputStreamB != null) {
                                z3 = true;
                            }
                        } else {
                            bufferedInputStreamB = null;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    inputStreamReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader3 = inputStreamReader2;
            }
        } else {
            bufferedInputStreamB = null;
        }
        if (!z3) {
            bufferedInputStreamB = ImageResponseCache.b(requestKey.f16333a);
        }
        if (bufferedInputStreamB != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamB);
            Utility.e(bufferedInputStreamB);
            imageDownloader.f(requestKey, null, bitmapDecodeStream, z3);
            return;
        }
        DownloaderContext downloaderContextG = g(requestKey);
        ImageRequest imageRequest = downloaderContextG != null ? downloaderContextG.f16332c : null;
        if (downloaderContextG == null || downloaderContextG.f16331b || imageRequest == null) {
            return;
        }
        e(imageRequest, requestKey, f16326b, new DownloadImageWorkItem(requestKey));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0015, B:6:0x001d, B:8:0x0022, B:12:0x0037, B:17:0x0044, B:15:0x003e, B:18:0x0048, B:19:0x004b, B:20:0x004c, B:9:0x002b, B:11:0x002f), top: B:26:0x0015, inners: #1 }] */
    public static final void c(ImageRequest request) {
        boolean z2;
        Intrinsics.f(request, "request");
        Uri uri = request.f16337b;
        Object obj = request.f16339e;
        RequestKey requestKey = new RequestKey();
        requestKey.f16333a = uri;
        requestKey.f16334b = obj;
        HashMap map = d;
        synchronized (map) {
            DownloaderContext downloaderContext = (DownloaderContext) map.get(requestKey);
            if (downloaderContext != null) {
                WorkQueue.WorkItem workItem = downloaderContext.f16330a;
                if (workItem != null) {
                    WorkQueue.WorkNode workNode = (WorkQueue.WorkNode) workItem;
                    WorkQueue workQueue = WorkQueue.this;
                    ReentrantLock reentrantLock = workQueue.f16399a;
                    reentrantLock.lock();
                    try {
                        if (workNode.f16405c) {
                            reentrantLock.unlock();
                            z2 = false;
                        } else {
                            workQueue.f16400b = workNode.b(workQueue.f16400b);
                            reentrantLock.unlock();
                            z2 = true;
                        }
                        if (z2) {
                            map.remove(requestKey);
                        } else {
                            downloaderContext.f16331b = true;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    downloaderContext.f16331b = true;
                }
            }
        }
    }

    public static final void d(ImageRequest imageRequest) {
        Uri uri = imageRequest.f16337b;
        Object obj = imageRequest.f16339e;
        RequestKey requestKey = new RequestKey();
        requestKey.f16333a = uri;
        requestKey.f16334b = obj;
        HashMap map = d;
        synchronized (map) {
            DownloaderContext downloaderContext = (DownloaderContext) map.get(requestKey);
            if (downloaderContext != null) {
                downloaderContext.f16332c = imageRequest;
                downloaderContext.f16331b = false;
                WorkQueue.WorkItem workItem = downloaderContext.f16330a;
                if (workItem != null) {
                    WorkQueue.WorkNode workNode = (WorkQueue.WorkNode) workItem;
                    WorkQueue workQueue = WorkQueue.this;
                    ReentrantLock reentrantLock = workQueue.f16399a;
                    reentrantLock.lock();
                    try {
                        if (!workNode.f16405c) {
                            WorkQueue.WorkNode workNodeB = workNode.b(workQueue.f16400b);
                            workQueue.f16400b = workNodeB;
                            workQueue.f16400b = workNode.a(workNodeB, true);
                        }
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
            } else {
                e(imageRequest, requestKey, f16327c, new CacheReadWorkItem(requestKey, imageRequest.d));
            }
        }
    }

    public static void e(ImageRequest request, RequestKey requestKey, WorkQueue workQueue, Runnable runnable) {
        HashMap map = d;
        synchronized (map) {
            Intrinsics.f(request, "request");
            DownloaderContext downloaderContext = new DownloaderContext();
            downloaderContext.f16332c = request;
            map.put(requestKey, downloaderContext);
            downloaderContext.f16330a = WorkQueue.a(workQueue, runnable);
        }
    }

    public static DownloaderContext g(RequestKey requestKey) {
        DownloaderContext downloaderContext;
        HashMap map = d;
        synchronized (map) {
            downloaderContext = (DownloaderContext) map.remove(requestKey);
        }
        return downloaderContext;
    }

    public final void f(RequestKey requestKey, final Exception exc, final Bitmap bitmap, final boolean z2) {
        Handler handler;
        DownloaderContext downloaderContextG = g(requestKey);
        if (downloaderContextG == null || downloaderContextG.f16331b) {
            return;
        }
        final ImageRequest imageRequest = downloaderContextG.f16332c;
        final ImageRequest.Callback callback = imageRequest != null ? imageRequest.f16338c : null;
        if (callback != null) {
            synchronized (this) {
                try {
                    if (f16325a == null) {
                        f16325a = new Handler(Looper.getMainLooper());
                    }
                    handler = f16325a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.ImageDownloader$issueResponse$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            callback.a(new ImageResponse(imageRequest, exc, z2, bitmap));
                        } catch (Throwable th2) {
                            CrashShieldHandler.a(this, th2);
                        }
                    }
                });
            }
        }
    }
}
