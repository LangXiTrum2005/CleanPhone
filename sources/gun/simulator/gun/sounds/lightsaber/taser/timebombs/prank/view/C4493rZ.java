package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4493rZ implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((InterfaceC3616hZ) message.obj).recycle();
        return true;
    }
}
