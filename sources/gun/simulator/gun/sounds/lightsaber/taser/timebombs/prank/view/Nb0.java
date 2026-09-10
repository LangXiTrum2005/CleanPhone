package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class Nb0 implements Ob0 {
    final /* synthetic */ byte[] val$input;

    public Nb0(byte[] bArr) {
        this.val$input = bArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ob0
    public byte byteAt(int i) {
        return this.val$input[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ob0
    public int size() {
        return this.val$input.length;
    }
}
