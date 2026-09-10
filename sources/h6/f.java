package h6;

import a7.p;
import android.graphics.Bitmap;
import android.util.Log;
import ea.b0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f42225j = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f42226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f42227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f42228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42234i;

    public f(long j10) {
        j jVar = new j();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f42229d = j10;
        this.f42226a = jVar;
        this.f42227b = setUnmodifiableSet;
        this.f42228c = new b0(21);
    }

    @Override // h6.a
    public final Bitmap a(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD = d(i10, i11, config);
        if (bitmapD != null) {
            return bitmapD;
        }
        if (config == null) {
            config = f42225j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // h6.a
    public final synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f42226a.getClass();
                if (p.c(bitmap) <= this.f42229d && this.f42227b.contains(bitmap.getConfig())) {
                    this.f42226a.getClass();
                    int iC = p.c(bitmap);
                    this.f42226a.e(bitmap);
                    this.f42228c.getClass();
                    this.f42233h++;
                    this.f42230e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Put bitmap in pool=");
                        this.f42226a.getClass();
                        sb2.append(j.c(p.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        c();
                    }
                    f(this.f42229d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f42226a.getClass();
                sb3.append(j.c(p.c(bitmap), bitmap.getConfig()));
                sb3.append(", is mutable: ");
                sb3.append(bitmap.isMutable());
                sb3.append(", is allowed config: ");
                sb3.append(this.f42227b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb3.toString());
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        Log.v("LruBitmapPool", "Hits=" + this.f42231f + ", misses=" + this.f42232g + ", puts=" + this.f42233h + ", evictions=" + this.f42234i + ", currentSize=" + this.f42230e + ", maxSize=" + this.f42229d + "\nStrategy=" + this.f42226a);
    }

    public final synchronized Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f42226a.b(i10, i11, config != null ? config : f42225j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    this.f42226a.getClass();
                    sb2.append(j.c(p.d(config) * i10 * i11, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f42232g++;
            } else {
                this.f42231f++;
                long j10 = this.f42230e;
                this.f42226a.getClass();
                this.f42230e = j10 - ((long) p.c(bitmapB));
                this.f42228c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                this.f42226a.getClass();
                sb3.append(j.c(p.d(config) * i10 * i11, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapB;
    }

    @Override // h6.a
    public final void e(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            k();
        } else if (i10 >= 20 || i10 == 15) {
            f(this.f42229d / 2);
        }
    }

    public final synchronized void f(long j10) {
        while (this.f42230e > j10) {
            try {
                j jVar = this.f42226a;
                Bitmap bitmap = (Bitmap) jVar.f42245b.B();
                if (bitmap != null) {
                    jVar.a(Integer.valueOf(p.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        c();
                    }
                    this.f42230e = 0L;
                    return;
                }
                this.f42228c.getClass();
                long j11 = this.f42230e;
                this.f42226a.getClass();
                this.f42230e = j11 - ((long) p.c(bitmap));
                this.f42234i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    this.f42226a.getClass();
                    sb2.append(j.c(p.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    c();
                }
                bitmap.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h6.a
    public final void k() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        f(0L);
    }

    @Override // h6.a
    public final Bitmap n(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD = d(i10, i11, config);
        if (bitmapD != null) {
            bitmapD.eraseColor(0);
            return bitmapD;
        }
        if (config == null) {
            config = f42225j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }
}
