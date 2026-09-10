package com.inmobi.media;

import A.RunnableC0883c;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class J4 implements I4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Movie f22898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22900c;
    public volatile boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K4 f22901e;

    public J4(String filePath) {
        Intrinsics.f(filePath, "filePath");
        File file = new File(filePath);
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int i2 = fileInputStream.read(bArr);
            T9.a((Closeable) fileInputStream);
            Movie movieDecodeByteArray = Movie.decodeByteArray(bArr, 0, i2);
            this.f22898a = movieDecodeByteArray;
            if (movieDecodeByteArray == null) {
                throw new IllegalStateException("Cannot decode gif byte array");
            }
        } catch (Throwable th) {
            T9.a((Closeable) fileInputStream);
            throw th;
        }
    }

    @Override // com.inmobi.media.I4
    public final void a(boolean z2) {
        this.d = z2;
        if (!this.d) {
            this.f22900c = SystemClock.uptimeMillis() - ((long) this.f22899b);
        }
        K4 k4 = this.f22901e;
        if (k4 != null) {
            k4.invalidate();
        }
    }

    @Override // com.inmobi.media.I4
    public final boolean b() {
        return !this.d;
    }

    @Override // com.inmobi.media.I4
    public final int c() {
        Movie movie = this.f22898a;
        if (movie != null) {
            return movie.width();
        }
        return 0;
    }

    @Override // com.inmobi.media.I4
    public final void d() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f22900c == 0) {
            this.f22900c = jUptimeMillis;
        }
        Movie movie = this.f22898a;
        int iDuration = movie != null ? movie.duration() : 0;
        if (iDuration == 0) {
            iDuration = 1000;
        }
        int i2 = (int) ((jUptimeMillis - this.f22900c) % ((long) iDuration));
        this.f22899b = i2;
        Movie movie2 = this.f22898a;
        if (movie2 != null) {
            movie2.setTime(i2);
        }
    }

    public final void e() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0883c(this, 5));
    }

    @Override // com.inmobi.media.I4
    public final void start() {
    }

    @Override // com.inmobi.media.I4
    public final int a() {
        Movie movie = this.f22898a;
        if (movie != null) {
            return movie.height();
        }
        return 0;
    }

    @Override // com.inmobi.media.I4
    public final void a(Canvas canvas, float f, float f2) {
        Movie movie = this.f22898a;
        if (movie != null) {
            movie.draw(canvas, f, f2);
        }
        Movie movie2 = this.f22898a;
        if (this.f22899b + 20 >= (movie2 != null ? movie2.duration() : 0)) {
            e();
        }
    }

    public static final void a(J4 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.f22899b = 0;
        this$0.a(false);
    }

    @Override // com.inmobi.media.I4
    public final void a(K4 k4) {
        this.f22901e = k4;
    }
}
