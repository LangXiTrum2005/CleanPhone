package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4478rK implements InterfaceC2459Ha {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4742uK f4926a;
    public final Set b;
    public final Qm0 c;
    public final long d;
    public long e;

    public C4478rK(long j) {
        C4815v70 c4815v70 = new C4815v70();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.f4926a = c4815v70;
        this.b = setUnmodifiableSet;
        this.c = new Qm0(5);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public final synchronized void a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f4926a.l(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                int iL = this.f4926a.l(bitmap);
                this.f4926a.a(bitmap);
                this.c.getClass();
                this.e += (long) iL;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f4926a.h(bitmap);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.f4926a);
                }
                d(this.d);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f4926a.h(bitmap);
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapC = c(i, i2, config);
        if (bitmapC != null) {
            bitmapC.eraseColor(0);
            return bitmapC;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f4926a.b(i, i2, config != null ? config : f);
            if (bitmapB != null) {
                this.e -= (long) this.f4926a.l(bitmapB);
                this.c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f4926a.i(i, i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f4926a.i(i, i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f4926a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void d(long j) {
        while (this.e > j) {
            Bitmap bitmapRemoveLast = this.f4926a.removeLast();
            if (bitmapRemoveLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f4926a);
                }
                this.e = 0L;
                return;
            } else {
                this.c.getClass();
                this.e -= (long) this.f4926a.l(bitmapRemoveLast);
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f4926a.h(bitmapRemoveLast);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.f4926a);
                }
                bitmapRemoveLast.recycle();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapC = c(i, i2, config);
        if (bitmapC != null) {
            return bitmapC;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public final void i(int i) {
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            k();
        } else if (i >= 20 || i == 15) {
            d(this.d / 2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public final void k() {
        d(0L);
    }
}
