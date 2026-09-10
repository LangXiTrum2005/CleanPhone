package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LruBitmapPool implements BitmapPool {
    public static final Bitmap.Config j = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SizeConfigStrategy f12495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f12496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NullBitmapTracker f12497c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12498e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12500i;

    public interface BitmapTracker {
    }

    public static final class NullBitmapTracker implements BitmapTracker {
    }

    public static class ThrowingBitmapTracker implements BitmapTracker {
    }

    public LruBitmapPool(long j2) {
        SizeConfigStrategy sizeConfigStrategy = new SizeConfigStrategy();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j2;
        this.f12495a = sizeConfigStrategy;
        this.f12496b = setUnmodifiableSet;
        this.f12497c = new NullBitmapTracker();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap a(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapG = g(i2, i3, config);
        if (bitmapG != null) {
            return bitmapG;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f12495a.getClass();
                if (Util.c(bitmap) <= this.d && this.f12496b.contains(bitmap.getConfig())) {
                    this.f12495a.getClass();
                    int iC = Util.c(bitmap);
                    this.f12495a.f(bitmap);
                    this.f12497c.getClass();
                    this.f12499h++;
                    this.f12498e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f12495a.getClass();
                        sb.append(SizeConfigStrategy.c(Util.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        f();
                    }
                    h(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f12495a.getClass();
                sb2.append(SizeConfigStrategy.c(Util.c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f12496b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void c(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || i2 >= 20) {
            d();
        } else if (i2 >= 20 || i2 == 15) {
            h(this.d / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void d() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap e(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapG = g(i2, i3, config);
        if (bitmapG != null) {
            bitmapG.eraseColor(0);
            return bitmapG;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f + ", misses=" + this.g + ", puts=" + this.f12499h + ", evictions=" + this.f12500i + ", currentSize=" + this.f12498e + ", maxSize=" + this.d + "\nStrategy=" + this.f12495a);
    }

    public final synchronized Bitmap g(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f12495a.b(i2, i3, config != null ? config : j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f12495a.e(i2, i3, config));
                }
                this.g++;
            } else {
                this.f++;
                long j2 = this.f12498e;
                this.f12495a.getClass();
                this.f12498e = j2 - ((long) Util.c(bitmapB));
                this.f12497c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f12495a.e(i2, i3, config));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void h(long j2) {
        while (this.f12498e > j2) {
            try {
                SizeConfigStrategy sizeConfigStrategy = this.f12495a;
                Bitmap bitmap = (Bitmap) sizeConfigStrategy.f12504b.c();
                if (bitmap != null) {
                    sizeConfigStrategy.a(Integer.valueOf(Util.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        f();
                    }
                    this.f12498e = 0L;
                    return;
                }
                this.f12497c.getClass();
                long j3 = this.f12498e;
                this.f12495a.getClass();
                this.f12498e = j3 - ((long) Util.c(bitmap));
                this.f12500i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f12495a.getClass();
                    sb.append(SizeConfigStrategy.c(Util.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    f();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
