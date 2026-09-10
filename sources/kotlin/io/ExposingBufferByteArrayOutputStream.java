package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/ExposingBufferByteArrayOutputStream;", "Ljava/io/ByteArrayOutputStream;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ExposingBufferByteArrayOutputStream extends ByteArrayOutputStream {
    public final byte[] d() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.e(buf, "buf");
        return buf;
    }
}
