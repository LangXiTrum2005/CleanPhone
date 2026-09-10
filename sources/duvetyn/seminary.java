package duvetyn;

import java.util.concurrent.locks.ReentrantLock;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: -JvmPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\b\u0010\t*\n\u0010\u000b\"\u00020\n2\u00020\n*\n\u0010\r\"\u00020\f2\u00020\f*\n\u0010\u000f\"\u00020\u000e2\u00020\u000e*\n\u0010\u0011\"\u00020\u00102\u00020\u0010*\n\u0010\u0013\"\u00020\u00122\u00020\u0012*\n\u0010\u0014\"\u00020\u00062\u00020\u0006*\n\u0010\u0016\"\u00020\u00152\u00020\u0015¨\u0006\u0017"}, d2 = {"", "", "dern", "([B)Ljava/lang/String;", "attabal", "(Ljava/lang/String;)[B", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "saneness", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/Closeable;", "Closeable", "Ljava/io/EOFException;", "EOFException", "Ljava/io/FileNotFoundException;", "FileNotFoundException", "Ljava/io/IOException;", "IOException", "Lock", "Ljava/net/ProtocolException;", "ProtocolException", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class seminary {
    public static final byte[] attabal(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static final String dern(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final ReentrantLock saneness() {
        return new ReentrantLock();
    }
}
