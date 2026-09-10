package q;

import com.applovin.impl.da;
import com.google.android.gms.internal.play_billing.q1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f48507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final da f48508d = new da(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f48509b = new b();

    public static a L() {
        if (f48507c != null) {
            return f48507c;
        }
        synchronized (a.class) {
            try {
                if (f48507c == null) {
                    f48507c = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f48507c;
    }
}
