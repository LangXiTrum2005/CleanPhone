package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2854Wg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3013ah;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2828Vg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore$actor$2 extends WG implements InterfaceC3567gx {
    public static final SingleProcessDataStore$actor$2 INSTANCE = new SingleProcessDataStore$actor$2();

    public SingleProcessDataStore$actor$2() {
        super(2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        invoke((SingleProcessDataStore.Message) obj, (Throwable) obj2);
        return C5033xf0.f5238a;
    }

    public final void invoke(SingleProcessDataStore.Message<T> message, Throwable th) throws IllegalAccessException, InvocationTargetException {
        AbstractC2995aW.q(message, NotificationCompat.CATEGORY_MESSAGE);
        if (message instanceof SingleProcessDataStore.Message.Update) {
            InterfaceC2828Vg ack = ((SingleProcessDataStore.Message.Update) message).getAck();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            C2854Wg c2854Wg = (C2854Wg) ack;
            c2854Wg.getClass();
            c2854Wg.S(new C3013ah(false, th));
        }
    }
}
