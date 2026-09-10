package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2434Gb extends InterfaceC4463r70, WritableByteChannel {
    InterfaceC2434Gb A(String str);

    long B(InterfaceC3588h80 interfaceC3588h80);

    InterfaceC2434Gb E(long j);

    InterfaceC2434Gb I(C3971lc c3971lc);

    InterfaceC2434Gb M(long j);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    void flush();

    C4848vb getBuffer();

    InterfaceC2434Gb write(byte[] bArr);

    InterfaceC2434Gb write(byte[] bArr, int i, int i2);

    InterfaceC2434Gb writeByte(int i);

    InterfaceC2434Gb writeInt(int i);

    InterfaceC2434Gb writeShort(int i);

    InterfaceC2434Gb z();
}
