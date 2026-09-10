package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class AB extends Binder implements BB {
    public static BB c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof BB)) {
            return (BB) iInterfaceQueryLocalInterface;
        }
        C5173zB c5173zB = new C5173zB();
        c5173zB.f5319a = iBinder;
        return c5173zB;
    }
}
