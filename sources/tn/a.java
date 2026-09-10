package tn;

import an.o;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51591a;

    static {
        Object objC;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            n.e(property, "getProperty(...)");
            objC = o.e0(property);
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if (objC instanceof wj.g) {
            objC = null;
        }
        Integer num = (Integer) objC;
        f51591a = num != null ? num.intValue() : 2097152;
    }
}
