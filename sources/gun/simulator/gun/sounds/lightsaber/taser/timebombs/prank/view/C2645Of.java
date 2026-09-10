package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.C2143u;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2645Of extends C2143u {
    private final ByteBuffer byteBuffer;
    private int initialPosition;

    public C2645Of(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.byteBuffer = byteBuffer;
        this.initialPosition = byteBuffer.position();
    }

    @Override // com.google.protobuf.C2143u, com.google.protobuf.CodedOutputStream
    public void flush() {
    }
}
