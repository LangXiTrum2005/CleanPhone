package n6;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final File f46607d = new File("/proc/self/fd");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile s f46608e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46611c = true;

    public s() {
        new AtomicBoolean(false);
        this.f46609a = 20000;
    }

    public static s a() {
        if (f46608e == null) {
            synchronized (s.class) {
                try {
                    if (f46608e == null) {
                        f46608e = new s();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46608e;
    }

    public final boolean b(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        if (z10) {
            if (z11) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                    return false;
                }
            } else if (i10 >= 0 && i11 >= 0) {
                synchronized (this) {
                    try {
                        int i12 = this.f46610b + 1;
                        this.f46610b = i12;
                        if (i12 >= 50) {
                            this.f46610b = 0;
                            int length = f46607d.list().length;
                            long j10 = this.f46609a;
                            boolean z13 = ((long) length) < j10;
                            this.f46611c = z13;
                            if (!z13 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j10);
                            }
                        }
                        z12 = this.f46611c;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z12) {
                    return true;
                }
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
