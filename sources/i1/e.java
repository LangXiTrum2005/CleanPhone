package i1;

import android.media.AudioAttributes;
import android.os.Build;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f42531c = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioAttributes f42533b;

    static {
        d5.u.m(0, 1, 2, 3, 4);
        l1.y.G(5);
        l1.y.G(6);
    }

    public e(int i10) {
        this.f42532a = i10;
    }

    public final AudioAttributes a() {
        if (this.f42533b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f42532a).setFlags(0).setUsage(1);
            int i10 = Build.VERSION.SDK_INT;
            usage.setAllowedCapturePolicy(1);
            usage.setHapticChannelsMuted(true);
            if (i10 >= 32) {
                d.b(usage);
                d.a(usage);
            }
            this.f42533b = usage.build();
        }
        return this.f42533b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e.class == obj.getClass() && this.f42532a == ((e) obj).f42532a;
    }

    public final int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f42532a) * 961) + 1) * 31) + 1) * 29791) + 1;
    }
}
