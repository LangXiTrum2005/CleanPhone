package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4616a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f4617b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f4618c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void b() {
    }
}
