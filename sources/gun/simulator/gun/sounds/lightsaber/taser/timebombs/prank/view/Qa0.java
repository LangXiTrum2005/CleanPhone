package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class Qa0 implements InterfaceC3481fz {
    public static final ArrayList b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3608a;

    public Qa0(Handler handler) {
        this.f3608a = handler;
    }

    public static Pa0 b() {
        Pa0 pa0;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                pa0 = arrayList.isEmpty() ? new Pa0() : (Pa0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pa0;
    }

    public final Pa0 a(int i, Object obj) {
        Pa0 pa0B = b();
        pa0B.f3557a = this.f3608a.obtainMessage(i, obj);
        return pa0B;
    }

    public final boolean c(Runnable runnable) {
        return this.f3608a.post(runnable);
    }

    public final boolean d(int i) {
        return this.f3608a.sendEmptyMessage(i);
    }
}
