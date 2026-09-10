package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class ByteBufferWriter {
    static {
        Class<?> cls;
        new ThreadLocal();
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                if (UnsafeUtil.f4939e) {
                    UnsafeUtil.f4938c.n(cls.getDeclaredField("channel"));
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
