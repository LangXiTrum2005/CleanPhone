package com.charging.screenshow.battery.animations.themes.download;

import android.os.Handler;
import android.os.Message;
import android.support.v4.media.a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/download/DownloadTask;", "Landroid/os/Handler;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DownloadTask extends Handler {
    public static final /* synthetic */ int q = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FilePoint f13239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13240c;
    public volatile boolean d;
    public File k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DownloadListener f13246p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13238a = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f13241e = new AtomicInteger(0);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicInteger g = new AtomicInteger(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13244l = 1;
    public final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f13245n = 3;
    public final int o = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f13243i = new long[3];
    public final File[] j = new File[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HttpUtil f13242h = (HttpUtil) HttpUtil.f13255b.getX();

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    public DownloadTask(FilePoint filePoint, DownloadListener downloadListener) {
        this.f13239b = filePoint;
        this.f13246p = downloadListener;
    }

    public static final void a(DownloadTask downloadTask, Closeable... closeableArr) {
        downloadTask.getClass();
        int length = closeableArr.length;
        int i2 = 0;
        for (Closeable closeable : closeableArr) {
            try {
                try {
                    if (closeable != null) {
                        closeable.close();
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    while (i2 < length) {
                        i2++;
                    }
                    return;
                }
            } catch (Throwable th) {
                while (i2 < length) {
                    i2++;
                }
                throw th;
            }
        }
        while (i2 < length) {
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.charging.screenshow.battery.animations.themes.download.DownloadTask$start$1] */
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
    public final synchronized void b() {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            this.f13242h.a(this.f13239b.f13252a, new Callback() { // from class: com.charging.screenshow.battery.animations.themes.download.DownloadTask$start$1
                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException e2) {
                    Intrinsics.f(call, "call");
                    Intrinsics.f(e2, "e");
                    int i2 = DownloadTask.q;
                    this.f13251a.d = false;
                }

                @Override // okhttp3.Callback
                public final void onResponse(Call call, Response response) throws IOException {
                    long j;
                    int i2 = 1;
                    Intrinsics.f(call, "call");
                    Intrinsics.f(response, "response");
                    int iCode = response.code();
                    final DownloadTask downloadTask = this.f13251a;
                    if (iCode != 200) {
                        DownloadTask.a(downloadTask, response.body());
                        downloadTask.d = false;
                        return;
                    }
                    ResponseBody responseBodyBody = response.body();
                    Intrinsics.c(responseBodyBody);
                    long j2 = responseBodyBody.get$contentLength();
                    downloadTask.f13240c = j2;
                    if (j2 < 0) {
                        return;
                    }
                    DownloadTask.a(downloadTask, response.body());
                    File file = new File(downloadTask.f13239b.f13253b, a.r(new StringBuilder(), downloadTask.f13239b.f13254c, ".tmp"));
                    downloadTask.k = file;
                    if (!file.getParentFile().exists()) {
                        File file2 = downloadTask.k;
                        Intrinsics.c(file2);
                        file2.getParentFile().mkdirs();
                    }
                    new RandomAccessFile(downloadTask.k, "rw").setLength(downloadTask.f13240c);
                    long j3 = downloadTask.f13240c;
                    int i3 = downloadTask.f13238a;
                    long j4 = j3 / ((long) i3);
                    final int i4 = 0;
                    while (i4 < i3) {
                        final long j5 = ((long) i4) * j4;
                        int i5 = i4 + 1;
                        long j6 = (((long) i5) * j4) - 1;
                        if (i4 == downloadTask.f13238a - i2) {
                            j6 = downloadTask.f13240c - 1;
                        }
                        FilePoint filePoint = downloadTask.f13239b;
                        String str = filePoint.f13253b;
                        StringBuilder sb = new StringBuilder("thread");
                        sb.append(i4);
                        sb.append('_');
                        int i6 = i3;
                        final File file3 = new File(str, a.r(sb, filePoint.f13254c, ".cache"));
                        downloadTask.j[i4] = file3;
                        final RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rwd");
                        if (file3.exists()) {
                            String line = randomAccessFile.readLine();
                            try {
                                Intrinsics.c(line);
                                j = Integer.parseInt(line);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                j = j5;
                            }
                        } else {
                            j = j5;
                        }
                        long j7 = j6;
                        final long j8 = j;
                        Callback callback = new Callback() { // from class: com.charging.screenshow.battery.animations.themes.download.DownloadTask$download$1
                            @Override // okhttp3.Callback
                            public final void onFailure(Call call2, IOException e3) {
                                Intrinsics.f(call2, "call");
                                Intrinsics.f(e3, "e");
                                downloadTask.d = false;
                            }

                            @Override // okhttp3.Callback
                            public final void onResponse(Call call2, Response response2) throws IOException {
                                RandomAccessFile randomAccessFile2;
                                Intrinsics.f(call2, "call");
                                Intrinsics.f(response2, "response");
                                int iCode2 = response2.code();
                                DownloadTask downloadTask2 = downloadTask;
                                if (iCode2 != 206) {
                                    int i7 = DownloadTask.q;
                                    downloadTask2.d = false;
                                    return;
                                }
                                ResponseBody responseBodyBody2 = response2.body();
                                Intrinsics.c(responseBodyBody2);
                                InputStream inputStreamByteStream = responseBodyBody2.byteStream();
                                RandomAccessFile randomAccessFile3 = new RandomAccessFile(downloadTask2.k, "rw");
                                long j9 = j8;
                                randomAccessFile3.seek(j9);
                                byte[] bArr = new byte[4096];
                                int i8 = 0;
                                while (true) {
                                    int i9 = inputStreamByteStream.read(bArr);
                                    randomAccessFile2 = randomAccessFile;
                                    if (i9 <= 0) {
                                        break;
                                    }
                                    randomAccessFile3.write(bArr, 0, i9);
                                    i8 += i9;
                                    long j10 = ((long) i8) + j9;
                                    randomAccessFile2.seek(0L);
                                    Charset charsetForName = Charset.forName("UTF-8");
                                    Intrinsics.e(charsetForName, "forName(...)");
                                    byte[] bytes = (j10 + "").getBytes(charsetForName);
                                    Intrinsics.e(bytes, "getBytes(...)");
                                    randomAccessFile2.write(bytes);
                                    downloadTask2.f13243i[i4] = j10 - j5;
                                    downloadTask2.sendEmptyMessage(downloadTask2.f13244l);
                                }
                                DownloadTask.a(downloadTask2, randomAccessFile2, inputStreamByteStream, response2.body());
                                File file4 = new File[]{file3}[0];
                                if (file4 != null) {
                                    file4.delete();
                                }
                                downloadTask2.sendEmptyMessage(downloadTask2.m);
                            }
                        };
                        HttpUtil httpUtil = downloadTask.f13242h;
                        httpUtil.getClass();
                        String url = filePoint.f13252a;
                        Intrinsics.f(url, "url");
                        Request requestBuild = new Request.Builder().header("RANGE", "bytes=" + j8 + '-' + j7).url(url).build();
                        OkHttpClient okHttpClient = httpUtil.f13256a;
                        Intrinsics.c(okHttpClient);
                        okHttpClient.newCall(requestBuild).enqueue(callback);
                        i3 = i6;
                        i4 = i5;
                        i2 = 1;
                    }
                }
            });
        } catch (Exception unused) {
            this.d = false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.f(msg, "msg");
        DownloadListener downloadListener = this.f13246p;
        if (downloadListener == null) {
            return;
        }
        int i2 = msg.what;
        int i3 = this.f13244l;
        FilePoint filePoint = this.f13239b;
        if (i2 == i3) {
            int length = this.f13243i.length;
            long j = 0;
            for (int i4 = 0; i4 < length; i4++) {
                j += this.f13243i[i4];
            }
            downloadListener.c((j * 1.0f) / this.f13240c, filePoint.f13252a);
            return;
        }
        if (i2 == this.f13245n) {
            if (this.f.incrementAndGet() % this.f13238a != 0) {
                return;
            }
            this.d = false;
            downloadListener.d(filePoint.f13252a);
            return;
        }
        if (i2 != this.m) {
            if (i2 == this.o && this.f13241e.incrementAndGet() % this.f13238a == 0) {
                this.d = false;
                this.f13243i = new long[this.f13238a];
                downloadListener.a(filePoint.f13252a);
                return;
            }
            return;
        }
        if (this.g.incrementAndGet() % this.f13238a != 0) {
            return;
        }
        File file = this.k;
        Intrinsics.c(file);
        file.renameTo(new File(filePoint.f13253b, filePoint.f13254c));
        this.d = false;
        downloadListener.b(filePoint.f13252a);
    }
}
