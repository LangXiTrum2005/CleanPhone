package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3533gc extends C3795jc {
    private static final long serialVersionUID = 1;
    private final int bytesLength;
    private final int bytesOffset;

    public C3533gc(byte[] bArr, int i, int i2) {
        super(bArr);
        ByteString.checkRange(i, i + i2, bArr.length);
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3795jc, com.google.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, size());
        return this.bytes[this.bytesOffset + i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3795jc, com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3795jc
    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3795jc, com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return this.bytes[this.bytesOffset + i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3795jc, com.google.protobuf.ByteString
    public int size() {
        return this.bytesLength;
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }
}
