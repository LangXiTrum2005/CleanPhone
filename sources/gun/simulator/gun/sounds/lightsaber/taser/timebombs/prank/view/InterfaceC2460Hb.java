package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2460Hb extends InterfaceC3588h80, ReadableByteChannel {
    String C();

    void D(long j);

    C3971lc F(long j);

    long G(C3971lc c3971lc);

    long H(C4848vb c4848vb);

    byte[] J();

    boolean K();

    String L(Charset charset);

    C3971lc N();

    int O(XS xs);

    long P();

    C4760ub Q();

    C4848vb getBuffer();

    String j(long j);

    boolean l(long j);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);
}
