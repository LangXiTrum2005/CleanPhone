package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.AbstractC2126l;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3795jc extends AbstractC2126l {
    private static final long serialVersionUID = 1;
    protected final byte[] bytes;

    public C3795jc(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        return this.bytes[i];
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C3795jc)) {
            return obj.equals(this);
        }
        C3795jc c3795jc = (C3795jc) obj;
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = c3795jc.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsRange(c3795jc, 0, size());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2126l
    public final boolean equalsRange(ByteString byteString, int i, int i2) {
        if (i2 > byteString.size()) {
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }
        int i3 = i + i2;
        if (i3 > byteString.size()) {
            StringBuilder sbT = AbstractC3950lJ.t("Ran off end of other: ", i, ", ", i2, ", ");
            sbT.append(byteString.size());
            throw new IllegalArgumentException(sbT.toString());
        }
        if (!(byteString instanceof C3795jc)) {
            return byteString.substring(i, i3).equals(substring(0, i2));
        }
        C3795jc c3795jc = (C3795jc) byteString;
        byte[] bArr = this.bytes;
        byte[] bArr2 = c3795jc.bytes;
        int offsetIntoBytes = getOffsetIntoBytes() + i2;
        int offsetIntoBytes2 = getOffsetIntoBytes();
        int offsetIntoBytes3 = c3795jc.getOffsetIntoBytes() + i;
        while (offsetIntoBytes2 < offsetIntoBytes) {
            if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                return false;
            }
            offsetIntoBytes2++;
            offsetIntoBytes3++;
        }
        return true;
    }

    public int getOffsetIntoBytes() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return this.bytes[i];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int offsetIntoBytes = getOffsetIntoBytes();
        return Ng0.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        return Internal.partialHash(i, this.bytes, getOffsetIntoBytes() + i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int offsetIntoBytes = getOffsetIntoBytes() + i2;
        return Ng0.partialIsValidUtf8(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.bytes.length;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, size());
        return iCheckRange == 0 ? ByteString.EMPTY : new C3533gc(this.bytes, getOffsetIntoBytes() + i, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.bytes, getOffsetIntoBytes(), size());
    }
}
