package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2677Pl extends AbstractC4936wb {
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final int h;
    public final C2339Ck c = new C2339Ck();
    public final int i = 0;

    static {
        AbstractC2944Zs.a("goog.exo.decoder");
    }

    public C2677Pl(int i) {
        this.h = i;
    }

    public void e() {
        this.b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer f(int i) {
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        throw new C2651Ol(AbstractC3950lJ.q("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    public final void g(int i) {
        int i2 = i + this.i;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = f(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferF = f(i3);
        byteBufferF.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferF.put(byteBuffer);
        }
        this.d = byteBufferF;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
