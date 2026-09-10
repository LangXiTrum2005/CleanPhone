package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.ByteString;
import com.google.protobuf.C2120i;
import com.google.protobuf.CodedOutputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3709ic {
    private final byte[] buffer;
    private final CodedOutputStream output;

    public /* synthetic */ C3709ic(int i, C2120i c2120i) {
        this(i);
    }

    public ByteString build() {
        this.output.checkNoSpaceLeft();
        return new C3795jc(this.buffer);
    }

    public CodedOutputStream getCodedOutput() {
        return this.output;
    }

    private C3709ic(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.output = CodedOutputStream.newInstance(bArr);
    }
}
