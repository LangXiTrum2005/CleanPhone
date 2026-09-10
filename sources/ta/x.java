package ta;

import com.google.android.gms.internal.ads.ee1;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r9.b f50668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ee1 f50669k = new ee1(x.class, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Set f50670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f50671i;

    static {
        Throwable th2;
        r9.b wVar;
        try {
            wVar = new v(AtomicReferenceFieldUpdater.newUpdater(x.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(x.class, "i"));
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            wVar = new w();
        }
        f50668j = wVar;
        if (th2 != null) {
            f50669k.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }
}
