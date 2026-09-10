package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class Pa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f3557a;

    public final void a() {
        this.f3557a = null;
        ArrayList arrayList = Qa0.b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f3557a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
