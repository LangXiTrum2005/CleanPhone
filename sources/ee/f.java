package ee;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f40033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.C0227a f40034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b.a f40035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f40036d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f40033a = z10;
        if (!z10) {
            f40034b = null;
            f40035c = null;
            f40036d = null;
        } else {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f40034b = a.f40026b;
            f40035c = b.f40028b;
            f40036d = d.f40030b;
        }
    }
}
