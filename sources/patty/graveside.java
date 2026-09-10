package patty;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: HardwareConfigState.java */
/* JADX INFO: loaded from: classes2.dex */
public final class graveside {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final boolean f35122beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final File f35123competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static volatile graveside f35124impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final boolean f35125marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f35128saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f35127dern = true;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AtomicBoolean f35129wireman = new AtomicBoolean(false);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f35126attabal = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f35125marial = i < 29;
        f35122beachfront = i >= 28;
        f35123competently = new File("/proc/self/fd");
    }

    public static boolean marial() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static graveside saneness() {
        if (f35124impromptu == null) {
            synchronized (graveside.class) {
                try {
                    if (f35124impromptu == null) {
                        f35124impromptu = new graveside();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35124impromptu;
    }

    public final boolean attabal() {
        return f35125marial && !this.f35129wireman.get();
    }

    public boolean beachfront(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f35122beachfront) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (attabal()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i < 0 || i2 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (wireman()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    public boolean competently(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zBeachfront = beachfront(i, i2, z, z2);
        if (zBeachfront) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zBeachfront;
    }

    public final int dern() {
        if (marial()) {
            return 500;
        }
        return this.f35126attabal;
    }

    public void impromptu() {
        com.bumptech.glide.util.formularize.saneness();
        this.f35129wireman.set(true);
    }

    public final synchronized boolean wireman() {
        try {
            boolean z = true;
            int i = this.f35128saneness + 1;
            this.f35128saneness = i;
            if (i >= 50) {
                this.f35128saneness = 0;
                if (f35123competently.list().length >= dern()) {
                    z = false;
                }
                this.f35127dern = z;
                if (!z) {
                    Log.isLoggable("Downsampler", 5);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f35127dern;
    }
}
