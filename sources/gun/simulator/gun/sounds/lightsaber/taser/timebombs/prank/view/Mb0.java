package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class Mb0 implements Ob0 {
    final /* synthetic */ ByteString val$input;

    public Mb0(ByteString byteString) {
        this.val$input = byteString;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ob0
    public byte byteAt(int i) {
        return this.val$input.byteAt(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ob0
    public int size() {
        return this.val$input.size();
    }
}
