package hk;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends ByteArrayOutputStream {
    public byte[] d() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] h() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        n.e(buf, "buf");
        return buf;
    }
}
