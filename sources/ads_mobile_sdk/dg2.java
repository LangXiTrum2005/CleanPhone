package ads_mobile_sdk;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.nio.charset.Charset;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final class dg2 implements Closeable {
    public final byte[] a;

    public dg2(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.a = bytes;
    }

    public static String a(dg2 dg2Var) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(dg2Var.a, charset);
    }

    public final ByteArrayInputStream a() {
        return new ByteArrayInputStream(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
