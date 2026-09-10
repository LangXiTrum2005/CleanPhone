package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
abstract class AllocatedBuffer {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$1, reason: invalid class name */
    class AnonymousClass1 extends AllocatedBuffer {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$2, reason: invalid class name */
    class AnonymousClass2 extends AllocatedBuffer {
    }

    public static AnonymousClass1 a(ByteBuffer byteBuffer) {
        Internal.a(byteBuffer, "buffer");
        return new AnonymousClass1();
    }

    public static void b(int i2, int i3, byte[] bArr) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }
}
