package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f24882a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f24883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f24884c;

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    static {
        Class<?> cls;
        long jN;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f24883b = cls;
        if (cls != null) {
            try {
                if (x4.f25023e) {
                    jN = x4.f25021c.n(cls.getDeclaredField("channel"));
                } else {
                    jN = -1;
                }
            } catch (Throwable unused2) {
            }
        } else {
            jN = -1;
        }
        f24884c = jN;
    }
}
