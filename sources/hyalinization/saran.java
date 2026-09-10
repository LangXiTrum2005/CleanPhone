package hyalinization;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: compiled from: OggOpusAudioPacketizer.java */
/* JADX INFO: loaded from: classes.dex */
public final class saran {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ByteBuffer f28099attabal = AudioProcessor.f10777attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f28100dern = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f28101saneness = 2;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final byte[] f28098wireman = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final byte[] f28097marial = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, ExecutionDataWriter.BLOCK_SESSIONINFO, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    public void attabal(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        decarock.attabal.marial(decoderInputBuffer.f11483polloi);
        if (decoderInputBuffer.f11483polloi.limit() - decoderInputBuffer.f11483polloi.position() == 0) {
            return;
        }
        this.f28099attabal = saneness(decoderInputBuffer.f11483polloi, (this.f28101saneness == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.dern();
        decoderInputBuffer.kowloon(this.f28099attabal.remaining());
        decoderInputBuffer.f11483polloi.put(this.f28099attabal);
        decoderInputBuffer.arytenoidectomy();
    }

    public final void beachfront(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.common.primitives.competently.attabal(i2));
    }

    public final ByteBuffer dern(int i) {
        if (this.f28099attabal.capacity() < i) {
            this.f28099attabal = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f28099attabal.clear();
        }
        return this.f28099attabal;
    }

    public final void marial(ByteBuffer byteBuffer, byte[] bArr) {
        beachfront(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(com.google.common.primitives.competently.attabal(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, decarock.grimness.gintrap(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    public final ByteBuffer saneness(ByteBuffer byteBuffer, byte[] bArr) {
        int i;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int length = i3 + 27 + i2;
        if (this.f28101saneness == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f28098wireman.length;
            length += f28097marial.length + length2;
            i = length2;
        } else {
            i = 0;
        }
        ByteBuffer byteBufferDern = dern(length);
        if (this.f28101saneness == 2) {
            if (bArr != null) {
                marial(byteBufferDern, bArr);
            } else {
                byteBufferDern.put(f28098wireman);
            }
            byteBufferDern.put(f28097marial);
        }
        int iCutely = this.f28100dern + cybernatic.supplicat.cutely(byteBuffer);
        this.f28100dern = iCutely;
        beachfront(byteBufferDern, iCutely, this.f28101saneness, i3, false);
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 >= 255) {
                byteBufferDern.put((byte) -1);
                i2 -= 255;
            } else {
                byteBufferDern.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferDern.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferDern.flip();
        if (this.f28101saneness == 2) {
            byte[] bArrArray = byteBufferDern.array();
            int iArrayOffset = byteBufferDern.arrayOffset() + i;
            byte[] bArr2 = f28097marial;
            byteBufferDern.putInt(i + bArr2.length + 22, decarock.grimness.gintrap(bArrArray, iArrayOffset + bArr2.length, byteBufferDern.limit() - byteBufferDern.position(), 0));
        } else {
            byteBufferDern.putInt(22, decarock.grimness.gintrap(byteBufferDern.array(), byteBufferDern.arrayOffset(), byteBufferDern.limit() - byteBufferDern.position(), 0));
        }
        this.f28101saneness++;
        return byteBufferDern;
    }

    public void wireman() {
        this.f28099attabal = AudioProcessor.f10777attabal;
        this.f28100dern = 0;
        this.f28101saneness = 2;
    }
}
