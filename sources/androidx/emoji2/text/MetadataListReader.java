package androidx.emoji2.text;

import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class MetadataListReader {

    public static class ByteBufferReader implements OpenTypeReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f4994a;

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.f4994a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final void a(int i2) {
            ByteBuffer byteBuffer = this.f4994a;
            byteBuffer.position(byteBuffer.position() + i2);
        }
    }

    public static class InputStreamOpenTypeReader implements OpenTypeReader {
    }

    public static class OffsetInfo {
    }

    public interface OpenTypeReader {
    }

    public static MetadataList a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        ByteBufferReader byteBufferReader = new ByteBufferReader(byteBufferDuplicate);
        byteBufferReader.a(4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferReader.a(6);
        int i3 = 0;
        while (true) {
            byteBuffer = byteBufferReader.f4994a;
            if (i3 >= i2) {
                j = -1;
                break;
            }
            int i4 = byteBuffer.getInt();
            byteBufferReader.a(4);
            j = ((long) byteBuffer.getInt()) & 4294967295L;
            byteBufferReader.a(4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j != -1) {
            byteBufferReader.a((int) (j - ((long) byteBuffer.position())));
            byteBufferReader.a(12);
            long j2 = ((long) byteBuffer.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j2; i5++) {
                int i6 = byteBuffer.getInt();
                long j3 = ((long) byteBuffer.getInt()) & 4294967295L;
                byteBuffer.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    MetadataList metadataList = new MetadataList();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    metadataList.f5017b = byteBufferDuplicate;
                    metadataList.f5016a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    metadataList.f5018c = i7;
                    metadataList.d = metadataList.f5017b.getShort(i7);
                    return metadataList;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
