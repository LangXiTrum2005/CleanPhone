package lo;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface f extends r, WritableByteChannel {
    @Override // lo.r, java.io.Flushable
    void flush();

    f g(h hVar);

    f i(int i10, byte[] bArr);

    f write(byte[] bArr);

    f writeByte(int i10);

    f writeHexadecimalUnsignedLong(long j10);

    f writeInt(int i10);

    f writeShort(int i10);

    f writeUtf8(String str);
}
